package p241f1;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.content.AbstractC2436b;
import androidx.databinding.AbstractC2473f;
import androidx.databinding.AbstractC2474g;
import androidx.fragment.app.AbstractActivityC2592j;
import androidx.lifecycle.AbstractC2658t;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.anas_mugally.clipboard.C3034A;
import com.anas_mugally.clipboard.C3065o;
import com.anas_mugally.clipboard.MyApplication;
import com.anas_mugally.clipboard.R;
import com.anas_mugally.clipboard.p221ui.p222ai.utils.C3137d;
import com.android.billingclient.api.AbstractC3175a;
import com.android.billingclient.api.C3178d;
import com.android.billingclient.api.C3180f;
import com.android.billingclient.api.C3181g;
import com.android.billingclient.api.C3182h;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.C4428b;
import com.google.android.material.bottomsheet.DialogC4427a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.AbstractC6087b;
import kotlin.coroutines.jvm.internal.AbstractC6097l;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import kotlin.jvm.internal.C6103F;
import p111O.AbstractC1030Z;
import p145S5.AbstractC1430h;
import p145S5.AbstractC1437o;
import p145S5.C1444v;
import p145S5.InterfaceC1429g;
import p152T5.AbstractC1638q;
import p173W5.InterfaceC1875e;
import p180X5.AbstractC2005b;
import p233e1.AbstractC5290d0;
import p238e6.InterfaceC5356a;
import p238e6.InterfaceC5367l;
import p238e6.InterfaceC5371p;
import p289l1.InterfaceC6212a0;
import p318o6.AbstractC6668i;
import p318o6.AbstractC6672k;
import p318o6.C6656c0;
import p318o6.InterfaceC6624N;
import p318o6.InterfaceC6701y0;
import p403z1.InterfaceC7564f;
import p405z3.C7611b;

/* JADX INFO: renamed from: f1.q */
/* JADX INFO: loaded from: classes.dex */
public final class C5419q extends C4428b {

    /* JADX INFO: renamed from: M0 */
    public static final a f20605M0 = new a(null);

    /* JADX INFO: renamed from: F0 */
    private InterfaceC6212a0 f20606F0;

    /* JADX INFO: renamed from: G0 */
    private AbstractC3175a f20607G0;

    /* JADX INFO: renamed from: H0 */
    private final InterfaceC1429g f20608H0;

    /* JADX INFO: renamed from: I0 */
    private c[] f20609I0;

    /* JADX INFO: renamed from: J0 */
    private b f20610J0;

    /* JADX INFO: renamed from: K0 */
    private int f20611K0;

    /* JADX INFO: renamed from: L0 */
    private InterfaceC6701y0 f20612L0;

    /* JADX INFO: renamed from: f1.q$a */
    public static final class a {
        public /* synthetic */ a(AbstractC6112h abstractC6112h) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C5419q m24564a(InterfaceC6212a0 onClickListener, AbstractC3175a abstractC3175a) {
            AbstractC6118n.m27187e(onClickListener, "onClickListener");
            return new C5419q(onClickListener, abstractC3175a);
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: f1.q$b */
    public final class b extends RecyclerView.AbstractC2757h {

        /* JADX INFO: renamed from: d */
        private final c[] f20613d;

        /* JADX INFO: renamed from: e */
        private final InterfaceC5367l f20614e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ C5419q f20615f;

        /* JADX INFO: renamed from: f1.q$b$a */
        public final class a extends RecyclerView.AbstractC2749E {

            /* JADX INFO: renamed from: u */
            private final TextView f20616u;

            /* JADX INFO: renamed from: v */
            private final TextView f20617v;

            /* JADX INFO: renamed from: w */
            private final TextView f20618w;

            /* JADX INFO: renamed from: x */
            private final TextView f20619x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ b f20620y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar, View view) {
                super(view);
                AbstractC6118n.m27187e(view, "view");
                this.f20620y = bVar;
                View viewFindViewById = view.findViewById(R.id.tv_plan_title);
                AbstractC6118n.m27186d(viewFindViewById, "findViewById(...)");
                this.f20616u = (TextView) viewFindViewById;
                View viewFindViewById2 = view.findViewById(R.id.tv_badge);
                AbstractC6118n.m27186d(viewFindViewById2, "findViewById(...)");
                this.f20617v = (TextView) viewFindViewById2;
                View viewFindViewById3 = view.findViewById(R.id.tv_price);
                AbstractC6118n.m27186d(viewFindViewById3, "findViewById(...)");
                this.f20618w = (TextView) viewFindViewById3;
                View viewFindViewById4 = view.findViewById(R.id.tv_old_price);
                AbstractC6118n.m27186d(viewFindViewById4, "findViewById(...)");
                this.f20619x = (TextView) viewFindViewById4;
            }

            /* JADX INFO: renamed from: Q */
            public final TextView m24573Q() {
                return this.f20617v;
            }

            /* JADX INFO: renamed from: R */
            public final TextView m24574R() {
                return this.f20619x;
            }

            /* JADX INFO: renamed from: S */
            public final TextView m24575S() {
                return this.f20616u;
            }

            /* JADX INFO: renamed from: T */
            public final TextView m24576T() {
                return this.f20618w;
            }
        }

        public b(C5419q c5419q, c[] options, InterfaceC5367l onItemClick) {
            AbstractC6118n.m27187e(options, "options");
            AbstractC6118n.m27187e(onItemClick, "onItemClick");
            this.f20615f = c5419q;
            this.f20613d = options;
            this.f20614e = onItemClick;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: E */
        public static final boolean m24567E(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action == 0) {
                AbstractC6118n.m27184b(view);
                m24568F(view, true);
            } else if (action == 1) {
                AbstractC6118n.m27184b(view);
                m24568F(view, false);
            } else if (action == 3) {
                AbstractC6118n.m27184b(view);
                m24569G(view);
            }
            return false;
        }

        /* JADX INFO: renamed from: F */
        private static final void m24568F(View view, boolean z7) {
            float f7 = z7 ? 0.97f : 1.0f;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "scaleX", view.getScaleX(), f7);
            objectAnimatorOfFloat.setDuration(50L);
            objectAnimatorOfFloat.start();
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, "scaleY", view.getScaleY(), f7);
            objectAnimatorOfFloat2.setDuration(50L);
            objectAnimatorOfFloat2.start();
        }

        /* JADX INFO: renamed from: G */
        private static final void m24569G(View view) {
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            AbstractC1030Z.m4506z0(view, 0.0f);
            view.clearAnimation();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: H */
        public static final void m24570H(b bVar, c cVar, View view) {
            bVar.f20614e.invoke(cVar);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2757h
        /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
        public void mo3682q(a holder, int i7) {
            AbstractC6118n.m27187e(holder, "holder");
            final c cVar = this.f20613d[i7];
            if (cVar == null) {
                return;
            }
            holder.m24575S().setText(cVar.m24582f());
            holder.m24576T().setText(cVar.m24580d());
            holder.m24574R().setVisibility(cVar.m24579c() != null ? 0 : 8);
            if (cVar.m24579c() != null) {
                holder.m24574R().setText(cVar.m24579c());
                holder.m24574R().setPaintFlags(holder.m24574R().getPaintFlags() | 16);
            }
            String strM24577a = cVar.m24577a();
            if (strM24577a == null || strM24577a.length() == 0) {
                holder.m24573Q().setVisibility(4);
            } else {
                holder.m24573Q().setVisibility(0);
                holder.m24573Q().setText(cVar.m24577a());
            }
            holder.f10894a.setOnTouchListener(new View.OnTouchListener() { // from class: f1.r
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return C5419q.b.m24567E(view, motionEvent);
                }
            });
            holder.f10894a.setOnClickListener(new View.OnClickListener() { // from class: f1.s
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C5419q.b.m24570H(this.f20644a, cVar, view);
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2757h
        /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
        public a mo3683s(ViewGroup parent, int i7) {
            AbstractC6118n.m27187e(parent, "parent");
            View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_pricing_option, parent, false);
            AbstractC6118n.m27184b(viewInflate);
            return new a(this, viewInflate);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2757h
        /* JADX INFO: renamed from: g */
        public int mo8548g() {
            return this.f20613d.length;
        }
    }

    /* JADX INFO: renamed from: f1.q$d */
    static final class d extends AbstractC6097l implements InterfaceC5371p {

        /* JADX INFO: renamed from: a */
        int f20628a;

        d(InterfaceC1875e interfaceC1875e) {
            super(2, interfaceC1875e);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
            return C5419q.this.new d(interfaceC1875e);
        }

        @Override // p238e6.InterfaceC5371p
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
            return ((d) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final Object invokeSuspend(Object obj) {
            Object objE = AbstractC2005b.m8369e();
            int i7 = this.f20628a;
            if (i7 == 0) {
                AbstractC1437o.m6082b(obj);
                C5419q c5419q = C5419q.this;
                this.f20628a = 1;
                if (c5419q.m24539H2(this) == objE) {
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

    /* JADX INFO: renamed from: f1.q$e */
    static final class e extends AbstractC6097l implements InterfaceC5371p {

        /* JADX INFO: renamed from: a */
        int f20630a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C3182h f20631b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ C5419q f20632c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(C3182h c3182h, C5419q c5419q, InterfaceC1875e interfaceC1875e) {
            super(2, interfaceC1875e);
            this.f20631b = c3182h;
            this.f20632c = c5419q;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
            return new e(this.f20631b, this.f20632c, interfaceC1875e);
        }

        @Override // p238e6.InterfaceC5371p
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
            return ((e) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final Object invokeSuspend(Object obj) {
            String strM16949a;
            AbstractC2005b.m8369e();
            if (this.f20630a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1437o.m6082b(obj);
            List<C3180f> listM16973a = this.f20631b.m16973a();
            AbstractC6118n.m27186d(listM16973a, "getProductDetailsList(...)");
            for (C3180f c3180f : listM16973a) {
                String strM16942c = c3180f.m16942c();
                if (strM16942c.hashCode() == -63216790 && strM16942c.equals("clipboard_lifetime_premium")) {
                    C3180f.b bVarM16940a = c3180f.m16940a();
                    if (bVarM16940a == null || (strM16949a = bVarM16940a.m16949a()) == null) {
                        return C1444v.f4971a;
                    }
                    C3180f.b bVarM16940a2 = c3180f.m16940a();
                    Long lM27123d = bVarM16940a2 != null ? AbstractC6087b.m27123d(bVarM16940a2.m16951c()) : null;
                    String strM24533B2 = this.f20632c.m24533B2(strM16949a, lM27123d != null ? AbstractC6087b.m27121b(lM27123d.longValue() / 1000000.0d) : null);
                    if (this.f20632c.m12204u() == null) {
                        return C1444v.f4971a;
                    }
                    C5419q c5419q = this.f20632c;
                    c[] cVarArr = c5419q.f20609I0;
                    AbstractC6118n.m27184b(c3180f);
                    String strM12154X = c5419q.m12154X(R.string.lifetime_premium);
                    AbstractC6118n.m27186d(strM12154X, "getString(...)");
                    cVarArr[3] = new c(c3180f, strM12154X, strM16949a, strM24533B2, 50, null, c5419q.m12154X(R.string.most_popular), 32, null);
                }
            }
            this.f20632c.m24548Q2();
            return C1444v.f4971a;
        }
    }

    /* JADX INFO: renamed from: f1.q$f */
    static final class f extends AbstractC6097l implements InterfaceC5371p {

        /* JADX INFO: renamed from: a */
        int f20633a;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ List f20635c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ List f20636d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(List list, List list2, InterfaceC1875e interfaceC1875e) {
            super(2, interfaceC1875e);
            this.f20635c = list;
            this.f20636d = list2;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
            return C5419q.this.new f(this.f20635c, this.f20636d, interfaceC1875e);
        }

        @Override // p238e6.InterfaceC5371p
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
            return ((f) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
        
            if (r5.m24540I2(r1, r4) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objE = AbstractC2005b.m8369e();
            int i7 = this.f20633a;
            if (i7 != 0) {
                if (i7 == 1) {
                    AbstractC1437o.m6082b(obj);
                } else {
                    if (i7 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1437o.m6082b(obj);
                }
                return C1444v.f4971a;
            }
            AbstractC1437o.m6082b(obj);
            C5419q c5419q = C5419q.this;
            List list = this.f20635c;
            this.f20633a = 1;
            if (c5419q.m24537F2(list, this) != objE) {
            }
            return objE;
            C5419q c5419q2 = C5419q.this;
            List list2 = this.f20636d;
            this.f20633a = 2;
        }
    }

    /* JADX INFO: renamed from: f1.q$g */
    static final class g extends AbstractC6097l implements InterfaceC5371p {

        /* JADX INFO: renamed from: a */
        int f20637a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C3182h f20638b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ C5419q f20639c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(C3182h c3182h, C5419q c5419q, InterfaceC1875e interfaceC1875e) {
            super(2, interfaceC1875e);
            this.f20638b = c3182h;
            this.f20639c = c5419q;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
            return new g(this.f20638b, this.f20639c, interfaceC1875e);
        }

        @Override // p238e6.InterfaceC5371p
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
            return ((g) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final Object invokeSuspend(Object obj) {
            AbstractC2005b.m8369e();
            if (this.f20637a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1437o.m6082b(obj);
            List<C3180f> listM16973a = this.f20638b.m16973a();
            AbstractC6118n.m27186d(listM16973a, "getProductDetailsList(...)");
            for (C3180f c3180f : listM16973a) {
                List<C3180f.e> listM16944e = c3180f.m16944e();
                if (listM16944e != null) {
                    C5419q c5419q = this.f20639c;
                    for (C3180f.e eVar : listM16944e) {
                        List listM16956a = eVar.m16958b().m16956a();
                        AbstractC6118n.m27186d(listM16956a, "getPricingPhaseList(...)");
                        C3180f.c cVar = (C3180f.c) AbstractC1638q.m6572L(listM16956a);
                        if (cVar != null) {
                            String strM16954a = cVar.m16954a();
                            AbstractC6118n.m27186d(strM16954a, "getFormattedPrice(...)");
                            String strM24533B2 = c5419q.m24533B2(strM16954a, AbstractC6087b.m27121b(cVar.m16955b() / 1000000.0d));
                            String strM16942c = c3180f.m16942c();
                            int iHashCode = strM16942c.hashCode();
                            if (iHashCode != -1593677051) {
                                if (iHashCode != -687294613) {
                                    if (iHashCode == -333516932 && strM16942c.equals("clipboard_monthly_premium") && c5419q.m12204u() != null) {
                                        c[] cVarArr = c5419q.f20609I0;
                                        AbstractC6118n.m27184b(c3180f);
                                        String strM12154X = c5419q.m12154X(R.string.monthly_premium);
                                        AbstractC6118n.m27186d(strM12154X, "getString(...)");
                                        cVarArr[0] = new c(c3180f, strM12154X, strM16954a, strM24533B2, 50, eVar.m16957a(), null, 64, null);
                                    }
                                } else if (strM16942c.equals("clipboard_yearly_premium") && c5419q.m12204u() != null) {
                                    c[] cVarArr2 = c5419q.f20609I0;
                                    AbstractC6118n.m27184b(c3180f);
                                    String strM12154X2 = c5419q.m12154X(R.string.yearly_premium);
                                    AbstractC6118n.m27186d(strM12154X2, "getString(...)");
                                    cVarArr2[2] = new c(c3180f, strM12154X2, strM16954a, strM24533B2, 50, eVar.m16957a(), c5419q.m12154X(R.string.best_value));
                                }
                            } else if (strM16942c.equals("clipboard_half_yearly_premium") && c5419q.m12204u() != null) {
                                c[] cVarArr3 = c5419q.f20609I0;
                                AbstractC6118n.m27184b(c3180f);
                                String strM12154X3 = c5419q.m12154X(R.string.half_yearly_premium);
                                AbstractC6118n.m27186d(strM12154X3, "getString(...)");
                                cVarArr3[1] = new c(c3180f, strM12154X3, strM16954a, strM24533B2, 50, eVar.m16957a(), null, 64, null);
                            }
                        }
                    }
                }
            }
            this.f20639c.m24548Q2();
            return C1444v.f4971a;
        }
    }

    /* JADX INFO: renamed from: f1.q$h */
    public static final class h extends GridLayoutManager.AbstractC2740c {

        /* JADX INFO: renamed from: e */
        final /* synthetic */ int f20640e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ GridLayoutManager f20641f;

        h(int i7, GridLayoutManager gridLayoutManager) {
            this.f20640e = i7;
            this.f20641f = gridLayoutManager;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC2740c
        /* JADX INFO: renamed from: f */
        public int mo12998f(int i7) {
            if (i7 == this.f20640e) {
                return this.f20641f.m12984Z2();
            }
            return 1;
        }
    }

    /* JADX INFO: renamed from: f1.q$i */
    static final class i extends AbstractC6097l implements InterfaceC5371p {

        /* JADX INFO: renamed from: a */
        int f20642a;

        i(InterfaceC1875e interfaceC1875e) {
            super(2, interfaceC1875e);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
            return C5419q.this.new i(interfaceC1875e);
        }

        @Override // p238e6.InterfaceC5371p
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
            return ((i) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final Object invokeSuspend(Object obj) {
            AbstractC2005b.m8369e();
            if (this.f20642a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1437o.m6082b(obj);
            Toast.makeText(MyApplication.f12496a.m15105a(), R.string.error_not_spicfical, 0).show();
            C5419q.this.m24534C2().f20194x.setVisibility(8);
            return C1444v.f4971a;
        }
    }

    public C5419q() {
        this.f20608H0 = AbstractC1430h.m6066b(new InterfaceC5356a() { // from class: f1.k
            @Override // p238e6.InterfaceC5356a
            public final Object invoke() {
                return C5419q.m24532A2(this.f20601a);
            }
        });
        c[] cVarArr = new c[4];
        for (int i7 = 0; i7 < 4; i7++) {
            cVarArr[i7] = null;
        }
        this.f20609I0 = cVarArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A2 */
    public static final AbstractC5290d0 m24532A2(C5419q c5419q) {
        AbstractC2474g abstractC2474gM10822a = AbstractC2473f.m10822a(c5419q.m12216z1());
        AbstractC6118n.m27184b(abstractC2474gM10822a);
        return (AbstractC5290d0) abstractC2474gM10822a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B2 */
    public final String m24533B2(String str, Double d7) {
        if (d7 == null) {
            return null;
        }
        try {
            double dDoubleValue = d7.doubleValue() * 1.5d;
            StringBuilder sb = new StringBuilder();
            int length = str.length();
            for (int i7 = 0; i7 < length; i7++) {
                char cCharAt = str.charAt(i7);
                if (Character.getType(cCharAt) == 26) {
                    sb.append(cCharAt);
                }
            }
            String string = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            C6103F c6103f = C6103F.f23863a;
            String str2 = String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(dDoubleValue)}, 1));
            AbstractC6118n.m27186d(str2, "format(...)");
            sb2.append(str2);
            sb2.append(' ');
            sb2.append(string);
            return sb2.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C2 */
    public final AbstractC5290d0 m24534C2() {
        return (AbstractC5290d0) this.f20608H0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D2 */
    public static final void m24535D2(C5419q c5419q, View view) {
        new C7611b(c5419q.m12211x1()).m33365P(R.string.title_how_to_cancel_subscrib).m33354E(R.string.message_how_to_cancel_subscrib).m33361L(R.string.ok, new DialogInterface.OnClickListener() { // from class: f1.m
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i7) {
                C5419q.m24536E2(dialogInterface, i7);
            }
        }).m9118v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E2 */
    public static final void m24536E2(DialogInterface dialogInterface, int i7) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F2 */
    public final Object m24537F2(List list, InterfaceC1875e interfaceC1875e) {
        ArrayList arrayList = new ArrayList(AbstractC1638q.m6774s(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(C3181g.b.m16965a().m16971b((String) it.next()).m16972c("inapp").m16970a());
        }
        C3181g c3181gM16963a = C3181g.m16959a().m16964b(arrayList).m16963a();
        AbstractC6118n.m27186d(c3181gM16963a, "build(...)");
        AbstractC3175a abstractC3175a = this.f20607G0;
        if (abstractC3175a != null) {
            abstractC3175a.mo16759e(c3181gM16963a, new InterfaceC7564f() { // from class: f1.p
                @Override // p403z1.InterfaceC7564f
                /* JADX INFO: renamed from: a */
                public final void mo24531a(C3178d c3178d, C3182h c3182h) {
                    C5419q.m24538G2(this.f20604a, c3178d, c3182h);
                }
            });
        }
        return C1444v.f4971a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G2 */
    public static final void m24538G2(C5419q c5419q, C3178d billingResult, C3182h queryProductDetailsResult) {
        AbstractC6118n.m27187e(billingResult, "billingResult");
        AbstractC6118n.m27187e(queryProductDetailsResult, "queryProductDetailsResult");
        if (billingResult.m16929c() == 0) {
            AbstractC6672k.m28227d(AbstractC2658t.m12641a(c5419q), C6656c0.m28164c(), null, new e(queryProductDetailsResult, c5419q, null), 2, null);
        } else {
            c5419q.m24547P2();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H2 */
    public final Object m24539H2(InterfaceC1875e interfaceC1875e) {
        Object objM28186g = AbstractC6668i.m28186g(C6656c0.m28163b(), new f(AbstractC1638q.m6759d("clipboard_lifetime_premium"), AbstractC1638q.m6767l("clipboard_monthly_premium", "clipboard_half_yearly_premium", "clipboard_yearly_premium"), null), interfaceC1875e);
        return objM28186g == AbstractC2005b.m8369e() ? objM28186g : C1444v.f4971a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I2 */
    public final Object m24540I2(List list, InterfaceC1875e interfaceC1875e) {
        ArrayList arrayList = new ArrayList(AbstractC1638q.m6774s(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(C3181g.b.m16965a().m16971b((String) it.next()).m16972c("subs").m16970a());
        }
        C3181g c3181gM16963a = C3181g.m16959a().m16964b(arrayList).m16963a();
        AbstractC6118n.m27186d(c3181gM16963a, "build(...)");
        AbstractC3175a abstractC3175a = this.f20607G0;
        if (abstractC3175a != null) {
            abstractC3175a.mo16759e(c3181gM16963a, new InterfaceC7564f() { // from class: f1.n
                @Override // p403z1.InterfaceC7564f
                /* JADX INFO: renamed from: a */
                public final void mo24531a(C3178d c3178d, C3182h c3182h) {
                    C5419q.m24541J2(this.f20602a, c3178d, c3182h);
                }
            });
        }
        return C1444v.f4971a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J2 */
    public static final void m24541J2(C5419q c5419q, C3178d billingResult, C3182h queryProductDetailsResult) {
        AbstractC6118n.m27187e(billingResult, "billingResult");
        AbstractC6118n.m27187e(queryProductDetailsResult, "queryProductDetailsResult");
        if (billingResult.m16929c() == 0) {
            AbstractC6672k.m28227d(AbstractC2658t.m12641a(c5419q), C6656c0.m28164c(), null, new g(queryProductDetailsResult, c5419q, null), 2, null);
        } else {
            c5419q.m24547P2();
        }
    }

    /* JADX INFO: renamed from: K2 */
    private final void m24542K2() {
        Context contextM12204u = m12204u();
        AbstractC6118n.m27185c(contextM12204u, "null cannot be cast to non-null type android.app.Activity");
        this.f20611K0 = ((Activity) contextM12204u).getWindow().getNavigationBarColor();
    }

    /* JADX INFO: renamed from: L2 */
    private final void m24543L2() {
        Dialog dialogM12085W1 = m12085W1();
        if (dialogM12085W1 != null) {
            dialogM12085W1.setOnShowListener(new DialogInterface.OnShowListener() { // from class: f1.l
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    C5419q.m24544M2(dialogInterface);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M2 */
    public static final void m24544M2(DialogInterface dialogInterface) {
        AbstractC6118n.m27185c(dialogInterface, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        FrameLayout frameLayout = (FrameLayout) ((DialogC4427a) dialogInterface).findViewById(R.id.design_bottom_sheet);
        if (frameLayout != null) {
            frameLayout.setBackgroundResource(android.R.color.transparent);
        }
        if (frameLayout != null) {
            BottomSheetBehavior bottomSheetBehaviorM19645q0 = BottomSheetBehavior.m19645q0(frameLayout);
            AbstractC6118n.m27186d(bottomSheetBehaviorM19645q0, "from(...)");
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            layoutParams.height = -1;
            frameLayout.setLayoutParams(layoutParams);
            bottomSheetBehaviorM19645q0.m19669Z0(3);
            bottomSheetBehaviorM19645q0.m19655L0(false);
        }
    }

    /* JADX INFO: renamed from: N2 */
    private final void m24545N2() {
        this.f20610J0 = new b(this, this.f20609I0, new InterfaceC5367l() { // from class: f1.o
            @Override // p238e6.InterfaceC5367l
            public final Object invoke(Object obj) {
                return C5419q.m24546O2(this.f20603a, (C5419q.c) obj);
            }
        });
        C3034A c3034a = C3034A.f12453a;
        Context contextM12214y1 = m12214y1();
        AbstractC6118n.m27186d(contextM12214y1, "requireContext(...)");
        int i7 = c3034a.m15018E(contextM12214y1) ? 4 : 3;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(m12211x1(), i7);
        m24534C2().f20195y.setLayoutManager(gridLayoutManager);
        gridLayoutManager.m12989h3(new h(i7, gridLayoutManager));
        RecyclerView recyclerView = m24534C2().f20195y;
        b bVar = this.f20610J0;
        if (bVar == null) {
            AbstractC6118n.m27197o("pricingAdapter");
            bVar = null;
        }
        recyclerView.setAdapter(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O2 */
    public static final C1444v m24546O2(C5419q c5419q, c pricingOption) {
        AbstractC6118n.m27187e(pricingOption, "pricingOption");
        InterfaceC6212a0 interfaceC6212a0 = c5419q.f20606F0;
        if (interfaceC6212a0 == null) {
            AbstractC6118n.m27197o("listener");
            interfaceC6212a0 = null;
        }
        interfaceC6212a0.mo15838B(pricingOption.m24581e(), pricingOption.m24578b());
        return C1444v.f4971a;
    }

    /* JADX INFO: renamed from: P2 */
    private final void m24547P2() {
        AbstractC6672k.m28227d(AbstractC2658t.m12641a(this), C6656c0.m28164c(), null, new i(null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q2 */
    public final void m24548Q2() {
        AbstractC5290d0 abstractC5290d0M24534C2 = m24534C2();
        abstractC5290d0M24534C2.f20194x.setVisibility(8);
        if (this.f20609I0.length <= 1) {
            m24547P2();
            return;
        }
        abstractC5290d0M24534C2.f20195y.setVisibility(0);
        b bVar = this.f20610J0;
        if (bVar == null) {
            AbstractC6118n.m27197o("pricingAdapter");
            bVar = null;
        }
        bVar.m13322l();
    }

    /* JADX INFO: renamed from: z2 */
    private final void m24563z2() {
        Window window;
        Dialog dialogM12085W1 = m12085W1();
        if (dialogM12085W1 == null || (window = dialogM12085W1.getWindow()) == null) {
            return;
        }
        window.setNavigationBarColor(AbstractC2436b.getColor(window.getContext(), R.color.ai_gradient_center));
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2590h, androidx.fragment.app.AbstractComponentCallbacksC2591i
    /* JADX INFO: renamed from: C0 */
    public void mo676C0() {
        InterfaceC6701y0 interfaceC6701y0 = this.f20612L0;
        if (interfaceC6701y0 != null) {
            InterfaceC6701y0.a.m28291b(interfaceC6701y0, null, 1, null);
        }
        super.mo676C0();
    }

    @Override // com.google.android.material.bottomsheet.C4428b, androidx.fragment.app.DialogInterfaceOnCancelListenerC2590h
    /* JADX INFO: renamed from: T1 */
    public void mo12082T1() {
        Dialog dialogM12085W1;
        Window window;
        try {
            Context contextM12204u = m12204u();
            if ((contextM12204u instanceof Activity) && (window = ((Activity) contextM12204u).getWindow()) != null) {
                window.setNavigationBarColor(this.f20611K0);
            }
            if (m12169g0() && (dialogM12085W1 = m12085W1()) != null && dialogM12085W1.isShowing()) {
                super.mo12082T1();
            } else {
                super.mo12083U1();
            }
        } catch (Exception e7) {
            Log.w("BillingDialog", "dismiss error", e7);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2591i
    /* JADX INFO: renamed from: U0 */
    public void mo1869U0(View view, Bundle bundle) {
        AbstractC6118n.m27187e(view, "view");
        super.mo1869U0(view, bundle);
        C3065o.a aVar = C3065o.f12624f;
        AbstractActivityC2592j abstractActivityC2592jM12211x1 = m12211x1();
        AbstractC6118n.m27186d(abstractActivityC2592jM12211x1, "requireActivity(...)");
        C3065o c3065oM15175a = aVar.m15175a(abstractActivityC2592jM12211x1);
        String name = m12211x1().getClass().getName();
        AbstractC6118n.m27186d(name, "getName(...)");
        c3065oM15175a.m15172n(name);
        m24542K2();
        m24563z2();
        m24543L2();
        Dialog dialogM12085W1 = m12085W1();
        AbstractC6118n.m27184b(dialogM12085W1);
        Window window = dialogM12085W1.getWindow();
        AbstractC6118n.m27184b(window);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        LinearLayout linearLayout = m24534C2().f20193w;
        AbstractActivityC2592j abstractActivityC2592jM12211x2 = m12211x1();
        AbstractC6118n.m27186d(abstractActivityC2592jM12211x2, "requireActivity(...)");
        linearLayout.setBackground(new C3137d(abstractActivityC2592jM12211x2, false).m16407d());
        m24534C2().f20192v.setOnClickListener(new View.OnClickListener() { // from class: f1.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C5419q.m24535D2(this.f20600a, view2);
            }
        });
        m24545N2();
        this.f20612L0 = AbstractC6672k.m28227d(AbstractC2658t.m12641a(this), null, null, new d(null), 3, null);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2590h, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        AbstractC6118n.m27187e(dialog, "dialog");
        super.onDismiss(dialog);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2590h, androidx.fragment.app.AbstractComponentCallbacksC2591i
    /* JADX INFO: renamed from: v0 */
    public void mo681v0(Bundle bundle) {
        super.mo681v0(bundle);
        if (this.f20607G0 == null) {
            mo12082T1();
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2591i
    /* JADX INFO: renamed from: z0 */
    public View mo682z0(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC6118n.m27187e(inflater, "inflater");
        return inflater.inflate(R.layout.view_billing_app, viewGroup, false);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5419q(InterfaceC6212a0 listener, AbstractC3175a abstractC3175a) {
        this();
        AbstractC6118n.m27187e(listener, "listener");
        this.f20606F0 = listener;
        this.f20607G0 = abstractC3175a;
    }

    /* JADX INFO: renamed from: f1.q$c */
    public static final class c {

        /* JADX INFO: renamed from: a */
        private final C3180f f20621a;

        /* JADX INFO: renamed from: b */
        private final String f20622b;

        /* JADX INFO: renamed from: c */
        private final String f20623c;

        /* JADX INFO: renamed from: d */
        private final String f20624d;

        /* JADX INFO: renamed from: e */
        private final int f20625e;

        /* JADX INFO: renamed from: f */
        private final String f20626f;

        /* JADX INFO: renamed from: g */
        private final String f20627g;

        public c(C3180f productDetails, String title, String price, String str, int i7, String str2, String str3) {
            AbstractC6118n.m27187e(productDetails, "productDetails");
            AbstractC6118n.m27187e(title, "title");
            AbstractC6118n.m27187e(price, "price");
            this.f20621a = productDetails;
            this.f20622b = title;
            this.f20623c = price;
            this.f20624d = str;
            this.f20625e = i7;
            this.f20626f = str2;
            this.f20627g = str3;
        }

        /* JADX INFO: renamed from: a */
        public final String m24577a() {
            return this.f20627g;
        }

        /* JADX INFO: renamed from: b */
        public final String m24578b() {
            return this.f20626f;
        }

        /* JADX INFO: renamed from: c */
        public final String m24579c() {
            return this.f20624d;
        }

        /* JADX INFO: renamed from: d */
        public final String m24580d() {
            return this.f20623c;
        }

        /* JADX INFO: renamed from: e */
        public final C3180f m24581e() {
            return this.f20621a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return AbstractC6118n.m27183a(this.f20621a, cVar.f20621a) && AbstractC6118n.m27183a(this.f20622b, cVar.f20622b) && AbstractC6118n.m27183a(this.f20623c, cVar.f20623c) && AbstractC6118n.m27183a(this.f20624d, cVar.f20624d) && this.f20625e == cVar.f20625e && AbstractC6118n.m27183a(this.f20626f, cVar.f20626f) && AbstractC6118n.m27183a(this.f20627g, cVar.f20627g);
        }

        /* JADX INFO: renamed from: f */
        public final String m24582f() {
            return this.f20622b;
        }

        public int hashCode() {
            int iHashCode = ((((this.f20621a.hashCode() * 31) + this.f20622b.hashCode()) * 31) + this.f20623c.hashCode()) * 31;
            String str = this.f20624d;
            int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.f20625e)) * 31;
            String str2 = this.f20626f;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f20627g;
            return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            return "PricingOption(productDetails=" + this.f20621a + ", title=" + this.f20622b + ", price=" + this.f20623c + ", originalPrice=" + this.f20624d + ", discountPercentage=" + this.f20625e + ", offerToken=" + this.f20626f + ", badgeText=" + this.f20627g + ')';
        }

        public /* synthetic */ c(C3180f c3180f, String str, String str2, String str3, int i7, String str4, String str5, int i8, AbstractC6112h abstractC6112h) {
            this(c3180f, str, str2, str3, i7, (i8 & 32) != 0 ? null : str4, (i8 & 64) != 0 ? null : str5);
        }
    }
}
