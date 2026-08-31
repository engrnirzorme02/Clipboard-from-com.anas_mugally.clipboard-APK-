package com.anas_mugally.clipboard.p221ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.AbstractC2473f;
import androidx.lifecycle.AbstractC2658t;
import androidx.lifecycle.C2635a0;
import androidx.lifecycle.InterfaceC2612D;
import androidx.recyclerview.widget.C2787f;
import androidx.recyclerview.widget.RecyclerView;
import com.anas_mugally.clipboard.C3034A;
import com.anas_mugally.clipboard.C3080t;
import com.anas_mugally.clipboard.MyApplication;
import com.anas_mugally.clipboard.R;
import com.anas_mugally.clipboard.database.AppDatabase;
import com.anas_mugally.clipboard.p221ui.SectionActivity;
import com.anas_mugally.clipboard.p221ui.ads.AbstractActivityC3130a;
import com.anas_mugally.clipboard.p221ui.ads.BaseMyAppAdsActivity;
import com.android.billingclient.api.Purchase;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.jvm.internal.AbstractC6097l;
import kotlin.jvm.internal.AbstractC6118n;
import kotlin.jvm.internal.InterfaceC6113i;
import p033E.C0247b;
import p111O.AbstractC1030Z;
import p111O.AbstractC1061m0;
import p111O.C0982A0;
import p111O.InterfaceC0993G;
import p145S5.AbstractC1430h;
import p145S5.AbstractC1437o;
import p145S5.C1444v;
import p145S5.InterfaceC1425c;
import p145S5.InterfaceC1429g;
import p152T5.AbstractC1617O;
import p152T5.AbstractC1638q;
import p173W5.InterfaceC1875e;
import p180X5.AbstractC2005b;
import p189Z0.C2069e;
import p215c1.InterfaceC2979a;
import p225d1.C5209a;
import p233e1.AbstractC5311o;
import p238e6.InterfaceC5356a;
import p238e6.InterfaceC5367l;
import p238e6.InterfaceC5371p;
import p239f.AbstractC5382c;
import p239f.C5380a;
import p239f.InterfaceC5381b;
import p241f1.C5411i;
import p241f1.ViewOnClickListenerC5396A;
import p247g.C5449c;
import p249g1.C5458e;
import p249g1.InterfaceC5455b;
import p249g1.InterfaceC5456c;
import p249g1.InterfaceC5457d;
import p313o1.C6540v;
import p318o6.AbstractC6615I0;
import p318o6.AbstractC6668i;
import p318o6.AbstractC6672k;
import p318o6.C6656c0;
import p318o6.InterfaceC6624N;
import p405z3.C7611b;

/* JADX INFO: loaded from: classes.dex */
public final class SectionActivity extends BaseMyAppAdsActivity implements View.OnClickListener, InterfaceC5371p, InterfaceC5456c, InterfaceC5455b, InterfaceC5457d {

    /* JADX INFO: renamed from: N0 */
    private C2787f f12780N0;

    /* JADX INFO: renamed from: L0 */
    private final InterfaceC1429g f12778L0 = AbstractC1430h.m6066b(new InterfaceC5356a() { // from class: l1.M0
        @Override // p238e6.InterfaceC5356a
        public final Object invoke() {
            return SectionActivity.m15512F4(this.f23950a);
        }
    });

    /* JADX INFO: renamed from: M0 */
    private int f12779M0 = -1;

    /* JADX INFO: renamed from: O0 */
    private final InterfaceC1429g f12781O0 = AbstractC1430h.m6066b(new InterfaceC5356a() { // from class: l1.N0
        @Override // p238e6.InterfaceC5356a
        public final Object invoke() {
            return SectionActivity.m15511E4(this.f23952a);
        }
    });

    /* JADX INFO: renamed from: P0 */
    private final InterfaceC1429g f12782P0 = AbstractC1430h.m6066b(new InterfaceC5356a() { // from class: l1.O0
        @Override // p238e6.InterfaceC5356a
        public final Object invoke() {
            return SectionActivity.m15537f5(this.f23955a);
        }
    });

    /* JADX INFO: renamed from: Q0 */
    private final InterfaceC1429g f12783Q0 = AbstractC1430h.m6066b(new InterfaceC5356a() { // from class: l1.P0
        @Override // p238e6.InterfaceC5356a
        public final Object invoke() {
            return SectionActivity.m15510D4(this.f23958a);
        }
    });

    /* JADX INFO: renamed from: R0 */
    private final AbstractC5382c f12784R0 = m23988A0(new C5449c(), new InterfaceC5381b() { // from class: l1.Q0
        @Override // p239f.InterfaceC5381b
        /* JADX INFO: renamed from: a */
        public final void mo12412a(Object obj) {
            SectionActivity.m15539g5(this.f23961a, (C5380a) obj);
        }
    });

    /* JADX INFO: renamed from: com.anas_mugally.clipboard.ui.SectionActivity$a */
    static final class C3093a extends AbstractC6097l implements InterfaceC5371p {

        /* JADX INFO: renamed from: a */
        int f12785a;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ List f12787c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ C5209a f12788d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ int f12789e;

        /* JADX INFO: renamed from: com.anas_mugally.clipboard.ui.SectionActivity$a$a */
        static final class a extends AbstractC6097l implements InterfaceC5371p {

            /* JADX INFO: renamed from: a */
            int f12790a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ SectionActivity f12791b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ ArrayList f12792c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(SectionActivity sectionActivity, ArrayList arrayList, InterfaceC1875e interfaceC1875e) {
                super(2, interfaceC1875e);
                this.f12791b = sectionActivity;
                this.f12792c = arrayList;
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
                return new a(this.f12791b, this.f12792c, interfaceC1875e);
            }

            @Override // p238e6.InterfaceC5371p
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
                return ((a) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final Object invokeSuspend(Object obj) {
                AbstractC2005b.m8369e();
                if (this.f12790a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1437o.m6082b(obj);
                this.f12791b.m15514H4().m8546K(this.f12792c);
                this.f12791b.mo15559L();
                return C1444v.f4971a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C3093a(List list, C5209a c5209a, int i7, InterfaceC1875e interfaceC1875e) {
            super(2, interfaceC1875e);
            this.f12787c = list;
            this.f12788d = c5209a;
            this.f12789e = i7;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
            return SectionActivity.this.new C3093a(this.f12787c, this.f12788d, this.f12789e, interfaceC1875e);
        }

        @Override // p238e6.InterfaceC5371p
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
            return ((C3093a) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final Object invokeSuspend(Object obj) {
            Object objE = AbstractC2005b.m8369e();
            int i7 = this.f12785a;
            if (i7 == 0) {
                AbstractC1437o.m6082b(obj);
                AppDatabase appDatabaseM15515I4 = SectionActivity.this.m15515I4();
                C5209a c5209a = this.f12788d;
                appDatabaseM15515I4.mo15146G().mo14870k(c5209a.m24098d());
                appDatabaseM15515I4.mo15144E().mo14843c(c5209a);
                ArrayList arrayList = new ArrayList(this.f12787c);
                arrayList.remove(this.f12789e);
                AbstractC6615I0 abstractC6615I0M28164c = C6656c0.m28164c();
                a aVar = new a(SectionActivity.this, arrayList, null);
                this.f12785a = 1;
                if (AbstractC6668i.m28186g(abstractC6615I0M28164c, aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1437o.m6082b(obj);
            }
            return C1444v.f4971a;
        }
    }

    /* JADX INFO: renamed from: com.anas_mugally.clipboard.ui.SectionActivity$b */
    static final class C3094b extends AbstractC6097l implements InterfaceC5371p {

        /* JADX INFO: renamed from: a */
        int f12793a;

        /* JADX INFO: renamed from: com.anas_mugally.clipboard.ui.SectionActivity$b$a */
        static final class a extends AbstractC6097l implements InterfaceC5371p {

            /* JADX INFO: renamed from: a */
            int f12795a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ SectionActivity f12796b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(SectionActivity sectionActivity, InterfaceC1875e interfaceC1875e) {
                super(2, interfaceC1875e);
                this.f12796b = sectionActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
                return new a(this.f12796b, interfaceC1875e);
            }

            @Override // p238e6.InterfaceC5371p
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
                return ((a) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final Object invokeSuspend(Object obj) {
                AbstractC2005b.m8369e();
                if (this.f12795a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1437o.m6082b(obj);
                this.f12796b.m15514H4().m13322l();
                return C1444v.f4971a;
            }
        }

        C3094b(InterfaceC1875e interfaceC1875e) {
            super(2, interfaceC1875e);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
            return SectionActivity.this.new C3094b(interfaceC1875e);
        }

        @Override // p238e6.InterfaceC5371p
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
            return ((C3094b) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final Object invokeSuspend(Object obj) {
            Object objE = AbstractC2005b.m8369e();
            int i7 = this.f12793a;
            if (i7 == 0) {
                AbstractC1437o.m6082b(obj);
                List listM8541E = SectionActivity.this.m15514H4().m8541E();
                if (listM8541E != null) {
                    SectionActivity sectionActivity = SectionActivity.this;
                    int i8 = 0;
                    for (Object obj2 : listM8541E) {
                        int i9 = i8 + 1;
                        if (i8 < 0) {
                            AbstractC1638q.m6773r();
                        }
                        ((C5209a) obj2).m24103i(i8);
                        i8 = i9;
                    }
                    sectionActivity.m15515I4().mo15144E().mo14844d(listM8541E);
                }
                AbstractC6615I0 abstractC6615I0M28164c = C6656c0.m28164c();
                a aVar = new a(SectionActivity.this, null);
                this.f12793a = 1;
                if (AbstractC6668i.m28186g(abstractC6615I0M28164c, aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1437o.m6082b(obj);
            }
            return C1444v.f4971a;
        }
    }

    /* JADX INFO: renamed from: com.anas_mugally.clipboard.ui.SectionActivity$c */
    static final class C3095c implements InterfaceC2612D, InterfaceC6113i {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ InterfaceC5367l f12797a;

        C3095c(InterfaceC5367l function) {
            AbstractC6118n.m27187e(function, "function");
            this.f12797a = function;
        }

        @Override // kotlin.jvm.internal.InterfaceC6113i
        /* JADX INFO: renamed from: a */
        public final InterfaceC1425c mo12586a() {
            return this.f12797a;
        }

        @Override // androidx.lifecycle.InterfaceC2612D
        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void mo12097b(Object obj) {
            this.f12797a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC2612D) && (obj instanceof InterfaceC6113i)) {
                return AbstractC6118n.m27183a(mo12586a(), ((InterfaceC6113i) obj).mo12586a());
            }
            return false;
        }

        public final int hashCode() {
            return mo12586a().hashCode();
        }
    }

    /* JADX INFO: renamed from: com.anas_mugally.clipboard.ui.SectionActivity$d */
    static final class C3096d extends AbstractC6097l implements InterfaceC5371p {

        /* JADX INFO: renamed from: a */
        int f12798a;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ boolean f12800c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ C5209a f12801d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C3096d(boolean z7, C5209a c5209a, InterfaceC1875e interfaceC1875e) {
            super(2, interfaceC1875e);
            this.f12800c = z7;
            this.f12801d = c5209a;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
            return SectionActivity.this.new C3096d(this.f12800c, this.f12801d, interfaceC1875e);
        }

        @Override // p238e6.InterfaceC5371p
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
            return ((C3096d) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final Object invokeSuspend(Object obj) {
            AbstractC2005b.m8369e();
            if (this.f12798a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1437o.m6082b(obj);
            InterfaceC2979a interfaceC2979aMo15144E = SectionActivity.this.m15515I4().mo15144E();
            boolean z7 = this.f12800c;
            C5209a c5209a = this.f12801d;
            if (z7) {
                c5209a.m24103i(interfaceC2979aMo15144E.mo14845e().size());
            }
            if (z7) {
                interfaceC2979aMo15144E.mo14842b(c5209a);
            } else {
                interfaceC2979aMo15144E.mo14841a(c5209a);
            }
            SectionActivity.this.m15519M4().m27775u(SectionActivity.this);
            return C1444v.f4971a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D4 */
    public static final AbstractC5311o m15510D4(SectionActivity sectionActivity) {
        return (AbstractC5311o) AbstractC2473f.m10831j(sectionActivity, R.layout.activity_categories);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E4 */
    public static final C2069e m15511E4(SectionActivity sectionActivity) {
        return new C2069e(sectionActivity, MyApplication.f12496a.m15107c(sectionActivity.getApplication()), sectionActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F4 */
    public static final AppDatabase m15512F4(SectionActivity sectionActivity) {
        return AppDatabase.f12597p.m15148b(sectionActivity);
    }

    /* JADX INFO: renamed from: G4 */
    private final AbstractC5311o m15513G4() {
        Object value = this.f12783Q0.getValue();
        AbstractC6118n.m27186d(value, "getValue(...)");
        return (AbstractC5311o) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H4 */
    public final C2069e m15514H4() {
        return (C2069e) this.f12781O0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I4 */
    public final AppDatabase m15515I4() {
        return (AppDatabase) this.f12778L0.getValue();
    }

    /* JADX INFO: renamed from: J4 */
    private final void m15516J4(C5209a c5209a, final InterfaceC5356a interfaceC5356a, final InterfaceC5356a interfaceC5356a2) {
        new C7611b(this).mo9116t(getString(R.string.wrring) + " ( " + c5209a.m24099e() + " )").mo9105i(getString(R.string.wrriring_delete_section)).m33361L(R.string.delete, new DialogInterface.OnClickListener() { // from class: l1.I0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i7) {
                SectionActivity.m15517K4(interfaceC5356a2, dialogInterface, i7);
            }
        }).m33356G(R.string.cansel, new DialogInterface.OnClickListener() { // from class: l1.J0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i7) {
                SectionActivity.m15518L4(interfaceC5356a, dialogInterface, i7);
            }
        }).mo9100d(false).mo9097a().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K4 */
    public static final void m15517K4(InterfaceC5356a interfaceC5356a, DialogInterface dialogInterface, int i7) {
        interfaceC5356a.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L4 */
    public static final void m15518L4(InterfaceC5356a interfaceC5356a, DialogInterface dialogInterface, int i7) {
        interfaceC5356a.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M4 */
    public final C6540v m15519M4() {
        return (C6540v) this.f12782P0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O4 */
    public static final C1444v m15520O4(SectionActivity sectionActivity, int i7, int i8) {
        sectionActivity.m15521P4(i7, i8);
        return C1444v.f4971a;
    }

    /* JADX INFO: renamed from: P4 */
    private final void m15521P4(final int i7, int i8) {
        switch (i8) {
            case R.id.item_delete /* 2131296677 */:
                final List listM8541E = m15514H4().m8541E();
                AbstractC6118n.m27184b(listM8541E);
                final C5209a c5209a = (C5209a) listM8541E.get(i7);
                final InterfaceC5356a interfaceC5356a = new InterfaceC5356a() { // from class: l1.C0
                    @Override // p238e6.InterfaceC5356a
                    public final Object invoke() {
                        return SectionActivity.m15524S4(this.f23904a);
                    }
                };
                final InterfaceC5356a interfaceC5356a2 = new InterfaceC5356a() { // from class: l1.D0
                    @Override // p238e6.InterfaceC5356a
                    public final Object invoke() {
                        return SectionActivity.m15525T4(this.f23907a, c5209a, interfaceC5356a, listM8541E, i7);
                    }
                };
                if (listM8541E.size() <= 1) {
                    interfaceC5356a.invoke();
                    Toast.makeText(this, R.string.err_re_cate, 0).show();
                } else if (!c5209a.m24102h()) {
                    interfaceC5356a2.invoke();
                } else {
                    C5411i c5411iM24530a = C5411i.f20591L0.m24530a(true);
                    c5411iM24530a.m24529y2(new InterfaceC5371p() { // from class: l1.E0
                        @Override // p238e6.InterfaceC5371p
                        public final Object invoke(Object obj, Object obj2) {
                            return SectionActivity.m15527V4(c5209a, interfaceC5356a2, (String) obj, (C5411i) obj2);
                        }
                    });
                    c5411iM24530a.m24528x2(new InterfaceC5356a() { // from class: l1.F0
                        @Override // p238e6.InterfaceC5356a
                        public final Object invoke() {
                            return SectionActivity.m15528W4(interfaceC5356a2);
                        }
                    });
                    c5411iM24530a.m24527w2(new InterfaceC5356a() { // from class: l1.G0
                        @Override // p238e6.InterfaceC5356a
                        public final Object invoke() {
                            return SectionActivity.m15529X4(interfaceC5356a);
                        }
                    });
                    c5411iM24530a.mo7649g2(m12232H0(), "enter_pass");
                }
                break;
            case R.id.item_edit /* 2131296678 */:
                List listM8541E2 = m15514H4().m8541E();
                AbstractC6118n.m27184b(listM8541E2);
                final C5209a c5209a2 = (C5209a) listM8541E2.get(i7);
                if (!c5209a2.m24102h()) {
                    m15534c5(c5209a2);
                } else {
                    C5411i c5411iM24530a2 = C5411i.f20591L0.m24530a(c5209a2.m24097c());
                    c5411iM24530a2.m24528x2(new InterfaceC5356a() { // from class: l1.A0
                        @Override // p238e6.InterfaceC5356a
                        public final Object invoke() {
                            return SectionActivity.m15522Q4(this.f23896a, c5209a2);
                        }
                    });
                    c5411iM24530a2.m24529y2(new InterfaceC5371p() { // from class: l1.B0
                        @Override // p238e6.InterfaceC5371p
                        public final Object invoke(Object obj, Object obj2) {
                            return SectionActivity.m15523R4(c5209a2, this, (String) obj, (C5411i) obj2);
                        }
                    });
                    c5411iM24530a2.mo7649g2(m12232H0(), null);
                }
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q4 */
    public static final C1444v m15522Q4(SectionActivity sectionActivity, C5209a c5209a) {
        sectionActivity.m15534c5(c5209a);
        return C1444v.f4971a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R4 */
    public static final C1444v m15523R4(C5209a c5209a, SectionActivity sectionActivity, String password, C5411i dialog) {
        AbstractC6118n.m27187e(password, "password");
        AbstractC6118n.m27187e(dialog, "dialog");
        if (AbstractC6118n.m27183a(password, c5209a.m24101g())) {
            dialog.mo12082T1();
            sectionActivity.m15534c5(c5209a);
        } else {
            dialog.m24526B2();
        }
        return C1444v.f4971a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S4 */
    public static final C1444v m15524S4(SectionActivity sectionActivity) {
        sectionActivity.m15514H4().m13322l();
        return C1444v.f4971a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T4 */
    public static final C1444v m15525T4(final SectionActivity sectionActivity, final C5209a c5209a, InterfaceC5356a interfaceC5356a, final List list, final int i7) {
        sectionActivity.m15516J4(c5209a, interfaceC5356a, new InterfaceC5356a() { // from class: l1.H0
            @Override // p238e6.InterfaceC5356a
            public final Object invoke() {
                return SectionActivity.m15526U4(this.f23923a, list, c5209a, i7);
            }
        });
        return C1444v.f4971a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U4 */
    public static final C1444v m15526U4(SectionActivity sectionActivity, List list, C5209a c5209a, int i7) {
        AbstractC6672k.m28227d(AbstractC2658t.m12641a(sectionActivity), C6656c0.m28163b(), null, sectionActivity.new C3093a(list, c5209a, i7, null), 2, null);
        return C1444v.f4971a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V4 */
    public static final C1444v m15527V4(C5209a c5209a, InterfaceC5356a interfaceC5356a, String pass, C5411i dialog) {
        AbstractC6118n.m27187e(pass, "pass");
        AbstractC6118n.m27187e(dialog, "dialog");
        if (AbstractC6118n.m27183a(pass, c5209a.m24101g())) {
            interfaceC5356a.invoke();
            dialog.mo12082T1();
        } else {
            dialog.m24526B2();
        }
        return C1444v.f4971a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W4 */
    public static final C1444v m15528W4(InterfaceC5356a interfaceC5356a) {
        interfaceC5356a.invoke();
        return C1444v.f4971a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X4 */
    public static final C1444v m15529X4(InterfaceC5356a interfaceC5356a) {
        interfaceC5356a.invoke();
        return C1444v.f4971a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y4 */
    public static final C1444v m15530Y4(SectionActivity sectionActivity, List list) {
        sectionActivity.m15514H4().m8546K(new ArrayList(list));
        sectionActivity.f12779M0 = list.size();
        return C1444v.f4971a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z4 */
    public static final void m15531Z4(SectionActivity sectionActivity, View view) {
        sectionActivity.mo12238b().m23939s();
    }

    /* JADX INFO: renamed from: a5 */
    private final void m15532a5() {
        AbstractC1061m0.m4703b(getWindow(), false);
        AbstractC1030Z.m4494t0(m15513G4().m10849k(), new InterfaceC0993G() { // from class: l1.S0
            @Override // p111O.InterfaceC0993G
            /* JADX INFO: renamed from: a */
            public final C0982A0 mo4369a(View view, C0982A0 c0982a0) {
                return SectionActivity.m15533b5(this.f23973a, view, c0982a0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b5 */
    public static final C0982A0 m15533b5(SectionActivity sectionActivity, View view, C0982A0 windowInsets) {
        AbstractC6118n.m27187e(view, "<unused var>");
        AbstractC6118n.m27187e(windowInsets, "windowInsets");
        C0247b c0247bM4272f = windowInsets.m4272f(C0982A0.p.m4332e());
        AbstractC6118n.m27186d(c0247bM4272f, "getInsets(...)");
        Toolbar toolbar = sectionActivity.m15513G4().f20311y;
        AbstractC6118n.m27186d(toolbar, "toolbar");
        toolbar.setPadding(toolbar.getPaddingLeft(), c0247bM4272f.f985b, toolbar.getPaddingRight(), toolbar.getPaddingBottom());
        ExtendedFloatingActionButton fltBtnAddCategory = sectionActivity.m15513G4().f20309w;
        AbstractC6118n.m27186d(fltBtnAddCategory, "fltBtnAddCategory");
        ViewGroup.LayoutParams layoutParams = fltBtnAddCategory.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        }
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        layoutParams2.bottomMargin = c0247bM4272f.f987d + 60;
        fltBtnAddCategory.setLayoutParams(layoutParams2);
        if (C3034A.f12453a.m15018E(sectionActivity)) {
            AppBarLayout appBarMain = sectionActivity.m15513G4().f20308v;
            AbstractC6118n.m27186d(appBarMain, "appBarMain");
            appBarMain.setPadding(appBarMain.getPaddingLeft(), appBarMain.getPaddingTop(), c0247bM4272f.f986c, appBarMain.getPaddingBottom());
            RecyclerView recyclerCategory = sectionActivity.m15513G4().f20310x;
            AbstractC6118n.m27186d(recyclerCategory, "recyclerCategory");
            recyclerCategory.setPadding(recyclerCategory.getPaddingLeft(), recyclerCategory.getPaddingTop(), c0247bM4272f.f986c, recyclerCategory.getPaddingBottom());
        }
        return C0982A0.f3748b;
    }

    /* JADX INFO: renamed from: c5 */
    private final void m15534c5(C5209a c5209a) {
        final ViewOnClickListenerC5396A viewOnClickListenerC5396AM24480a = ViewOnClickListenerC5396A.f20555J0.m24480a(c5209a);
        viewOnClickListenerC5396AM24480a.m24479t2(new InterfaceC5371p() { // from class: l1.L0
            @Override // p238e6.InterfaceC5371p
            public final Object invoke(Object obj, Object obj2) {
                return SectionActivity.m15535d5(viewOnClickListenerC5396AM24480a, this, (C5209a) obj, ((Boolean) obj2).booleanValue());
            }
        });
        viewOnClickListenerC5396AM24480a.mo7649g2(m12232H0(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d5 */
    public static final C1444v m15535d5(ViewOnClickListenerC5396A viewOnClickListenerC5396A, SectionActivity sectionActivity, C5209a category, boolean z7) {
        AbstractC6118n.m27187e(category, "category");
        AbstractC6672k.m28227d(AbstractC2658t.m12641a(viewOnClickListenerC5396A), C6656c0.m28163b(), null, sectionActivity.new C3096d(z7, category, null), 2, null);
        return C1444v.f4971a;
    }

    /* JADX INFO: renamed from: e5 */
    private final void m15536e5() {
        WatchAdActivity.C3108a c3108a = WatchAdActivity.f12879J0;
        String string = getString(R.string.watch_ad_add_section_reward);
        AbstractC6118n.m27186d(string, "getString(...)");
        this.f12784R0.m24394a(WatchAdActivity.C3108a.m15789b(c3108a, this, string, null, null, null, 28, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f5 */
    public static final C6540v m15537f5(SectionActivity sectionActivity) {
        return (C6540v) new C2635a0(sectionActivity).m12591a(C6540v.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g5 */
    public static final void m15539g5(SectionActivity sectionActivity, C5380a result) {
        AbstractC6118n.m27187e(result, "result");
        int iM24390b = result.m24390b();
        if (iM24390b == 100) {
            sectionActivity.m15534c5(null);
            Intent intentM24389a = result.m24389a();
            AbstractC6118n.m27184b(intentM24389a);
            intentM24389a.getIntExtra("reward_amount", 1);
            return;
        }
        if (iM24390b != 101) {
            return;
        }
        View view = new View(sectionActivity.getApplication());
        view.setId(R.id.in_app_purchasing);
        sectionActivity.onClick(view);
    }

    @Override // com.anas_mugally.clipboard.p221ui.ads.AbstractActivityC3130a
    /* JADX INFO: renamed from: D2 */
    protected Set mo15494D2() {
        if (m15845V1()) {
            return AbstractC1617O.m6652f(AbstractActivityC3130a.d.INTERSTITIAL, AbstractActivityC3130a.d.APP_OPEN, AbstractActivityC3130a.d.NATIVE);
        }
        return null;
    }

    @Override // p249g1.InterfaceC5455b
    /* JADX INFO: renamed from: L */
    public void mo15559L() {
        setResult(-1);
        AbstractC6672k.m28227d(AbstractC2658t.m12641a(this), C6656c0.m28163b(), null, new C3094b(null), 2, null);
    }

    @Override // p249g1.InterfaceC5457d
    /* JADX INFO: renamed from: M */
    public void mo15560M(int i7) {
        m15562N4(m15514H4().m8543G(i7), R.id.item_delete);
    }

    @Override // p249g1.InterfaceC5457d
    /* JADX INFO: renamed from: N */
    public void mo15561N(int i7, int i8) {
        C2069e c2069eM15514H4 = m15514H4();
        Collections.swap(c2069eM15514H4.m8541E(), c2069eM15514H4.m8543G(i7), c2069eM15514H4.m8543G(i8));
        c2069eM15514H4.m13324n(i7, i8);
    }

    /* JADX INFO: renamed from: N4 */
    public void m15562N4(final int i7, final int i8) {
        m16252P2();
        m16261j3(new InterfaceC5356a() { // from class: l1.R0
            @Override // p238e6.InterfaceC5356a
            public final Object invoke() {
                return SectionActivity.m15520O4(this.f23963a, i7, i8);
            }
        });
        setResult(-1);
    }

    @Override // com.anas_mugally.clipboard.p221ui.AbstractViewOnClickListenerC3111a
    /* JADX INFO: renamed from: W1 */
    public void mo15563W1(Purchase purchase) {
        AbstractC6118n.m27187e(purchase, "purchase");
        super.mo15563W1(purchase);
        setResult(-1);
        C2069e c2069eM15514H4 = m15514H4();
        c2069eM15514H4.m8547L(m15845V1());
        c2069eM15514H4.m13322l();
    }

    @Override // p249g1.InterfaceC5456c
    /* JADX INFO: renamed from: c */
    public void mo15564c(RecyclerView.AbstractC2749E viewHolder) {
        AbstractC6118n.m27187e(viewHolder, "viewHolder");
        C2787f c2787f = this.f12780N0;
        if (c2787f == null) {
            AbstractC6118n.m27197o("mItemTouchHelper");
            c2787f = null;
        }
        c2787f.m13774H(viewHolder);
    }

    @Override // p238e6.InterfaceC5371p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        m15562N4(((Number) obj).intValue(), ((Number) obj2).intValue());
        return C1444v.f4971a;
    }

    @Override // com.anas_mugally.clipboard.p221ui.AbstractViewOnClickListenerC3111a, android.view.View.OnClickListener
    public void onClick(View view) {
        super.onClick(view);
        Integer numValueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (numValueOf != null && numValueOf.intValue() == R.id.flt_btn_add_category) {
            if (m15845V1()) {
                m15536e5();
            } else {
                m15534c5(null);
            }
            setResult(-1);
        }
    }

    @Override // com.anas_mugally.clipboard.p221ui.ads.BaseMyAppAdsActivity, com.anas_mugally.clipboard.p221ui.ads.AbstractActivityC3130a, com.anas_mugally.clipboard.p221ui.AbstractViewOnClickListenerC3111a, com.anas_mugally.clipboard.p221ui.AbstractActivityC3140d, androidx.fragment.app.AbstractActivityC2592j, p223d.AbstractActivityC5187q, p017C.AbstractActivityC0106g, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C6540v c6540vM15519M4 = m15519M4();
        c6540vM15519M4.m27775u(this);
        c6540vM15519M4.m27766i().m12674k(this, new C3095c(new InterfaceC5367l() { // from class: l1.z0
            @Override // p238e6.InterfaceC5367l
            public final Object invoke(Object obj) {
                return SectionActivity.m15530Y4(this.f24088a, (List) obj);
            }
        }));
        AbstractC5311o abstractC5311oM15513G4 = m15513G4();
        abstractC5311oM15513G4.f20311y.setNavigationOnClickListener(new View.OnClickListener() { // from class: l1.K0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SectionActivity.m15531Z4(this.f23943a, view);
            }
        });
        abstractC5311oM15513G4.f20309w.setOnClickListener(this);
        RecyclerView recyclerView = abstractC5311oM15513G4.f20310x;
        recyclerView.setAdapter(m15514H4());
        recyclerView.setHasFixedSize(true);
        C2787f c2787f = new C2787f(new C5458e(this));
        this.f12780N0 = c2787f;
        c2787f.m13776m(recyclerView);
        recyclerView.m13182l(new C3080t(abstractC5311oM15513G4.f20309w, false));
        m15532a5();
    }
}
