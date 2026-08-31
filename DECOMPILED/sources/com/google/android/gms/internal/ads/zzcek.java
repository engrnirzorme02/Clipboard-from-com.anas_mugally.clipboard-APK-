package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.client.InterfaceC3318a;
import com.google.android.gms.common.util.InterfaceC3761p;
import java.util.List;
import p157U3.InterfaceFutureC1673e;
import p380w2.C7332a;
import p380w2.InterfaceC7345n;
import p396y2.AbstractBinderC7534v;
import p404z2.C7584a;

/* JADX INFO: loaded from: classes2.dex */
public interface zzcek extends InterfaceC3318a, zzddz, zzceb, zzbmh, zzcfr, zzcfw, zzbmt, zzayi, zzcga, InterfaceC7345n, zzcgd, zzcge, zzcbd, zzcgf {
    boolean canGoBack();

    void destroy();

    @Override // com.google.android.gms.internal.ads.zzcfw, com.google.android.gms.internal.ads.zzcbd
    Context getContext();

    int getHeight();

    ViewGroup.LayoutParams getLayoutParams();

    void getLocationOnScreen(int[] iArr);

    int getMeasuredHeight();

    int getMeasuredWidth();

    ViewParent getParent();

    int getWidth();

    void goBack();

    boolean isAttachedToWindow();

    void loadData(String str, String str2, String str3);

    void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5);

    void loadUrl(String str);

    void measure(int i7, int i8);

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3318a
    /* synthetic */ void onAdClicked();

    void onPause();

    void onResume();

    @Override // com.google.android.gms.internal.ads.zzcbd
    void setBackgroundColor(int i7);

    void setOnClickListener(View.OnClickListener onClickListener);

    void setOnTouchListener(View.OnTouchListener onTouchListener);

    void setWebChromeClient(WebChromeClient webChromeClient);

    void setWebViewClient(WebViewClient webViewClient);

    @Override // com.google.android.gms.internal.ads.zzceb
    zzfcj zzC();

    WebView zzD();

    @Override // com.google.android.gms.internal.ads.zzcgf
    View zzE();

    List zzF();

    void zzG();

    void zzH(int i7);

    void zzI();

    void zzJ();

    Context zzK();

    AbstractBinderC7534v zzL();

    AbstractBinderC7534v zzM();

    @Override // com.google.android.gms.internal.ads.zzcgc
    zzcgt zzN();

    String zzO();

    zzcgi zzP();

    WebViewClient zzQ();

    boolean zzR();

    @Override // com.google.android.gms.internal.ads.zzcgd
    zzauu zzS();

    zzfdg zzT();

    zzedu zzU();

    zzeds zzV();

    boolean zzW();

    boolean zzX();

    void zzY();

    boolean zzZ();

    boolean zzaA(boolean z7, int i7);

    boolean zzaB();

    @Override // com.google.android.gms.internal.ads.zzcfr
    zzfcm zzaC();

    void zzaD(zzfcj zzfcjVar, zzfcm zzfcmVar);

    void zzaE(boolean z7);

    InterfaceFutureC1673e zzaF();

    void zzaG(boolean z7);

    boolean zzaa();

    void zzab(String str, zzbjl zzbjlVar);

    void zzac(String str, zzbjl zzbjlVar);

    void zzad(String str, InterfaceC3761p interfaceC3761p);

    void zzae(AbstractBinderC7534v abstractBinderC7534v);

    void zzaf(zzcgt zzcgtVar);

    void zzag(boolean z7);

    void zzah();

    void zzai(Context context);

    void zzaj(boolean z7);

    void zzak(zzedu zzeduVar);

    void zzal(zzeds zzedsVar);

    void zzam(int i7);

    void zzan(AbstractBinderC7534v abstractBinderC7534v);

    void zzao(boolean z7);

    void zzap();

    void zzaq(zzbfj zzbfjVar);

    zzbfj zzar();

    void zzas(boolean z7);

    void zzat();

    void zzau(String str, String str2, String str3);

    void zzav();

    void zzaw(boolean z7);

    void zzax(zzbfg zzbfgVar);

    void zzay(zzazv zzazvVar);

    zzazv zzaz();

    @Override // p380w2.InterfaceC7345n
    /* synthetic */ void zzdp();

    @Override // p380w2.InterfaceC7345n
    /* synthetic */ void zzdq();

    @Override // com.google.android.gms.internal.ads.zzcbd
    zzcfq zzh();

    @Override // com.google.android.gms.internal.ads.zzcfw, com.google.android.gms.internal.ads.zzcbd
    Activity zzj();

    @Override // com.google.android.gms.internal.ads.zzcbd
    C7332a zzk();

    @Override // com.google.android.gms.internal.ads.zzcbd
    zzbcv zzq();

    @Override // com.google.android.gms.internal.ads.zzcge, com.google.android.gms.internal.ads.zzcbd
    C7584a zzs();

    @Override // com.google.android.gms.internal.ads.zzcbd
    void zzt(String str, zzccq zzccqVar);

    @Override // com.google.android.gms.internal.ads.zzcbd
    void zzw(zzcfq zzcfqVar);
}
