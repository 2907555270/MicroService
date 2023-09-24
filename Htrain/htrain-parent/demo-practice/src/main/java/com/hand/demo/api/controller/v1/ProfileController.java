package com.hand.demo.api.controller.v1;

import com.hand.demo.config.SwaggerTags;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.hzero.boot.platform.profile.ProfileClient;
import org.hzero.core.base.BaseController;
import org.hzero.core.util.Results;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.choerodon.core.iam.ResourceLevel;
import io.choerodon.swagger.annotation.Permission;

/**
 * 配置维护 Api层
 *
 * @author xiaoyu.tang@hand-china.com 2023/09/23 17:03
 */
@Api(tags = SwaggerTags.PROFILE)
@RestController("profileController.v1")
@RequestMapping("/v1/{organizationId}/profile")
public class ProfileController extends BaseController {

    @Autowired
    private ProfileClient profileClient;


    @ApiOperation(value = "根据编码获取配置信息")
    @Permission(level = ResourceLevel.ORGANIZATION)
    @GetMapping
    public ResponseEntity<String> getProfileByCode(@PathVariable Long organizationId,
                                                   @RequestParam String profileName,
                                                   Long roleId,
                                                   Long userId) {
        // CustomUserDetails userDetails = DetailsHelper.getUserDetails();
        // Long roleId = userDetails.getRoleId();
        // Long userId = userDetails.getUserId();
        String profile = profileClient.getProfileValueByOptions(organizationId, userId, roleId, profileName);
        return Results.success(profile);
    }
}
