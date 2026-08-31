package com.google.android.gms.ads.internal.client;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import com.google.android.gms.internal.ads.zzbga;
import com.google.android.gms.internal.ads.zzbhs;
import com.google.android.gms.internal.ads.zzbht;
import com.google.android.gms.internal.ads.zzbko;
import com.google.android.gms.internal.ads.zzbox;
import com.google.android.gms.internal.ads.zzbsp;
import com.google.android.gms.internal.ads.zzbst;
import com.google.android.gms.internal.ads.zzbsw;
import com.google.android.gms.internal.ads.zzbtv;
import com.google.android.gms.internal.ads.zzbwa;
import com.google.android.gms.internal.ads.zzbwm;
import com.google.android.gms.internal.ads.zzbye;
import p348s2.InterfaceC7004b;
import p404z2.AbstractC7599p;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.client.y */
/* JADX INFO: loaded from: classes.dex */
public final class C3411y {

    /* JADX INFO: renamed from: a */
    private final C3341f2 f14119a;

    /* JADX INFO: renamed from: b */
    private final C3333d2 f14120b;

    /* JADX INFO: renamed from: c */
    private final C3258F1 f14121c;

    /* JADX INFO: renamed from: d */
    private final zzbhs f14122d;

    /* JADX INFO: renamed from: e */
    private final zzbst f14123e;

    /* JADX INFO: renamed from: f */
    private final zzbht f14124f;

    /* JADX INFO: renamed from: g */
    private zzbtv f14125g;

    /* JADX INFO: renamed from: h */
    private final C3345g2 f14126h;

    public C3411y(C3341f2 c3341f2, C3333d2 c3333d2, C3258F1 c3258f1, zzbhs zzbhsVar, zzbwm zzbwmVar, zzbst zzbstVar, zzbht zzbhtVar, C3345g2 c3345g2) {
        this.f14119a = c3341f2;
        this.f14120b = c3333d2;
        this.f14121c = c3258f1;
        this.f14122d = zzbhsVar;
        this.f14123e = zzbstVar;
        this.f14124f = zzbhtVar;
        this.f14126h = c3345g2;
    }

    /* JADX INFO: renamed from: l */
    static /* synthetic */ void m17344l(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("action", "no_ads_fallback");
        bundle.putString("flow", str);
        C3244B.m17190a().m33295q(context, C3244B.m17193d().f30226a, "gmob-apps", bundle, true);
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC3312Y m17345a(Context context, C3369m2 c3369m2, String str, zzbox zzboxVar) {
        return (InterfaceC3312Y) new C3370n(this, context, c3369m2, str, zzboxVar).m17188d(context, false);
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC3312Y m17346b(Context context, C3369m2 c3369m2, String str, zzbox zzboxVar) {
        return (InterfaceC3312Y) new C3378p(this, context, c3369m2, str, zzboxVar).m17188d(context, false);
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC3300U m17347c(Context context, String str, zzbox zzboxVar) {
        return (InterfaceC3300U) new C3386r(this, context, str, zzboxVar).m17188d(context, false);
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC3359k0 m17348d(Context context, zzbox zzboxVar) {
        return (InterfaceC3359k0) new C3394t(this, context, zzboxVar).m17188d(context, false);
    }

    /* JADX INFO: renamed from: e */
    public final zzbga m17349e(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        return (zzbga) new C3408x(this, frameLayout, frameLayout2, context).m17188d(context, false);
    }

    /* JADX INFO: renamed from: f */
    public final zzbwa m17350f(Context context, String str, zzbox zzboxVar) {
        return (zzbwa) new C3322b(this, context, str, zzboxVar).m17188d(context, false);
    }

    /* JADX INFO: renamed from: g */
    public final zzbsw m17351g(Activity activity) {
        C3330d c3330d = new C3330d(this, activity);
        Intent intent = activity.getIntent();
        boolean booleanExtra = false;
        if (intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
            booleanExtra = intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
        } else {
            AbstractC7599p.m33328c("useClientJar flag not found in activity intent extras.");
        }
        return (zzbsw) c3330d.m17188d(activity, booleanExtra);
    }

    /* JADX INFO: renamed from: h */
    public final InterfaceC3310X0 m17352h(Context context, zzbox zzboxVar) {
        return (InterfaceC3310X0) new C3338f(this, context, zzboxVar).m17188d(context, false);
    }

    /* JADX INFO: renamed from: i */
    public final zzbye m17353i(Context context, zzbox zzboxVar) {
        return (zzbye) new C3346h(this, context, zzboxVar).m17188d(context, false);
    }

    /* JADX INFO: renamed from: j */
    public final zzbsp m17354j(Context context, zzbox zzboxVar) {
        return (zzbsp) new C3354j(this, context, zzboxVar).m17188d(context, false);
    }

    /* JADX INFO: renamed from: k */
    public final zzbko m17355k(Context context, zzbox zzboxVar, InterfaceC7004b interfaceC7004b) {
        return (zzbko) new C3362l(this, context, zzboxVar, interfaceC7004b).m17188d(context, false);
    }

    /* JADX INFO: renamed from: m */
    final /* synthetic */ C3341f2 m17356m() {
        return this.f14119a;
    }

    /* JADX INFO: renamed from: n */
    final /* synthetic */ C3333d2 m17357n() {
        return this.f14120b;
    }

    /* JADX INFO: renamed from: o */
    final /* synthetic */ C3258F1 m17358o() {
        return this.f14121c;
    }

    /* JADX INFO: renamed from: p */
    final /* synthetic */ zzbhs m17359p() {
        return this.f14122d;
    }

    /* JADX INFO: renamed from: q */
    final /* synthetic */ zzbst m17360q() {
        return this.f14123e;
    }

    /* JADX INFO: renamed from: r */
    final /* synthetic */ zzbtv m17361r() {
        return this.f14125g;
    }

    /* JADX INFO: renamed from: s */
    final /* synthetic */ void m17362s(zzbtv zzbtvVar) {
        this.f14125g = zzbtvVar;
    }

    /* JADX INFO: renamed from: t */
    final /* synthetic */ C3345g2 m17363t() {
        return this.f14126h;
    }
}
