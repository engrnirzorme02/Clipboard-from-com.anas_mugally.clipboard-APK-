package p347s1;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractActivityC2592j;
import androidx.fragment.app.AbstractComponentCallbacksC2591i;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.anas_mugally.clipboard.R;
import com.anas_mugally.clipboard.p221ui.p222ai.AiTextProcessingActivity;
import com.anas_mugally.clipboard.p221ui.p222ai.models.AiPrompt;
import com.anas_mugally.clipboard.p221ui.p222ai.utils.C3135b;
import java.util.List;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import p111O.AbstractC1030Z;
import p145S5.C1434l;
import p145S5.C1444v;
import p152T5.AbstractC1638q;
import p233e1.AbstractC5264G;
import p238e6.InterfaceC5356a;
import p238e6.InterfaceC5371p;
import p339r1.C6878a;
import p371v1.C7210k;

/* JADX INFO: renamed from: s1.B */
/* JADX INFO: loaded from: classes.dex */
public final class C6946B extends AbstractComponentCallbacksC2591i {

    /* JADX INFO: renamed from: t0 */
    public static final a f27900t0 = new a(null);

    /* JADX INFO: renamed from: p0 */
    private AbstractC5264G f27902p0;

    /* JADX INFO: renamed from: q0 */
    private String f27903q0;

    /* JADX INFO: renamed from: r0 */
    private C6878a f27904r0;

    /* JADX INFO: renamed from: o0 */
    private final View.OnTouchListener f27901o0 = new View.OnTouchListener() { // from class: s1.a
        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            return C6946B.m30459b3(view, motionEvent);
        }
    };

    /* JADX INFO: renamed from: s0 */
    private final C3135b f27905s0 = new C3135b();

    /* JADX INFO: renamed from: s1.B$a */
    public static final class a {
        public /* synthetic */ a(AbstractC6112h abstractC6112h) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C6946B m30486a(String text) {
            AbstractC6118n.m27187e(text, "text");
            C6946B c6946b = new C6946B();
            Bundle bundle = new Bundle();
            bundle.putString("arg_text", text);
            c6946b.m12117E1(bundle);
            return c6946b;
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: s1.B$b */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f27906a;

        static {
            int[] iArr = new int[C6878a.a.values().length];
            try {
                iArr[C6878a.a.USE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C6878a.a.EDIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[C6878a.a.DELETE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f27906a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A2 */
    public static final void m30420A2(C6946B c6946b, View view) {
        AbstractC6118n.m27184b(view);
        c6946b.m30434O2(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B2 */
    public static final void m30421B2(C6946B c6946b, View view) {
        AbstractC6118n.m27184b(view);
        c6946b.m30451X2(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C2 */
    public static final void m30422C2(C6946B c6946b, View view) {
        AbstractActivityC2592j abstractActivityC2592jM12184m = c6946b.m12184m();
        AbstractC6118n.m27185c(abstractActivityC2592jM12184m, "null cannot be cast to non-null type com.anas_mugally.clipboard.ui.ai.AiTextProcessingActivity");
        ((AiTextProcessingActivity) abstractActivityC2592jM12184m).m16367I5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D2 */
    public static final void m30423D2(C6946B c6946b, View view) {
        AbstractC6118n.m27184b(view);
        c6946b.m30426G2(view);
    }

    /* JADX INFO: renamed from: E2 */
    private final void m30424E2() {
        this.f27904r0 = new C6878a(new InterfaceC5371p() { // from class: s1.l
            @Override // p238e6.InterfaceC5371p
            public final Object invoke(Object obj, Object obj2) {
                return C6946B.m30425F2(this.f27995a, (AiPrompt) obj, (C6878a.a) obj2);
            }
        });
        AbstractC5264G abstractC5264G = this.f27902p0;
        C6878a c6878a = null;
        if (abstractC5264G == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5264G = null;
        }
        RecyclerView recyclerView = abstractC5264G.f20046B;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
        C6878a c6878a2 = this.f27904r0;
        if (c6878a2 == null) {
            AbstractC6118n.m27197o("savedPromptsAdapter");
        } else {
            c6878a = c6878a2;
        }
        recyclerView.setAdapter(c6878a);
        m30479t2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F2 */
    public static final C1444v m30425F2(C6946B c6946b, AiPrompt prompt, C6878a.a action) {
        AbstractC6118n.m27187e(prompt, "prompt");
        AbstractC6118n.m27187e(action, "action");
        int i7 = b.f27906a[action.ordinal()];
        if (i7 == 1) {
            c6946b.m30480u2(prompt);
        } else if (i7 == 2) {
            c6946b.m30478s2(prompt);
        } else {
            if (i7 != 3) {
                throw new C1434l();
            }
            c6946b.m30477r2(prompt);
        }
        return C1444v.f4971a;
    }

    /* JADX INFO: renamed from: G2 */
    private final void m30426G2(View view) {
        Context contextM12214y1 = m12214y1();
        AbstractC6118n.m27186d(contextM12214y1, "requireContext(...)");
        C7210k c7210k = new C7210k(contextM12214y1);
        C3135b c3135b = this.f27905s0;
        Context contextM12214y2 = m12214y1();
        AbstractC6118n.m27186d(contextM12214y2, "requireContext(...)");
        C7210k.d dVar = new C7210k.d(c3135b.m16394t(contextM12214y2, this.f27905s0.m16383i()), new C7210k.b(m12214y1().getDrawable(R.drawable.ic_expand), false, 2, null), new InterfaceC5356a() { // from class: s1.f
            @Override // p238e6.InterfaceC5356a
            public final Object invoke() {
                return C6946B.m30427H2(this.f27982a);
            }
        }, null, null, 24, null);
        C3135b c3135b2 = this.f27905s0;
        Context contextM12214y3 = m12214y1();
        AbstractC6118n.m27186d(contextM12214y3, "requireContext(...)");
        C7210k.m31796O(c7210k, view, AbstractC1638q.m6767l(dVar, new C7210k.d(c3135b2.m16394t(contextM12214y3, this.f27905s0.m16397w()), new C7210k.b(m12214y1().getDrawable(R.drawable.ic_shrink), false, 2, null), new InterfaceC5356a() { // from class: s1.g
            @Override // p238e6.InterfaceC5356a
            public final Object invoke() {
                return C6946B.m30428I2(this.f27985a);
            }
        }, null, null, 24, null)), null, null, true, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H2 */
    public static final C1444v m30427H2(C6946B c6946b) {
        c6946b.m30480u2(c6946b.f27905s0.m16383i());
        return C1444v.f4971a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I2 */
    public static final C1444v m30428I2(C6946B c6946b) {
        c6946b.m30480u2(c6946b.f27905s0.m16397w());
        return C1444v.f4971a;
    }

    /* JADX INFO: renamed from: J2 */
    private final void m30429J2(View view) {
        Context contextM12214y1 = m12214y1();
        AbstractC6118n.m27186d(contextM12214y1, "requireContext(...)");
        C7210k c7210k = new C7210k(contextM12214y1);
        C3135b c3135b = this.f27905s0;
        Context contextM12214y2 = m12214y1();
        AbstractC6118n.m27186d(contextM12214y2, "requireContext(...)");
        C7210k.d dVar = new C7210k.d(c3135b.m16394t(contextM12214y2, this.f27905s0.m16387m()), new C7210k.b(m12214y1().getDrawable(R.drawable.ic_numbers), false, 2, null), new InterfaceC5356a() { // from class: s1.b
            @Override // p238e6.InterfaceC5356a
            public final Object invoke() {
                return C6946B.m30430K2(this.f27974a);
            }
        }, null, null, 24, null);
        C3135b c3135b2 = this.f27905s0;
        Context contextM12214y3 = m12214y1();
        AbstractC6118n.m27186d(contextM12214y3, "requireContext(...)");
        C7210k.d dVar2 = new C7210k.d(c3135b2.m16394t(contextM12214y3, this.f27905s0.m16386l()), new C7210k.b(m12214y1().getDrawable(R.drawable.ic_names), false, 2, null), new InterfaceC5356a() { // from class: s1.c
            @Override // p238e6.InterfaceC5356a
            public final Object invoke() {
                return C6946B.m30431L2(this.f27976a);
            }
        }, null, null, 24, null);
        C3135b c3135b3 = this.f27905s0;
        Context contextM12214y4 = m12214y1();
        AbstractC6118n.m27186d(contextM12214y4, "requireContext(...)");
        C7210k.d dVar3 = new C7210k.d(c3135b3.m16394t(contextM12214y4, this.f27905s0.m16385k()), new C7210k.b(m12214y1().getDrawable(R.drawable.ic_keywords), false, 2, null), new InterfaceC5356a() { // from class: s1.d
            @Override // p238e6.InterfaceC5356a
            public final Object invoke() {
                return C6946B.m30432M2(this.f27978a);
            }
        }, null, null, 24, null);
        C3135b c3135b4 = this.f27905s0;
        Context contextM12214y5 = m12214y1();
        AbstractC6118n.m27186d(contextM12214y5, "requireContext(...)");
        C7210k.m31796O(c7210k, view, AbstractC1638q.m6767l(dVar, dVar2, dVar3, new C7210k.d(c3135b4.m16394t(contextM12214y5, this.f27905s0.m16384j()), new C7210k.b(m12214y1().getDrawable(R.drawable.ic_contacts), false, 2, null), new InterfaceC5356a() { // from class: s1.e
            @Override // p238e6.InterfaceC5356a
            public final Object invoke() {
                return C6946B.m30433N2(this.f27980a);
            }
        }, null, null, 24, null)), null, null, true, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K2 */
    public static final C1444v m30430K2(C6946B c6946b) {
        c6946b.m30480u2(c6946b.f27905s0.m16387m());
        return C1444v.f4971a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L2 */
    public static final C1444v m30431L2(C6946B c6946b) {
        c6946b.m30480u2(c6946b.f27905s0.m16386l());
        return C1444v.f4971a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M2 */
    public static final C1444v m30432M2(C6946B c6946b) {
        c6946b.m30480u2(c6946b.f27905s0.m16385k());
        return C1444v.f4971a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N2 */
    public static final C1444v m30433N2(C6946B c6946b) {
        c6946b.m30480u2(c6946b.f27905s0.m16384j());
        return C1444v.f4971a;
    }

    /* JADX INFO: renamed from: O2 */
    private final void m30434O2(View view) {
        Context contextM12214y1 = m12214y1();
        AbstractC6118n.m27186d(contextM12214y1, "requireContext(...)");
        C7210k c7210k = new C7210k(contextM12214y1);
        C3135b c3135b = this.f27905s0;
        Context contextM12214y2 = m12214y1();
        AbstractC6118n.m27186d(contextM12214y2, "requireContext(...)");
        C7210k.d dVar = new C7210k.d(c3135b.m16394t(contextM12214y2, this.f27905s0.m16380f()), new C7210k.b(m12214y1().getDrawable(R.drawable.ic_creative), false, 2, null), new InterfaceC5356a() { // from class: s1.k
            @Override // p238e6.InterfaceC5356a
            public final Object invoke() {
                return C6946B.m30435P2(this.f27994a);
            }
        }, null, null, 24, null);
        C3135b c3135b2 = this.f27905s0;
        Context contextM12214y3 = m12214y1();
        AbstractC6118n.m27186d(contextM12214y3, "requireContext(...)");
        C7210k.d dVar2 = new C7210k.d(c3135b2.m16394t(contextM12214y3, this.f27905s0.m16393s()), new C7210k.b(m12214y1().getDrawable(R.drawable.ic_professional), false, 2, null), new InterfaceC5356a() { // from class: s1.m
            @Override // p238e6.InterfaceC5356a
            public final Object invoke() {
                return C6946B.m30437Q2(this.f27996a);
            }
        }, null, null, 24, null);
        C3135b c3135b3 = this.f27905s0;
        Context contextM12214y4 = m12214y1();
        AbstractC6118n.m27186d(contextM12214y4, "requireContext(...)");
        C7210k.d dVar3 = new C7210k.d(c3135b3.m16394t(contextM12214y4, this.f27905s0.m16398x()), new C7210k.b(m12214y1().getDrawable(R.drawable.ic_simple), false, 2, null), new InterfaceC5356a() { // from class: s1.n
            @Override // p238e6.InterfaceC5356a
            public final Object invoke() {
                return C6946B.m30439R2(this.f27997a);
            }
        }, null, null, 24, null);
        C3135b c3135b4 = this.f27905s0;
        Context contextM12214y5 = m12214y1();
        AbstractC6118n.m27186d(contextM12214y5, "requireContext(...)");
        C7210k.d dVar4 = new C7210k.d(c3135b4.m16394t(contextM12214y5, this.f27905s0.m16388n()), new C7210k.b(m12214y1().getDrawable(R.drawable.ic_formal), false, 2, null), new InterfaceC5356a() { // from class: s1.o
            @Override // p238e6.InterfaceC5356a
            public final Object invoke() {
                return C6946B.m30441S2(this.f27998a);
            }
        }, null, null, 24, null);
        C3135b c3135b5 = this.f27905s0;
        Context contextM12214y6 = m12214y1();
        AbstractC6118n.m27186d(contextM12214y6, "requireContext(...)");
        C7210k.d dVar5 = new C7210k.d(c3135b5.m16394t(contextM12214y6, this.f27905s0.m16390p()), new C7210k.b(m12214y1().getDrawable(R.drawable.ic_informal), false, 2, null), new InterfaceC5356a() { // from class: s1.p
            @Override // p238e6.InterfaceC5356a
            public final Object invoke() {
                return C6946B.m30443T2(this.f27999a);
            }
        }, null, null, 24, null);
        C3135b c3135b6 = this.f27905s0;
        Context contextM12214y7 = m12214y1();
        AbstractC6118n.m27186d(contextM12214y7, "requireContext(...)");
        C7210k.d dVar6 = new C7210k.d(c3135b6.m16394t(contextM12214y7, this.f27905s0.m16392r()), new C7210k.b(m12214y1().getDrawable(R.drawable.ic_polite), false, 2, null), new InterfaceC5356a() { // from class: s1.q
            @Override // p238e6.InterfaceC5356a
            public final Object invoke() {
                return C6946B.m30445U2(this.f28000a);
            }
        }, null, null, 24, null);
        C3135b c3135b7 = this.f27905s0;
        Context contextM12214y8 = m12214y1();
        AbstractC6118n.m27186d(contextM12214y8, "requireContext(...)");
        C7210k.d dVar7 = new C7210k.d(c3135b7.m16394t(contextM12214y8, this.f27905s0.m16399y()), new C7210k.b(m12214y1().getDrawable(R.drawable.ic_social), false, 2, null), new InterfaceC5356a() { // from class: s1.r
            @Override // p238e6.InterfaceC5356a
            public final Object invoke() {
                return C6946B.m30447V2(this.f28001a);
            }
        }, null, null, 24, null);
        C3135b c3135b8 = this.f27905s0;
        Context contextM12214y9 = m12214y1();
        AbstractC6118n.m27186d(contextM12214y9, "requireContext(...)");
        C7210k.m31796O(c7210k, view, AbstractC1638q.m6767l(dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7, new C7210k.d(c3135b8.m16394t(contextM12214y9, this.f27905s0.m16382h()), new C7210k.b(m12214y1().getDrawable(R.drawable.ic_emoji), false, 2, null), new InterfaceC5356a() { // from class: s1.s
            @Override // p238e6.InterfaceC5356a
            public final Object invoke() {
                return C6946B.m30449W2(this.f28002a);
            }
        }, null, null, 24, null)), null, null, true, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P2 */
    public static final C1444v m30435P2(C6946B c6946b) {
        c6946b.m30480u2(c6946b.f27905s0.m16380f());
        return C1444v.f4971a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q2 */
    public static final C1444v m30437Q2(C6946B c6946b) {
        c6946b.m30480u2(c6946b.f27905s0.m16393s());
        return C1444v.f4971a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R2 */
    public static final C1444v m30439R2(C6946B c6946b) {
        c6946b.m30480u2(c6946b.f27905s0.m16398x());
        return C1444v.f4971a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S2 */
    public static final C1444v m30441S2(C6946B c6946b) {
        c6946b.m30480u2(c6946b.f27905s0.m16388n());
        return C1444v.f4971a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T2 */
    public static final C1444v m30443T2(C6946B c6946b) {
        c6946b.m30480u2(c6946b.f27905s0.m16390p());
        return C1444v.f4971a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U2 */
    public static final C1444v m30445U2(C6946B c6946b) {
        c6946b.m30480u2(c6946b.f27905s0.m16392r());
        return C1444v.f4971a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V2 */
    public static final C1444v m30447V2(C6946B c6946b) {
        c6946b.m30480u2(c6946b.f27905s0.m16399y());
        return C1444v.f4971a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W2 */
    public static final C1444v m30449W2(C6946B c6946b) {
        c6946b.m30480u2(c6946b.f27905s0.m16382h());
        return C1444v.f4971a;
    }

    /* JADX INFO: renamed from: X2 */
    private final void m30451X2(View view) {
        Context contextM12214y1 = m12214y1();
        AbstractC6118n.m27186d(contextM12214y1, "requireContext(...)");
        C7210k c7210k = new C7210k(contextM12214y1);
        C3135b c3135b = this.f27905s0;
        Context contextM12214y2 = m12214y1();
        AbstractC6118n.m27186d(contextM12214y2, "requireContext(...)");
        C7210k.d dVar = new C7210k.d(c3135b.m16394t(contextM12214y2, this.f27905s0.m16396v()), new C7210k.b(m12214y1().getDrawable(R.drawable.ic_short_summary), false, 2, null), new InterfaceC5356a() { // from class: s1.h
            @Override // p238e6.InterfaceC5356a
            public final Object invoke() {
                return C6946B.m30453Y2(this.f27991a);
            }
        }, null, null, 24, null);
        C3135b c3135b2 = this.f27905s0;
        Context contextM12214y3 = m12214y1();
        AbstractC6118n.m27186d(contextM12214y3, "requireContext(...)");
        C7210k.d dVar2 = new C7210k.d(c3135b2.m16394t(contextM12214y3, this.f27905s0.m16378d()), new C7210k.b(m12214y1().getDrawable(R.drawable.ic_bullet_points), false, 2, null), new InterfaceC5356a() { // from class: s1.i
            @Override // p238e6.InterfaceC5356a
            public final Object invoke() {
                return C6946B.m30455Z2(this.f27992a);
            }
        }, null, null, 24, null);
        C3135b c3135b3 = this.f27905s0;
        Context contextM12214y4 = m12214y1();
        AbstractC6118n.m27186d(contextM12214y4, "requireContext(...)");
        C7210k.m31796O(c7210k, view, AbstractC1638q.m6767l(dVar, dVar2, new C7210k.d(c3135b3.m16394t(contextM12214y4, this.f27905s0.m16391q()), new C7210k.b(m12214y1().getDrawable(R.drawable.ic_key_points), false, 2, null), new InterfaceC5356a() { // from class: s1.j
            @Override // p238e6.InterfaceC5356a
            public final Object invoke() {
                return C6946B.m30457a3(this.f27993a);
            }
        }, null, null, 24, null)), null, null, true, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y2 */
    public static final C1444v m30453Y2(C6946B c6946b) {
        c6946b.m30480u2(c6946b.f27905s0.m16396v());
        return C1444v.f4971a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z2 */
    public static final C1444v m30455Z2(C6946B c6946b) {
        c6946b.m30480u2(c6946b.f27905s0.m16378d());
        return C1444v.f4971a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a3 */
    public static final C1444v m30457a3(C6946B c6946b) {
        c6946b.m30480u2(c6946b.f27905s0.m16391q());
        return C1444v.f4971a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b3 */
    public static final boolean m30459b3(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            AbstractC6118n.m27184b(view);
            m30461c3(view, true);
        } else if (action == 1) {
            AbstractC6118n.m27184b(view);
            m30461c3(view, false);
        } else if (action == 3) {
            AbstractC6118n.m27184b(view);
            m30463d3(view);
        }
        return false;
    }

    /* JADX INFO: renamed from: c3 */
    private static final void m30461c3(View view, boolean z7) {
        float f7 = z7 ? 0.9f : 1.0f;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "scaleX", view.getScaleX(), f7);
        objectAnimatorOfFloat.setDuration(50L);
        objectAnimatorOfFloat.start();
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, "scaleY", view.getScaleY(), f7);
        objectAnimatorOfFloat2.setDuration(50L);
        objectAnimatorOfFloat2.start();
    }

    /* JADX INFO: renamed from: d3 */
    private static final void m30463d3(View view) {
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        AbstractC1030Z.m4506z0(view, 0.0f);
        view.clearAnimation();
    }

    /* JADX INFO: renamed from: r2 */
    private final void m30477r2(AiPrompt aiPrompt) {
        C3135b c3135b = this.f27905s0;
        Context contextM12214y1 = m12214y1();
        AbstractC6118n.m27186d(contextM12214y1, "requireContext(...)");
        c3135b.m16377b(contextM12214y1, aiPrompt.getId());
        m30479t2();
    }

    /* JADX INFO: renamed from: s2 */
    private final void m30478s2(AiPrompt aiPrompt) {
        AbstractActivityC2592j abstractActivityC2592jM12184m = m12184m();
        AbstractC6118n.m27185c(abstractActivityC2592jM12184m, "null cannot be cast to non-null type com.anas_mugally.clipboard.ui.ai.AiTextProcessingActivity");
        ((AiTextProcessingActivity) abstractActivityC2592jM12184m).m16371v5(aiPrompt.getId());
    }

    /* JADX INFO: renamed from: t2 */
    private final void m30479t2() {
        C3135b c3135b = this.f27905s0;
        Context contextM12214y1 = m12214y1();
        AbstractC6118n.m27186d(contextM12214y1, "requireContext(...)");
        List listM16395u = c3135b.m16395u(contextM12214y1);
        AbstractC5264G abstractC5264G = null;
        C6878a c6878a = null;
        if (listM16395u.isEmpty()) {
            AbstractC5264G abstractC5264G2 = this.f27902p0;
            if (abstractC5264G2 == null) {
                AbstractC6118n.m27197o("binding");
                abstractC5264G2 = null;
            }
            abstractC5264G2.f20046B.setVisibility(8);
            AbstractC5264G abstractC5264G3 = this.f27902p0;
            if (abstractC5264G3 == null) {
                AbstractC6118n.m27197o("binding");
            } else {
                abstractC5264G = abstractC5264G3;
            }
            abstractC5264G.f20053I.setVisibility(8);
            return;
        }
        AbstractC5264G abstractC5264G4 = this.f27902p0;
        if (abstractC5264G4 == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5264G4 = null;
        }
        abstractC5264G4.f20046B.setVisibility(0);
        AbstractC5264G abstractC5264G5 = this.f27902p0;
        if (abstractC5264G5 == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5264G5 = null;
        }
        abstractC5264G5.f20053I.setVisibility(0);
        C6878a c6878a2 = this.f27904r0;
        if (c6878a2 == null) {
            AbstractC6118n.m27197o("savedPromptsAdapter");
        } else {
            c6878a = c6878a2;
        }
        c6878a.m30077E(listM16395u);
    }

    /* JADX INFO: renamed from: u2 */
    private final void m30480u2(AiPrompt aiPrompt) {
        AbstractActivityC2592j abstractActivityC2592jM12184m = m12184m();
        AbstractC6118n.m27185c(abstractActivityC2592jM12184m, "null cannot be cast to non-null type com.anas_mugally.clipboard.ui.ai.AiTextProcessingActivity");
        AiTextProcessingActivity.m16322b5((AiTextProcessingActivity) abstractActivityC2592jM12184m, aiPrompt, null, 2, null);
    }

    /* JADX INFO: renamed from: v2 */
    private final void m30481v2() {
        AbstractC5264G abstractC5264G = this.f27902p0;
        if (abstractC5264G == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5264G = null;
        }
        abstractC5264G.f20056w.setOnClickListener(new View.OnClickListener() { // from class: s1.t
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C6946B.m30485z2(this.f28003a, view);
            }
        });
        abstractC5264G.f20056w.setOnTouchListener(this.f27901o0);
        abstractC5264G.f20047C.setOnClickListener(new View.OnClickListener() { // from class: s1.u
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C6946B.m30420A2(this.f28004a, view);
            }
        });
        abstractC5264G.f20047C.setOnTouchListener(this.f27901o0);
        abstractC5264G.f20051G.setOnClickListener(new View.OnClickListener() { // from class: s1.v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C6946B.m30421B2(this.f28005a, view);
            }
        });
        abstractC5264G.f20051G.setOnTouchListener(this.f27901o0);
        abstractC5264G.f20054J.setOnClickListener(new View.OnClickListener() { // from class: s1.w
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C6946B.m30422C2(this.f28006a, view);
            }
        });
        abstractC5264G.f20054J.setOnTouchListener(this.f27901o0);
        abstractC5264G.f20058y.setOnClickListener(new View.OnClickListener() { // from class: s1.x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C6946B.m30423D2(this.f28007a, view);
            }
        });
        abstractC5264G.f20058y.setOnTouchListener(this.f27901o0);
        abstractC5264G.f20059z.setOnClickListener(new View.OnClickListener() { // from class: s1.y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C6946B.m30482w2(this.f28008a, view);
            }
        });
        abstractC5264G.f20059z.setOnTouchListener(this.f27901o0);
        abstractC5264G.f20057x.setOnClickListener(new View.OnClickListener() { // from class: s1.z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C6946B.m30483x2(this.f28009a, view);
            }
        });
        abstractC5264G.f20057x.setOnTouchListener(this.f27901o0);
        abstractC5264G.f20045A.setOnClickListener(new View.OnClickListener() { // from class: s1.A
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C6946B.m30484y2(this.f27899a, view);
            }
        });
        abstractC5264G.f20045A.setOnTouchListener(this.f27901o0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w2 */
    public static final void m30482w2(C6946B c6946b, View view) {
        AbstractC6118n.m27184b(view);
        c6946b.m30429J2(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x2 */
    public static final void m30483x2(C6946B c6946b, View view) {
        AbstractActivityC2592j abstractActivityC2592jM12184m = c6946b.m12184m();
        AbstractC6118n.m27185c(abstractActivityC2592jM12184m, "null cannot be cast to non-null type com.anas_mugally.clipboard.ui.ai.AiTextProcessingActivity");
        AiTextProcessingActivity.m16358w5((AiTextProcessingActivity) abstractActivityC2592jM12184m, null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y2 */
    public static final void m30484y2(C6946B c6946b, View view) {
        AbstractActivityC2592j abstractActivityC2592jM12184m = c6946b.m12184m();
        AbstractC6118n.m27185c(abstractActivityC2592jM12184m, "null cannot be cast to non-null type com.anas_mugally.clipboard.ui.ai.AiTextProcessingActivity");
        ((AiTextProcessingActivity) abstractActivityC2592jM12184m).m16364E5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z2 */
    public static final void m30485z2(C6946B c6946b, View view) {
        c6946b.m30480u2(c6946b.f27905s0.m16379e());
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2591i
    /* JADX INFO: renamed from: U0 */
    public void mo1869U0(View view, Bundle bundle) {
        String string;
        AbstractC6118n.m27187e(view, "view");
        super.mo1869U0(view, bundle);
        Bundle bundleM12199s = m12199s();
        if (bundleM12199s == null || (string = bundleM12199s.getString("arg_text")) == null) {
            string = "";
        }
        this.f27903q0 = string;
        m30481v2();
        m30424E2();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2591i
    /* JADX INFO: renamed from: z0 */
    public View mo682z0(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC6118n.m27187e(inflater, "inflater");
        AbstractC5264G abstractC5264GM24274u = AbstractC5264G.m24274u(inflater, viewGroup, false);
        this.f27902p0 = abstractC5264GM24274u;
        if (abstractC5264GM24274u == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5264GM24274u = null;
        }
        View viewM10849k = abstractC5264GM24274u.m10849k();
        AbstractC6118n.m27186d(viewM10849k, "getRoot(...)");
        return viewM10849k;
    }
}
