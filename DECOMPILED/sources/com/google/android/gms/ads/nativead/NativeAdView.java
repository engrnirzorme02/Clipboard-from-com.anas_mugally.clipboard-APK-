package com.google.android.gms.ads.nativead;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.gms.ads.internal.client.C3244B;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.client.C3255E1;
import com.google.android.gms.dynamic.BinderC3773b;
import com.google.android.gms.dynamic.InterfaceC3772a;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbfi;
import com.google.android.gms.internal.ads.zzbfk;
import com.google.android.gms.internal.ads.zzbga;
import p314o2.InterfaceC6562n;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes.dex */
public final class NativeAdView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    private final FrameLayout f14376a;

    /* JADX INFO: renamed from: b */
    private final zzbga f14377b;

    public NativeAdView(Context context) {
        super(context);
        this.f14376a = m17605e(context);
        this.f14377b = m17606f();
    }

    /* JADX INFO: renamed from: d */
    private final void m17604d(String str, View view) {
        zzbga zzbgaVar = this.f14377b;
        if (zzbgaVar == null) {
            return;
        }
        try {
            zzbgaVar.zzb(str, BinderC3773b.m18221N0(view));
        } catch (RemoteException e7) {
            AbstractC7599p.m33329d("Unable to call setAssetView on delegate", e7);
        }
    }

    /* JADX INFO: renamed from: e */
    private final FrameLayout m17605e(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(frameLayout);
        return frameLayout;
    }

    /* JADX INFO: renamed from: f */
    private final zzbga m17606f() {
        if (isInEditMode()) {
            return null;
        }
        FrameLayout frameLayout = this.f14376a;
        return C3244B.m17191b().m17349e(frameLayout.getContext(), this, frameLayout);
    }

    /* JADX INFO: renamed from: a */
    protected final View m17607a(String str) {
        zzbga zzbgaVar = this.f14377b;
        if (zzbgaVar != null) {
            try {
                InterfaceC3772a interfaceC3772aZzc = zzbgaVar.zzc(str);
                if (interfaceC3772aZzc != null) {
                    return (View) BinderC3773b.m18220M0(interfaceC3772aZzc);
                }
            } catch (RemoteException e7) {
                AbstractC7599p.m33329d("Unable to call getAssetView on delegate", e7);
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i7, layoutParams);
        super.bringChildToFront(this.f14376a);
    }

    /* JADX INFO: renamed from: b */
    final /* synthetic */ void m17608b(InterfaceC6562n interfaceC6562n) {
        zzbga zzbgaVar = this.f14377b;
        if (zzbgaVar == null) {
            return;
        }
        try {
            if (interfaceC6562n instanceof C3255E1) {
                zzbgaVar.zzdI(((C3255E1) interfaceC6562n).m17205b());
            } else if (interfaceC6562n == null) {
                zzbgaVar.zzdI(null);
            } else {
                AbstractC7599p.m33326a("Use MediaContent provided by NativeAd.getMediaContent");
            }
        } catch (RemoteException e7) {
            AbstractC7599p.m33329d("Unable to call setMediaContent on delegate", e7);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void bringChildToFront(View view) {
        super.bringChildToFront(view);
        FrameLayout frameLayout = this.f14376a;
        if (frameLayout != view) {
            super.bringChildToFront(frameLayout);
        }
    }

    /* JADX INFO: renamed from: c */
    final /* synthetic */ void m17609c(ImageView.ScaleType scaleType) {
        zzbga zzbgaVar = this.f14377b;
        if (zzbgaVar == null || scaleType == null) {
            return;
        }
        try {
            zzbgaVar.zzdG(BinderC3773b.m18221N0(scaleType));
        } catch (RemoteException e7) {
            AbstractC7599p.m33329d("Unable to call setMediaViewImageScaleType on delegate", e7);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        zzbga zzbgaVar = this.f14377b;
        if (zzbgaVar != null) {
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzmp)).booleanValue()) {
                try {
                    zzbgaVar.zzdH(BinderC3773b.m18221N0(motionEvent));
                } catch (RemoteException e7) {
                    AbstractC7599p.m33329d("Unable to call handleTouchEvent on delegate", e7);
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public AbstractC3520a getAdChoicesView() {
        m17607a("3011");
        return null;
    }

    public final View getAdvertiserView() {
        return m17607a("3005");
    }

    public final View getBodyView() {
        return m17607a("3004");
    }

    public final View getCallToActionView() {
        return m17607a("3002");
    }

    public final View getHeadlineView() {
        return m17607a("3001");
    }

    public final View getIconView() {
        return m17607a("3003");
    }

    public final View getImageView() {
        return m17607a("3008");
    }

    public final MediaView getMediaView() {
        View viewM17607a = m17607a("3010");
        if (viewM17607a instanceof MediaView) {
            return (MediaView) viewM17607a;
        }
        if (viewM17607a == null) {
            return null;
        }
        AbstractC7599p.m33326a("View is not an instance of MediaView");
        return null;
    }

    public final View getPriceView() {
        return m17607a("3007");
    }

    public final View getStarRatingView() {
        return m17607a("3009");
    }

    public final View getStoreView() {
        return m17607a("3006");
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i7) {
        super.onVisibilityChanged(view, i7);
        zzbga zzbgaVar = this.f14377b;
        if (zzbgaVar == null) {
            return;
        }
        try {
            zzbgaVar.zzf(BinderC3773b.m18221N0(view), i7);
        } catch (RemoteException e7) {
            AbstractC7599p.m33329d("Unable to call onVisibilityChanged on delegate", e7);
        }
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        super.removeAllViews();
        super.addView(this.f14376a);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.f14376a == view) {
            return;
        }
        super.removeView(view);
    }

    public void setAdChoicesView(AbstractC3520a abstractC3520a) {
        m17604d("3011", abstractC3520a);
    }

    public final void setAdvertiserView(View view) {
        m17604d("3005", view);
    }

    public final void setBodyView(View view) {
        m17604d("3004", view);
    }

    public final void setCallToActionView(View view) {
        m17604d("3002", view);
    }

    public final void setClickConfirmingView(View view) {
        zzbga zzbgaVar = this.f14377b;
        if (zzbgaVar == null) {
            return;
        }
        try {
            zzbgaVar.zzg(BinderC3773b.m18221N0(view));
        } catch (RemoteException e7) {
            AbstractC7599p.m33329d("Unable to call setClickConfirmingView on delegate", e7);
        }
    }

    public final void setHeadlineView(View view) {
        m17604d("3001", view);
    }

    public final void setIconView(View view) {
        m17604d("3003", view);
    }

    public final void setImageView(View view) {
        m17604d("3008", view);
    }

    public final void setMediaView(MediaView mediaView) {
        m17604d("3010", mediaView);
        if (mediaView == null) {
            return;
        }
        mediaView.m17602a(new zzbfi() { // from class: com.google.android.gms.ads.nativead.e
            @Override // com.google.android.gms.internal.ads.zzbfi
            public final /* synthetic */ void zza(InterfaceC6562n interfaceC6562n) {
                this.f14397a.m17608b(interfaceC6562n);
            }
        });
        mediaView.m17603b(new zzbfk() { // from class: com.google.android.gms.ads.nativead.d
            @Override // com.google.android.gms.internal.ads.zzbfk
            public final /* synthetic */ void zza(ImageView.ScaleType scaleType) {
                this.f14396a.m17609c(scaleType);
            }
        });
    }

    public void setNativeAd(NativeAd nativeAd) {
        zzbga zzbgaVar = this.f14377b;
        if (zzbgaVar == null) {
            return;
        }
        try {
            zzbgaVar.zzd((InterfaceC3772a) nativeAd.zza());
        } catch (RemoteException e7) {
            AbstractC7599p.m33329d("Unable to call setNativeAd on delegate", e7);
        }
    }

    public final void setPriceView(View view) {
        m17604d("3007", view);
    }

    public final void setStarRatingView(View view) {
        m17604d("3009", view);
    }

    public final void setStoreView(View view) {
        m17604d("3006", view);
    }

    public NativeAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14376a = m17605e(context);
        this.f14377b = m17606f();
    }
}
