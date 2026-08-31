package p281k1;

import android.animation.ValueAnimator;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.lifecycle.AbstractC2631X;
import androidx.lifecycle.C2611C;
import androidx.lifecycle.InterfaceC2612D;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.anas_mugally.clipboard.C3034A;
import com.anas_mugally.clipboard.R;
import com.anas_mugally.clipboard.database.AppDatabase;
import com.anas_mugally.clipboard.p221ui.SearchActivity;
import com.anas_mugally.clipboard.p221ui.notes.BrowseNotesDialogActivity;
import com.anas_mugally.clipboard.service.MyAccessibilityService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.AbstractC6097l;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import kotlin.jvm.internal.C6098A;
import kotlin.jvm.internal.C6102E;
import kotlin.jvm.internal.C6128x;
import kotlin.jvm.internal.C6129y;
import kotlin.jvm.internal.InterfaceC6113i;
import p145S5.AbstractC1430h;
import p145S5.AbstractC1437o;
import p145S5.C1444v;
import p145S5.InterfaceC1425c;
import p145S5.InterfaceC1429g;
import p152T5.AbstractC1638q;
import p173W5.InterfaceC1875e;
import p180X5.AbstractC2005b;
import p215c1.InterfaceC2979a;
import p215c1.InterfaceC2983e;
import p225d1.C5209a;
import p225d1.C5211c;
import p238e6.InterfaceC5356a;
import p238e6.InterfaceC5367l;
import p238e6.InterfaceC5371p;
import p278j6.AbstractC5905g;
import p318o6.AbstractC6615I0;
import p318o6.AbstractC6626O;
import p318o6.AbstractC6668i;
import p318o6.AbstractC6672k;
import p318o6.C6656c0;
import p318o6.InterfaceC6624N;

/* JADX INFO: renamed from: k1.s */
/* JADX INFO: loaded from: classes.dex */
public final class C5961s {

    /* JADX INFO: renamed from: t */
    public static final b f23646t = new b(null);

    /* JADX INFO: renamed from: u */
    private static volatile C5961s f23647u;

    /* JADX INFO: renamed from: a */
    private AccessibilityNodeInfo f23648a;

    /* JADX INFO: renamed from: b */
    private C2611C f23649b;

    /* JADX INFO: renamed from: c */
    private C2611C f23650c;

    /* JADX INFO: renamed from: d */
    private final MyAccessibilityService f23651d;

    /* JADX INFO: renamed from: e */
    private final WindowManager f23652e;

    /* JADX INFO: renamed from: f */
    private View f23653f;

    /* JADX INFO: renamed from: g */
    private View f23654g;

    /* JADX INFO: renamed from: h */
    private a f23655h;

    /* JADX INFO: renamed from: i */
    private Spinner f23656i;

    /* JADX INFO: renamed from: j */
    private RecyclerView f23657j;

    /* JADX INFO: renamed from: k */
    private final InterfaceC1429g f23658k;

    /* JADX INFO: renamed from: l */
    private int f23659l;

    /* JADX INFO: renamed from: m */
    private int f23660m;

    /* JADX INFO: renamed from: n */
    private final InterfaceC1429g f23661n;

    /* JADX INFO: renamed from: o */
    private View f23662o;

    /* JADX INFO: renamed from: p */
    private boolean f23663p;

    /* JADX INFO: renamed from: q */
    private WindowManager.LayoutParams f23664q;

    /* JADX INFO: renamed from: r */
    private WindowManager.LayoutParams f23665r;

    /* JADX INFO: renamed from: s */
    private final WindowManager.LayoutParams f23666s;

    /* JADX INFO: renamed from: k1.s$a */
    public final class a extends RecyclerView.AbstractC2757h {

        /* JADX INFO: renamed from: d */
        private List f23667d;

        /* JADX INFO: renamed from: e */
        private final InterfaceC5367l f23668e;

        /* JADX INFO: renamed from: f */
        private final InterfaceC5367l f23669f;

        /* JADX INFO: renamed from: g */
        private final InterfaceC5367l f23670g;

        /* JADX INFO: renamed from: h */
        final /* synthetic */ C5961s f23671h;

        /* JADX INFO: renamed from: k1.s$a$a, reason: collision with other inner class name */
        public final class C7713a extends RecyclerView.AbstractC2749E {

            /* JADX INFO: renamed from: u */
            private final TextView f23672u;

            /* JADX INFO: renamed from: v */
            private final AppCompatImageView f23673v;

            /* JADX INFO: renamed from: w */
            private final AppCompatImageView f23674w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ a f23675x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7713a(final a aVar, View view) {
                super(view);
                AbstractC6118n.m27187e(view, "view");
                this.f23675x = aVar;
                View viewFindViewById = view.findViewById(R.id.text);
                AbstractC6118n.m27186d(viewFindViewById, "findViewById(...)");
                TextView textView = (TextView) viewFindViewById;
                this.f23672u = textView;
                View viewFindViewById2 = view.findViewById(R.id.copy);
                AbstractC6118n.m27186d(viewFindViewById2, "findViewById(...)");
                AppCompatImageView appCompatImageView = (AppCompatImageView) viewFindViewById2;
                this.f23673v = appCompatImageView;
                View viewFindViewById3 = view.findViewById(R.id.past);
                AbstractC6118n.m27186d(viewFindViewById3, "findViewById(...)");
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) viewFindViewById3;
                this.f23674w = appCompatImageView2;
                textView.setOnClickListener(new View.OnClickListener() { // from class: k1.p
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        C5961s.a.C7713a.m26906T(aVar, this, view2);
                    }
                });
                appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: k1.q
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        C5961s.a.C7713a.m26907U(aVar, this, view2);
                    }
                });
                appCompatImageView2.setOnClickListener(new View.OnClickListener() { // from class: k1.r
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        C5961s.a.C7713a.m26908V(aVar, this, view2);
                    }
                });
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: T */
            public static final void m26906T(a aVar, C7713a c7713a, View view) {
                aVar.f23668e.invoke(aVar.f23667d.get(c7713a.m13277m()));
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: U */
            public static final void m26907U(a aVar, C7713a c7713a, View view) {
                aVar.f23669f.invoke(aVar.f23667d.get(c7713a.m13277m()));
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: V */
            public static final void m26908V(a aVar, C7713a c7713a, View view) {
                aVar.f23670g.invoke(aVar.f23667d.get(c7713a.m13277m()));
            }

            /* JADX INFO: renamed from: W */
            public final TextView m26909W() {
                return this.f23672u;
            }
        }

        public a(C5961s c5961s, List items, InterfaceC5367l onItemClick, InterfaceC5367l onCopyClick, InterfaceC5367l onPastClick) {
            AbstractC6118n.m27187e(items, "items");
            AbstractC6118n.m27187e(onItemClick, "onItemClick");
            AbstractC6118n.m27187e(onCopyClick, "onCopyClick");
            AbstractC6118n.m27187e(onPastClick, "onPastClick");
            this.f23671h = c5961s;
            this.f23667d = items;
            this.f23668e = onItemClick;
            this.f23669f = onCopyClick;
            this.f23670g = onPastClick;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2757h
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public void mo3682q(C7713a holder, int i7) {
            AbstractC6118n.m27187e(holder, "holder");
            holder.m26909W().setText(((C5211c) this.f23667d.get(i7)).m24112f());
            holder.m26909W().setMaxLines(2);
            holder.m26909W().setEllipsize(TextUtils.TruncateAt.END);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2757h
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public C7713a mo3683s(ViewGroup parent, int i7) {
            AbstractC6118n.m27187e(parent, "parent");
            View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.quick_paste_item, parent, false);
            AbstractC6118n.m27184b(viewInflate);
            return new C7713a(this, viewInflate);
        }

        /* JADX INFO: renamed from: H */
        public final void m26902H(List newItems) {
            AbstractC6118n.m27187e(newItems, "newItems");
            this.f23667d = newItems;
            m13322l();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2757h
        /* JADX INFO: renamed from: g */
        public int mo8548g() {
            return this.f23667d.size();
        }
    }

    /* JADX INFO: renamed from: k1.s$b */
    public static final class b {
        public /* synthetic */ b(AbstractC6112h abstractC6112h) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C5961s m26910a() {
            C5961s c5961s;
            C5961s c5961s2 = C5961s.f23647u;
            if (c5961s2 != null) {
                return c5961s2;
            }
            synchronized (this) {
                c5961s = C5961s.f23647u;
                if (c5961s == null) {
                    c5961s = new C5961s(null);
                    C5961s.f23647u = c5961s;
                }
            }
            return c5961s;
        }

        private b() {
        }
    }

    /* JADX INFO: renamed from: k1.s$c */
    static final class c extends AbstractC6097l implements InterfaceC5371p {

        /* JADX INFO: renamed from: a */
        int f23676a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ int f23677b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ C5961s f23678c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ List f23679d;

        /* JADX INFO: renamed from: k1.s$c$a */
        static final class a extends AbstractC6097l implements InterfaceC5371p {

            /* JADX INFO: renamed from: a */
            int f23680a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ List f23681b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ C5961s f23682c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(List list, C5961s c5961s, InterfaceC1875e interfaceC1875e) {
                super(2, interfaceC1875e);
                this.f23681b = list;
                this.f23682c = c5961s;
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
                return new a(this.f23681b, this.f23682c, interfaceC1875e);
            }

            @Override // p238e6.InterfaceC5371p
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
                return ((a) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final Object invokeSuspend(Object obj) {
                AbstractC2005b.m8369e();
                if (this.f23680a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1437o.m6082b(obj);
                List list = this.f23681b;
                if (list != null) {
                    this.f23682c.f23649b.mo12526q(list);
                }
                return C1444v.f4971a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i7, C5961s c5961s, List list, InterfaceC1875e interfaceC1875e) {
            super(2, interfaceC1875e);
            this.f23677b = i7;
            this.f23678c = c5961s;
            this.f23679d = list;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
            return new c(this.f23677b, this.f23678c, this.f23679d, interfaceC1875e);
        }

        @Override // p238e6.InterfaceC5371p
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
            return ((c) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
        }

        /* JADX WARN: Code duplicated, block: B:15:0x0038  */
        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final Object invokeSuspend(Object obj) {
            InterfaceC2983e interfaceC2983eMo15146G;
            List listMo14865f;
            InterfaceC2983e interfaceC2983eMo15146G2;
            Object objE = AbstractC2005b.m8369e();
            int i7 = this.f23676a;
            if (i7 == 0) {
                AbstractC1437o.m6082b(obj);
                if (this.f23677b == 0) {
                    AppDatabase appDatabaseM26833B = this.f23678c.m26833B();
                    if (appDatabaseM26833B == null || (interfaceC2983eMo15146G2 = appDatabaseM26833B.mo15146G()) == null) {
                        listMo14865f = null;
                    } else {
                        listMo14865f = interfaceC2983eMo15146G2.mo14868i(this.f23678c.m26832A());
                    }
                } else {
                    AppDatabase appDatabaseM26833B2 = this.f23678c.m26833B();
                    if (appDatabaseM26833B2 == null || (interfaceC2983eMo15146G = appDatabaseM26833B2.mo15146G()) == null) {
                        listMo14865f = null;
                    } else {
                        List list = this.f23679d;
                        AbstractC6118n.m27184b(list);
                        listMo14865f = interfaceC2983eMo15146G.mo14865f(((C5209a) list.get(this.f23677b - 1)).m24098d());
                    }
                }
                AbstractC6615I0 abstractC6615I0M28164c = C6656c0.m28164c();
                a aVar = new a(listMo14865f, this.f23678c, null);
                this.f23676a = 1;
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

    /* JADX INFO: renamed from: k1.s$d */
    static final class d implements InterfaceC2612D, InterfaceC6113i {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ InterfaceC5367l f23683a;

        d(InterfaceC5367l function) {
            AbstractC6118n.m27187e(function, "function");
            this.f23683a = function;
        }

        @Override // kotlin.jvm.internal.InterfaceC6113i
        /* JADX INFO: renamed from: a */
        public final InterfaceC1425c mo12586a() {
            return this.f23683a;
        }

        @Override // androidx.lifecycle.InterfaceC2612D
        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void mo12097b(Object obj) {
            this.f23683a.invoke(obj);
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

    /* JADX INFO: renamed from: k1.s$e */
    public static final class e implements AdapterView.OnItemSelectedListener {
        e() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i7, long j7) {
            TextView textView = view instanceof TextView ? (TextView) view : null;
            if (textView != null) {
                textView.setTextColor(-1);
            }
            C5961s c5961s = C5961s.this;
            c5961s.m26841K((List) c5961s.f23650c.m12669f(), i7);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    /* JADX INFO: renamed from: k1.s$f */
    static final class f extends AbstractC6097l implements InterfaceC5371p {

        /* JADX INFO: renamed from: a */
        int f23685a;

        /* JADX INFO: renamed from: k1.s$f$a */
        static final class a extends AbstractC6097l implements InterfaceC5371p {

            /* JADX INFO: renamed from: a */
            int f23687a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ C5961s f23688b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ List f23689c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C5961s c5961s, List list, InterfaceC1875e interfaceC1875e) {
                super(2, interfaceC1875e);
                this.f23688b = c5961s;
                this.f23689c = list;
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
                return new a(this.f23688b, this.f23689c, interfaceC1875e);
            }

            @Override // p238e6.InterfaceC5371p
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
                return ((a) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final Object invokeSuspend(Object obj) {
                AbstractC2005b.m8369e();
                if (this.f23687a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1437o.m6082b(obj);
                C2611C c2611c = this.f23688b.f23650c;
                List listJ = this.f23689c;
                if (listJ == null) {
                    listJ = AbstractC1638q.m6765j();
                }
                c2611c.mo12526q(listJ);
                return C1444v.f4971a;
            }
        }

        f(InterfaceC1875e interfaceC1875e) {
            super(2, interfaceC1875e);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
            return C5961s.this.new f(interfaceC1875e);
        }

        @Override // p238e6.InterfaceC5371p
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
            return ((f) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final Object invokeSuspend(Object obj) {
            InterfaceC2979a interfaceC2979aMo15144E;
            Object objE = AbstractC2005b.m8369e();
            int i7 = this.f23685a;
            if (i7 == 0) {
                AbstractC1437o.m6082b(obj);
                AppDatabase appDatabaseM26833B = C5961s.this.m26833B();
                List listMo14846f = (appDatabaseM26833B == null || (interfaceC2979aMo15144E = appDatabaseM26833B.mo15144E()) == null) ? null : interfaceC2979aMo15144E.mo14846f();
                AbstractC6615I0 abstractC6615I0M28164c = C6656c0.m28164c();
                a aVar = new a(C5961s.this, listMo14846f, null);
                this.f23685a = 1;
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

    public /* synthetic */ C5961s(AbstractC6112h abstractC6112h) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public final int m26832A() {
        return m26834C().getInt(C3034A.f12453a.m15039m(), 15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public final AppDatabase m26833B() {
        return (AppDatabase) this.f23658k.getValue();
    }

    /* JADX INFO: renamed from: C */
    private final SharedPreferences m26834C() {
        SharedPreferences sharedPreferences = this.f23651d.getSharedPreferences("SHARED_NAME", 0);
        AbstractC6118n.m27186d(sharedPreferences, "getSharedPreferences(...)");
        return sharedPreferences;
    }

    /* JADX INFO: renamed from: D */
    private final int m26835D() {
        return ((Number) this.f23661n.getValue()).intValue();
    }

    /* JADX INFO: renamed from: F */
    private final void m26836F() {
        View view = this.f23654g;
        if (view != null && view.isAttachedToWindow()) {
            try {
                this.f23652e.removeView(view);
            } catch (Exception e7) {
                e7.printStackTrace();
            }
        }
        this.f23648a = null;
    }

    /* JADX INFO: renamed from: G */
    private final void m26837G() {
        View view;
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        ViewPropertyAnimator viewPropertyAnimatorAlpha;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator viewPropertyAnimatorWithEndAction;
        if (!this.f23663p || (view = this.f23662o) == null || !view.isAttachedToWindow()) {
            this.f23663p = false;
            return;
        }
        View view2 = this.f23662o;
        if (view2 == null || (viewPropertyAnimatorAnimate = view2.animate()) == null || (viewPropertyAnimatorAlpha = viewPropertyAnimatorAnimate.alpha(0.0f)) == null || (duration = viewPropertyAnimatorAlpha.setDuration(200L)) == null || (viewPropertyAnimatorWithEndAction = duration.withEndAction(new Runnable() { // from class: k1.b
            @Override // java.lang.Runnable
            public final void run() {
                C5961s.m26838H(this.f23529a);
            }
        })) == null) {
            return;
        }
        viewPropertyAnimatorWithEndAction.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final void m26838H(C5961s c5961s) {
        try {
            View view = c5961s.f23662o;
            if (view != null && view.isAttachedToWindow()) {
                c5961s.f23652e.removeView(c5961s.f23662o);
            }
        } catch (Exception e7) {
            e7.printStackTrace();
        } finally {
            c5961s.f23663p = false;
        }
    }

    /* JADX INFO: renamed from: I */
    private final void m26839I() {
        int i7 = Resources.getSystem().getDisplayMetrics().heightPixels;
        this.f23659l = 0;
        this.f23660m = (int) (((double) i7) * 0.2d);
    }

    /* JADX INFO: renamed from: J */
    private final boolean m26840J(float f7, float f8) {
        View view = this.f23662o;
        if (view == null) {
            return false;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i7 = iArr[0];
        return new Rect(i7, iArr[1], view.getWidth() + i7, iArr[1] + view.getHeight()).contains((int) f7, (int) f8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public final void m26841K(List list, int i7) {
        AbstractC6672k.m28227d(AbstractC6626O.m28098a(C6656c0.m28163b()), null, null, new c(i7, this, list, null), 3, null);
    }

    /* JADX INFO: renamed from: L */
    private final void m26842L(final View view) {
        final C6129y c6129y = new C6129y();
        final C6129y c6129y2 = new C6129y();
        final C6129y c6129y3 = new C6129y();
        final C6129y c6129y4 = new C6129y();
        final C6128x c6128x = new C6128x();
        final C6098A c6098a = new C6098A();
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        final int i7 = displayMetrics.widthPixels;
        final int i8 = displayMetrics.heightPixels;
        view.setOnTouchListener(new View.OnTouchListener() { // from class: k1.m
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                return C5961s.m26843M(c6129y, this, c6129y2, c6129y3, c6129y4, c6128x, c6098a, i7, view, i8, view2, motionEvent);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final boolean m26843M(C6129y c6129y, C5961s c5961s, C6129y c6129y2, C6129y c6129y3, C6129y c6129y4, C6128x c6128x, C6098A c6098a, int i7, View view, int i8, View view2, MotionEvent motionEvent) {
        ImageView imageView;
        ImageView imageView2;
        int action = motionEvent.getAction();
        if (action == 0) {
            WindowManager.LayoutParams layoutParams = c5961s.f23664q;
            c6129y.f23886a = layoutParams.x;
            c6129y2.f23886a = layoutParams.y;
            c6129y3.f23886a = motionEvent.getRawX();
            c6129y4.f23886a = motionEvent.getRawY();
            c6128x.f23885a = false;
            c6098a.f23858a = System.currentTimeMillis();
            return true;
        }
        if (action != 1) {
            if (action == 2) {
                float rawX = motionEvent.getRawX() - c6129y3.f23886a;
                float rawY = motionEvent.getRawY() - c6129y4.f23886a;
                if (Math.abs(rawX) > 10.0f || Math.abs(rawY) > 10.0f) {
                    if (!c6128x.f23885a) {
                        c6128x.f23885a = true;
                        c5961s.m26870h0();
                    }
                    c5961s.f23664q.x = AbstractC5905g.m26659g((int) (c6129y.f23886a + rawX), 0, i7 - view.getWidth());
                    c5961s.f23664q.y = AbstractC5905g.m26659g((int) (c6129y2.f23886a + rawY), 0, i8 - view.getHeight());
                    try {
                        c5961s.f23652e.updateViewLayout(c5961s.f23653f, c5961s.f23664q);
                        if (c5961s.m26840J(motionEvent.getRawX(), motionEvent.getRawY())) {
                            View view3 = c5961s.f23662o;
                            if (view3 != null && (imageView2 = (ImageView) view3.findViewById(R.id.trash_icon)) != null) {
                                imageView2.setImageResource(R.drawable.ic_trash);
                            }
                        } else {
                            View view4 = c5961s.f23662o;
                            if (view4 != null && (imageView = (ImageView) view4.findViewById(R.id.trash_icon)) != null) {
                                imageView.setImageResource(R.drawable.ic_trash_open);
                            }
                        }
                    } catch (Exception e7) {
                        e7.printStackTrace();
                    }
                }
                return true;
            }
            if (action != 3) {
                return false;
            }
        }
        if (c6128x.f23885a) {
            if (c5961s.m26840J(motionEvent.getRawX(), motionEvent.getRawY())) {
                c5961s.m26892E();
                c5961s.m26891z();
            } else {
                c5961s.m26872i0(view, i7);
                c5961s.m26837G();
            }
            c6128x.f23885a = false;
        } else if (System.currentTimeMillis() - c6098a.f23858a > 250) {
            c5961s.m26892E();
        } else {
            view2.performClick();
        }
        return true;
    }

    /* JADX INFO: renamed from: N */
    private final void m26844N(Class cls) {
        Intent intent = new Intent(this.f23651d, (Class<?>) cls);
        intent.setFlags(268468224);
        this.f23651d.startActivity(intent);
        m26836F();
    }

    /* JADX INFO: renamed from: O */
    private final void m26845O(String str, boolean z7) {
        if (!this.f23651d.m15224J(str, z7, this.f23648a)) {
            C3034A.f12453a.m15029c(this.f23651d, str);
            Toast.makeText(this.f23651d, R.string.copied_succ, 0).show();
        }
        m26836F();
    }

    /* JADX INFO: renamed from: P */
    private final void m26846P() {
        RecyclerView recyclerView;
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        int i7 = displayMetrics.heightPixels;
        int i8 = displayMetrics.widthPixels;
        WindowManager.LayoutParams layoutParams = this.f23665r;
        layoutParams.width = (int) (((double) i8) * 0.9d);
        double d7 = i7;
        layoutParams.height = (int) (0.7d * d7);
        View view = this.f23654g;
        if (view == null || (recyclerView = (RecyclerView) view.findViewById(R.id.clipboard_list)) == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams2 = recyclerView.getLayoutParams();
        layoutParams2.height = (int) (d7 * 0.6d);
        recyclerView.setLayoutParams(layoutParams2);
    }

    /* JADX INFO: renamed from: Q */
    private final void m26847Q() {
        RecyclerView recyclerView = this.f23657j;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(this.f23651d));
            recyclerView.setHasFixedSize(true);
            a aVar = new a(this, AbstractC1638q.m6765j(), new InterfaceC5367l() { // from class: k1.d
                @Override // p238e6.InterfaceC5367l
                public final Object invoke(Object obj) {
                    return C5961s.m26848R(this.f23532a, (C5211c) obj);
                }
            }, new InterfaceC5367l() { // from class: k1.e
                @Override // p238e6.InterfaceC5367l
                public final Object invoke(Object obj) {
                    return C5961s.m26849S(this.f23534a, (C5211c) obj);
                }
            }, new InterfaceC5367l() { // from class: k1.f
                @Override // p238e6.InterfaceC5367l
                public final Object invoke(Object obj) {
                    return C5961s.m26850T(this.f23536a, (C5211c) obj);
                }
            });
            this.f23655h = aVar;
            recyclerView.setAdapter(aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final C1444v m26848R(C5961s c5961s, C5211c text) {
        AbstractC6118n.m27187e(text, "text");
        c5961s.m26845O(text.m24112f(), true);
        return C1444v.f4971a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final C1444v m26849S(C5961s c5961s, C5211c text) {
        AbstractC6118n.m27187e(text, "text");
        c5961s.m26889x(text.m24112f());
        return C1444v.f4971a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public static final C1444v m26850T(C5961s c5961s, C5211c text) {
        AbstractC6118n.m27187e(text, "text");
        c5961s.m26845O(text.m24112f(), false);
        return C1444v.f4971a;
    }

    /* JADX INFO: renamed from: U */
    private final void m26851U() {
        View view = this.f23653f;
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: k1.h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C5961s.m26852V(this.f23622a, view2);
                }
            });
        }
        View view2 = this.f23653f;
        AbstractC6118n.m27184b(view2);
        m26842L(view2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public static final void m26852V(C5961s c5961s, View view) {
        c5961s.m26894g0(null);
    }

    /* JADX INFO: renamed from: W */
    private final void m26853W() {
        View view = this.f23654g;
        if (view != null) {
            this.f23657j = (RecyclerView) view.findViewById(R.id.clipboard_list);
            this.f23656i = (Spinner) view.findViewById(R.id.spinner_category);
            view.findViewById(R.id.close).setOnClickListener(new View.OnClickListener() { // from class: k1.i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C5961s.m26854X(this.f23624a, view2);
                }
            });
            view.findViewById(R.id.open).setOnClickListener(new View.OnClickListener() { // from class: k1.j
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C5961s.m26855Y(this.f23625a, view2);
                }
            });
            view.findViewById(R.id.search).setOnClickListener(new View.OnClickListener() { // from class: k1.k
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C5961s.m26856Z(this.f23626a, view2);
                }
            });
            view.setOnTouchListener(new View.OnTouchListener() { // from class: k1.l
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    return C5961s.m26858a0(this.f23627a, view2, motionEvent);
                }
            });
            m26847Q();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public static final void m26854X(C5961s c5961s, View view) {
        c5961s.m26836F();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public static final void m26855Y(C5961s c5961s, View view) {
        c5961s.m26844N(BrowseNotesDialogActivity.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public static final void m26856Z(C5961s c5961s, View view) {
        c5961s.m26844N(SearchActivity.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public static final boolean m26858a0(C5961s c5961s, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 4) {
            return false;
        }
        c5961s.m26836F();
        return true;
    }

    /* JADX INFO: renamed from: b0 */
    private final void m26860b0() {
        AbstractC2631X.m12584b(this.f23649b).m12675l(new d(new InterfaceC5367l() { // from class: k1.n
            @Override // p238e6.InterfaceC5367l
            public final Object invoke(Object obj) {
                return C5961s.m26862c0(this.f23638a, (List) obj);
            }
        }));
        AbstractC2631X.m12584b(this.f23650c).m12675l(new d(new InterfaceC5367l() { // from class: k1.o
            @Override // p238e6.InterfaceC5367l
            public final Object invoke(Object obj) {
                return C5961s.m26864d0(this.f23639a, (List) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public static final C1444v m26862c0(C5961s c5961s, List list) {
        a aVar = c5961s.f23655h;
        if (aVar != null) {
            AbstractC6118n.m27184b(list);
            aVar.m26902H(list);
        }
        return C1444v.f4971a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d0 */
    public static final C1444v m26864d0(C5961s c5961s, List list) {
        C6102E c6102e = new C6102E(2);
        c6102e.m27154a(c5961s.f23651d.getString(R.string.last_added));
        AbstractC6118n.m27184b(list);
        ArrayList arrayList = new ArrayList(AbstractC1638q.m6774s(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((C5209a) it.next()).m24099e());
        }
        c6102e.m27155b(arrayList.toArray(new String[0]));
        String[] strArr = (String[]) c6102e.m27157d(new String[c6102e.m27156c()]);
        Spinner spinner = c5961s.f23656i;
        if (spinner != null) {
            spinner.setAdapter((SpinnerAdapter) new ArrayAdapter(c5961s.f23651d, R.layout.lay_spinner, strArr));
        }
        return C1444v.f4971a;
    }

    /* JADX INFO: renamed from: e0 */
    private final void m26866e0() {
        Spinner spinner = this.f23656i;
        if (spinner != null) {
            spinner.setOnItemSelectedListener(new e());
            m26878l0();
        }
    }

    /* JADX INFO: renamed from: h0 */
    private final void m26870h0() {
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        ViewPropertyAnimator viewPropertyAnimatorAlpha;
        ViewPropertyAnimator duration;
        if (this.f23663p) {
            return;
        }
        if (this.f23662o == null) {
            this.f23662o = LayoutInflater.from(this.f23651d).inflate(R.layout.trash_layout, (ViewGroup) null);
        }
        View view = this.f23662o;
        if (view != null && view.isAttachedToWindow()) {
            this.f23663p = true;
            return;
        }
        try {
            this.f23652e.addView(this.f23662o, this.f23666s);
            this.f23663p = true;
            View view2 = this.f23662o;
            if (view2 != null) {
                view2.setAlpha(0.0f);
            }
            View view3 = this.f23662o;
            if (view3 == null || (viewPropertyAnimatorAnimate = view3.animate()) == null || (viewPropertyAnimatorAlpha = viewPropertyAnimatorAnimate.alpha(1.0f)) == null || (duration = viewPropertyAnimatorAlpha.setDuration(50L)) == null) {
                return;
            }
            duration.start();
            C1444v c1444v = C1444v.f4971a;
        } catch (Exception e7) {
            e7.printStackTrace();
            this.f23663p = false;
            C1444v c1444v2 = C1444v.f4971a;
        }
    }

    /* JADX INFO: renamed from: i0 */
    private final void m26872i0(View view, int i7) {
        int i8 = this.f23664q.x;
        int width = i8 > i7 - (view.getWidth() + i8) ? i7 - view.getWidth() : 0;
        this.f23659l = width;
        WindowManager.LayoutParams layoutParams = this.f23664q;
        this.f23660m = layoutParams.y;
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(layoutParams.x, width);
        valueAnimatorOfInt.setDuration(100L);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: k1.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C5961s.m26874j0(this.f23531a, valueAnimator);
            }
        });
        valueAnimatorOfInt.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public static final void m26874j0(C5961s c5961s, ValueAnimator animation) {
        AbstractC6118n.m27187e(animation, "animation");
        WindowManager.LayoutParams layoutParams = c5961s.f23664q;
        Object animatedValue = animation.getAnimatedValue();
        AbstractC6118n.m27185c(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        layoutParams.x = ((Integer) animatedValue).intValue();
        try {
            c5961s.f23652e.updateViewLayout(c5961s.f23653f, c5961s.f23664q);
        } catch (Exception e7) {
            e7.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public static final int m26876k0() {
        return C3034A.m15013z(C3034A.f12453a, false, 1, null);
    }

    /* JADX INFO: renamed from: l0 */
    private final void m26878l0() {
        AbstractC6672k.m28227d(AbstractC6626O.m28098a(C6656c0.m28163b()), null, null, new f(null), 3, null);
    }

    /* JADX INFO: renamed from: x */
    private final void m26889x(String str) {
        C3034A.f12453a.m15029c(this.f23651d, str);
        m26836F();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final AppDatabase m26890y(C5961s c5961s) {
        return AppDatabase.f12597p.m15148b(c5961s.f23651d);
    }

    /* JADX INFO: renamed from: z */
    private final void m26891z() {
        try {
            View view = this.f23662o;
            if (view != null && view.isAttachedToWindow()) {
                this.f23652e.removeView(this.f23662o);
            }
        } catch (Exception e7) {
            e7.printStackTrace();
        } finally {
            this.f23663p = false;
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m26892E() {
        m26891z();
        View view = this.f23653f;
        if (view == null || !view.isAttachedToWindow()) {
            return;
        }
        try {
            this.f23652e.removeView(view);
        } catch (Exception e7) {
            e7.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: f0 */
    public final void m26893f0() {
        if (this.f23653f == null) {
            this.f23653f = LayoutInflater.from(this.f23651d).inflate(R.layout.bubble_icon_layout, (ViewGroup) null);
            m26851U();
            if (this.f23659l == 0 && this.f23660m == 0) {
                m26839I();
            }
        }
        View view = this.f23653f;
        AbstractC6118n.m27184b(view);
        if (view.isAttachedToWindow()) {
            return;
        }
        WindowManager.LayoutParams layoutParams = this.f23664q;
        layoutParams.x = this.f23659l;
        layoutParams.y = this.f23660m;
        try {
            this.f23652e.addView(this.f23653f, layoutParams);
        } catch (Exception e7) {
            e7.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: g0 */
    public final void m26894g0(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f23648a = accessibilityNodeInfo;
        if (this.f23654g == null) {
            this.f23654g = LayoutInflater.from(new ContextThemeWrapper(this.f23651d, R.style.Theme_ClipboardTextSaved)).inflate(R.layout.view_list_items, (ViewGroup) null);
            m26853W();
        }
        View view = this.f23654g;
        AbstractC6118n.m27184b(view);
        if (view.isAttachedToWindow()) {
            return;
        }
        m26846P();
        try {
            this.f23652e.addView(this.f23654g, this.f23665r);
            m26860b0();
            Spinner spinner = this.f23656i;
            if ((spinner != null ? spinner.getAdapter() : null) == null) {
                m26866e0();
                return;
            }
            m26878l0();
            List list = (List) this.f23650c.m12669f();
            Spinner spinner2 = this.f23656i;
            AbstractC6118n.m27184b(spinner2);
            m26841K(list, spinner2.getSelectedItemPosition());
        } catch (Exception e7) {
            e7.printStackTrace();
            MyAccessibilityService myAccessibilityService = this.f23651d;
            Toast.makeText(myAccessibilityService, myAccessibilityService.getString(R.string.failed_to_show_your_notes), 0).show();
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m26895w() {
        m26836F();
        m26892E();
        m26891z();
        this.f23654g = null;
        this.f23655h = null;
        this.f23656i = null;
        this.f23657j = null;
        this.f23653f = null;
        this.f23662o = null;
        this.f23663p = false;
        f23647u = null;
    }

    private C5961s() {
        this.f23649b = new C2611C();
        this.f23650c = new C2611C();
        MyAccessibilityService myAccessibilityServiceM15245a = MyAccessibilityService.f12639O.m15245a();
        AbstractC6118n.m27184b(myAccessibilityServiceM15245a);
        this.f23651d = myAccessibilityServiceM15245a;
        Object systemService = myAccessibilityServiceM15245a.getSystemService("window");
        AbstractC6118n.m27185c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.f23652e = (WindowManager) systemService;
        this.f23658k = AbstractC1430h.m6066b(new InterfaceC5356a() { // from class: k1.a
            @Override // p238e6.InterfaceC5356a
            public final Object invoke() {
                return C5961s.m26890y(this.f23526a);
            }
        });
        this.f23661n = AbstractC1430h.m6066b(new InterfaceC5356a() { // from class: k1.g
            @Override // p238e6.InterfaceC5356a
            public final Object invoke() {
                return Integer.valueOf(C5961s.m26876k0());
            }
        });
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, m26835D(), 8, -3);
        layoutParams.gravity = 8388659;
        this.f23664q = layoutParams;
        WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams(-1, -1, m26835D(), 262152, -3);
        layoutParams2.gravity = 17;
        this.f23665r = layoutParams2;
        WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(-2, -2, m26835D(), 24, -3);
        layoutParams3.gravity = 81;
        this.f23666s = layoutParams3;
    }
}
