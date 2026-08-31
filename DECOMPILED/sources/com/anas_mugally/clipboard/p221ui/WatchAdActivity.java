package com.anas_mugally.clipboard.p221ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import androidx.databinding.AbstractC2473f;
import com.anas_mugally.clipboard.R;
import com.anas_mugally.clipboard.p221ui.WatchAdActivity;
import com.anas_mugally.clipboard.p221ui.ads.AbstractActivityC3130a;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import p068I2.InterfaceC0607b;
import p145S5.AbstractC1430h;
import p145S5.C1444v;
import p145S5.InterfaceC1429g;
import p152T5.AbstractC1617O;
import p233e1.AbstractC5258B0;
import p238e6.InterfaceC5356a;
import p238e6.InterfaceC5367l;

/* JADX INFO: loaded from: classes.dex */
public final class WatchAdActivity extends AbstractActivityC3130a implements View.OnClickListener {

    /* JADX INFO: renamed from: J0 */
    public static final C3108a f12879J0 = new C3108a(null);

    /* JADX INFO: renamed from: D0 */
    private String f12883D0;

    /* JADX INFO: renamed from: E0 */
    private String f12884E0;

    /* JADX INFO: renamed from: F0 */
    private String f12885F0;

    /* JADX INFO: renamed from: G0 */
    private String f12886G0;

    /* JADX INFO: renamed from: H0 */
    private AbstractC5258B0 f12887H0;

    /* JADX INFO: renamed from: A0 */
    private final InterfaceC1429g f12880A0 = AbstractC1430h.m6066b(new InterfaceC5356a() { // from class: l1.S1
        @Override // p238e6.InterfaceC5356a
        public final Object invoke() {
            return WatchAdActivity.m15784y3();
        }
    });

    /* JADX INFO: renamed from: B0 */
    private final InterfaceC1429g f12881B0 = AbstractC1430h.m6066b(new InterfaceC5356a() { // from class: l1.T1
        @Override // p238e6.InterfaceC5356a
        public final Object invoke() {
            return WatchAdActivity.m15766F3(this.f23977a);
        }
    });

    /* JADX INFO: renamed from: C0 */
    private final InterfaceC5367l f12882C0 = new InterfaceC5367l() { // from class: l1.U1
        @Override // p238e6.InterfaceC5367l
        public final Object invoke(Object obj) {
            return WatchAdActivity.m15765E3(this.f23979a, (InterfaceC0607b) obj);
        }
    };

    /* JADX INFO: renamed from: I0 */
    private long f12888I0 = System.currentTimeMillis();

    /* JADX INFO: renamed from: com.anas_mugally.clipboard.ui.WatchAdActivity$a */
    public static final class C3108a {
        public /* synthetic */ C3108a(AbstractC6112h abstractC6112h) {
            this();
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ Intent m15789b(C3108a c3108a, Context context, String str, String str2, String str3, String str4, int i7, Object obj) {
            if ((i7 & 4) != 0) {
                str2 = AbstractActivityC3130a.f13021g0.m16270d();
            }
            String str5 = str2;
            if ((i7 & 8) != 0) {
                str3 = AbstractActivityC3130a.f13021g0.m16271e();
            }
            String str6 = str3;
            if ((i7 & 16) != 0) {
                str4 = AbstractActivityC3130a.f13021g0.m16272f();
            }
            return c3108a.m15790a(context, str, str5, str6, str4);
        }

        /* JADX INFO: renamed from: a */
        public final Intent m15790a(Context context, String textDescription, String interstitialUnit, String rewardedUnit, String rewardedInterstitialUnit) {
            AbstractC6118n.m27187e(context, "context");
            AbstractC6118n.m27187e(textDescription, "textDescription");
            AbstractC6118n.m27187e(interstitialUnit, "interstitialUnit");
            AbstractC6118n.m27187e(rewardedUnit, "rewardedUnit");
            AbstractC6118n.m27187e(rewardedInterstitialUnit, "rewardedInterstitialUnit");
            Intent intent = new Intent(context, (Class<?>) WatchAdActivity.class);
            intent.putExtra("TEXT_DESCRIPTION", textDescription);
            intent.putExtra("INTERSTITIAL_UNIT", interstitialUnit);
            intent.putExtra("REWARDED_UNIT", rewardedUnit);
            intent.putExtra("INTERSTITIAL_REWARDED_UNIT", rewardedInterstitialUnit);
            return intent;
        }

        private C3108a() {
        }
    }

    /* JADX INFO: renamed from: com.anas_mugally.clipboard.ui.WatchAdActivity$b */
    public static final class C3109b implements AbstractActivityC3130a.c {
        C3109b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: f */
        public static final C1444v m15792f(WatchAdActivity watchAdActivity) {
            watchAdActivity.m15788v3().invoke(null);
            return C1444v.f4971a;
        }

        @Override // com.anas_mugally.clipboard.p221ui.ads.AbstractActivityC3130a.c
        /* JADX INFO: renamed from: a */
        public void mo15793a() {
            AbstractActivityC3130a.c.a.m16265b(this);
        }

        @Override // com.anas_mugally.clipboard.p221ui.ads.AbstractActivityC3130a.c
        /* JADX INFO: renamed from: b */
        public void mo15794b() {
            AbstractActivityC3130a.c.a.m16264a(this);
        }

        @Override // com.anas_mugally.clipboard.p221ui.ads.AbstractActivityC3130a.c
        /* JADX INFO: renamed from: c */
        public void mo15795c() {
            final WatchAdActivity watchAdActivity = WatchAdActivity.this;
            watchAdActivity.m16261j3(new InterfaceC5356a() { // from class: l1.c2
                @Override // p238e6.InterfaceC5356a
                public final Object invoke() {
                    return WatchAdActivity.C3109b.m15792f(watchAdActivity);
                }
            });
        }

        @Override // com.anas_mugally.clipboard.p221ui.ads.AbstractActivityC3130a.c
        /* JADX INFO: renamed from: d */
        public void mo15796d(boolean z7) {
            WatchAdActivity.this.m15788v3().invoke(null);
        }
    }

    /* JADX INFO: renamed from: com.anas_mugally.clipboard.ui.WatchAdActivity$c */
    public static final class C3110c implements AbstractActivityC3130a.b {
        C3110c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: f */
        public static final C1444v m15798f(WatchAdActivity watchAdActivity) {
            watchAdActivity.m15788v3().invoke(null);
            return C1444v.f4971a;
        }

        @Override // com.anas_mugally.clipboard.p221ui.ads.AbstractActivityC3130a.b
        /* JADX INFO: renamed from: a */
        public void mo15799a() {
            AbstractActivityC3130a.b.a.m16263b(this);
        }

        @Override // com.anas_mugally.clipboard.p221ui.ads.AbstractActivityC3130a.b
        /* JADX INFO: renamed from: b */
        public void mo15800b() {
            AbstractActivityC3130a.b.a.m16262a(this);
        }

        @Override // com.anas_mugally.clipboard.p221ui.ads.AbstractActivityC3130a.b
        /* JADX INFO: renamed from: c */
        public void mo15801c() {
            final WatchAdActivity watchAdActivity = WatchAdActivity.this;
            watchAdActivity.m16261j3(new InterfaceC5356a() { // from class: l1.d2
                @Override // p238e6.InterfaceC5356a
                public final Object invoke() {
                    return WatchAdActivity.C3110c.m15798f(watchAdActivity);
                }
            });
        }

        @Override // com.anas_mugally.clipboard.p221ui.ads.AbstractActivityC3130a.b
        /* JADX INFO: renamed from: d */
        public void mo15802d(InterfaceC0607b interfaceC0607b) {
            WatchAdActivity.this.m15788v3().invoke(interfaceC0607b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A3 */
    public static final C1444v m15761A3(WatchAdActivity watchAdActivity) {
        AbstractC5258B0 abstractC5258B0 = watchAdActivity.f12887H0;
        AbstractC5258B0 abstractC5258B1 = null;
        if (abstractC5258B0 == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5258B0 = null;
        }
        abstractC5258B0.f20024z.setVisibility(8);
        AbstractC5258B0 abstractC5258B2 = watchAdActivity.f12887H0;
        if (abstractC5258B2 == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5258B2 = null;
        }
        abstractC5258B2.f20023y.setVisibility(0);
        AbstractC5258B0 abstractC5258B3 = watchAdActivity.f12887H0;
        if (abstractC5258B3 == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5258B3 = null;
        }
        abstractC5258B3.f20023y.setImageResource(R.drawable.ic_round_check_circle_outline_24);
        AbstractC5258B0 abstractC5258B4 = watchAdActivity.f12887H0;
        if (abstractC5258B4 == null) {
            AbstractC6118n.m27197o("binding");
        } else {
            abstractC5258B1 = abstractC5258B4;
        }
        abstractC5258B1.f20022x.setOnClickListener(watchAdActivity);
        return C1444v.f4971a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B3 */
    public static final void m15762B3(final InterfaceC5356a interfaceC5356a, final WatchAdActivity watchAdActivity, final boolean z7) {
        Log.d("anas_ads_r", String.valueOf(z7));
        if (z7) {
            interfaceC5356a.invoke();
            return;
        }
        String str = watchAdActivity.f12886G0;
        if (str == null) {
            AbstractC6118n.m27197o("rewardedInterstitialUnit");
            str = null;
        }
        watchAdActivity.m16256X2(str, new AbstractActivityC3130a.a() { // from class: l1.Z1
            @Override // com.anas_mugally.clipboard.p221ui.ads.AbstractActivityC3130a.a
            /* JADX INFO: renamed from: a */
            public final void mo8536a(boolean z8) {
                WatchAdActivity.m15763C3(z7, interfaceC5356a, watchAdActivity, z8);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C3 */
    public static final void m15763C3(final boolean z7, final InterfaceC5356a interfaceC5356a, final WatchAdActivity watchAdActivity, boolean z8) {
        Log.d("anas_ads_ri", String.valueOf(z7));
        if (z8) {
            interfaceC5356a.invoke();
            return;
        }
        String str = watchAdActivity.f12884E0;
        if (str == null) {
            AbstractC6118n.m27197o("interstitialUnit");
            str = null;
        }
        watchAdActivity.m16253Q2(str, new AbstractActivityC3130a.a() { // from class: l1.b2
            @Override // com.anas_mugally.clipboard.p221ui.ads.AbstractActivityC3130a.a
            /* JADX INFO: renamed from: a */
            public final void mo8536a(boolean z9) {
                WatchAdActivity.m15764D3(z7, interfaceC5356a, watchAdActivity, z9);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D3 */
    public static final void m15764D3(boolean z7, InterfaceC5356a interfaceC5356a, WatchAdActivity watchAdActivity, boolean z8) {
        Log.d("anas_ads_i", String.valueOf(z7));
        if (z8) {
            interfaceC5356a.invoke();
        } else {
            watchAdActivity.m15783x3();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E3 */
    public static final C1444v m15765E3(WatchAdActivity watchAdActivity, InterfaceC0607b interfaceC0607b) {
        String type;
        Intent intent = new Intent();
        if (interfaceC0607b == null || (type = interfaceC0607b.getType()) == null) {
            type = "Reward";
        }
        intent.putExtra("reward_type", type);
        intent.putExtra("reward_amount", interfaceC0607b != null ? interfaceC0607b.getAmount() : 1);
        watchAdActivity.setResult(100, intent);
        watchAdActivity.finish();
        return C1444v.f4971a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F3 */
    public static final Runnable m15766F3(final WatchAdActivity watchAdActivity) {
        return new Runnable() { // from class: l1.a2
            @Override // java.lang.Runnable
            public final void run() {
                WatchAdActivity.m15767G3(this.f24002a);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G3 */
    public static final void m15767G3(WatchAdActivity watchAdActivity) {
        if (watchAdActivity.isFinishing()) {
            return;
        }
        watchAdActivity.f12882C0.invoke(null);
        watchAdActivity.finish();
    }

    /* JADX INFO: renamed from: H3 */
    private final void m15768H3() {
        AbstractC5258B0 abstractC5258B0 = this.f12887H0;
        AbstractC5258B0 abstractC5258B1 = null;
        if (abstractC5258B0 == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5258B0 = null;
        }
        TextView textView = abstractC5258B0.f20019A;
        String str = this.f12883D0;
        if (str == null) {
            AbstractC6118n.m27197o("textDescription");
            str = null;
        }
        textView.setText(str);
        AbstractC5258B0 abstractC5258B2 = this.f12887H0;
        if (abstractC5258B2 == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5258B2 = null;
        }
        abstractC5258B2.f20021w.setOnClickListener(new View.OnClickListener() { // from class: l1.V1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WatchAdActivity.m15769I3(this.f23982a, view);
            }
        });
        AbstractC5258B0 abstractC5258B3 = this.f12887H0;
        if (abstractC5258B3 == null) {
            AbstractC6118n.m27197o("binding");
        } else {
            abstractC5258B1 = abstractC5258B3;
        }
        abstractC5258B1.f20020v.setOnClickListener(new View.OnClickListener() { // from class: l1.W1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WatchAdActivity.m15770J3(this.f23985a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I3 */
    public static final void m15769I3(WatchAdActivity watchAdActivity, View view) {
        watchAdActivity.setResult(101);
        watchAdActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J3 */
    public static final void m15770J3(WatchAdActivity watchAdActivity, View view) {
        watchAdActivity.setResult(0);
        watchAdActivity.finish();
    }

    /* JADX INFO: renamed from: u3 */
    private final Handler m15781u3() {
        return (Handler) this.f12880A0.getValue();
    }

    /* JADX INFO: renamed from: w3 */
    private final Runnable m15782w3() {
        return (Runnable) this.f12881B0.getValue();
    }

    /* JADX INFO: renamed from: x3 */
    private final void m15783x3() {
        m15781u3().postDelayed(m15782w3(), (System.currentTimeMillis() - (this.f12888I0 + TimeUnit.SECONDS.toMillis(60L))) * ((long) (-1)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y3 */
    public static final Handler m15784y3() {
        Looper looperMyLooper = Looper.myLooper();
        AbstractC6118n.m27184b(looperMyLooper);
        return new Handler(looperMyLooper);
    }

    /* JADX INFO: renamed from: z3 */
    private final void m15785z3() {
        final InterfaceC5356a interfaceC5356a = new InterfaceC5356a() { // from class: l1.X1
            @Override // p238e6.InterfaceC5356a
            public final Object invoke() {
                return WatchAdActivity.m15761A3(this.f23989a);
            }
        };
        String str = this.f12885F0;
        if (str == null) {
            AbstractC6118n.m27197o("rewardedUnit");
            str = null;
        }
        m16255V2(str, new AbstractActivityC3130a.a() { // from class: l1.Y1
            @Override // com.anas_mugally.clipboard.p221ui.ads.AbstractActivityC3130a.a
            /* JADX INFO: renamed from: a */
            public final void mo8536a(boolean z7) {
                WatchAdActivity.m15762B3(interfaceC5356a, this, z7);
            }
        });
    }

    @Override // com.anas_mugally.clipboard.p221ui.ads.AbstractActivityC3130a
    /* JADX INFO: renamed from: A2 */
    protected boolean mo15786A2() {
        return false;
    }

    @Override // com.anas_mugally.clipboard.p221ui.ads.AbstractActivityC3130a
    /* JADX INFO: renamed from: C2 */
    protected Map mo15787C2() {
        Map mapMo15787C2 = super.mo15787C2();
        AbstractActivityC3130a.d dVar = AbstractActivityC3130a.d.INTERSTITIAL;
        String str = this.f12884E0;
        String str2 = null;
        if (str == null) {
            AbstractC6118n.m27197o("interstitialUnit");
            str = null;
        }
        mapMo15787C2.put(dVar, str);
        AbstractActivityC3130a.d dVar2 = AbstractActivityC3130a.d.REWARDED;
        String str3 = this.f12885F0;
        if (str3 == null) {
            AbstractC6118n.m27197o("rewardedUnit");
            str3 = null;
        }
        mapMo15787C2.put(dVar2, str3);
        AbstractActivityC3130a.d dVar3 = AbstractActivityC3130a.d.REWARDED_INTERSTITIAL;
        String str4 = this.f12886G0;
        if (str4 == null) {
            AbstractC6118n.m27197o("rewardedInterstitialUnit");
        } else {
            str2 = str4;
        }
        mapMo15787C2.put(dVar3, str2);
        return mapMo15787C2;
    }

    @Override // com.anas_mugally.clipboard.p221ui.ads.AbstractActivityC3130a
    /* JADX INFO: renamed from: D2 */
    protected Set mo15494D2() {
        return AbstractC1617O.m6652f(AbstractActivityC3130a.d.INTERSTITIAL, AbstractActivityC3130a.d.REWARDED_INTERSTITIAL, AbstractActivityC3130a.d.REWARDED);
    }

    @Override // com.anas_mugally.clipboard.p221ui.AbstractViewOnClickListenerC3111a, android.view.View.OnClickListener
    public void onClick(View view) {
        C3110c c3110c = new C3110c();
        String str = this.f12885F0;
        String str2 = null;
        if (str == null) {
            AbstractC6118n.m27197o("rewardedUnit");
            str = null;
        }
        if (m16249J2(str)) {
            String str3 = this.f12885F0;
            if (str3 == null) {
                AbstractC6118n.m27197o("rewardedUnit");
            } else {
                str2 = str3;
            }
            m16259f3(str2, c3110c);
            Log.d("anas_ads_r", "true");
            return;
        }
        String str4 = this.f12886G0;
        if (str4 == null) {
            AbstractC6118n.m27197o("rewardedInterstitialUnit");
            str4 = null;
        }
        if (m16250L2(str4)) {
            String str5 = this.f12886G0;
            if (str5 == null) {
                AbstractC6118n.m27197o("rewardedInterstitialUnit");
            } else {
                str2 = str5;
            }
            m16260h3(str2, c3110c);
            Log.d("anas_ads_ri", "true");
            return;
        }
        String str6 = this.f12884E0;
        if (str6 == null) {
            AbstractC6118n.m27197o("interstitialUnit");
        } else {
            str2 = str6;
        }
        m16258d3(str2, new C3109b());
        Log.d("anas_ads_i", "true");
    }

    @Override // com.anas_mugally.clipboard.p221ui.ads.AbstractActivityC3130a, com.anas_mugally.clipboard.p221ui.AbstractViewOnClickListenerC3111a, com.anas_mugally.clipboard.p221ui.AbstractActivityC3140d, androidx.fragment.app.AbstractActivityC2592j, p223d.AbstractActivityC5187q, p017C.AbstractActivityC0106g, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        String stringExtra = getIntent().getStringExtra("TEXT_DESCRIPTION");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f12883D0 = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("INTERSTITIAL_UNIT");
        if (stringExtra2 == null) {
            stringExtra2 = AbstractActivityC3130a.f13021g0.m16270d();
        }
        this.f12884E0 = stringExtra2;
        String stringExtra3 = getIntent().getStringExtra("REWARDED_UNIT");
        if (stringExtra3 == null) {
            stringExtra3 = AbstractActivityC3130a.f13021g0.m16271e();
        }
        this.f12885F0 = stringExtra3;
        String stringExtra4 = getIntent().getStringExtra("INTERSTITIAL_REWARDED_UNIT");
        if (stringExtra4 == null) {
            stringExtra4 = AbstractActivityC3130a.f13021g0.m16272f();
        }
        this.f12886G0 = stringExtra4;
        this.f12887H0 = (AbstractC5258B0) AbstractC2473f.m10831j(this, R.layout.view_watch_rewarded_ad);
        m15768H3();
        m15785z3();
    }

    @Override // androidx.appcompat.app.AbstractActivityC2242c, androidx.fragment.app.AbstractActivityC2592j, android.app.Activity
    protected void onDestroy() {
        m15781u3().removeCallbacks(m15782w3());
        super.onDestroy();
    }

    /* JADX INFO: renamed from: v3 */
    public final InterfaceC5367l m15788v3() {
        return this.f12882C0;
    }
}
