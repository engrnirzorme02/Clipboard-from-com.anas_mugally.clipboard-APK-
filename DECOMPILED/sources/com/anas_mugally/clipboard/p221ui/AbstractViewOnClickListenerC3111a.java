package com.anas_mugally.clipboard.p221ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import com.anas_mugally.clipboard.C3065o;
import com.anas_mugally.clipboard.MyApplication;
import com.anas_mugally.clipboard.R;
import com.anas_mugally.clipboard.p221ui.AbstractViewOnClickListenerC3111a;
import com.android.billingclient.api.AbstractC3175a;
import com.android.billingclient.api.C3177c;
import com.android.billingclient.api.C3178d;
import com.android.billingclient.api.C3179e;
import com.android.billingclient.api.C3180f;
import com.android.billingclient.api.Purchase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.AbstractC6097l;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import p145S5.AbstractC1430h;
import p145S5.AbstractC1437o;
import p145S5.C1444v;
import p145S5.InterfaceC1429g;
import p152T5.AbstractC1617O;
import p152T5.AbstractC1638q;
import p173W5.InterfaceC1875e;
import p180X5.AbstractC2005b;
import p238e6.InterfaceC5356a;
import p238e6.InterfaceC5367l;
import p238e6.InterfaceC5371p;
import p241f1.C5419q;
import p241f1.C5425w;
import p289l1.InterfaceC6212a0;
import p318o6.AbstractC6672k;
import p318o6.C6656c0;
import p318o6.C6689s0;
import p318o6.InterfaceC6624N;
import p403z1.C7559a;
import p403z1.C7567i;
import p403z1.InterfaceC7560b;
import p403z1.InterfaceC7562d;
import p403z1.InterfaceC7565g;
import p403z1.InterfaceC7566h;
import p405z3.C7611b;

/* JADX INFO: renamed from: com.anas_mugally.clipboard.ui.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractViewOnClickListenerC3111a extends AbstractActivityC3140d implements View.OnClickListener, InterfaceC7566h, InterfaceC7562d, InterfaceC6212a0 {

    /* JADX INFO: renamed from: X */
    public static final a f12891X = new a(null);

    /* JADX INFO: renamed from: Y */
    private static String f12892Y = "";

    /* JADX INFO: renamed from: Z */
    private static final String f12893Z = "notLook";

    /* JADX INFO: renamed from: a0 */
    private static final String f12894a0 = "myCustomSettingApp";

    /* JADX INFO: renamed from: b0 */
    private static final String f12895b0 = "isDark3";

    /* JADX INFO: renamed from: c0 */
    private static final String f12896c0 = "categoryLooking";

    /* JADX INFO: renamed from: d0 */
    private static final String f12897d0 = "WithSounds";

    /* JADX INFO: renamed from: e0 */
    private static final String f12898e0 = "is_subscribe";

    /* JADX INFO: renamed from: T */
    private C5419q f12899T;

    /* JADX INFO: renamed from: U */
    private final InterfaceC1429g f12900U = AbstractC1430h.m6066b(new InterfaceC5356a() { // from class: l1.q
        @Override // p238e6.InterfaceC5356a
        public final Object invoke() {
            return AbstractViewOnClickListenerC3111a.m15825c2(this.f24058a);
        }
    });

    /* JADX INFO: renamed from: V */
    private final InterfaceC1429g f12901V = AbstractC1430h.m6066b(new InterfaceC5356a() { // from class: l1.r
        @Override // p238e6.InterfaceC5356a
        public final Object invoke() {
            return AbstractViewOnClickListenerC3111a.m15824b2(this.f24062a);
        }
    });

    /* JADX INFO: renamed from: W */
    private final InterfaceC1429g f12902W = AbstractC1430h.m6066b(new InterfaceC5356a() { // from class: l1.s
        @Override // p238e6.InterfaceC5356a
        public final Object invoke() {
            return AbstractViewOnClickListenerC3111a.m15813K1(this.f24066a);
        }
    });

    /* JADX INFO: renamed from: com.anas_mugally.clipboard.ui.a$a */
    public static final class a {
        public /* synthetic */ a(AbstractC6112h abstractC6112h) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final String m15847a() {
            return AbstractViewOnClickListenerC3111a.f12893Z;
        }

        /* JADX INFO: renamed from: b */
        public final String m15848b() {
            return AbstractViewOnClickListenerC3111a.f12894a0;
        }

        /* JADX INFO: renamed from: c */
        public final String m15849c() {
            return AbstractViewOnClickListenerC3111a.f12895b0;
        }

        /* JADX INFO: renamed from: d */
        public final String m15850d() {
            return AbstractViewOnClickListenerC3111a.f12896c0;
        }

        /* JADX INFO: renamed from: e */
        public final String m15851e() {
            return AbstractViewOnClickListenerC3111a.f12897d0;
        }

        /* JADX INFO: renamed from: f */
        public final String m15852f() {
            return AbstractViewOnClickListenerC3111a.f12898e0;
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: com.anas_mugally.clipboard.ui.a$b */
    static final class b extends AbstractC6097l implements InterfaceC5371p {

        /* JADX INFO: renamed from: a */
        int f12903a;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ C7559a f12905c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ Purchase f12906d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C7559a c7559a, Purchase purchase, InterfaceC1875e interfaceC1875e) {
            super(2, interfaceC1875e);
            this.f12905c = c7559a;
            this.f12906d = purchase;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: k */
        public static final void m15854k(AbstractViewOnClickListenerC3111a abstractViewOnClickListenerC3111a, Purchase purchase, C3178d c3178d) {
            if (c3178d.m16929c() != 0) {
                abstractViewOnClickListenerC3111a.m15812J1(purchase);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
            return AbstractViewOnClickListenerC3111a.this.new b(this.f12905c, this.f12906d, interfaceC1875e);
        }

        @Override // p238e6.InterfaceC5371p
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
            return ((b) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final Object invokeSuspend(Object obj) {
            AbstractC2005b.m8369e();
            if (this.f12903a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1437o.m6082b(obj);
            AbstractC3175a abstractC3175aM15819Q1 = AbstractViewOnClickListenerC3111a.this.m15819Q1();
            C7559a c7559a = this.f12905c;
            final AbstractViewOnClickListenerC3111a abstractViewOnClickListenerC3111a = AbstractViewOnClickListenerC3111a.this;
            final Purchase purchase = this.f12906d;
            abstractC3175aM15819Q1.mo16757a(c7559a, new InterfaceC7560b() { // from class: com.anas_mugally.clipboard.ui.b
                @Override // p403z1.InterfaceC7560b
                /* JADX INFO: renamed from: a */
                public final void mo16408a(C3178d c3178d) {
                    AbstractViewOnClickListenerC3111a.b.m15854k(abstractViewOnClickListenerC3111a, purchase, c3178d);
                }
            });
            return C1444v.f4971a;
        }
    }

    /* JADX INFO: renamed from: com.anas_mugally.clipboard.ui.a$c */
    static final class c extends AbstractC6097l implements InterfaceC5371p {

        /* JADX INFO: renamed from: a */
        int f12907a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ List f12908b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ AbstractViewOnClickListenerC3111a f12909c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(List list, AbstractViewOnClickListenerC3111a abstractViewOnClickListenerC3111a, InterfaceC1875e interfaceC1875e) {
            super(2, interfaceC1875e);
            this.f12908b = list;
            this.f12909c = abstractViewOnClickListenerC3111a;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
            return new c(this.f12908b, this.f12909c, interfaceC1875e);
        }

        @Override // p238e6.InterfaceC5371p
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
            return ((c) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final Object invokeSuspend(Object obj) {
            AbstractC2005b.m8369e();
            if (this.f12907a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1437o.m6082b(obj);
            List<Purchase> list = this.f12908b;
            AbstractC6118n.m27184b(list);
            AbstractViewOnClickListenerC3111a abstractViewOnClickListenerC3111a = this.f12909c;
            for (Purchase purchase : list) {
                if (!purchase.m16792f()) {
                    AbstractC6118n.m27184b(purchase);
                    abstractViewOnClickListenerC3111a.m15812J1(purchase);
                }
            }
            List list2 = this.f12908b;
            AbstractC6118n.m27184b(list2);
            ArrayList<Purchase> arrayList = new ArrayList();
            for (Object obj2 : list2) {
                if (((Purchase) obj2).m16789c() == 1) {
                    arrayList.add(obj2);
                }
            }
            if (!arrayList.isEmpty() && this.f12909c.m15845V1() && !arrayList.isEmpty()) {
                for (Purchase purchase2 : arrayList) {
                    if (purchase2.m16788b().contains("clipboard_clear_ads") || purchase2.m16788b().contains("clipboard_lifetime_premium")) {
                        AbstractViewOnClickListenerC3111a abstractViewOnClickListenerC3111a2 = this.f12909c;
                        Object objJ = AbstractC1638q.m6570J(arrayList);
                        AbstractC6118n.m27186d(objJ, "first(...)");
                        abstractViewOnClickListenerC3111a2.mo15563W1((Purchase) objJ);
                        return C1444v.f4971a;
                    }
                }
            }
            if (arrayList.isEmpty()) {
                this.f12909c.m15817O1();
            }
            return C1444v.f4971a;
        }
    }

    /* JADX INFO: renamed from: com.anas_mugally.clipboard.ui.a$d */
    static final class d extends AbstractC6097l implements InterfaceC5371p {

        /* JADX INFO: renamed from: a */
        int f12910a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ List f12911b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ AbstractViewOnClickListenerC3111a f12912c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(List list, AbstractViewOnClickListenerC3111a abstractViewOnClickListenerC3111a, InterfaceC1875e interfaceC1875e) {
            super(2, interfaceC1875e);
            this.f12911b = list;
            this.f12912c = abstractViewOnClickListenerC3111a;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
            return new d(this.f12911b, this.f12912c, interfaceC1875e);
        }

        @Override // p238e6.InterfaceC5371p
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
            return ((d) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final Object invokeSuspend(Object obj) {
            AbstractC2005b.m8369e();
            if (this.f12910a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1437o.m6082b(obj);
            List<Purchase> list = this.f12911b;
            AbstractC6118n.m27184b(list);
            AbstractViewOnClickListenerC3111a abstractViewOnClickListenerC3111a = this.f12912c;
            for (Purchase purchase : list) {
                if (!purchase.m16792f()) {
                    AbstractC6118n.m27184b(purchase);
                    abstractViewOnClickListenerC3111a.m15812J1(purchase);
                }
            }
            List list2 = this.f12911b;
            AbstractC6118n.m27184b(list2);
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list2) {
                if (((Purchase) obj2).m16789c() == 1) {
                    arrayList.add(obj2);
                }
            }
            if (arrayList.isEmpty() || !this.f12912c.m15845V1()) {
                if (arrayList.isEmpty() && !this.f12912c.m15845V1()) {
                    this.f12912c.m15814L1(true, null, null);
                }
                return C1444v.f4971a;
            }
            AbstractViewOnClickListenerC3111a abstractViewOnClickListenerC3111a2 = this.f12912c;
            Object objJ = AbstractC1638q.m6570J(arrayList);
            AbstractC6118n.m27186d(objJ, "first(...)");
            abstractViewOnClickListenerC3111a2.mo15563W1((Purchase) objJ);
            return C1444v.f4971a;
        }
    }

    /* JADX INFO: renamed from: com.anas_mugally.clipboard.ui.a$e */
    static final class e extends AbstractC6097l implements InterfaceC5371p {

        /* JADX INFO: renamed from: a */
        int f12913a;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ Purchase f12915c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Purchase purchase, InterfaceC1875e interfaceC1875e) {
            super(2, interfaceC1875e);
            this.f12915c = purchase;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
            return AbstractViewOnClickListenerC3111a.this.new e(this.f12915c, interfaceC1875e);
        }

        @Override // p238e6.InterfaceC5371p
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
            return ((e) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final Object invokeSuspend(Object obj) {
            AbstractC2005b.m8369e();
            if (this.f12913a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1437o.m6082b(obj);
            AbstractViewOnClickListenerC3111a.this.mo15563W1(this.f12915c);
            return C1444v.f4971a;
        }
    }

    /* JADX INFO: renamed from: com.anas_mugally.clipboard.ui.a$f */
    static final class f extends AbstractC6097l implements InterfaceC5371p {

        /* JADX INFO: renamed from: a */
        int f12916a;

        f(InterfaceC1875e interfaceC1875e) {
            super(2, interfaceC1875e);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
            return AbstractViewOnClickListenerC3111a.this.new f(interfaceC1875e);
        }

        @Override // p238e6.InterfaceC5371p
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
            return ((f) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final Object invokeSuspend(Object obj) {
            AbstractC2005b.m8369e();
            if (this.f12916a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1437o.m6082b(obj);
            Toast.makeText(AbstractViewOnClickListenerC3111a.this.getApplication(), R.string.error_not_spicfical, 0).show();
            return C1444v.f4971a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J1 */
    public final void m15812J1(Purchase purchase) {
        C7559a c7559aM33260a = C7559a.m33257b().m33261b(purchase.m16790d()).m33260a();
        AbstractC6118n.m27186d(c7559aM33260a, "build(...)");
        AbstractC6672k.m28227d(C6689s0.f24991a, C6656c0.m28163b(), null, new b(c7559aM33260a, purchase, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K1 */
    public static final AbstractC3175a m15813K1(AbstractViewOnClickListenerC3111a abstractViewOnClickListenerC3111a) {
        return AbstractC3175a.m16802d(abstractViewOnClickListenerC3111a).m16808c(abstractViewOnClickListenerC3111a).m16807b(C3179e.m16934c().m16938b().m16939c().m16937a()).m16806a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L1 */
    public final void m15814L1(boolean z7, String str, String str2) {
        m15846a2(str);
        boolean zM15845V1 = m15845V1();
        m15844U1().putBoolean(f12893Z, z7).putBoolean(f12894a0, z7).putBoolean(f12895b0, z7).putBoolean(f12896c0, z7).putBoolean(f12897d0, z7).apply();
        m15844U1().putBoolean(f12898e0, AbstractC1638q.m6564D(AbstractC1617O.m6652f("clipboard_monthly_premium", "clipboard_half_yearly_premium", "clipboard_yearly_premium"), str2)).apply();
        if (zM15845V1 != z7) {
            C3065o.f12624f.m15175a(this).m15173o(zM15845V1);
        }
    }

    /* JADX INFO: renamed from: M1 */
    private final void m15815M1() {
        C7567i c7567iM33266a = C7567i.m33263a().m33267b("inapp").m33266a();
        AbstractC6118n.m27186d(c7567iM33266a, "build(...)");
        m15819Q1().mo16804f(c7567iM33266a, new InterfaceC7565g() { // from class: l1.w
            @Override // p403z1.InterfaceC7565g
            /* JADX INFO: renamed from: a */
            public final void mo27214a(C3178d c3178d, List list) {
                AbstractViewOnClickListenerC3111a.m15816N1(this.f24075a, c3178d, list);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N1 */
    public static final void m15816N1(AbstractViewOnClickListenerC3111a abstractViewOnClickListenerC3111a, C3178d billingResult, List purchasesList) {
        AbstractC6118n.m27187e(billingResult, "billingResult");
        AbstractC6118n.m27187e(purchasesList, "purchasesList");
        if (billingResult.m16929c() == 0) {
            AbstractC6672k.m28227d(C6689s0.f24991a, C6656c0.m28164c(), null, new c(purchasesList, abstractViewOnClickListenerC3111a, null), 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O1 */
    public final void m15817O1() {
        C7567i c7567iM33266a = C7567i.m33263a().m33267b("subs").m33266a();
        AbstractC6118n.m27186d(c7567iM33266a, "build(...)");
        m15819Q1().mo16804f(c7567iM33266a, new InterfaceC7565g() { // from class: l1.x
            @Override // p403z1.InterfaceC7565g
            /* JADX INFO: renamed from: a */
            public final void mo27214a(C3178d c3178d, List list) {
                AbstractViewOnClickListenerC3111a.m15818P1(this.f24078a, c3178d, list);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P1 */
    public static final void m15818P1(AbstractViewOnClickListenerC3111a abstractViewOnClickListenerC3111a, C3178d billingResult, List purchasesList) {
        AbstractC6118n.m27187e(billingResult, "billingResult");
        AbstractC6118n.m27187e(purchasesList, "purchasesList");
        if (billingResult.m16929c() == 0) {
            AbstractC6672k.m28227d(C6689s0.f24991a, C6656c0.m28164c(), null, new d(purchasesList, abstractViewOnClickListenerC3111a, null), 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q1 */
    public final AbstractC3175a m15819Q1() {
        return (AbstractC3175a) this.f12902W.getValue();
    }

    /* JADX INFO: renamed from: R1 */
    private final int m15820R1() {
        return m15843T1().getInt("issues_pay_count", 0);
    }

    /* JADX INFO: renamed from: X1 */
    private final void m15821X1() {
        new C5425w(this).m24596f(!m15845V1(), new InterfaceC5367l() { // from class: l1.v
            @Override // p238e6.InterfaceC5367l
            public final Object invoke(Object obj) {
                return AbstractViewOnClickListenerC3111a.m15822Y1((String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y1 */
    public static final C1444v m15822Y1(String errorMessage) {
        AbstractC6118n.m27187e(errorMessage, "errorMessage");
        return C1444v.f4971a;
    }

    /* JADX INFO: renamed from: Z1 */
    private final void m15823Z1(int i7) {
        m15844U1().putInt("issues_pay_count", i7 + 1).commit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b2 */
    public static final SharedPreferences.Editor m15824b2(AbstractViewOnClickListenerC3111a abstractViewOnClickListenerC3111a) {
        return abstractViewOnClickListenerC3111a.m15843T1().edit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c2 */
    public static final SharedPreferences m15825c2(AbstractViewOnClickListenerC3111a abstractViewOnClickListenerC3111a) {
        return abstractViewOnClickListenerC3111a.getSharedPreferences("SHARED_NAME", 0);
    }

    /* JADX INFO: renamed from: d2 */
    private final void m15826d2() {
        try {
            new C7611b(this).m33365P(R.string.play_install_issue_title).m33354E(R.string.play_install_issue_message).mo9100d(false).m33356G(R.string.cancel, null).m33361L(R.string.play_install_issue_open_play, new DialogInterface.OnClickListener() { // from class: l1.t
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i7) {
                    AbstractViewOnClickListenerC3111a.m15827e2(this.f24069a, dialogInterface, i7);
                }
            }).m33358I(R.string.send_email, new DialogInterface.OnClickListener() { // from class: l1.u
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i7) {
                    AbstractViewOnClickListenerC3111a.m15828f2(this.f24071a, dialogInterface, i7);
                }
            }).m9118v();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e2 */
    public static final void m15827e2(AbstractViewOnClickListenerC3111a abstractViewOnClickListenerC3111a, DialogInterface dialogInterface, int i7) {
        String packageName = abstractViewOnClickListenerC3111a.getPackageName();
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=" + packageName));
        intent.setPackage("com.android.vending");
        abstractViewOnClickListenerC3111a.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f2 */
    public static final void m15828f2(AbstractViewOnClickListenerC3111a abstractViewOnClickListenerC3111a, DialogInterface dialogInterface, int i7) {
        abstractViewOnClickListenerC3111a.m15821X1();
    }

    @Override // p289l1.InterfaceC6212a0
    /* JADX INFO: renamed from: B */
    public void mo15838B(C3180f productDetails, String str) {
        AbstractC6118n.m27187e(productDetails, "productDetails");
        if (m15845V1()) {
            C3177c c3177cM16904a = C3177c.m16883a().m16905b(AbstractC1638q.m6759d(str != null ? C3177c.b.m16906a().m16913c(productDetails).m16912b(str).m16911a() : C3177c.b.m16906a().m16913c(productDetails).m16911a())).m16904a();
            AbstractC6118n.m27186d(c3177cM16904a, "build(...)");
            C3178d c3178dMo16758c = m15819Q1().mo16758c(this, c3177cM16904a);
            AbstractC6118n.m27186d(c3178dMo16758c, "launchBillingFlow(...)");
            if (c3178dMo16758c.m16929c() != 0) {
                AbstractC6672k.m28227d(C6689s0.f24991a, C6656c0.m28164c(), null, new f(null), 2, null);
            }
        }
    }

    @Override // p403z1.InterfaceC7566h
    /* JADX INFO: renamed from: D */
    public void mo15839D(C3178d billingResult, List list) {
        AbstractC6118n.m27187e(billingResult, "billingResult");
        if (AbstractC6118n.m27183a(f12892Y, toString())) {
            if (billingResult.m16929c() != 0 || list == null) {
                int iM15820R1 = m15820R1();
                m15823Z1(iM15820R1 + 1);
                if (iM15820R1 > 0) {
                    m15826d2();
                    return;
                }
                return;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Purchase purchase = (Purchase) it.next();
                if (purchase.m16789c() == 1) {
                    AbstractC6672k.m28227d(C6689s0.f24991a, C6656c0.m28164c(), null, new e(purchase, null), 2, null);
                    if (!purchase.m16792f()) {
                        m15812J1(purchase);
                    }
                }
            }
        }
    }

    @Override // p403z1.InterfaceC7562d
    /* JADX INFO: renamed from: G */
    public void mo15840G(C3178d billingResult) {
        AbstractC6118n.m27187e(billingResult, "billingResult");
        if (billingResult.m16929c() == 0) {
            m15815M1();
        }
    }

    @Override // p403z1.InterfaceC7562d
    /* JADX INFO: renamed from: O */
    public void mo15841O() {
    }

    /* JADX INFO: renamed from: S1 */
    public final String m15842S1() {
        return m15843T1().getString("serverValidateToken", null);
    }

    /* JADX INFO: renamed from: T1 */
    public final SharedPreferences m15843T1() {
        Object value = this.f12900U.getValue();
        AbstractC6118n.m27186d(value, "getValue(...)");
        return (SharedPreferences) value;
    }

    /* JADX INFO: renamed from: U1 */
    public final SharedPreferences.Editor m15844U1() {
        Object value = this.f12901V.getValue();
        AbstractC6118n.m27186d(value, "getValue(...)");
        return (SharedPreferences.Editor) value;
    }

    /* JADX INFO: renamed from: V1 */
    public final boolean m15845V1() {
        return MyApplication.f12496a.m15107c(getApplication());
    }

    /* JADX INFO: renamed from: W1 */
    public void mo15563W1(Purchase purchase) {
        AbstractC6118n.m27187e(purchase, "purchase");
        List listM16788b = purchase.m16788b();
        AbstractC6118n.m27186d(listM16788b, "getProducts(...)");
        m15814L1(false, purchase.m16790d(), (String) AbstractC1638q.m6572L(listM16788b));
        C3065o c3065oM15175a = C3065o.f12624f.m15175a(this);
        String strM16787a = purchase.m16787a();
        AbstractC6118n.m27186d(strM16787a, "getOriginalJson(...)");
        c3065oM15175a.m15171m(strM16787a, m15820R1());
        C5419q c5419q = this.f12899T;
        if (c5419q != null) {
            c5419q.mo12082T1();
        }
        this.f12899T = null;
    }

    /* JADX INFO: renamed from: a2 */
    public final void m15846a2(String str) {
        SharedPreferences.Editor editorPutString;
        SharedPreferences.Editor editorM15844U1 = m15844U1();
        if (editorM15844U1 == null || (editorPutString = editorM15844U1.putString("serverValidateToken", str)) == null) {
            return;
        }
        editorPutString.apply();
    }

    public void onClick(View view) {
        Integer numValueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (numValueOf != null && numValueOf.intValue() == R.id.in_app_purchasing) {
            if (m15819Q1().mo16803b() == 2) {
                C5419q c5419qM24564a = C5419q.f20605M0.m24564a(this, m15819Q1());
                this.f12899T = c5419qM24564a;
                c5419qM24564a.mo7649g2(m12232H0(), null);
            } else {
                int iMo16803b = m15819Q1().mo16803b();
                if (iMo16803b == 3 || iMo16803b == 0) {
                    m15819Q1().mo16760g(this);
                }
                Toast.makeText(this, R.string.google_billing_is_not_available, 1).show();
            }
        }
    }

    @Override // com.anas_mugally.clipboard.p221ui.AbstractActivityC3140d, androidx.fragment.app.AbstractActivityC2592j, p223d.AbstractActivityC5187q, p017C.AbstractActivityC0106g, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 29) {
            getWindow().getDecorView().setForceDarkAllowed(false);
        }
        m15819Q1().mo16760g(this);
    }

    @Override // androidx.fragment.app.AbstractActivityC2592j, android.app.Activity
    protected void onResume() {
        f12892Y = toString();
        super.onResume();
    }
}
