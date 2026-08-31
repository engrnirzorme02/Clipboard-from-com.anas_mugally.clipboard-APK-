package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: com.bumptech.glide.load.data.m */
/* JADX INFO: loaded from: classes.dex */
public class C3228m extends AbstractC3217b {
    public C3228m(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3219d
    /* JADX INFO: renamed from: a */
    public Class mo930a() {
        return InputStream.class;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.load.data.AbstractC3217b
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void mo17109c(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.load.data.AbstractC3217b
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public InputStream mo17110f(AssetManager assetManager, String str) {
        return assetManager.open(str);
    }
}
