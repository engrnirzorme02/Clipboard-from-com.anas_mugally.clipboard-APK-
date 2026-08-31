package p380w2;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.client.AbstractBinderC3309X;
import com.google.android.gms.ads.internal.client.C3244B;
import com.google.android.gms.ads.internal.client.C3321a2;
import com.google.android.gms.ads.internal.client.C3349h2;
import com.google.android.gms.ads.internal.client.C3356j1;
import com.google.android.gms.ads.internal.client.C3369m2;
import com.google.android.gms.ads.internal.client.C3391s0;
import com.google.android.gms.ads.internal.client.C3393s2;
import com.google.android.gms.ads.internal.client.InterfaceC3262H;
import com.google.android.gms.ads.internal.client.InterfaceC3271K;
import com.google.android.gms.ads.internal.client.InterfaceC3280N;
import com.google.android.gms.ads.internal.client.InterfaceC3301U0;
import com.google.android.gms.ads.internal.client.InterfaceC3328c1;
import com.google.android.gms.ads.internal.client.InterfaceC3331d0;
import com.google.android.gms.ads.internal.client.InterfaceC3340f1;
import com.google.android.gms.ads.internal.client.InterfaceC3375o0;
import com.google.android.gms.ads.internal.client.InterfaceC3403v0;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.dynamic.BinderC3773b;
import com.google.android.gms.dynamic.InterfaceC3772a;
import com.google.android.gms.internal.ads.zzbae;
import com.google.android.gms.internal.ads.zzbdd;
import com.google.android.gms.internal.ads.zzbdu;
import com.google.android.gms.internal.ads.zzbtf;
import com.google.android.gms.internal.ads.zzbti;
import com.google.android.gms.internal.ads.zzbvn;
import java.util.Map;
import p404z2.C7584a;
import p404z2.C7590g;

/* JADX INFO: renamed from: w2.s */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC7350s extends AbstractBinderC3309X {

    /* JADX INFO: renamed from: a */
    private final C7584a f29237a;

    /* JADX INFO: renamed from: b */
    private final C3369m2 f29238b;

    /* JADX INFO: renamed from: c */
    private final Context f29239c;

    /* JADX INFO: renamed from: d */
    private final C7349r f29240d;

    /* JADX INFO: renamed from: e */
    private WebView f29241e;

    /* JADX INFO: renamed from: f */
    private InterfaceC3271K f29242f;

    /* JADX INFO: renamed from: r */
    private AsyncTask f29243r;

    public BinderC7350s(Context context, C3369m2 c3369m2, String str, C7584a c7584a) {
        this.f29239c = context;
        this.f29237a = c7584a;
        this.f29238b = c3369m2;
        this.f29241e = new WebView(context);
        this.f29240d = new C7349r(context, str);
        m32333M0(0);
        this.f29241e.setVerticalScrollBarEnabled(false);
        this.f29241e.getSettings().setJavaScriptEnabled(true);
        this.f29241e.setWebViewClient(new C7346o(this));
        this.f29241e.setOnTouchListener(new ViewOnTouchListenerC7347p(this));
    }

    /* JADX INFO: renamed from: L0 */
    final int m32332L0(String str) {
        String queryParameter = Uri.parse(str).getQueryParameter("height");
        if (TextUtils.isEmpty(queryParameter)) {
            return 0;
        }
        try {
            C3244B.m17190a();
            return C7590g.m33276c(this.f29239c, Integer.parseInt(queryParameter));
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: M0 */
    final void m32333M0(int i7) {
        if (this.f29241e == null) {
            return;
        }
        this.f29241e.setLayoutParams(new ViewGroup.LayoutParams(-1, i7));
    }

    /* JADX INFO: renamed from: N0 */
    final String m32334N0() {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https://").appendEncodedPath((String) zzbdu.zzd.zze());
        C7349r c7349r = this.f29240d;
        builder.appendQueryParameter("query", c7349r.m32327b());
        builder.appendQueryParameter("pubId", c7349r.m32328c());
        builder.appendQueryParameter("mappver", c7349r.m32329d());
        Map mapM32330e = c7349r.m32330e();
        for (String str : mapM32330e.keySet()) {
            builder.appendQueryParameter(str, (String) mapM32330e.get(str));
        }
        Uri uriBuild = builder.build();
        String strM32335O0 = m32335O0();
        String encodedQuery = uriBuild.getEncodedQuery();
        StringBuilder sb = new StringBuilder(strM32335O0.length() + 1 + String.valueOf(encodedQuery).length());
        sb.append(strM32335O0);
        sb.append("#");
        sb.append(encodedQuery);
        return sb.toString();
    }

    /* JADX INFO: renamed from: O0 */
    final String m32335O0() {
        String strM32326a = this.f29240d.m32326a();
        if (true == TextUtils.isEmpty(strM32326a)) {
            strM32326a = "www.google.com";
        }
        String str = (String) zzbdu.zzd.zze();
        StringBuilder sb = new StringBuilder(String.valueOf(strM32326a).length() + 8 + String.valueOf(str).length());
        sb.append("https://");
        sb.append(strM32326a);
        sb.append(str);
        return sb.toString();
    }

    /* JADX INFO: renamed from: P0 */
    final /* synthetic */ void m32336P0(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        this.f29239c.startActivity(intent);
    }

    /* JADX INFO: renamed from: Q0 */
    final /* synthetic */ WebView m32337Q0() {
        return this.f29241e;
    }

    /* JADX INFO: renamed from: R0 */
    final /* synthetic */ InterfaceC3271K m32338R0() {
        return this.f29242f;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final boolean zzA() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final boolean zzB() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final void zzC(zzbvn zzbvnVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final void zzD(String str) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final void zzE(String str) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final InterfaceC3340f1 zzF() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final void zzG(C3321a2 c3321a2) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final void zzH(C3356j1 c3356j1) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final void zzI(C3393s2 c3393s2) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final void zzJ(zzbae zzbaeVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final void zzK(boolean z7) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final void zzP(InterfaceC3301U0 interfaceC3301U0) {
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final void zzQ(C3349h2 c3349h2, InterfaceC3280N interfaceC3280N) {
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final void zzR(InterfaceC3772a interfaceC3772a) {
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final void zzS(InterfaceC3403v0 interfaceC3403v0) {
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final void zzT(long j7) {
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final long zzU() {
        return 0L;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final void zzY(C3391s0 c3391s0) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final InterfaceC3772a zzb() {
        AbstractC3718s.m18076e("getAdFrame must be called on the main UI thread.");
        return BinderC3773b.m18221N0(this.f29241e);
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final void zzc() {
        AbstractC3718s.m18076e("destroy must be called on the main UI thread.");
        this.f29243r.cancel(true);
        this.f29241e.destroy();
        this.f29241e = null;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final boolean zzd() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final void zzdW(InterfaceC3271K interfaceC3271K) {
        this.f29242f = interfaceC3271K;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final boolean zze(C3349h2 c3349h2) {
        AbstractC3718s.m18084m(this.f29241e, "This Search Ad has already been torn down");
        this.f29240d.m32331f(c3349h2, this.f29237a);
        this.f29243r = new AsyncTaskC7348q(this, null).execute(new Void[0]);
        return true;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final void zzf() {
        AbstractC3718s.m18076e("pause must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final void zzg() {
        AbstractC3718s.m18076e("resume must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final void zzi(InterfaceC3375o0 interfaceC3375o0) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final void zzj(InterfaceC3331d0 interfaceC3331d0) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final Bundle zzk() {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final void zzl() {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final void zzm() {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final C3369m2 zzn() {
        return this.f29238b;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final void zzo(C3369m2 c3369m2) {
        throw new IllegalStateException("AdSize must be set before initialization");
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final void zzp(zzbtf zzbtfVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final void zzq(zzbti zzbtiVar, String str) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final String zzr() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final String zzs() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final InterfaceC3328c1 zzt() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final String zzu() {
        throw new IllegalStateException("getAdUnitId not implemented");
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final InterfaceC3375o0 zzv() {
        throw new IllegalStateException("getIAppEventListener not implemented");
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final InterfaceC3271K zzw() {
        throw new IllegalStateException("getIAdListener not implemented");
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final void zzx(zzbdd zzbddVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final void zzy(InterfaceC3262H interfaceC3262H) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final void zzz(boolean z7) {
    }
}
