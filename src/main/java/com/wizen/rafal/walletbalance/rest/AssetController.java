package com.wizen.rafal.walletbalance.rest;

import com.wizen.rafal.walletbalance.entity.Asset;
import com.wizen.rafal.walletbalance.service.AssetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/assets")
public class AssetController {

    private AssetService assetService;

    @Autowired
    public AssetController(AssetService assetService) {
        this.assetService = assetService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Asset>> getAllAssets() {
        return new ResponseEntity<List<Asset>>(assetService.findAll(), HttpStatus.OK);
    }
}
