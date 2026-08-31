package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.util.C3431F0;
import com.google.android.gms.common.util.InterfaceC3761p;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import p157U3.InterfaceFutureC1673e;
import p380w2.C7332a;
import p380w2.C7351t;
import p396y2.AbstractBinderC7534v;
import p396y2.C7524l;
import p404z2.C7584a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcfg extends FrameLayout implements zzcek {
    private final zzcek zza;
    private final zzcas zzb;
    private final AtomicBoolean zzc;

    /* JADX WARN: Multi-variable type inference failed */
    public zzcfg(zzcek zzcekVar, zzdsm zzdsmVar) {
        super(zzcekVar.getContext());
        this.zzc = new AtomicBoolean();
        this.zza = zzcekVar;
        this.zzb = new zzcas(zzcekVar.zzK(), this, this, zzdsmVar);
        addView((View) zzcekVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final boolean canGoBack() {
        return this.zza.canGoBack();
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final void destroy() {
        final zzeds zzedsVarZzV;
        final zzedu zzeduVarZzU = zzU();
        if (zzeduVarZzU != null) {
            zzfro zzfroVar = C3431F0.f14180l;
            zzfroVar.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcff
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    C7351t.m32367y().zzf(zzeduVarZzU.zza());
                }
            });
            final zzcek zzcekVar = this.zza;
            Objects.requireNonNull(zzcekVar);
            zzfroVar.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfc
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzcekVar.destroy();
                }
            }, ((Integer) C3250D.m17200c().zzd(zzbci.zzfK)).intValue());
            return;
        }
        if (!((Boolean) C3250D.m17200c().zzd(zzbci.zzfM)).booleanValue() || (zzedsVarZzV = zzV()) == null) {
            this.zza.destroy();
        } else {
            C3431F0.f14180l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfd
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    final zzcfg zzcfgVar = this.zza;
                    zzedsVarZzV.zze(new zzflu() { // from class: com.google.android.gms.internal.ads.zzcfe
                        @Override // com.google.android.gms.internal.ads.zzflu
                        public final /* synthetic */ void zza(boolean z7) {
                            zzcfgVar.zzaM(true);
                        }
                    });
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final void goBack() {
        this.zza.goBack();
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final void loadData(String str, String str2, String str3) {
        this.zza.loadData(str, "text/html", str3);
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.zza.loadDataWithBaseURL(str, str2, "text/html", "UTF-8", null);
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final void loadUrl(String str) {
        this.zza.loadUrl(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcek, com.google.android.gms.ads.internal.client.InterfaceC3318a
    public final void onAdClicked() {
        zzcek zzcekVar = this.zza;
        if (zzcekVar != null) {
            zzcekVar.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final void onPause() {
        this.zzb.zze();
        this.zza.onPause();
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final void onResume() {
        this.zza.onResume();
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzcek
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.zza.setOnClickListener(onClickListener);
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzcek
    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.zza.setOnTouchListener(onTouchListener);
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final void setWebChromeClient(WebChromeClient webChromeClient) {
        this.zza.setWebChromeClient(webChromeClient);
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final void setWebViewClient(WebViewClient webViewClient) {
        this.zza.setWebViewClient(webViewClient);
    }

    @Override // com.google.android.gms.internal.ads.zzcbd
    public final void zzA(int i7) {
    }

    @Override // com.google.android.gms.internal.ads.zzcbd
    public final void zzB(int i7) {
    }

    @Override // com.google.android.gms.internal.ads.zzcek, com.google.android.gms.internal.ads.zzceb
    public final zzfcj zzC() {
        return this.zza.zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final WebView zzD() {
        return (WebView) this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzcek, com.google.android.gms.internal.ads.zzcgf
    public final View zzE() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final List zzF() {
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            if (childAt != this.zza) {
                arrayList.add(childAt);
            }
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final void zzG() {
        this.zza.zzG();
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final void zzH(int i7) {
        this.zza.zzH(i7);
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final void zzI() {
        this.zza.zzI();
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final void zzJ() {
        this.zza.zzJ();
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final Context zzK() {
        return this.zza.zzK();
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final AbstractBinderC7534v zzL() {
        return this.zza.zzL();
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final AbstractBinderC7534v zzM() {
        return this.zza.zzM();
    }

    @Override // com.google.android.gms.internal.ads.zzcek, com.google.android.gms.internal.ads.zzcgc
    public final zzcgt zzN() {
        return this.zza.zzN();
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final String zzO() {
        return this.zza.zzO();
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final zzcgi zzP() {
        return ((zzcfn) this.zza).zzaS();
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final WebViewClient zzQ() {
        return this.zza.zzQ();
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final boolean zzR() {
        return this.zza.zzR();
    }

    @Override // com.google.android.gms.internal.ads.zzcek, com.google.android.gms.internal.ads.zzcgd
    public final zzauu zzS() {
        return this.zza.zzS();
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final zzfdg zzT() {
        return this.zza.zzT();
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final zzedu zzU() {
        return this.zza.zzU();
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final zzeds zzV() {
        return this.zza.zzV();
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final boolean zzW() {
        return this.zza.zzW();
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final boolean zzX() {
        return this.zza.zzX();
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final void zzY() {
        this.zzb.zzf();
        this.zza.zzY();
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final boolean zzZ() {
        return this.zza.zzZ();
    }

    @Override // com.google.android.gms.internal.ads.zzbmt
    public final void zza(String str) {
        ((zzcfn) this.zza).zzaP(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.ads.zzcek
    public final boolean zzaA(boolean z7, int i7) {
        if (!this.zzc.compareAndSet(false, true)) {
            return true;
        }
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzbb)).booleanValue()) {
            return false;
        }
        zzcek zzcekVar = this.zza;
        if (zzcekVar.getParent() instanceof ViewGroup) {
            ((ViewGroup) zzcekVar.getParent()).removeView((View) zzcekVar);
        }
        zzcekVar.zzaA(z7, i7);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final boolean zzaB() {
        return this.zzc.get();
    }

    @Override // com.google.android.gms.internal.ads.zzcek, com.google.android.gms.internal.ads.zzcfr
    public final zzfcm zzaC() {
        return this.zza.zzaC();
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final void zzaD(zzfcj zzfcjVar, zzfcm zzfcmVar) {
        this.zza.zzaD(zzfcjVar, zzfcmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final void zzaE(boolean z7) {
        this.zza.zzaE(z7);
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final InterfaceFutureC1673e zzaF() {
        return this.zza.zzaF();
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final void zzaG(boolean z7) {
        this.zza.zzaG(true);
    }

    @Override // com.google.android.gms.internal.ads.zzcga
    public final void zzaH(C7524l c7524l, boolean z7, boolean z8, String str) {
        this.zza.zzaH(c7524l, z7, z8, str);
    }

    @Override // com.google.android.gms.internal.ads.zzcga
    public final void zzaI(boolean z7, int i7, boolean z8) {
        this.zza.zzaI(z7, i7, z8);
    }

    @Override // com.google.android.gms.internal.ads.zzcga
    public final void zzaJ(boolean z7, int i7, String str, boolean z8, boolean z9) {
        this.zza.zzaJ(z7, i7, str, z8, z9);
    }

    @Override // com.google.android.gms.internal.ads.zzcga
    public final void zzaK(boolean z7, int i7, String str, String str2, boolean z8) {
        this.zza.zzaK(z7, i7, str, str2, z8);
    }

    @Override // com.google.android.gms.internal.ads.zzcga
    public final void zzaL(String str, String str2, int i7) {
        this.zza.zzaL(str, str2, 14);
    }

    final /* synthetic */ void zzaM(boolean z7) {
        final zzcek zzcekVar = this.zza;
        zzfro zzfroVar = C3431F0.f14180l;
        Objects.requireNonNull(zzcekVar);
        zzfroVar.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfb
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzcekVar.destroy();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final boolean zzaa() {
        return this.zza.zzaa();
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final void zzab(String str, zzbjl zzbjlVar) {
        this.zza.zzab(str, zzbjlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final void zzac(String str, zzbjl zzbjlVar) {
        this.zza.zzac(str, zzbjlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final void zzad(String str, InterfaceC3761p interfaceC3761p) {
        this.zza.zzad(str, interfaceC3761p);
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final void zzae(AbstractBinderC7534v abstractBinderC7534v) {
        this.zza.zzae(abstractBinderC7534v);
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final void zzaf(zzcgt zzcgtVar) {
        this.zza.zzaf(zzcgtVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final void zzag(boolean z7) {
        this.zza.zzag(z7);
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final void zzah() {
        this.zza.zzah();
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final void zzai(Context context) {
        this.zza.zzai(context);
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final void zzaj(boolean z7) {
        this.zza.zzaj(z7);
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final void zzak(zzedu zzeduVar) {
        this.zza.zzak(zzeduVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final void zzal(zzeds zzedsVar) {
        this.zza.zzal(zzedsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final void zzam(int i7) {
        this.zza.zzam(i7);
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final void zzan(AbstractBinderC7534v abstractBinderC7534v) {
        this.zza.zzan(abstractBinderC7534v);
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final void zzao(boolean z7) {
        this.zza.zzao(z7);
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final void zzap() {
        this.zza.zzap();
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final void zzaq(zzbfj zzbfjVar) {
        this.zza.zzaq(zzbfjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final zzbfj zzar() {
        return this.zza.zzar();
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final void zzas(boolean z7) {
        this.zza.zzas(z7);
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final void zzat() {
        setBackgroundColor(0);
        this.zza.setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final void zzau(String str, String str2, String str3) {
        this.zza.zzau(str, str2, null);
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final void zzav() {
        zzedu zzeduVarZzU;
        zzeds zzedsVarZzV;
        TextView textView = new TextView(getContext());
        C7351t.m32349g();
        textView.setText(C3431F0.m17404c());
        textView.setTextSize(15.0f);
        textView.setTextColor(-1);
        textView.setPadding(5, 0, 5, 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(-12303292);
        gradientDrawable.setCornerRadius(8.0f);
        textView.setBackground(gradientDrawable);
        addView(textView, new FrameLayout.LayoutParams(-2, -2, 49));
        bringChildToFront(textView);
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzfM)).booleanValue() && (zzedsVarZzV = zzV()) != null) {
            zzedsVarZzV.zzf(textView);
        } else if (((Boolean) C3250D.m17200c().zzd(zzbci.zzfL)).booleanValue() && (zzeduVarZzU = zzU()) != null && zzeduVarZzU.zzb()) {
            C7351t.m32367y().zzg(zzeduVarZzU.zza(), textView);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final void zzaw(boolean z7) {
        this.zza.zzaw(z7);
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final void zzax(zzbfg zzbfgVar) {
        this.zza.zzax(zzbfgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final void zzay(zzazv zzazvVar) {
        this.zza.zzay(zzazvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final zzazv zzaz() {
        return this.zza.zzaz();
    }

    @Override // com.google.android.gms.internal.ads.zzbmt
    public final void zzb(String str, JSONObject jSONObject) {
        ((zzcfn) this.zza).zzc(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzbmt
    public final void zzc(String str, String str2) {
        this.zza.zzc("window.inspectorInfo", str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbmh
    public final void zzd(String str, JSONObject jSONObject) {
        this.zza.zzd(str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzddz
    public final void zzdV() {
        zzcek zzcekVar = this.zza;
        if (zzcekVar != null) {
            zzcekVar.zzdV();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzayi
    public final void zzdo(zzayh zzayhVar) {
        this.zza.zzdo(zzayhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcek, p380w2.InterfaceC7345n
    public final void zzdp() {
        this.zza.zzdp();
    }

    @Override // com.google.android.gms.internal.ads.zzcek, p380w2.InterfaceC7345n
    public final void zzdq() {
        this.zza.zzdq();
    }

    @Override // com.google.android.gms.internal.ads.zzcbd
    public final zzcas zzdr() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzcbd
    public final void zzds(boolean z7) {
        this.zza.zzds(false);
    }

    @Override // com.google.android.gms.internal.ads.zzddz
    public final void zzdz() {
        zzcek zzcekVar = this.zza;
        if (zzcekVar != null) {
            zzcekVar.zzdz();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbmh
    public final void zze(String str, Map map) {
        this.zza.zze(str, map);
    }

    @Override // com.google.android.gms.internal.ads.zzcek, com.google.android.gms.internal.ads.zzcbd
    public final zzcfq zzh() {
        return this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzcbd
    public final zzbcu zzi() {
        return this.zza.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzcek, com.google.android.gms.internal.ads.zzcfw, com.google.android.gms.internal.ads.zzcbd
    public final Activity zzj() {
        return this.zza.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzcek, com.google.android.gms.internal.ads.zzcbd
    public final C7332a zzk() {
        return this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzcbd
    public final void zzl() {
        this.zza.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzcbd
    public final String zzm() {
        return this.zza.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzcbd
    public final String zzn() {
        return this.zza.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzcbd
    public final void zzo(int i7) {
        this.zza.zzo(i7);
    }

    @Override // com.google.android.gms.internal.ads.zzcbd
    public final int zzp() {
        return this.zza.zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzcek, com.google.android.gms.internal.ads.zzcbd
    public final zzbcv zzq() {
        return this.zza.zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzcbd
    public final zzccq zzr(String str) {
        return this.zza.zzr(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcek, com.google.android.gms.internal.ads.zzcge, com.google.android.gms.internal.ads.zzcbd
    public final C7584a zzs() {
        return this.zza.zzs();
    }

    @Override // com.google.android.gms.internal.ads.zzcek, com.google.android.gms.internal.ads.zzcbd
    public final void zzt(String str, zzccq zzccqVar) {
        this.zza.zzt(str, zzccqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcbd
    public final void zzu(boolean z7, long j7) {
        this.zza.zzu(z7, j7);
    }

    @Override // com.google.android.gms.internal.ads.zzcbd
    public final void zzv(int i7) {
        this.zzb.zzg(i7);
    }

    @Override // com.google.android.gms.internal.ads.zzcek, com.google.android.gms.internal.ads.zzcbd
    public final void zzw(zzcfq zzcfqVar) {
        this.zza.zzw(zzcfqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcbd
    public final int zzx() {
        return ((Boolean) C3250D.m17200c().zzd(zzbci.zzeo)).booleanValue() ? this.zza.getMeasuredHeight() : getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.zzcbd
    public final int zzy() {
        return ((Boolean) C3250D.m17200c().zzd(zzbci.zzeo)).booleanValue() ? this.zza.getMeasuredWidth() : getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.zzcbd
    public final void zzz() {
        this.zza.zzz();
    }
}
