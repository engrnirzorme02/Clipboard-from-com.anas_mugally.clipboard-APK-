package com.anas_mugally.clipboard.p221ui.notes;

import android.app.ActivityOptions;
import android.app.Application;
import android.content.ComponentName;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.fragment.app.AbstractComponentCallbacksC2591i;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC2590h;
import androidx.lifecycle.AbstractC2658t;
import androidx.lifecycle.C2611C;
import androidx.lifecycle.C2635a0;
import androidx.lifecycle.InterfaceC2612D;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.anas_mugally.clipboard.AbstractC3041D;
import com.anas_mugally.clipboard.AbstractC3081u;
import com.anas_mugally.clipboard.ActionsLayout;
import com.anas_mugally.clipboard.C3034A;
import com.anas_mugally.clipboard.C3080t;
import com.anas_mugally.clipboard.C3149w;
import com.anas_mugally.clipboard.MyApplication;
import com.anas_mugally.clipboard.R;
import com.anas_mugally.clipboard.database.AppDatabase;
import com.anas_mugally.clipboard.p221ui.AppIntroActivity;
import com.anas_mugally.clipboard.p221ui.SettingActivity;
import com.anas_mugally.clipboard.p221ui.TextDialogActivity;
import com.anas_mugally.clipboard.p221ui.accessibilitySetting.AccessibilitySettingFullActivity;
import com.anas_mugally.clipboard.p221ui.addText.AddNoteActivity;
import com.anas_mugally.clipboard.p221ui.ads.AbstractActivityC3130a;
import com.anas_mugally.clipboard.p221ui.ads.BaseMyAppAdsActivity;
import com.anas_mugally.clipboard.p221ui.notes.AbstractViewOnClickListenerC3141a;
import com.google.android.gms.common.api.C3553a;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.jvm.internal.AbstractC6097l;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import kotlin.jvm.internal.InterfaceC6113i;
import p145S5.AbstractC1430h;
import p145S5.AbstractC1437o;
import p145S5.C1444v;
import p145S5.InterfaceC1425c;
import p145S5.InterfaceC1429g;
import p152T5.AbstractC1617O;
import p152T5.AbstractC1631j;
import p152T5.AbstractC1638q;
import p173W5.InterfaceC1875e;
import p180X5.AbstractC2005b;
import p189Z0.AbstractC2066b;
import p189Z0.AbstractC2072h;
import p189Z0.C2082r;
import p215c1.InterfaceC2983e;
import p223d.AbstractC5158A;
import p223d.AbstractC5166I;
import p225d1.C5209a;
import p225d1.C5211c;
import p238e6.InterfaceC5356a;
import p238e6.InterfaceC5367l;
import p238e6.InterfaceC5371p;
import p238e6.InterfaceC5373r;
import p241f1.C5411i;
import p262h6.AbstractC5657c;
import p281k1.C5920K;
import p297m1.C6327h;
import p313o1.C6540v;
import p318o6.AbstractC6615I0;
import p318o6.AbstractC6668i;
import p318o6.AbstractC6672k;
import p318o6.C6656c0;
import p318o6.InterfaceC6624N;
import p371v1.C7213n;
import p371v1.C7223x;
import p379w1.C7296P;

/* JADX INFO: renamed from: com.anas_mugally.clipboard.ui.notes.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractViewOnClickListenerC3141a extends BaseMyAppAdsActivity implements View.OnClickListener, InterfaceC5373r, AbstractC2072h.a, SwipeRefreshLayout.InterfaceC2817j {

    /* JADX INFO: renamed from: d1 */
    public static final a f13140d1 = new a(null);

    /* JADX INFO: renamed from: e1 */
    private static final String f13141e1 = "textExtra";

    /* JADX INFO: renamed from: f1 */
    private static final String f13142f1 = "fromApp";

    /* JADX INFO: renamed from: g1 */
    private static final int f13143g1 = C3553a.e.API_PRIORITY_OTHER;

    /* JADX INFO: renamed from: M0 */
    private AbstractC2072h f13145M0;

    /* JADX INFO: renamed from: N0 */
    private int f13146N0;

    /* JADX INFO: renamed from: R0 */
    private SwipeRefreshLayout f13150R0;

    /* JADX INFO: renamed from: S0 */
    private RecyclerView f13151S0;

    /* JADX INFO: renamed from: T0 */
    private ChipGroup f13152T0;

    /* JADX INFO: renamed from: U0 */
    private ImageView f13153U0;

    /* JADX INFO: renamed from: X0 */
    private final int f13156X0;

    /* JADX INFO: renamed from: b1 */
    private List f13160b1;

    /* JADX INFO: renamed from: c1 */
    private List f13161c1;

    /* JADX INFO: renamed from: L0 */
    private final InterfaceC1429g f13144L0 = AbstractC1430h.m6066b(new InterfaceC5356a() { // from class: w1.q
        @Override // p238e6.InterfaceC5356a
        public final Object invoke() {
            return AbstractViewOnClickListenerC3141a.m16524N4(this.f29175a);
        }
    });

    /* JADX INFO: renamed from: O0 */
    private final InterfaceC1429g f13147O0 = AbstractC1430h.m6066b(new InterfaceC5356a() { // from class: w1.r
        @Override // p238e6.InterfaceC5356a
        public final Object invoke() {
            return AbstractViewOnClickListenerC3141a.m16530Q4(this.f29176a);
        }
    });

    /* JADX INFO: renamed from: P0 */
    private final InterfaceC1429g f13148P0 = AbstractC1430h.m6066b(new InterfaceC5356a() { // from class: w1.s
        @Override // p238e6.InterfaceC5356a
        public final Object invoke() {
            return AbstractViewOnClickListenerC3141a.m16528P4(this.f29177a);
        }
    });

    /* JADX INFO: renamed from: Q0 */
    private final InterfaceC1429g f13149Q0 = AbstractC1430h.m6066b(new InterfaceC5356a() { // from class: w1.t
        @Override // p238e6.InterfaceC5356a
        public final Object invoke() {
            return AbstractViewOnClickListenerC3141a.m16520L4(this.f29178a);
        }
    });

    /* JADX INFO: renamed from: V0 */
    private final InterfaceC1429g f13154V0 = AbstractC1430h.m6066b(new InterfaceC5356a() { // from class: w1.u
        @Override // p238e6.InterfaceC5356a
        public final Object invoke() {
            return AbstractViewOnClickListenerC3141a.m16587z5();
        }
    });

    /* JADX INFO: renamed from: W0 */
    private final InterfaceC1429g f13155W0 = AbstractC1430h.m6066b(new InterfaceC5356a() { // from class: w1.v
        @Override // p238e6.InterfaceC5356a
        public final Object invoke() {
            return AbstractViewOnClickListenerC3141a.m16545X5(this.f29179a);
        }
    });

    /* JADX INFO: renamed from: Y0 */
    private final int f13157Y0 = 1;

    /* JADX INFO: renamed from: Z0 */
    private final int f13158Z0 = 3;

    /* JADX INFO: renamed from: a1 */
    private final int f13159a1 = 4;

    /* JADX INFO: renamed from: com.anas_mugally.clipboard.ui.notes.a$a */
    public static final class a {
        public /* synthetic */ a(AbstractC6112h abstractC6112h) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final int m16594a() {
            return AbstractViewOnClickListenerC3141a.f13143g1;
        }

        /* JADX INFO: renamed from: b */
        public final String m16595b() {
            return AbstractViewOnClickListenerC3141a.f13141e1;
        }

        /* JADX INFO: renamed from: c */
        public final String m16596c() {
            return AbstractViewOnClickListenerC3141a.f13142f1;
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: com.anas_mugally.clipboard.ui.notes.a$b */
    static final class b extends AbstractC6097l implements InterfaceC5371p {

        /* JADX INFO: renamed from: a */
        int f13162a;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ Integer[] f13164c;

        /* JADX INFO: renamed from: com.anas_mugally.clipboard.ui.notes.a$b$a */
        static final class a extends AbstractC6097l implements InterfaceC5371p {

            /* JADX INFO: renamed from: a */
            int f13165a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ AbstractViewOnClickListenerC3141a f13166b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(AbstractViewOnClickListenerC3141a abstractViewOnClickListenerC3141a, InterfaceC1875e interfaceC1875e) {
                super(2, interfaceC1875e);
                this.f13166b = abstractViewOnClickListenerC3141a;
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
                return new a(this.f13166b, interfaceC1875e);
            }

            @Override // p238e6.InterfaceC5371p
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
                return ((a) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final Object invokeSuspend(Object obj) {
                AbstractC2005b.m8369e();
                if (this.f13165a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1437o.m6082b(obj);
                this.f13166b.m16501B5();
                return C1444v.f4971a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Integer[] numArr, InterfaceC1875e interfaceC1875e) {
            super(2, interfaceC1875e);
            this.f13164c = numArr;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
            return AbstractViewOnClickListenerC3141a.this.new b(this.f13164c, interfaceC1875e);
        }

        @Override // p238e6.InterfaceC5371p
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
            return ((b) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final Object invokeSuspend(Object obj) {
            AbstractC2005b.m8369e();
            if (this.f13162a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1437o.m6082b(obj);
            AbstractViewOnClickListenerC3141a.this.m16540V4().mo15146G().mo14860a(AbstractC1631j.m6734e0(this.f13164c));
            AbstractC6672k.m28227d(AbstractC2658t.m12641a(AbstractViewOnClickListenerC3141a.this), C6656c0.m28164c(), null, new a(AbstractViewOnClickListenerC3141a.this, null), 2, null);
            return C1444v.f4971a;
        }
    }

    /* JADX INFO: renamed from: com.anas_mugally.clipboard.ui.notes.a$c */
    static final class c extends AbstractC6097l implements InterfaceC5371p {

        /* JADX INFO: renamed from: a */
        int f13167a;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ HashSet f13169c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ InterfaceC5367l f13170d;

        /* JADX INFO: renamed from: com.anas_mugally.clipboard.ui.notes.a$c$a */
        static final class a extends AbstractC6097l implements InterfaceC5371p {

            /* JADX INFO: renamed from: a */
            int f13171a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ AbstractViewOnClickListenerC3141a f13172b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ List f13173c;

            /* JADX INFO: renamed from: d */
            final /* synthetic */ InterfaceC5367l f13174d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(AbstractViewOnClickListenerC3141a abstractViewOnClickListenerC3141a, List list, InterfaceC5367l interfaceC5367l, InterfaceC1875e interfaceC1875e) {
                super(2, interfaceC1875e);
                this.f13172b = abstractViewOnClickListenerC3141a;
                this.f13173c = list;
                this.f13174d = interfaceC5367l;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: k */
            public static final void m16601k(InterfaceC5367l interfaceC5367l, String str) {
                interfaceC5367l.invoke(str);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
                return new a(this.f13172b, this.f13173c, this.f13174d, interfaceC1875e);
            }

            @Override // p238e6.InterfaceC5371p
            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
                return ((a) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final Object invokeSuspend(Object obj) {
                AbstractC2005b.m8369e();
                if (this.f13171a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1437o.m6082b(obj);
                C7223x c7223x = new C7223x(this.f13172b, this.f13173c);
                final InterfaceC5367l interfaceC5367l = this.f13174d;
                c7223x.m31879m(new C7223x.a() { // from class: com.anas_mugally.clipboard.ui.notes.b
                    @Override // p371v1.C7223x.a
                    /* JADX INFO: renamed from: a */
                    public final void mo16605a(String str) {
                        AbstractViewOnClickListenerC3141a.c.a.m16601k(interfaceC5367l, str);
                    }
                });
                return C1444v.f4971a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(HashSet hashSet, InterfaceC5367l interfaceC5367l, InterfaceC1875e interfaceC1875e) {
            super(2, interfaceC1875e);
            this.f13169c = hashSet;
            this.f13170d = interfaceC5367l;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
            return AbstractViewOnClickListenerC3141a.this.new c(this.f13169c, this.f13170d, interfaceC1875e);
        }

        @Override // p238e6.InterfaceC5371p
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
            return ((c) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final Object invokeSuspend(Object obj) {
            Object objE = AbstractC2005b.m8369e();
            int i7 = this.f13167a;
            if (i7 == 0) {
                AbstractC1437o.m6082b(obj);
                List listMo14871l = AbstractViewOnClickListenerC3141a.this.m16540V4().mo15146G().mo14871l(AbstractC1638q.m6593g0(this.f13169c));
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : listMo14871l) {
                    if (((String) obj2).length() > 0) {
                        arrayList.add(obj2);
                    }
                }
                if (arrayList.isEmpty()) {
                    return C1444v.f4971a;
                }
                AbstractC6615I0 abstractC6615I0M28164c = C6656c0.m28164c();
                a aVar = new a(AbstractViewOnClickListenerC3141a.this, arrayList, this.f13170d, null);
                this.f13167a = 1;
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

    /* JADX INFO: renamed from: com.anas_mugally.clipboard.ui.notes.a$d */
    public static final class d implements C7213n.a {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ int f13176b;

        d(int i7) {
            this.f13176b = i7;
        }

        @Override // p371v1.C7213n.a
        /* JADX INFO: renamed from: a */
        public void mo15502a(String error) {
            AbstractC6118n.m27187e(error, "error");
            Toast.makeText(AbstractViewOnClickListenerC3141a.this, error, 0).show();
        }

        @Override // p371v1.C7213n.a
        /* JADX INFO: renamed from: b */
        public void mo15503b(String categoryName) {
            AbstractC6118n.m27187e(categoryName, "categoryName");
            List list = AbstractViewOnClickListenerC3141a.this.f13161c1;
            AbstractC6118n.m27184b(list);
            C5211c c5211c = (C5211c) AbstractC1638q.m6573M(list, this.f13176b);
            if (c5211c != null) {
                AbstractViewOnClickListenerC3141a.this.m16526O4(new Integer[]{Integer.valueOf(c5211c.m24110d())});
            }
            AbstractViewOnClickListenerC3141a abstractViewOnClickListenerC3141a = AbstractViewOnClickListenerC3141a.this;
            Toast.makeText(abstractViewOnClickListenerC3141a, abstractViewOnClickListenerC3141a.getString(R.string.done_add_to_clipboard, categoryName), 0).show();
        }
    }

    /* JADX INFO: renamed from: com.anas_mugally.clipboard.ui.notes.a$e */
    static final class e extends AbstractC6097l implements InterfaceC5371p {

        /* JADX INFO: renamed from: a */
        Object f13177a;

        /* JADX INFO: renamed from: b */
        int f13178b;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ int f13180d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ boolean f13181e;

        /* JADX INFO: renamed from: com.anas_mugally.clipboard.ui.notes.a$e$a */
        static final class a extends AbstractC6097l implements InterfaceC5371p {

            /* JADX INFO: renamed from: a */
            int f13182a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ AbstractViewOnClickListenerC3141a f13183b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(AbstractViewOnClickListenerC3141a abstractViewOnClickListenerC3141a, InterfaceC1875e interfaceC1875e) {
                super(2, interfaceC1875e);
                this.f13183b = abstractViewOnClickListenerC3141a;
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
                return new a(this.f13183b, interfaceC1875e);
            }

            @Override // p238e6.InterfaceC5371p
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
                return ((a) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final Object invokeSuspend(Object obj) {
                AbstractC2005b.m8369e();
                if (this.f13182a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1437o.m6082b(obj);
                this.f13183b.m16501B5();
                return C1444v.f4971a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(int i7, boolean z7, InterfaceC1875e interfaceC1875e) {
            super(2, interfaceC1875e);
            this.f13180d = i7;
            this.f13181e = z7;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
            return AbstractViewOnClickListenerC3141a.this.new e(this.f13180d, this.f13181e, interfaceC1875e);
        }

        @Override // p238e6.InterfaceC5371p
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
            return ((e) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final Object invokeSuspend(Object obj) {
            Object objE = AbstractC2005b.m8369e();
            int i7 = this.f13178b;
            if (i7 == 0) {
                AbstractC1437o.m6082b(obj);
                InterfaceC2983e interfaceC2983eMo15146G = AbstractViewOnClickListenerC3141a.this.m16540V4().mo15146G();
                AbstractViewOnClickListenerC3141a abstractViewOnClickListenerC3141a = AbstractViewOnClickListenerC3141a.this;
                int i8 = this.f13180d;
                boolean z7 = this.f13181e;
                List list = abstractViewOnClickListenerC3141a.f13161c1;
                AbstractC6118n.m27184b(list);
                C5211c c5211c = (C5211c) list.get(i8);
                c5211c.m24116j(!z7 ? interfaceC2983eMo15146G.mo14882w(c5211c.m24109c()) + 1 : 0L);
                interfaceC2983eMo15146G.mo14873n(c5211c);
                AbstractC6615I0 abstractC6615I0M28164c = C6656c0.m28164c();
                a aVar = new a(abstractViewOnClickListenerC3141a, null);
                this.f13177a = interfaceC2983eMo15146G;
                this.f13178b = 1;
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

    /* JADX INFO: renamed from: com.anas_mugally.clipboard.ui.notes.a$f */
    static final class f implements InterfaceC2612D, InterfaceC6113i {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ InterfaceC5367l f13184a;

        f(InterfaceC5367l function) {
            AbstractC6118n.m27187e(function, "function");
            this.f13184a = function;
        }

        @Override // kotlin.jvm.internal.InterfaceC6113i
        /* JADX INFO: renamed from: a */
        public final InterfaceC1425c mo12586a() {
            return this.f13184a;
        }

        @Override // androidx.lifecycle.InterfaceC2612D
        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void mo12097b(Object obj) {
            this.f13184a.invoke(obj);
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

    /* JADX INFO: renamed from: A5 */
    private final void m16499A5() {
        m16547c5().m27775u(this);
        m16537T5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B5 */
    public final void m16501B5() {
        C5209a c5209aM16536T4 = m16536T4();
        String strM24098d = c5209aM16536T4 != null ? c5209aM16536T4.m24098d() : null;
        C2611C c2611c = (C2611C) AbstractC1638q.m6573M(m16547c5().m27772p(), this.f13146N0);
        if (c2611c != null) {
            c2611c.m12674k(this, new f(new InterfaceC5367l() { // from class: w1.d
                @Override // p238e6.InterfaceC5367l
                public final Object invoke(Object obj) {
                    return AbstractViewOnClickListenerC3141a.m16503C5(this.f29153a, (List) obj);
                }
            }));
        }
        C6540v c6540vM16547c5 = m16547c5();
        Application application = getApplication();
        AbstractC6118n.m27186d(application, "getApplication(...)");
        c6540vM16547c5.m27776v(application, strM24098d, this.f13146N0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C5 */
    public static final C1444v m16503C5(AbstractViewOnClickListenerC3141a abstractViewOnClickListenerC3141a, List list) {
        if (AbstractC6118n.m27183a(abstractViewOnClickListenerC3141a.f13161c1, list)) {
            SwipeRefreshLayout swipeRefreshLayout = abstractViewOnClickListenerC3141a.f13150R0;
            if (swipeRefreshLayout == null) {
                AbstractC6118n.m27197o("swipeRefreshLayout");
                swipeRefreshLayout = null;
            }
            swipeRefreshLayout.setRefreshing(false);
        } else {
            abstractViewOnClickListenerC3141a.m16509F5(list);
        }
        return C1444v.f4971a;
    }

    /* JADX INFO: renamed from: D5 */
    private final void m16505D5(boolean z7) {
        SharedPreferences.Editor editorRemove;
        SharedPreferences.Editor editorPutLong;
        if (z7) {
            SharedPreferences.Editor editorM15844U1 = m15844U1();
            if (editorM15844U1 == null || (editorPutLong = editorM15844U1.putLong("ACCESSIBILITY_SKIP_TO_ONE_WEEK_UNTIL", System.currentTimeMillis() + 604800000)) == null) {
                return;
            }
            editorPutLong.apply();
            return;
        }
        SharedPreferences.Editor editorM15844U2 = m15844U1();
        if (editorM15844U2 == null || (editorRemove = editorM15844U2.remove("ACCESSIBILITY_SKIP_TO_ONE_WEEK_UNTIL")) == null) {
            return;
        }
        editorRemove.apply();
    }

    /* JADX INFO: renamed from: E5 */
    private final void m16507E5(List list) {
        this.f13160b1 = list;
        m16513H5();
    }

    /* JADX INFO: renamed from: F5 */
    private final void m16509F5(List list) {
        this.f13161c1 = list;
        m16517J5(list);
    }

    /* JADX INFO: renamed from: G5 */
    private final void m16511G5(boolean z7) {
        SharedPreferences.Editor editorRemove;
        SharedPreferences.Editor editorPutLong;
        if (z7) {
            SharedPreferences.Editor editorM15844U1 = m15844U1();
            if (editorM15844U1 == null || (editorPutLong = editorM15844U1.putLong("NOTIFICATION_SKIP_TO_ONE_WEEK_UNTIL", System.currentTimeMillis() + 604800000)) == null) {
                return;
            }
            editorPutLong.apply();
            return;
        }
        SharedPreferences.Editor editorM15844U2 = m15844U1();
        if (editorM15844U2 == null || (editorRemove = editorM15844U2.remove("NOTIFICATION_SKIP_TO_ONE_WEEK_UNTIL")) == null) {
            return;
        }
        editorRemove.apply();
    }

    /* JADX INFO: renamed from: H5 */
    private final void m16513H5() {
        ChipGroup chipGroup = this.f13152T0;
        if (chipGroup == null) {
            AbstractC6118n.m27197o("chipGroupCategories");
            chipGroup = null;
        }
        chipGroup.removeAllViews();
        List list = this.f13160b1;
        if (list != null) {
            final int i7 = 0;
            for (Object obj : list) {
                int i8 = i7 + 1;
                if (i7 < 0) {
                    AbstractC1638q.m6773r();
                }
                C5209a c5209a = (C5209a) obj;
                View viewInflate = getLayoutInflater().inflate(R.layout.chip, (ViewGroup) null);
                AbstractC6118n.m27185c(viewInflate, "null cannot be cast to non-null type com.google.android.material.chip.Chip");
                Chip chip = (Chip) viewInflate;
                chip.setText(c5209a.m24099e());
                chip.setCheckable(true);
                chip.setChecked(i7 == this.f13146N0);
                boolean z7 = i7 >= f13143g1 && m15845V1();
                if (c5209a.m24102h() || z7) {
                    chip.setChipIconResource(z7 ? R.drawable.ic_crown : R.drawable.ic_locked_tab);
                }
                chip.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: w1.x
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z8) {
                        AbstractViewOnClickListenerC3141a.m16515I5(this.f29181a, i7, compoundButton, z8);
                    }
                });
                ChipGroup chipGroup2 = this.f13152T0;
                if (chipGroup2 == null) {
                    AbstractC6118n.m27197o("chipGroupCategories");
                    chipGroup2 = null;
                }
                chipGroup2.addView(chip);
                i7 = i8;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I5 */
    public static final void m16515I5(AbstractViewOnClickListenerC3141a abstractViewOnClickListenerC3141a, int i7, CompoundButton compoundButton, boolean z7) {
        AbstractC6118n.m27187e(compoundButton, "<unused var>");
        if (z7) {
            abstractViewOnClickListenerC3141a.f13146N0 = i7;
            abstractViewOnClickListenerC3141a.m16543W5();
        }
    }

    /* JADX INFO: renamed from: J5 */
    private final void m16517J5(List list) {
        RecyclerView recyclerView = this.f13151S0;
        SwipeRefreshLayout swipeRefreshLayout = null;
        if (recyclerView == null) {
            AbstractC6118n.m27197o("recyclerView");
            recyclerView = null;
        }
        C2082r c2082r = (C2082r) recyclerView.getAdapter();
        if (c2082r == null) {
            c2082r = new C2082r(this, m15845V1());
            RecyclerView recyclerView2 = this.f13151S0;
            if (recyclerView2 == null) {
                AbstractC6118n.m27197o("recyclerView");
                recyclerView2 = null;
            }
            recyclerView2.setAdapter(c2082r);
        }
        c2082r.m8546K(list);
        SwipeRefreshLayout swipeRefreshLayout2 = this.f13150R0;
        if (swipeRefreshLayout2 == null) {
            AbstractC6118n.m27197o("swipeRefreshLayout");
        } else {
            swipeRefreshLayout = swipeRefreshLayout2;
        }
        swipeRefreshLayout.postDelayed(new Runnable() { // from class: w1.i
            @Override // java.lang.Runnable
            public final void run() {
                AbstractViewOnClickListenerC3141a.m16519K5(this.f29163a);
            }
        }, 700L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K5 */
    public static final void m16519K5(AbstractViewOnClickListenerC3141a abstractViewOnClickListenerC3141a) {
        SwipeRefreshLayout swipeRefreshLayout = abstractViewOnClickListenerC3141a.f13150R0;
        if (swipeRefreshLayout == null) {
            AbstractC6118n.m27197o("swipeRefreshLayout");
            swipeRefreshLayout = null;
        }
        swipeRefreshLayout.setRefreshing(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L4 */
    public static final ViewGroup m16520L4(AbstractViewOnClickListenerC3141a abstractViewOnClickListenerC3141a) {
        return (ViewGroup) abstractViewOnClickListenerC3141a.findViewById(R.id.main_card_btns_ops);
    }

    /* JADX INFO: renamed from: L5 */
    private final void m16521L5() {
        MyApplication myApplicationM15105a = MyApplication.f12496a.m15105a();
        AbstractC6118n.m27184b(myApplicationM15105a);
        if (!AbstractC3081u.m15314a(myApplicationM15105a)) {
            FloatingActionButton floatingActionButtonM16542W4 = m16542W4();
            AbstractC6118n.m27186d(floatingActionButtonM16542W4, "<get-ftbEnableAccessibility>(...)");
            floatingActionButtonM16542W4.setVisibility(0);
            m16542W4().setOnClickListener(this);
        }
        m16544X4().setOnClickListener(this);
        View viewFindViewById = findViewById(R.id.img_open_app);
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(this);
        }
        ImageView imageView = this.f13153U0;
        RecyclerView recyclerView = null;
        if (imageView == null) {
            AbstractC6118n.m27197o("imgBlockingAccessToNots");
            imageView = null;
        }
        imageView.setOnClickListener(this);
        SwipeRefreshLayout swipeRefreshLayout = this.f13150R0;
        if (swipeRefreshLayout == null) {
            AbstractC6118n.m27197o("swipeRefreshLayout");
            swipeRefreshLayout = null;
        }
        swipeRefreshLayout.setOnRefreshListener(this);
        RecyclerView recyclerView2 = this.f13151S0;
        if (recyclerView2 == null) {
            AbstractC6118n.m27197o("recyclerView");
            recyclerView2 = null;
        }
        recyclerView2.setLayoutManager(new LinearLayoutManager(this));
        RecyclerView recyclerView3 = this.f13151S0;
        if (recyclerView3 == null) {
            AbstractC6118n.m27197o("recyclerView");
        } else {
            recyclerView = recyclerView3;
        }
        recyclerView.m13182l(new C3080t(m16544X4(), true));
    }

    /* JADX INFO: renamed from: M4 */
    private final void m16522M4() {
        RecyclerView recyclerView = this.f13151S0;
        if (recyclerView == null) {
            AbstractC6118n.m27197o("recyclerView");
            recyclerView = null;
        }
        AbstractC2066b abstractC2066b = (AbstractC2066b) recyclerView.getAdapter();
        if (abstractC2066b == null || abstractC2066b.m8545I() == m15845V1()) {
            return;
        }
        abstractC2066b.m8547L(m15845V1());
        abstractC2066b.m13322l();
    }

    /* JADX INFO: renamed from: M5 */
    private final void m16523M5() {
        ImageView imageView = this.f13153U0;
        RecyclerView recyclerView = null;
        if (imageView == null) {
            AbstractC6118n.m27197o("imgBlockingAccessToNots");
            imageView = null;
        }
        imageView.setVisibility(0);
        RecyclerView recyclerView2 = this.f13151S0;
        if (recyclerView2 == null) {
            AbstractC6118n.m27197o("recyclerView");
        } else {
            recyclerView = recyclerView2;
        }
        recyclerView.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N4 */
    public static final AppDatabase m16524N4(AbstractViewOnClickListenerC3141a abstractViewOnClickListenerC3141a) {
        return AppDatabase.f12597p.m15148b(abstractViewOnClickListenerC3141a);
    }

    /* JADX INFO: renamed from: N5 */
    private final void m16525N5(boolean z7) {
        C7296P.f29142a.m32301A(this, z7, new InterfaceC5356a() { // from class: w1.e
            @Override // p238e6.InterfaceC5356a
            public final Object invoke() {
                return AbstractViewOnClickListenerC3141a.m16527O5(this.f29154a);
            }
        }, new InterfaceC5367l() { // from class: w1.f
            @Override // p238e6.InterfaceC5367l
            public final Object invoke(Object obj) {
                return AbstractViewOnClickListenerC3141a.m16529P5(this.f29155a, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O4 */
    public final void m16526O4(Integer[] numArr) {
        AbstractC6672k.m28227d(AbstractC2658t.m12641a(this), C6656c0.m28163b(), null, new b(numArr, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O5 */
    public static final C1444v m16527O5(AbstractViewOnClickListenerC3141a abstractViewOnClickListenerC3141a) {
        abstractViewOnClickListenerC3141a.m16592w5(true);
        return C1444v.f4971a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P4 */
    public static final FloatingActionButton m16528P4(AbstractViewOnClickListenerC3141a abstractViewOnClickListenerC3141a) {
        return (FloatingActionButton) abstractViewOnClickListenerC3141a.findViewById(R.id.ftb_enable_accessibility);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P5 */
    public static final C1444v m16529P5(AbstractViewOnClickListenerC3141a abstractViewOnClickListenerC3141a, boolean z7) {
        abstractViewOnClickListenerC3141a.m16505D5(z7);
        return C1444v.f4971a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q4 */
    public static final ExtendedFloatingActionButton m16530Q4(AbstractViewOnClickListenerC3141a abstractViewOnClickListenerC3141a) {
        return (ExtendedFloatingActionButton) abstractViewOnClickListenerC3141a.findViewById(R.id.flt_btn_add_text);
    }

    /* JADX INFO: renamed from: Q5 */
    private final void m16531Q5(boolean z7) {
        C7296P.f29142a.m32302J(this, z7, new InterfaceC5356a() { // from class: w1.b
            @Override // p238e6.InterfaceC5356a
            public final Object invoke() {
                return AbstractViewOnClickListenerC3141a.m16533R5(this.f29151a);
            }
        }, new InterfaceC5367l() { // from class: w1.c
            @Override // p238e6.InterfaceC5367l
            public final Object invoke(Object obj) {
                return AbstractViewOnClickListenerC3141a.m16535S5(this.f29152a, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: renamed from: R4 */
    private final ActionsLayout m16532R4() {
        return (ActionsLayout) ((ViewGroup) findViewById(R.id.main_card_btns_ops)).findViewById(R.id.toolbar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R5 */
    public static final C1444v m16533R5(AbstractViewOnClickListenerC3141a abstractViewOnClickListenerC3141a) {
        abstractViewOnClickListenerC3141a.m16593y5(true);
        return C1444v.f4971a;
    }

    /* JADX INFO: renamed from: S4 */
    private final ViewGroup m16534S4() {
        Object value = this.f13149Q0.getValue();
        AbstractC6118n.m27186d(value, "getValue(...)");
        return (ViewGroup) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S5 */
    public static final C1444v m16535S5(AbstractViewOnClickListenerC3141a abstractViewOnClickListenerC3141a, boolean z7) {
        abstractViewOnClickListenerC3141a.m16511G5(z7);
        return C1444v.f4971a;
    }

    /* JADX INFO: renamed from: T4 */
    private final C5209a m16536T4() {
        List list = this.f13160b1;
        if (list != null) {
            return (C5209a) AbstractC1638q.m6573M(list, this.f13146N0);
        }
        return null;
    }

    /* JADX INFO: renamed from: T5 */
    private final void m16537T5() {
        if (m16547c5().m27766i().m12671h()) {
            return;
        }
        m16547c5().m27766i().m12674k(this, new f(new InterfaceC5367l() { // from class: w1.w
            @Override // p238e6.InterfaceC5367l
            public final Object invoke(Object obj) {
                return AbstractViewOnClickListenerC3141a.m16539U5(this.f29180a, (List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: U4 */
    private final void m16538U4(HashSet hashSet, InterfaceC5367l interfaceC5367l) {
        AbstractC6672k.m28227d(AbstractC2658t.m12641a(this), C6656c0.m28163b(), null, new c(hashSet, interfaceC5367l, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U5 */
    public static final C1444v m16539U5(AbstractViewOnClickListenerC3141a abstractViewOnClickListenerC3141a, List list) {
        abstractViewOnClickListenerC3141a.m16507E5(list);
        AbstractC6118n.m27184b(list);
        if (!list.isEmpty()) {
            abstractViewOnClickListenerC3141a.m16543W5();
        }
        return C1444v.f4971a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V4 */
    public final AppDatabase m16540V4() {
        return (AppDatabase) this.f13144L0.getValue();
    }

    /* JADX INFO: renamed from: V5 */
    private final boolean m16541V5() {
        SharedPreferences sharedPreferencesM15843T1 = m15843T1();
        C6327h.a aVar = C6327h.f24159H0;
        if (sharedPreferencesM15843T1.getBoolean(aVar.m27282b(), false) || !C3034A.f12453a.m15015B(this)) {
            return false;
        }
        aVar.m27281a().mo7649g2(m12232H0(), null);
        return true;
    }

    /* JADX INFO: renamed from: W4 */
    private final FloatingActionButton m16542W4() {
        return (FloatingActionButton) this.f13148P0.getValue();
    }

    /* JADX INFO: renamed from: W5 */
    private final void m16543W5() {
        C5209a c5209aM16536T4 = m16536T4();
        if (c5209aM16536T4 == null) {
            return;
        }
        if (!c5209aM16536T4.m24102h() || AbstractC6118n.m27183a(m16588Z4().get(c5209aM16536T4.m24098d()), Boolean.TRUE)) {
            m16550f5();
            m16501B5();
            return;
        }
        m16523M5();
        ImageView imageView = this.f13153U0;
        if (imageView == null) {
            AbstractC6118n.m27197o("imgBlockingAccessToNots");
            imageView = null;
        }
        imageView.performClick();
    }

    /* JADX INFO: renamed from: X4 */
    private final ExtendedFloatingActionButton m16544X4() {
        return (ExtendedFloatingActionButton) this.f13147O0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X5 */
    public static final C6540v m16545X5(AbstractViewOnClickListenerC3141a abstractViewOnClickListenerC3141a) {
        return (C6540v) new C2635a0(abstractViewOnClickListenerC3141a).m12591a(C6540v.class);
    }

    /* JADX INFO: renamed from: Y4 */
    private final boolean m16546Y4() {
        return C3149w.f13206f.m16729c(this);
    }

    /* JADX INFO: renamed from: c5 */
    private final C6540v m16547c5() {
        return (C6540v) this.f13155W0.getValue();
    }

    /* JADX INFO: renamed from: d5 */
    private final void m16548d5() {
        Integer numValueOf;
        int i7;
        AbstractC2072h abstractC2072h = this.f13145M0;
        if (abstractC2072h != null) {
            List list = this.f13161c1;
            int i8 = 0;
            if (list != null) {
                if (list.isEmpty()) {
                    i7 = 0;
                } else {
                    Iterator it = list.iterator();
                    i7 = 0;
                    while (it.hasNext()) {
                        if (!abstractC2072h.m8566M().contains(Integer.valueOf(((C5211c) it.next()).m24110d())) && (i7 = i7 + 1) < 0) {
                            AbstractC1638q.m6772q();
                        }
                    }
                }
                numValueOf = Integer.valueOf(i7);
            } else {
                numValueOf = null;
            }
            AbstractC6118n.m27184b(numValueOf);
            boolean z7 = numValueOf.intValue() > 0;
            List list2 = this.f13161c1;
            if (list2 != null) {
                for (Object obj : list2) {
                    int i9 = i8 + 1;
                    if (i8 < 0) {
                        AbstractC1638q.m6773r();
                    }
                    C5211c c5211c = (C5211c) obj;
                    if (z7) {
                        HashSet hashSetM8566M = abstractC2072h.m8566M();
                        AbstractC6118n.m27185c(c5211c, "null cannot be cast to non-null type com.anas_mugally.clipboard.database.entity.Text");
                        hashSetM8566M.add(Integer.valueOf(c5211c.m24110d()));
                    } else {
                        HashSet hashSetM8566M2 = abstractC2072h.m8566M();
                        AbstractC6118n.m27185c(c5211c, "null cannot be cast to non-null type com.anas_mugally.clipboard.database.entity.Text");
                        hashSetM8566M2.remove(Integer.valueOf(c5211c.m24110d()));
                    }
                    i8 = i9;
                }
            }
            abstractC2072h.m13322l();
        }
    }

    /* JADX INFO: renamed from: e5 */
    private final void m16549e5(View view, String str, int i7) {
        AppDatabase appDatabaseM16540V4 = m16540V4();
        AbstractC6118n.m27184b(appDatabaseM16540V4);
        C7213n c7213n = new C7213n(this, appDatabaseM16540V4);
        AbstractC6118n.m27184b(view);
        AbstractC6118n.m27184b(str);
        c7213n.m31850m(view, str, new d(i7));
    }

    /* JADX INFO: renamed from: f5 */
    private final void m16550f5() {
        ImageView imageView = this.f13153U0;
        RecyclerView recyclerView = null;
        if (imageView == null) {
            AbstractC6118n.m27197o("imgBlockingAccessToNots");
            imageView = null;
        }
        imageView.setVisibility(8);
        RecyclerView recyclerView2 = this.f13151S0;
        if (recyclerView2 == null) {
            AbstractC6118n.m27197o("recyclerView");
        } else {
            recyclerView = recyclerView2;
        }
        recyclerView.setVisibility(0);
    }

    /* JADX INFO: renamed from: g5 */
    private final void m16552g5() {
        this.f13150R0 = (SwipeRefreshLayout) findViewById(R.id.swiper_refresh_layout);
        this.f13151S0 = (RecyclerView) findViewById(R.id.swipe_target);
        this.f13152T0 = (ChipGroup) findViewById(R.id.chip_group_categories);
        this.f13153U0 = (ImageView) findViewById(R.id.img_blocking_access_to_nots);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i5 */
    public static final C1444v m16555i5(AbstractViewOnClickListenerC3141a abstractViewOnClickListenerC3141a, View view, int i7, int i8, String str) {
        abstractViewOnClickListenerC3141a.m16557j5(view, i7, i8, str);
        return C1444v.f4971a;
    }

    /* JADX INFO: renamed from: j5 */
    private final void m16557j5(View view, final int i7, int i8, String str) {
        C5211c c5211c;
        String strM24112f;
        List list = this.f13161c1;
        if (list == null || i7 >= list.size()) {
            return;
        }
        List list2 = this.f13161c1;
        AbstractC6118n.m27184b(list2);
        C5211c c5211c2 = (C5211c) AbstractC1638q.m6573M(list2, i7);
        if (c5211c2 != null && (strM24112f = c5211c2.m24112f()) != null) {
            str = strM24112f;
        } else if (str == null) {
            str = getString(R.string.empty_text);
            AbstractC6118n.m27186d(str, "getString(...)");
        }
        if (AbstractC3041D.m15081f(this, str)) {
            switch (i8) {
                case R.id.delete /* 2131296517 */:
                    C3034A.f12453a.m15023J(this, 1, new InterfaceC5356a() { // from class: w1.h
                        @Override // p238e6.InterfaceC5356a
                        public final Object invoke() {
                            return AbstractViewOnClickListenerC3141a.m16559k5(this.f29161a, i7);
                        }
                    });
                    break;
                case R.id.edit /* 2131296553 */:
                    AbstractC6118n.m27184b(view);
                    view.setTransitionName("edit_shared_element_transition");
                    ActivityOptions activityOptionsMakeSceneTransitionAnimation = ActivityOptions.makeSceneTransitionAnimation(this, view, "edit_shared_element_transition");
                    List list3 = this.f13161c1;
                    if (list3 == null || (c5211c = (C5211c) AbstractC1638q.m6573M(list3, i7)) == null) {
                        return;
                    }
                    if (AbstractC3041D.m15081f(this, c5211c.m24112f())) {
                        startActivity(new Intent(this, (Class<?>) AddNoteActivity.class).putExtra(f13141e1, c5211c).putExtra(f13142f1, true), activityOptionsMakeSceneTransitionAnimation.toBundle());
                    }
                    break;
                case R.id.img_pin /* 2131296651 */:
                    List list4 = this.f13161c1;
                    AbstractC6118n.m27184b(list4);
                    AbstractC6672k.m28227d(AbstractC2658t.m12641a(this), C6656c0.m28163b(), null, new e(i7, ((C5211c) list4.get(i7)).m24111e() != 0, null), 2, null);
                    break;
                case R.id.swap /* 2131297016 */:
                    List list5 = this.f13160b1;
                    if ((list5 != null ? list5.size() : 0) <= 1) {
                        Toast.makeText(this, R.string.you_need_more_one_sections, 0).show();
                    } else {
                        m16549e5(view, str, i7);
                    }
                    break;
                default:
                    C5920K c5920k = new C5920K(this, str, m16565n5());
                    AbstractC6118n.m27184b(view);
                    c5920k.m26717s(view, m16540V4());
                    c5920k.m26716i(i8);
                    break;
            }
            m16541V5();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k5 */
    public static final C1444v m16559k5(AbstractViewOnClickListenerC3141a abstractViewOnClickListenerC3141a, int i7) {
        List list = abstractViewOnClickListenerC3141a.f13161c1;
        AbstractC6118n.m27184b(list);
        C5211c c5211c = (C5211c) AbstractC1638q.m6573M(list, i7);
        if (c5211c != null) {
            abstractViewOnClickListenerC3141a.m16526O4(new Integer[]{Integer.valueOf(c5211c.m24110d())});
        }
        return C1444v.f4971a;
    }

    /* JADX INFO: renamed from: l5 */
    private final boolean m16561l5() {
        return System.currentTimeMillis() < m15843T1().getLong("ACCESSIBILITY_SKIP_TO_ONE_WEEK_UNTIL", 0L);
    }

    /* JADX INFO: renamed from: m5 */
    private final boolean m16563m5() {
        return System.currentTimeMillis() < m15843T1().getLong("NOTIFICATION_SKIP_TO_ONE_WEEK_UNTIL", 0L);
    }

    /* JADX INFO: renamed from: n5 */
    private final boolean m16565n5() {
        ViewGroup viewGroupM16534S4 = m16534S4();
        AbstractC6118n.m27184b(viewGroupM16534S4);
        return viewGroupM16534S4.getVisibility() == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o5 */
    public static final boolean m16567o5(final AbstractViewOnClickListenerC3141a abstractViewOnClickListenerC3141a, MenuItem it) {
        AbstractC6118n.m27187e(it, "it");
        AbstractC2072h abstractC2072h = abstractViewOnClickListenerC3141a.f13145M0;
        AbstractC6118n.m27184b(abstractC2072h);
        final HashSet hashSetM8566M = abstractC2072h.m8566M();
        final int itemId = it.getItemId();
        if (hashSetM8566M.isEmpty() && itemId != R.id.select_all) {
            Toast.makeText(abstractViewOnClickListenerC3141a, R.string.empty_text, 0).show();
            return true;
        }
        if (itemId == R.id.delete) {
            C3034A.f12453a.m15023J(abstractViewOnClickListenerC3141a, hashSetM8566M.size(), new InterfaceC5356a() { // from class: w1.o
                @Override // p238e6.InterfaceC5356a
                public final Object invoke() {
                    return AbstractViewOnClickListenerC3141a.m16569p5(this.f29171a, hashSetM8566M);
                }
            });
        } else if (itemId != R.id.select_all) {
            abstractViewOnClickListenerC3141a.m16538U4(hashSetM8566M, new InterfaceC5367l() { // from class: w1.p
                @Override // p238e6.InterfaceC5367l
                public final Object invoke(Object obj) {
                    return AbstractViewOnClickListenerC3141a.m16571q5(this.f29173a, itemId, (String) obj);
                }
            });
        } else {
            abstractViewOnClickListenerC3141a.m16548d5();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p5 */
    public static final C1444v m16569p5(AbstractViewOnClickListenerC3141a abstractViewOnClickListenerC3141a, HashSet hashSet) {
        abstractViewOnClickListenerC3141a.m16526O4((Integer[]) hashSet.toArray(new Integer[0]));
        abstractViewOnClickListenerC3141a.mo12238b().m23939s();
        return C1444v.f4971a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q5 */
    public static final C1444v m16571q5(AbstractViewOnClickListenerC3141a abstractViewOnClickListenerC3141a, int i7, String combinedText) {
        AbstractC6118n.m27187e(combinedText, "combinedText");
        if (AbstractC3041D.m15081f(abstractViewOnClickListenerC3141a, combinedText)) {
            ImageButton imageButton = abstractViewOnClickListenerC3141a.m16532R4().getItemViewMap().get(Integer.valueOf(R.id.save));
            AbstractC6118n.m27184b(imageButton);
            abstractViewOnClickListenerC3141a.m16591h5(imageButton, -1, i7, combinedText);
        }
        return C1444v.f4971a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r5 */
    public static final C1444v m16573r5(final AbstractViewOnClickListenerC3141a abstractViewOnClickListenerC3141a, final ComponentName componentName, final ActionsLayout.EnumC3037c type) {
        AbstractC6118n.m27187e(type, "type");
        AbstractC2072h abstractC2072h = abstractViewOnClickListenerC3141a.f13145M0;
        AbstractC6118n.m27184b(abstractC2072h);
        HashSet hashSetM8566M = abstractC2072h.m8566M();
        if (hashSetM8566M.isEmpty()) {
            Toast.makeText(abstractViewOnClickListenerC3141a, R.string.empty_text, 0).show();
            return C1444v.f4971a;
        }
        abstractViewOnClickListenerC3141a.m16538U4(hashSetM8566M, new InterfaceC5367l() { // from class: w1.n
            @Override // p238e6.InterfaceC5367l
            public final Object invoke(Object obj) {
                return AbstractViewOnClickListenerC3141a.m16575s5(this.f29168a, componentName, type, (String) obj);
            }
        });
        return C1444v.f4971a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s5 */
    public static final C1444v m16575s5(AbstractViewOnClickListenerC3141a abstractViewOnClickListenerC3141a, ComponentName componentName, ActionsLayout.EnumC3037c enumC3037c, String combinedText) {
        AbstractC6118n.m27187e(combinedText, "combinedText");
        if (AbstractC3041D.m15081f(abstractViewOnClickListenerC3141a, combinedText)) {
            AbstractC3041D.m15089n(abstractViewOnClickListenerC3141a, combinedText, componentName, enumC3037c, abstractViewOnClickListenerC3141a.m16565n5());
        }
        return C1444v.f4971a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t5 */
    public static final C1444v m16577t5(AbstractViewOnClickListenerC3141a abstractViewOnClickListenerC3141a, AbstractC5158A addCallback) {
        AbstractC6118n.m27187e(addCallback, "$this$addCallback");
        abstractViewOnClickListenerC3141a.m16534S4().setVisibility(8);
        abstractViewOnClickListenerC3141a.m16544X4().setVisibility(0);
        AbstractC2072h abstractC2072h = abstractViewOnClickListenerC3141a.f13145M0;
        if (abstractC2072h != null) {
            abstractC2072h.m8568O(false);
        }
        addCallback.m23913h();
        return C1444v.f4971a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u5 */
    public static final C1444v m16579u5(AbstractViewOnClickListenerC3141a abstractViewOnClickListenerC3141a, String pass, C5411i dialog) {
        AbstractC6118n.m27187e(pass, "pass");
        AbstractC6118n.m27187e(dialog, "dialog");
        C5209a c5209aM16536T4 = abstractViewOnClickListenerC3141a.m16536T4();
        AbstractC6118n.m27184b(c5209aM16536T4);
        if (AbstractC6118n.m27183a(pass, c5209aM16536T4.m24101g())) {
            dialog.mo12082T1();
            abstractViewOnClickListenerC3141a.m16584x5();
        } else {
            dialog.m24526B2();
        }
        return C1444v.f4971a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v5 */
    public static final C1444v m16581v5(AbstractViewOnClickListenerC3141a abstractViewOnClickListenerC3141a) {
        abstractViewOnClickListenerC3141a.m16584x5();
        return C1444v.f4971a;
    }

    /* JADX INFO: renamed from: x5 */
    private final void m16584x5() {
        SwipeRefreshLayout swipeRefreshLayout = this.f13150R0;
        if (swipeRefreshLayout == null) {
            AbstractC6118n.m27197o("swipeRefreshLayout");
            swipeRefreshLayout = null;
        }
        swipeRefreshLayout.setRefreshing(true);
        HashMap mapM16588Z4 = m16588Z4();
        C5209a c5209aM16536T4 = m16536T4();
        AbstractC6118n.m27184b(c5209aM16536T4);
        mapM16588Z4.put(c5209aM16536T4.m24098d(), Boolean.TRUE);
        m16550f5();
        m16501B5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z5 */
    public static final HashMap m16587z5() {
        return new HashMap();
    }

    @Override // p189Z0.AbstractC2072h.a
    /* JADX INFO: renamed from: C */
    public void mo8569C(AbstractC2072h adapter) {
        AbstractC6118n.m27187e(adapter, "adapter");
        m16252P2();
        this.f13145M0 = adapter;
        if (Build.VERSION.SDK_INT < 28) {
            m16532R4().removeItem(R.id.send_text);
        }
        m16532R4().setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: w1.j
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return AbstractViewOnClickListenerC3141a.m16567o5(this.f29164a, menuItem);
            }
        });
        m16532R4().setOnMoreAppsItemClickListener(new InterfaceC5371p() { // from class: w1.k
            @Override // p238e6.InterfaceC5371p
            public final Object invoke(Object obj, Object obj2) {
                return AbstractViewOnClickListenerC3141a.m16573r5(this.f29165a, (ComponentName) obj, (ActionsLayout.EnumC3037c) obj2);
            }
        });
        AbstractC5166I.m23950b(mo12238b(), this, false, new InterfaceC5367l() { // from class: w1.m
            @Override // p238e6.InterfaceC5367l
            public final Object invoke(Object obj) {
                return AbstractViewOnClickListenerC3141a.m16577t5(this.f29167a, (AbstractC5158A) obj);
            }
        }, 2, null);
        ViewGroup viewGroupM16534S4 = m16534S4();
        AbstractC6118n.m27184b(viewGroupM16534S4);
        viewGroupM16534S4.setVisibility(0);
        m16544X4().setVisibility(8);
    }

    @Override // com.anas_mugally.clipboard.p221ui.ads.AbstractActivityC3130a
    /* JADX INFO: renamed from: D2 */
    protected Set mo15494D2() {
        if (m15845V1()) {
            return AbstractC1617O.m6652f(AbstractActivityC3130a.d.INTERSTITIAL, AbstractActivityC3130a.d.APP_OPEN, AbstractActivityC3130a.d.NATIVE);
        }
        return null;
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.InterfaceC2817j
    /* JADX INFO: renamed from: F */
    public void mo14014F() {
        m16522M4();
        m16499A5();
    }

    /* JADX INFO: renamed from: Z4 */
    public final HashMap m16588Z4() {
        return (HashMap) this.f13154V0.getValue();
    }

    /* JADX INFO: renamed from: a5 */
    protected final int m16589a5() {
        return this.f13159a1;
    }

    /* JADX INFO: renamed from: b5 */
    public final int m16590b5() {
        return this.f13156X0;
    }

    /* JADX INFO: renamed from: h5 */
    public void m16591h5(final View view, final int i7, final int i8, final String str) {
        m16252P2();
        if (i8 == R.id.more) {
            return;
        }
        m16261j3(new InterfaceC5356a() { // from class: w1.g
            @Override // p238e6.InterfaceC5356a
            public final Object invoke() {
                return AbstractViewOnClickListenerC3141a.m16555i5(this.f29156a, view, i7, i8, str);
            }
        });
    }

    @Override // com.anas_mugally.clipboard.p221ui.AbstractActivityC3140d, androidx.fragment.app.AbstractActivityC2592j, p223d.AbstractActivityC5187q, android.app.Activity
    protected void onActivityResult(int i7, int i8, Intent intent) {
        super.onActivityResult(i7, i8, intent);
        if (i8 != -1) {
            if (i8 == C3034A.f12453a.m15048w()) {
                View view = new View(getApplication());
                view.setId(R.id.in_app_purchasing);
                onClick(view);
                return;
            }
            return;
        }
        Boolean boolValueOf = intent != null ? Boolean.valueOf(intent.getBooleanExtra("changePurchased", false)) : null;
        if (i7 == this.f13158Z0 || i7 == this.f13159a1 || AbstractC6118n.m27183a(boolValueOf, Boolean.TRUE)) {
            recreate();
        }
    }

    @Override // com.anas_mugally.clipboard.p221ui.AbstractViewOnClickListenerC3111a, android.view.View.OnClickListener
    public void onClick(View view) {
        C5211c c5211c;
        super.onClick(view);
        AbstractC6118n.m27184b(view);
        switch (view.getId()) {
            case R.id.flt_btn_add_text /* 2131296596 */:
                view.setTransitionName("shared_element_transition");
                ActivityOptions activityOptionsMakeSceneTransitionAnimation = ActivityOptions.makeSceneTransitionAnimation(this, view, "shared_element_transition");
                Intent intent = new Intent(this, (Class<?>) AddNoteActivity.class);
                intent.putExtra(f13142f1, true);
                startActivityForResult(intent, this.f13157Y0, activityOptionsMakeSceneTransitionAnimation.toBundle());
                break;
            case R.id.ftb_enable_accessibility /* 2131296601 */:
                m16525N5(false);
                break;
            case R.id.img_blocking_access_to_nots /* 2131296647 */:
                AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591iM12379h0 = m12232H0().m12379h0("AccessByPasswordOrBiometricDialog");
                C5209a c5209aM16536T4 = m16536T4();
                AbstractC6118n.m27184b(c5209aM16536T4);
                if (c5209aM16536T4.m24102h() && abstractComponentCallbacksC2591iM12379h0 == null) {
                    C5411i.a aVar = C5411i.f20591L0;
                    C5209a c5209aM16536T5 = m16536T4();
                    AbstractC6118n.m27184b(c5209aM16536T5);
                    C5411i c5411iM24530a = aVar.m24530a(c5209aM16536T5.m24097c());
                    c5411iM24530a.m24529y2(new InterfaceC5371p() { // from class: w1.a
                        @Override // p238e6.InterfaceC5371p
                        public final Object invoke(Object obj, Object obj2) {
                            return AbstractViewOnClickListenerC3141a.m16579u5(this.f29150a, (String) obj, (C5411i) obj2);
                        }
                    });
                    c5411iM24530a.m24528x2(new InterfaceC5356a() { // from class: w1.l
                        @Override // p238e6.InterfaceC5356a
                        public final Object invoke() {
                            return AbstractViewOnClickListenerC3141a.m16581v5(this.f29166a);
                        }
                    });
                    c5411iM24530a.mo7649g2(m12232H0(), "AccessByPasswordOrBiometricDialog");
                    break;
                }
                break;
            case R.id.img_open_app /* 2131296650 */:
                startActivity(new Intent(this, (Class<?>) BrowserNotesFullActivity.class).addFlags(268435456));
                finishAndRemoveTask();
                break;
            case R.id.lay_parent /* 2131296713 */:
            case R.id.text_content /* 2131297058 */:
            case R.id.text_title /* 2131297086 */:
                List list = this.f13161c1;
                if (list != null && (c5211c = (C5211c) AbstractC1638q.m6573M(list, Integer.parseInt(view.getTag().toString()))) != null) {
                    startActivity(new Intent(this, (Class<?>) TextDialogActivity.class).putExtra(f13141e1, c5211c));
                    break;
                }
                break;
        }
    }

    @Override // com.anas_mugally.clipboard.p221ui.ads.BaseMyAppAdsActivity, com.anas_mugally.clipboard.p221ui.ads.AbstractActivityC3130a, com.anas_mugally.clipboard.p221ui.AbstractViewOnClickListenerC3111a, com.anas_mugally.clipboard.p221ui.AbstractActivityC3140d, androidx.fragment.app.AbstractActivityC2592j, p223d.AbstractActivityC5187q, p017C.AbstractActivityC0106g, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m16552g5();
        boolean z7 = false;
        if (m15843T1().getBoolean("first_open_app", true)) {
            if (this instanceof BrowserNotesFullActivity) {
                startActivity(new Intent(this, (Class<?>) AppIntroActivity.class));
                SharedPreferences.Editor editorM15844U1 = m15844U1();
                AbstractC6118n.m27184b(editorM15844U1);
                editorM15844U1.putBoolean("first_open_app", false).commit();
            }
        } else if (C3034A.f12453a.m15015B(this)) {
            if (!m16546Y4() && !m16563m5()) {
                z7 = true;
            }
            MyApplication myApplicationM15105a = MyApplication.f12496a.m15105a();
            AbstractC6118n.m27184b(myApplicationM15105a);
            if (!AbstractC3081u.m15315b(myApplicationM15105a) && !m16561l5() && (AbstractC5657c.f21645a.mo25163c() || !z7)) {
                m16525N5(true);
            } else if (z7) {
                m16531Q5(true);
            }
        }
        m16521L5();
    }

    @Override // com.anas_mugally.clipboard.p221ui.ads.BaseMyAppAdsActivity, com.anas_mugally.clipboard.p221ui.ads.AbstractActivityC3130a, com.anas_mugally.clipboard.p221ui.AbstractViewOnClickListenerC3111a, androidx.fragment.app.AbstractActivityC2592j, android.app.Activity
    protected void onResume() {
        super.onResume();
        m16499A5();
        FloatingActionButton floatingActionButtonM16542W4 = m16542W4();
        AbstractC6118n.m27186d(floatingActionButtonM16542W4, "<get-ftbEnableAccessibility>(...)");
        if (floatingActionButtonM16542W4.getVisibility() == 0) {
            FloatingActionButton floatingActionButtonM16542W5 = m16542W4();
            AbstractC6118n.m27186d(floatingActionButtonM16542W5, "<get-ftbEnableAccessibility>(...)");
            MyApplication myApplicationM15105a = MyApplication.f12496a.m15105a();
            AbstractC6118n.m27184b(myApplicationM15105a);
            floatingActionButtonM16542W5.setVisibility(!AbstractC3081u.m15314a(myApplicationM15105a) ? 0 : 8);
        }
    }

    @Override // com.anas_mugally.clipboard.p221ui.ads.AbstractActivityC3130a, androidx.appcompat.app.AbstractActivityC2242c, androidx.fragment.app.AbstractActivityC2592j, android.app.Activity
    protected void onStart() {
        super.onStart();
        Application application = getApplication();
        AbstractC6118n.m27185c(application, "null cannot be cast to non-null type com.anas_mugally.clipboard.MyApplication");
        MyApplication.m15101k((MyApplication) application, false, 1, null);
        m16522M4();
    }

    @Override // androidx.appcompat.app.AbstractActivityC2242c, androidx.fragment.app.AbstractActivityC2592j, android.app.Activity
    protected void onStop() {
        List<AbstractComponentCallbacksC2591i> listM12401u0 = m12232H0().m12401u0();
        AbstractC6118n.m27186d(listM12401u0, "getFragments(...)");
        for (AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i : listM12401u0) {
            if (abstractComponentCallbacksC2591i instanceof DialogInterfaceOnCancelListenerC2590h) {
                ((DialogInterfaceOnCancelListenerC2590h) abstractComponentCallbacksC2591i).mo12082T1();
            }
        }
        super.onStop();
        m16588Z4().clear();
    }

    /* JADX INFO: renamed from: w5 */
    protected final void m16592w5(boolean z7) {
        startActivity(new Intent(this, (Class<?>) AccessibilitySettingFullActivity.class).putExtra("forEnableAccessibility", z7));
    }

    @Override // p238e6.InterfaceC5373r
    /* JADX INFO: renamed from: y */
    public /* bridge */ /* synthetic */ Object mo1284y(Object obj, Object obj2, Object obj3, Object obj4) {
        m16591h5((View) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue(), (String) obj4);
        return C1444v.f4971a;
    }

    /* JADX INFO: renamed from: y5 */
    protected final void m16593y5(boolean z7) {
        Intent intentPutExtra = new Intent(this, (Class<?>) SettingActivity.class).putExtra("forEnableOrDisableNotification", z7).putExtra("isFullScreenMode", true);
        AbstractC6118n.m27186d(intentPutExtra, "putExtra(...)");
        startActivityForResult(intentPutExtra, this.f13158Z0);
    }
}
