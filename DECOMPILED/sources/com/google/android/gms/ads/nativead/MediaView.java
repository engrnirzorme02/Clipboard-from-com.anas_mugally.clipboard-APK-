package com.google.android.gms.ads.nativead;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.gms.dynamic.BinderC3773b;
import com.google.android.gms.internal.ads.zzbfi;
import com.google.android.gms.internal.ads.zzbfk;
import com.google.android.gms.internal.ads.zzbgq;
import p314o2.InterfaceC6562n;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes.dex */
public class MediaView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    private InterfaceC6562n f14370a;

    /* JADX INFO: renamed from: b */
    private boolean f14371b;

    /* JADX INFO: renamed from: c */
    private zzbfi f14372c;

    /* JADX INFO: renamed from: d */
    private ImageView.ScaleType f14373d;

    /* JADX INFO: renamed from: e */
    private boolean f14374e;

    /* JADX INFO: renamed from: f */
    private zzbfk f14375f;

    public MediaView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    protected final synchronized void m17602a(zzbfi zzbfiVar) {
        this.f14372c = zzbfiVar;
        if (this.f14371b) {
            zzbfiVar.zza(this.f14370a);
        }
    }

    /* JADX INFO: renamed from: b */
    protected final synchronized void m17603b(zzbfk zzbfkVar) {
        this.f14375f = zzbfkVar;
        if (this.f14374e) {
            zzbfkVar.zza(this.f14373d);
        }
    }

    public InterfaceC6562n getMediaContent() {
        return this.f14370a;
    }

    public void setImageScaleType(ImageView.ScaleType scaleType) {
        this.f14374e = true;
        this.f14373d = scaleType;
        zzbfk zzbfkVar = this.f14375f;
        if (zzbfkVar != null) {
            zzbfkVar.zza(scaleType);
        }
    }

    public void setMediaContent(InterfaceC6562n interfaceC6562n) {
        boolean zZzt;
        this.f14371b = true;
        this.f14370a = interfaceC6562n;
        zzbfi zzbfiVar = this.f14372c;
        if (zzbfiVar != null) {
            zzbfiVar.zza(interfaceC6562n);
        }
        if (interfaceC6562n == null) {
            return;
        }
        try {
            zzbgq zzbgqVarZzb = interfaceC6562n.zzb();
            if (zzbgqVarZzb != null) {
                if (!interfaceC6562n.mo17204a()) {
                    if (interfaceC6562n.zza()) {
                        zZzt = zzbgqVarZzb.zzt(BinderC3773b.m18221N0(this));
                    }
                    removeAllViews();
                }
                zZzt = zzbgqVarZzb.zzn(BinderC3773b.m18221N0(this));
                if (zZzt) {
                    return;
                }
                removeAllViews();
            }
        } catch (RemoteException e7) {
            removeAllViews();
            AbstractC7599p.m33329d("", e7);
        }
    }

    public MediaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
