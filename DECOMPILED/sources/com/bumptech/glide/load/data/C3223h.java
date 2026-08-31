package com.bumptech.glide.load.data;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import java.io.IOException;

/* JADX INFO: renamed from: com.bumptech.glide.load.data.h */
/* JADX INFO: loaded from: classes.dex */
public class C3223h extends AbstractC3217b {
    public C3223h(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3219d
    /* JADX INFO: renamed from: a */
    public Class mo930a() {
        return AssetFileDescriptor.class;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.load.data.AbstractC3217b
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void mo17109c(AssetFileDescriptor assetFileDescriptor) throws IOException {
        assetFileDescriptor.close();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.load.data.AbstractC3217b
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public AssetFileDescriptor mo17110f(AssetManager assetManager, String str) {
        return assetManager.openFd(str);
    }
}
