package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import android.util.Log;
import com.bumptech.glide.EnumC3207g;
import java.io.IOException;
import p019C1.EnumC0125a;

/* JADX INFO: renamed from: com.bumptech.glide.load.data.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3217b implements InterfaceC3219d {

    /* JADX INFO: renamed from: a */
    private final String f13803a;

    /* JADX INFO: renamed from: b */
    private final AssetManager f13804b;

    /* JADX INFO: renamed from: c */
    private Object f13805c;

    public AbstractC3217b(AssetManager assetManager, String str) {
        this.f13804b = assetManager;
        this.f13803a = str;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3219d
    /* JADX INFO: renamed from: b */
    public void mo931b() {
        Object obj = this.f13805c;
        if (obj == null) {
            return;
        }
        try {
            mo17109c(obj);
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: c */
    protected abstract void mo17109c(Object obj);

    @Override // com.bumptech.glide.load.data.InterfaceC3219d
    public void cancel() {
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3219d
    /* JADX INFO: renamed from: d */
    public EnumC0125a mo932d() {
        return EnumC0125a.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3219d
    /* JADX INFO: renamed from: e */
    public void mo933e(EnumC3207g enumC3207g, InterfaceC3219d.a aVar) {
        try {
            Object objMo17110f = mo17110f(this.f13804b, this.f13803a);
            this.f13805c = objMo17110f;
            aVar.mo1314f(objMo17110f);
        } catch (IOException e7) {
            if (Log.isLoggable("AssetPathFetcher", 3)) {
                Log.d("AssetPathFetcher", "Failed to load data from asset manager", e7);
            }
            aVar.mo1313c(e7);
        }
    }

    /* JADX INFO: renamed from: f */
    protected abstract Object mo17110f(AssetManager assetManager, String str);
}
