package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.EnumC3207g;
import java.io.FileNotFoundException;
import java.io.IOException;
import p019C1.EnumC0125a;
import p027D1.AbstractC0183c;

/* JADX INFO: renamed from: com.bumptech.glide.load.data.l */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3227l implements InterfaceC3219d {

    /* JADX INFO: renamed from: a */
    protected final boolean f13827a;

    /* JADX INFO: renamed from: b */
    private final Uri f13828b;

    /* JADX INFO: renamed from: c */
    private final ContentResolver f13829c;

    /* JADX INFO: renamed from: d */
    private Object f13830d;

    AbstractC3227l(ContentResolver contentResolver, Uri uri, boolean z7) {
        this.f13829c = contentResolver;
        this.f13828b = uri;
        this.f13827a = z7;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3219d
    /* JADX INFO: renamed from: b */
    public void mo931b() {
        Object obj = this.f13830d;
        if (obj != null) {
            try {
                mo17105c(obj);
            } catch (IOException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: c */
    protected abstract void mo17105c(Object obj);

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
    public final void mo933e(EnumC3207g enumC3207g, InterfaceC3219d.a aVar) {
        try {
            Object objMo17106f = mo17106f(this.f13828b, this.f13829c);
            this.f13830d = objMo17106f;
            aVar.mo1314f(objMo17106f);
        } catch (FileNotFoundException e7) {
            if (Log.isLoggable("LocalUriFetcher", 3)) {
                Log.d("LocalUriFetcher", "Failed to open Uri", e7);
            }
            aVar.mo1313c(e7);
        }
    }

    /* JADX INFO: renamed from: f */
    protected abstract Object mo17106f(Uri uri, ContentResolver contentResolver);

    /* JADX INFO: renamed from: g */
    protected AssetFileDescriptor m17130g(Uri uri) {
        return (this.f13827a && AbstractC0183c.m921d(uri) && AbstractC0183c.m920c()) ? AbstractC0183c.m925h(uri, this.f13829c) : this.f13829c.openAssetFileDescriptor(uri, "r");
    }
}
