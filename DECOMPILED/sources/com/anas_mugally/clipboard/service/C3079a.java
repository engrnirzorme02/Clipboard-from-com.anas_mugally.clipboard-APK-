package com.anas_mugally.clipboard.service;

import android.animation.ValueAnimator;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.anas_mugally.clipboard.C3034A;
import com.anas_mugally.clipboard.C3150x;
import com.anas_mugally.clipboard.R;
import com.anas_mugally.clipboard.p221ui.scrollExtractTexts.ViewNodesActivity;
import com.anas_mugally.clipboard.service.C3079a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.jvm.internal.AbstractC6097l;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import p145S5.AbstractC1430h;
import p145S5.AbstractC1437o;
import p145S5.C1435m;
import p145S5.C1444v;
import p145S5.InterfaceC1429g;
import p173W5.InterfaceC1875e;
import p180X5.AbstractC2005b;
import p238e6.InterfaceC5356a;
import p238e6.InterfaceC5371p;
import p318o6.AbstractC6615I0;
import p318o6.AbstractC6626O;
import p318o6.AbstractC6634S0;
import p318o6.AbstractC6668i;
import p318o6.AbstractC6672k;
import p318o6.C6656c0;
import p318o6.InterfaceC6624N;

/* JADX INFO: renamed from: com.anas_mugally.clipboard.service.a */
/* JADX INFO: loaded from: classes.dex */
public final class C3079a {

    /* JADX INFO: renamed from: p */
    public static final a f12707p = new a(null);

    /* JADX INFO: renamed from: q */
    private static volatile C3079a f12708q;

    /* JADX INFO: renamed from: a */
    private final MyAccessibilityService f12709a;

    /* JADX INFO: renamed from: b */
    private WindowManager f12710b;

    /* JADX INFO: renamed from: c */
    private View f12711c;

    /* JADX INFO: renamed from: d */
    private TextView f12712d;

    /* JADX INFO: renamed from: e */
    private ImageView f12713e;

    /* JADX INFO: renamed from: f */
    private ProgressBar f12714f;

    /* JADX INFO: renamed from: g */
    private C3150x f12715g;

    /* JADX INFO: renamed from: h */
    private Set f12716h;

    /* JADX INFO: renamed from: i */
    private final InterfaceC1429g f12717i;

    /* JADX INFO: renamed from: j */
    private View f12718j;

    /* JADX INFO: renamed from: k */
    private final WindowManager.LayoutParams f12719k;

    /* JADX INFO: renamed from: l */
    private final WindowManager.LayoutParams f12720l;

    /* JADX INFO: renamed from: m */
    private boolean f12721m;

    /* JADX INFO: renamed from: n */
    private boolean f12722n;

    /* JADX INFO: renamed from: o */
    private InterfaceC6624N f12723o;

    /* JADX INFO: renamed from: com.anas_mugally.clipboard.service.a$a */
    public static final class a {
        public /* synthetic */ a(AbstractC6112h abstractC6112h) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C3079a m15310a() {
            C3079a c3079a;
            C3079a c3079a2 = C3079a.f12708q;
            if (c3079a2 != null) {
                return c3079a2;
            }
            synchronized (this) {
                c3079a = C3079a.f12708q;
                if (c3079a == null) {
                    c3079a = new C3079a(null);
                    C3079a.f12708q = c3079a;
                }
            }
            return c3079a;
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: com.anas_mugally.clipboard.service.a$b */
    static final class b extends AbstractC6097l implements InterfaceC5371p {

        /* JADX INFO: renamed from: a */
        int f12724a;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ List f12726c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(List list, InterfaceC1875e interfaceC1875e) {
            super(2, interfaceC1875e);
            this.f12726c = list;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
            return C3079a.this.new b(this.f12726c, interfaceC1875e);
        }

        @Override // p238e6.InterfaceC5371p
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
            return ((b) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final Object invokeSuspend(Object obj) {
            Object objE = AbstractC2005b.m8369e();
            int i7 = this.f12724a;
            if (i7 == 0) {
                AbstractC1437o.m6082b(obj);
                C3079a.this.m15281A();
                C3079a c3079a = C3079a.this;
                List list = this.f12726c;
                this.f12724a = 1;
                if (c3079a.m15301u(list, this) == objE) {
                    return objE;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1437o.m6082b(obj);
            }
            C3079a.this.m15298p();
            return C1444v.f4971a;
        }
    }

    /* JADX INFO: renamed from: com.anas_mugally.clipboard.service.a$c */
    static final class c extends AbstractC6097l implements InterfaceC5371p {

        /* JADX INFO: renamed from: a */
        int f12727a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ List f12728b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ C3079a f12729c;

        /* JADX INFO: renamed from: com.anas_mugally.clipboard.service.a$c$a */
        static final class a extends AbstractC6097l implements InterfaceC5371p {

            /* JADX INFO: renamed from: a */
            int f12730a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ C3079a f12731b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ List f12732c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C3079a c3079a, List list, InterfaceC1875e interfaceC1875e) {
                super(2, interfaceC1875e);
                this.f12731b = c3079a;
                this.f12732c = list;
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
                return new a(this.f12731b, this.f12732c, interfaceC1875e);
            }

            @Override // p238e6.InterfaceC5371p
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
                return ((a) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final Object invokeSuspend(Object obj) {
                AbstractC2005b.m8369e();
                if (this.f12730a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1437o.m6082b(obj);
                int size = this.f12731b.f12716h.size();
                this.f12731b.f12716h.addAll(this.f12732c);
                Set set = this.f12731b.f12716h;
                HashSet hashSet = new HashSet();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : set) {
                    if (hashSet.add((String) ((C1435m) obj2).m6070c())) {
                        arrayList.add(obj2);
                    }
                }
                C3079a c3079a = this.f12731b;
                c3079a.f12716h.clear();
                c3079a.f12716h.addAll(arrayList);
                if (this.f12731b.f12716h.size() > size) {
                    C3079a c3079a2 = this.f12731b;
                    c3079a2.m15296m(size, c3079a2.f12716h.size());
                }
                return C1444v.f4971a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(List list, C3079a c3079a, InterfaceC1875e interfaceC1875e) {
            super(2, interfaceC1875e);
            this.f12728b = list;
            this.f12729c = c3079a;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
            return new c(this.f12728b, this.f12729c, interfaceC1875e);
        }

        @Override // p238e6.InterfaceC5371p
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
            return ((c) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final Object invokeSuspend(Object obj) {
            Object objE = AbstractC2005b.m8369e();
            int i7 = this.f12727a;
            if (i7 == 0) {
                AbstractC1437o.m6082b(obj);
                List list = this.f12728b;
                if (list == null) {
                    return null;
                }
                C3079a c3079a = this.f12729c;
                C3150x c3150x = c3079a.f12715g;
                AbstractC6118n.m27184b(c3150x);
                List listM16732a = c3150x.m16732a(list);
                AbstractC6615I0 abstractC6615I0M28164c = C6656c0.m28164c();
                a aVar = new a(c3079a, listM16732a, null);
                this.f12727a = 1;
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

    public /* synthetic */ C3079a(AbstractC6112h abstractC6112h) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public final void m15281A() {
        this.f12722n = true;
        ImageView imageView = this.f12713e;
        if (imageView != null) {
            imageView.setVisibility(4);
        }
        ProgressBar progressBar = this.f12714f;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final int m15282B() {
        return C3034A.m15013z(C3034A.f12453a, false, 1, null);
    }

    /* JADX INFO: renamed from: C */
    private final void m15283C(int i7) {
        TextView textView = this.f12712d;
        if (textView != null) {
            textView.setText(String.valueOf(i7));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public final void m15296m(int i7, int i8) {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i7, i8);
        valueAnimatorOfInt.setDuration(1000L);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: j1.i
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C3079a.m15297n(this.f22961a, valueAnimator);
            }
        });
        valueAnimatorOfInt.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final void m15297n(C3079a c3079a, ValueAnimator animation) {
        AbstractC6118n.m27187e(animation, "animation");
        Object animatedValue = animation.getAnimatedValue();
        AbstractC6118n.m27185c(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        c3079a.m15283C(((Integer) animatedValue).intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public final void m15298p() {
        this.f12722n = false;
        ProgressBar progressBar = this.f12714f;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        ImageView imageView = this.f12713e;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: q */
    private final int m15299q() {
        return ((Number) this.f12717i.getValue()).intValue();
    }

    /* JADX INFO: renamed from: t */
    private final void m15300t() {
        Intent intent = new Intent(this.f12709a, (Class<?>) ViewNodesActivity.class);
        intent.setFlags(268468224);
        intent.putExtra("list", new ArrayList(this.f12716h));
        this.f12709a.startActivity(intent);
        m15306o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public final Object m15301u(List list, InterfaceC1875e interfaceC1875e) {
        return AbstractC6668i.m28186g(C6656c0.m28162a(), new c(list, this, null), interfaceC1875e);
    }

    /* JADX INFO: renamed from: v */
    private final void m15302v() {
        this.f12716h.clear();
        this.f12711c = null;
        this.f12718j = null;
        this.f12710b = null;
        this.f12712d = null;
        this.f12713e = null;
        this.f12714f = null;
        this.f12715g = null;
        this.f12722n = false;
        m15283C(0);
    }

    /* JADX INFO: renamed from: w */
    private final void m15303w() {
        ImageView imageView;
        ProgressBar progressBar;
        TextView textView;
        ImageView imageView2;
        Object systemService = this.f12709a.getSystemService("window");
        AbstractC6118n.m27185c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.f12710b = (WindowManager) systemService;
        this.f12715g = new C3150x();
        TextView textView2 = null;
        View viewInflate = LayoutInflater.from(this.f12709a).inflate(R.layout.overlay_controls, (ViewGroup) null);
        this.f12711c = viewInflate;
        if (viewInflate != null && (imageView2 = (ImageView) viewInflate.findViewById(R.id.exitButton)) != null) {
            imageView2.setElevation(4.0f);
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: j1.j
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C3079a.m15304x(this.f22962a, view);
                }
            });
        }
        View view = this.f12711c;
        if (view == null || (imageView = (ImageView) view.findViewById(R.id.confirmButton)) == null) {
            imageView = null;
        } else {
            imageView.setElevation(4.0f);
            imageView.setOnClickListener(new View.OnClickListener() { // from class: j1.k
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C3079a.m15305y(this.f22963a, view2);
                }
            });
        }
        this.f12713e = imageView;
        View view2 = this.f12711c;
        if (view2 == null || (progressBar = (ProgressBar) view2.findViewById(R.id.progressBar)) == null) {
            progressBar = null;
        } else {
            progressBar.setVisibility(8);
        }
        this.f12714f = progressBar;
        View view3 = this.f12711c;
        if (view3 != null && (textView = (TextView) view3.findViewById(R.id.nodeCountText)) != null) {
            textView.setElevation(4.0f);
            textView2 = textView;
        }
        this.f12712d = textView2;
        View view4 = new View(this.f12709a);
        view4.setVisibility(8);
        this.f12718j = view4;
        try {
            WindowManager windowManager = this.f12710b;
            if (windowManager != null) {
                windowManager.addView(view4, this.f12719k);
            }
            WindowManager windowManager2 = this.f12710b;
            if (windowManager2 != null) {
                windowManager2.addView(this.f12711c, this.f12720l);
            }
        } catch (Exception unused) {
            m15306o();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final void m15304x(C3079a c3079a, View view) {
        c3079a.m15306o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final void m15305y(C3079a c3079a, View view) {
        if (c3079a.f12722n) {
            return;
        }
        c3079a.m15300t();
    }

    /* JADX INFO: renamed from: o */
    public final void m15306o() {
        WindowManager windowManager;
        WindowManager windowManager2;
        this.f12721m = false;
        this.f12722n = false;
        AbstractC6626O.m28101d(this.f12723o, null, 1, null);
        try {
            View view = this.f12718j;
            if (view != null && (windowManager2 = this.f12710b) != null) {
                windowManager2.removeView(view);
            }
            View view2 = this.f12711c;
            if (view2 != null && (windowManager = this.f12710b) != null) {
                windowManager.removeView(view2);
            }
        } catch (Exception unused) {
        }
        m15302v();
    }

    /* JADX INFO: renamed from: r */
    public final boolean m15307r() {
        return this.f12721m;
    }

    /* JADX INFO: renamed from: s */
    public final void m15308s(List list) {
        if (!this.f12721m || this.f12722n) {
            return;
        }
        AbstractC6672k.m28227d(this.f12723o, null, null, new b(list, null), 3, null);
    }

    /* JADX INFO: renamed from: z */
    public final void m15309z() {
        if (this.f12721m) {
            return;
        }
        if (!AbstractC6626O.m28104g(this.f12723o)) {
            this.f12723o = AbstractC6626O.m28098a(C6656c0.m28164c().plus(AbstractC6634S0.m28112b(null, 1, null)));
        }
        m15302v();
        m15303w();
        this.f12721m = true;
    }

    private C3079a() {
        MyAccessibilityService myAccessibilityServiceM15245a = MyAccessibilityService.f12639O.m15245a();
        AbstractC6118n.m27184b(myAccessibilityServiceM15245a);
        this.f12709a = myAccessibilityServiceM15245a;
        this.f12716h = new LinkedHashSet();
        this.f12717i = AbstractC1430h.m6066b(new InterfaceC5356a() { // from class: j1.h
            @Override // p238e6.InterfaceC5356a
            public final Object invoke() {
                return Integer.valueOf(C3079a.m15282B());
            }
        });
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-1, -1, m15299q(), 262440, -3);
        layoutParams.gravity = 17;
        layoutParams.flags |= 262144;
        this.f12719k = layoutParams;
        WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams(-1, -2, m15299q(), 8, -3);
        layoutParams2.gravity = 8388659;
        layoutParams2.y = 50;
        this.f12720l = layoutParams2;
        this.f12723o = AbstractC6626O.m28098a(C6656c0.m28164c().plus(AbstractC6634S0.m28112b(null, 1, null)));
    }
}
