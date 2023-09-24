package com.hand.demo.api.controller.v1;

import com.hand.demo.config.SwaggerTags;
import feign.Response;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.hzero.boot.file.FileClient;
import org.hzero.core.base.BaseController;
import org.hzero.core.util.Results;
import org.hzero.file.domain.entity.UploadConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import io.choerodon.core.iam.ResourceLevel;
import io.choerodon.swagger.annotation.Permission;

/**
 * 文件服务 Api
 *
 * @author xiaoyu.tang@hand-china.com 2023/09/24 16:33
 */
@Api(tags = SwaggerTags.FILE)
@RestController
@RequestMapping("/v1/{organizationId}/file")
public class FileController extends BaseController {

    @Autowired
    private FileClient fileClient;

    @ApiOperation("上传文件")
    @Permission(level = ResourceLevel.ORGANIZATION, permissionLogin = true)
    @PostMapping("/upload")
    public ResponseEntity<String> uploadFile(@PathVariable Long organizationId,
                                             @RequestParam String storageCode,
                                             MultipartFile multipartFile,
                                             UploadConfig uploadConfig
    ) {

        String result = fileClient.updateFile(
                uploadConfig.getTenantId(),
                uploadConfig.getBucketName(),
                uploadConfig.getDirectory(),
                storageCode,
                multipartFile
        );

        return Results.success(result);
    }

    @ApiOperation("下载文件")
    @Permission(level = ResourceLevel.ORGANIZATION, permissionLogin = true)
    @GetMapping("/download")
    public ResponseEntity<Response> downloadFile(@PathVariable Long organizationId,
                                         @RequestParam String bucketName,
                                         @RequestParam String storageCode,
                                         @RequestParam String url){
        Response response = fileClient.downloadFileResponse(
                organizationId,
                bucketName,
                storageCode,
                url
        );

        return Results.success(response);
    }
}
