package com.anas_mugally.clipboard.p221ui;

import android.content.ComponentName;
import android.content.SharedPreferences;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageButton;
import android.widget.Toast;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.anas_mugally.clipboard.AbstractC3041D;
import com.anas_mugally.clipboard.ActionsLayout;
import com.anas_mugally.clipboard.C3034A;
import com.anas_mugally.clipboard.C3150x;
import com.anas_mugally.clipboard.R;
import com.anas_mugally.clipboard.database.AppDatabase;
import com.anas_mugally.clipboard.p221ui.TextExtractionActivity;
import com.anas_mugally.clipboard.p221ui.ads.AbstractActivityC3130a;
import com.anas_mugally.clipboard.p221ui.ads.BaseMyAppAdsActivity;
import com.google.android.gms.internal.ads.zzbbn;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6118n;
import p111O.AbstractC1030Z;
import p111O.C0982A0;
import p111O.InterfaceC0993G;
import p145S5.AbstractC1430h;
import p145S5.C1435m;
import p145S5.C1444v;
import p145S5.InterfaceC1429g;
import p152T5.AbstractC1617O;
import p152T5.AbstractC1638q;
import p223d.AbstractC5158A;
import p223d.AbstractC5166I;
import p238e6.InterfaceC5356a;
import p238e6.InterfaceC5367l;
import p238e6.InterfaceC5371p;
import p265i1.C5681j;
import p265i1.C5684m;
import p278j6.AbstractC5905g;
import p281k1.C5920K;
import p297m1.C6327h;
import p371v1.C7223x;

/* JADX INFO: loaded from: classes.dex */
public final class TextExtractionActivity extends BaseMyAppAdsActivity {

    /* JADX INFO: renamed from: L0 */
    private View f12848L0;

    /* JADX INFO: renamed from: N0 */
    private List f12850N0;

    /* JADX INFO: renamed from: P0 */
    private C5681j f12852P0;

    /* JADX INFO: renamed from: Q0 */
    private C5684m f12853Q0;

    /* JADX INFO: renamed from: R0 */
    private CoordinatorLayout f12854R0;

    /* JADX INFO: renamed from: S0 */
    private View f12855S0;

    /* JADX INFO: renamed from: T0 */
    private ActionsLayout f12856T0;

    /* JADX INFO: renamed from: U0 */
    private View f12857U0;

    /* JADX INFO: renamed from: V0 */
    private float f12858V0;

    /* JADX INFO: renamed from: W0 */
    private float f12859W0;

    /* JADX INFO: renamed from: X0 */
    private float f12860X0;

    /* JADX INFO: renamed from: Y0 */
    private int f12861Y0;

    /* JADX INFO: renamed from: Z0 */
    private int f12862Z0;

    /* JADX INFO: renamed from: a1 */
    private int f12863a1;

    /* JADX INFO: renamed from: b1 */
    private float f12864b1;

    /* JADX INFO: renamed from: c1 */
    private float f12865c1;

    /* JADX INFO: renamed from: d1 */
    private float f12866d1;

    /* JADX INFO: renamed from: i1 */
    private boolean f12871i1;

    /* JADX INFO: renamed from: M0 */
    private final InterfaceC1429g f12849M0 = AbstractC1430h.m6066b(new InterfaceC5356a() { // from class: l1.C1
        @Override // p238e6.InterfaceC5356a
        public final Object invoke() {
            return Boolean.valueOf(TextExtractionActivity.m15694Q4(this.f23905a));
        }
    });

    /* JADX INFO: renamed from: O0 */
    private ArrayList f12851O0 = new ArrayList();

    /* JADX INFO: renamed from: e1 */
    private final ArrayList f12867e1 = new ArrayList();

    /* JADX INFO: renamed from: f1 */
    private final long f12868f1 = 50;

    /* JADX INFO: renamed from: g1 */
    private final float f12869g1 = 800.0f;

    /* JADX INFO: renamed from: h1 */
    private final float f12870h1 = 10.0f;

    /* JADX INFO: renamed from: j1 */
    private final InterfaceC1429g f12872j1 = AbstractC1430h.m6066b(new InterfaceC5356a() { // from class: l1.D1
        @Override // p238e6.InterfaceC5356a
        public final Object invoke() {
            return TextExtractionActivity.m15696S4();
        }
    });

    /* JADX INFO: renamed from: com.anas_mugally.clipboard.ui.TextExtractionActivity$a */
    public final class C3106a implements Comparator {

        /* JADX INFO: renamed from: a */
        private final int f12873a;

        public C3106a(int i7) {
            this.f12873a = i7;
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(C1435m node1, C1435m node2) {
            AbstractC6118n.m27187e(node1, "node1");
            AbstractC6118n.m27187e(node2, "node2");
            Rect rect = (Rect) node1.m6071d();
            Rect rect2 = (Rect) node2.m6071d();
            int i7 = rect.top;
            int i8 = rect2.top;
            if (i7 != i8) {
                return i7 - i8;
            }
            return this.f12873a == 1 ? rect2.right - rect.right : rect.left - rect2.left;
        }
    }

    /* JADX INFO: renamed from: A4 */
    private final void m15678A4() {
        m15725u4(this.f12864b1);
        this.f12871i1 = true;
    }

    /* JADX INFO: renamed from: B4 */
    private final C3150x m15679B4() {
        return (C3150x) this.f12872j1.getValue();
    }

    /* JADX INFO: renamed from: C4 */
    private final List m15680C4(List list, int i7) {
        return AbstractC1638q.m6588b0(list, new C3106a(i7));
    }

    /* JADX INFO: renamed from: D4 */
    private final ArrayList m15681D4() {
        Object parcelable;
        ArrayList parcelableArrayListExtra = Build.VERSION.SDK_INT >= 33 ? getIntent().getParcelableArrayListExtra("list", Bundle.class) : getIntent().getParcelableArrayListExtra("list");
        ArrayList arrayList = new ArrayList();
        if (parcelableArrayListExtra != null) {
            Iterator it = parcelableArrayListExtra.iterator();
            AbstractC6118n.m27186d(it, "iterator(...)");
            while (it.hasNext()) {
                Bundle bundle = (Bundle) it.next();
                String string = bundle.getString("string");
                AbstractC6118n.m27184b(string);
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable = bundle.getParcelable("rect", Rect.class);
                    AbstractC6118n.m27184b(parcelable);
                } else {
                    parcelable = bundle.getParcelable("rect");
                    AbstractC6118n.m27184b(parcelable);
                }
                arrayList.add(new C1435m(string, (Rect) parcelable));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: E4 */
    private final void m15682E4() {
        if (this.f12871i1) {
            m15727w4();
        } else {
            m15678A4();
        }
    }

    /* JADX INFO: renamed from: F4 */
    private final void m15683F4(float f7) {
        View view = this.f12855S0;
        if (view == null) {
            AbstractC6118n.m27197o("bottomSheet");
            view = null;
        }
        float translationY = view.getTranslationY();
        float f8 = this.f12865c1;
        float f9 = this.f12864b1;
        float f10 = (f8 - f9) / 2;
        float f11 = this.f12869g1;
        if (f7 <= f11 && (f7 < (-f11) || translationY <= f10)) {
            f8 = f9;
        }
        this.f12871i1 = f8 == f9;
        m15725u4(f8);
    }

    /* JADX INFO: renamed from: G4 */
    private final void m15684G4(boolean z7) {
        int size = this.f12851O0.size();
        List list = this.f12850N0;
        AbstractC6118n.m27184b(list);
        if (size == list.size() || z7) {
            this.f12851O0.clear();
            m15727w4();
        } else {
            this.f12851O0.clear();
            ArrayList arrayList = this.f12851O0;
            List list2 = this.f12850N0;
            AbstractC6118n.m27184b(list2);
            arrayList.addAll(m15680C4(list2, getResources().getConfiguration().getLayoutDirection()));
            m15678A4();
        }
        C5681j c5681j = this.f12852P0;
        if (c5681j != null) {
            c5681j.m25224h(this.f12851O0);
        }
    }

    /* JADX INFO: renamed from: H4 */
    static /* synthetic */ void m15685H4(TextExtractionActivity textExtractionActivity, boolean z7, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            z7 = false;
        }
        textExtractionActivity.m15684G4(z7);
    }

    /* JADX INFO: renamed from: I4 */
    private final void m15686I4(int i7, int i8) {
        C3150x c3150xM15679B4 = m15679B4();
        List list = this.f12850N0;
        AbstractC6118n.m27184b(list);
        C1435m c1435mM16734c = c3150xM15679B4.m16734c(list, i7, i8);
        if ((c1435mM16734c != null ? (String) c1435mM16734c.m6070c() : null) == null) {
            return;
        }
        if (this.f12851O0.contains(c1435mM16734c)) {
            this.f12851O0.remove(c1435mM16734c);
            if (this.f12851O0.isEmpty()) {
                m15727w4();
            }
        } else {
            this.f12851O0.add(c1435mM16734c);
            if (this.f12851O0.size() == 1) {
                m15678A4();
            }
        }
        C5681j c5681j = this.f12852P0;
        if (c5681j != null) {
            c5681j.m25224h(this.f12851O0);
        }
    }

    /* JADX INFO: renamed from: J4 */
    private final void m15687J4() {
        this.f12861Y0 = getResources().getDisplayMetrics().heightPixels;
        View view = this.f12857U0;
        CoordinatorLayout coordinatorLayout = null;
        if (view == null) {
            AbstractC6118n.m27197o("container");
            view = null;
        }
        this.f12862Z0 = view.getHeight();
        ActionsLayout actionsLayout = this.f12856T0;
        if (actionsLayout == null) {
            AbstractC6118n.m27197o("actions");
            actionsLayout = null;
        }
        this.f12863a1 = actionsLayout.getHeight();
        this.f12864b1 = 0.0f;
        this.f12865c1 = this.f12862Z0;
        CoordinatorLayout coordinatorLayout2 = this.f12854R0;
        if (coordinatorLayout2 == null) {
            AbstractC6118n.m27197o("rootLayout");
        } else {
            coordinatorLayout = coordinatorLayout2;
        }
        AbstractC1030Z.m4494t0(coordinatorLayout, new InterfaceC0993G() { // from class: l1.v1
            @Override // p111O.InterfaceC0993G
            /* JADX INFO: renamed from: a */
            public final C0982A0 mo4369a(View view2, C0982A0 c0982a0) {
                return TextExtractionActivity.m15688K4(this.f24074a, view2, c0982a0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K4 */
    public static final C0982A0 m15688K4(TextExtractionActivity textExtractionActivity, View view, C0982A0 insets) {
        AbstractC6118n.m27187e(view, "<unused var>");
        AbstractC6118n.m27187e(insets, "insets");
        textExtractionActivity.f12865c1 = textExtractionActivity.f12862Z0 + insets.m4272f(C0982A0.p.m4332e()).f987d;
        View view2 = textExtractionActivity.f12855S0;
        if (view2 == null) {
            AbstractC6118n.m27197o("bottomSheet");
            view2 = null;
        }
        view2.setTranslationY(textExtractionActivity.f12865c1);
        textExtractionActivity.f12866d1 = textExtractionActivity.f12865c1;
        return insets;
    }

    /* JADX INFO: renamed from: L4 */
    private final boolean m15689L4(final int i7) {
        m16252P2();
        if (i7 == R.id.more) {
            return true;
        }
        m16261j3(new InterfaceC5356a() { // from class: l1.x1
            @Override // p238e6.InterfaceC5356a
            public final Object invoke() {
                return TextExtractionActivity.m15690M4(this.f24080a, i7);
            }
        });
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M4 */
    public static final C1444v m15690M4(TextExtractionActivity textExtractionActivity, int i7) {
        textExtractionActivity.m15691N4(i7);
        return C1444v.f4971a;
    }

    /* JADX INFO: renamed from: N4 */
    private final void m15691N4(final int i7) {
        if (i7 == R.id.select_all) {
            m15685H4(this, false, 1, null);
        } else {
            m15728x4(new InterfaceC5367l() { // from class: l1.B1
                @Override // p238e6.InterfaceC5367l
                public final Object invoke(Object obj) {
                    return TextExtractionActivity.m15692O4(this.f23901a, i7, (String) obj);
                }
            });
            m15711g5();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O4 */
    public static final C1444v m15692O4(TextExtractionActivity textExtractionActivity, int i7, String it) {
        AbstractC6118n.m27187e(it, "it");
        C5920K c5920k = new C5920K(textExtractionActivity, it, true);
        ActionsLayout actionsLayout = textExtractionActivity.f12856T0;
        if (actionsLayout == null) {
            AbstractC6118n.m27197o("actions");
            actionsLayout = null;
        }
        ImageButton imageButton = actionsLayout.getItemViewMap().get(Integer.valueOf(i7));
        AbstractC6118n.m27184b(imageButton);
        c5920k.m26717s(imageButton, AppDatabase.f12597p.m15148b(textExtractionActivity));
        c5920k.m26716i(i7);
        return C1444v.f4971a;
    }

    /* JADX INFO: renamed from: P4 */
    private final boolean m15693P4() {
        return ((Boolean) this.f12849M0.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q4 */
    public static final boolean m15694Q4(TextExtractionActivity textExtractionActivity) {
        return textExtractionActivity.getResources().getConfiguration().orientation == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R4 */
    public static final C1444v m15695R4(TextExtractionActivity textExtractionActivity, AbstractC5158A addCallback) {
        AbstractC6118n.m27187e(addCallback, "$this$addCallback");
        if (textExtractionActivity.f12851O0.isEmpty()) {
            addCallback.m23915j(false);
            textExtractionActivity.mo12238b().m23939s();
        } else {
            textExtractionActivity.m15684G4(true);
        }
        return C1444v.f4971a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S4 */
    public static final C3150x m15696S4() {
        return new C3150x();
    }

    /* JADX INFO: renamed from: T4 */
    private final void m15697T4(float f7) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f12867e1.add(new C1435m(Long.valueOf(jCurrentTimeMillis), Float.valueOf(f7)));
        while (this.f12867e1.size() > 1 && jCurrentTimeMillis - ((Number) ((C1435m) AbstractC1638q.m6570J(this.f12867e1)).m6070c()).longValue() > this.f12868f1) {
            this.f12867e1.remove(0);
        }
    }

    /* JADX INFO: renamed from: U4 */
    private final void m15698U4() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this);
        CoordinatorLayout coordinatorLayout = this.f12854R0;
        View view = null;
        if (coordinatorLayout == null) {
            AbstractC6118n.m27197o("rootLayout");
            coordinatorLayout = null;
        }
        View viewInflate = layoutInflaterFrom.inflate(R.layout.view_symbol_text_extraction_mutable, (ViewGroup) coordinatorLayout, false);
        this.f12855S0 = viewInflate;
        if (viewInflate == null) {
            AbstractC6118n.m27197o("bottomSheet");
            viewInflate = null;
        }
        this.f12857U0 = viewInflate.findViewById(R.id.container);
        View view2 = this.f12855S0;
        if (view2 == null) {
            AbstractC6118n.m27197o("bottomSheet");
            view2 = null;
        }
        ActionsLayout actionsLayout = (ActionsLayout) view2.findViewById(R.id.actions);
        this.f12856T0 = actionsLayout;
        if (actionsLayout == null) {
            AbstractC6118n.m27197o("actions");
            actionsLayout = null;
        }
        actionsLayout.removeItem(R.id.delete);
        if (Build.VERSION.SDK_INT >= 28) {
            ActionsLayout actionsLayout2 = this.f12856T0;
            if (actionsLayout2 == null) {
                AbstractC6118n.m27197o("actions");
                actionsLayout2 = null;
            }
            actionsLayout2.removeItem(R.id.send_text);
        }
        ActionsLayout actionsLayout3 = this.f12856T0;
        if (actionsLayout3 == null) {
            AbstractC6118n.m27197o("actions");
            actionsLayout3 = null;
        }
        actionsLayout3.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: l1.F1
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return TextExtractionActivity.m15702Y4(this.f23918a, menuItem);
            }
        });
        ActionsLayout actionsLayout4 = this.f12856T0;
        if (actionsLayout4 == null) {
            AbstractC6118n.m27197o("actions");
            actionsLayout4 = null;
        }
        actionsLayout4.setOnMoreAppsItemClickListener(new InterfaceC5371p() { // from class: l1.G1
            @Override // p238e6.InterfaceC5371p
            public final Object invoke(Object obj, Object obj2) {
                return TextExtractionActivity.m15699V4(this.f23921a, (ComponentName) obj, (ActionsLayout.EnumC3037c) obj2);
            }
        });
        int iM15049x = m15693P4() ? C3034A.f12453a.m15049x(this) : 0;
        CoordinatorLayout.C2426f c2426f = new CoordinatorLayout.C2426f(-1, -2);
        c2426f.f9257c = 80;
        ((ViewGroup.MarginLayoutParams) c2426f).bottomMargin = iM15049x;
        CoordinatorLayout coordinatorLayout2 = this.f12854R0;
        if (coordinatorLayout2 == null) {
            AbstractC6118n.m27197o("rootLayout");
            coordinatorLayout2 = null;
        }
        View view3 = this.f12855S0;
        if (view3 == null) {
            AbstractC6118n.m27197o("bottomSheet");
            view3 = null;
        }
        coordinatorLayout2.addView(view3, c2426f);
        if (iM15049x > 0) {
            CoordinatorLayout.C2426f c2426f2 = new CoordinatorLayout.C2426f(-1, -2);
            c2426f2.f9257c = 80;
            ((ViewGroup.MarginLayoutParams) c2426f2).height = iM15049x;
            ((ViewGroup.MarginLayoutParams) c2426f2).width = -1;
            View view4 = new View(this);
            view4.setBackgroundResource(R.color.my_background);
            this.f12848L0 = view4;
            CoordinatorLayout coordinatorLayout3 = this.f12854R0;
            if (coordinatorLayout3 == null) {
                AbstractC6118n.m27197o("rootLayout");
                coordinatorLayout3 = null;
            }
            coordinatorLayout3.addView(this.f12848L0, c2426f2);
        }
        View view5 = this.f12855S0;
        if (view5 == null) {
            AbstractC6118n.m27197o("bottomSheet");
        } else {
            view = view5;
        }
        view.post(new Runnable() { // from class: l1.H1
            @Override // java.lang.Runnable
            public final void run() {
                TextExtractionActivity.m15701X4(this.f23927a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V4 */
    public static final C1444v m15699V4(final TextExtractionActivity textExtractionActivity, final ComponentName componentName, final ActionsLayout.EnumC3037c type) {
        AbstractC6118n.m27187e(type, "type");
        textExtractionActivity.m15728x4(new InterfaceC5367l() { // from class: l1.y1
            @Override // p238e6.InterfaceC5367l
            public final Object invoke(Object obj) {
                return TextExtractionActivity.m15700W4(this.f24084a, componentName, type, (String) obj);
            }
        });
        return C1444v.f4971a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W4 */
    public static final C1444v m15700W4(TextExtractionActivity textExtractionActivity, ComponentName componentName, ActionsLayout.EnumC3037c enumC3037c, String it) {
        AbstractC6118n.m27187e(it, "it");
        AbstractC3041D.m15090o(textExtractionActivity, it, componentName, enumC3037c, false, 8, null);
        if (C3034A.f12453a.m15042q(textExtractionActivity)) {
            textExtractionActivity.m15684G4(true);
        }
        return C1444v.f4971a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X4 */
    public static final void m15701X4(TextExtractionActivity textExtractionActivity) {
        textExtractionActivity.m15687J4();
        textExtractionActivity.m15703Z4();
        View view = textExtractionActivity.f12855S0;
        if (view == null) {
            AbstractC6118n.m27197o("bottomSheet");
            view = null;
        }
        view.setTranslationY(textExtractionActivity.f12865c1);
        textExtractionActivity.f12866d1 = textExtractionActivity.f12865c1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y4 */
    public static final boolean m15702Y4(TextExtractionActivity textExtractionActivity, MenuItem it) {
        AbstractC6118n.m27187e(it, "it");
        textExtractionActivity.m15689L4(it.getItemId());
        return true;
    }

    /* JADX INFO: renamed from: Z4 */
    private final void m15703Z4() {
        View view = this.f12855S0;
        if (view == null) {
            AbstractC6118n.m27197o("bottomSheet");
            view = null;
        }
        view.setOnTouchListener(new View.OnTouchListener() { // from class: l1.w1
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                return TextExtractionActivity.m15704a5(this.f24077a, view2, motionEvent);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a5 */
    public static final boolean m15704a5(TextExtractionActivity textExtractionActivity, View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        View view2 = null;
        if (action == 0) {
            textExtractionActivity.f12858V0 = motionEvent.getRawY();
            textExtractionActivity.f12859W0 = motionEvent.getRawX();
            View view3 = textExtractionActivity.f12855S0;
            if (view3 == null) {
                AbstractC6118n.m27197o("bottomSheet");
            } else {
                view2 = view3;
            }
            textExtractionActivity.f12860X0 = view2.getTranslationY();
            textExtractionActivity.f12867e1.clear();
            textExtractionActivity.m15697T4(motionEvent.getRawY());
            return true;
        }
        if (action == 1) {
            float fAbs = Math.abs(motionEvent.getRawY() - textExtractionActivity.f12858V0);
            float fAbs2 = Math.abs(motionEvent.getRawX() - textExtractionActivity.f12859W0);
            float f7 = textExtractionActivity.f12870h1;
            if (fAbs >= f7 || fAbs2 >= f7) {
                textExtractionActivity.m15683F4(textExtractionActivity.m15726v4());
            } else {
                textExtractionActivity.m15682E4();
            }
            return true;
        }
        if (action != 2) {
            return false;
        }
        float rawY = motionEvent.getRawY() - textExtractionActivity.f12858V0;
        float rawX = motionEvent.getRawX() - textExtractionActivity.f12859W0;
        if (Math.abs(rawY) > textExtractionActivity.f12870h1 || Math.abs(rawX) > textExtractionActivity.f12870h1) {
            float f8 = AbstractC5905g.m26658f(textExtractionActivity.f12860X0 + rawY, textExtractionActivity.f12864b1, textExtractionActivity.f12865c1);
            View view4 = textExtractionActivity.f12855S0;
            if (view4 == null) {
                AbstractC6118n.m27197o("bottomSheet");
            } else {
                view2 = view4;
            }
            view2.setTranslationY(f8);
            textExtractionActivity.f12866d1 = f8;
            textExtractionActivity.m15697T4(motionEvent.getRawY());
        }
        return true;
    }

    /* JADX INFO: renamed from: b5 */
    private final void m15705b5() {
        C5684m c5684m = this.f12853Q0;
        ViewParent parent = c5684m != null ? c5684m.getParent() : null;
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(this.f12853Q0);
        }
        this.f12853Q0 = null;
        m15708e5();
        m15706c5();
        m15698U4();
    }

    /* JADX INFO: renamed from: c5 */
    private final void m15706c5() {
        List listJ;
        C5681j c5681j = new C5681j(this);
        c5681j.setBackgroundColor(0);
        c5681j.setLayoutParams(new CoordinatorLayout.C2426f(-1, -1));
        c5681j.setOnTouchListener(new View.OnTouchListener() { // from class: l1.I1
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return TextExtractionActivity.m15707d5(this.f23938a, view, motionEvent);
            }
        });
        List list = this.f12850N0;
        if (list != null) {
            listJ = new ArrayList(AbstractC1638q.m6774s(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                listJ.add((Rect) ((C1435m) it.next()).m6071d());
            }
        } else {
            listJ = AbstractC1638q.m6765j();
        }
        c5681j.m25223g(listJ);
        this.f12852P0 = c5681j;
        CoordinatorLayout coordinatorLayout = this.f12854R0;
        if (coordinatorLayout == null) {
            AbstractC6118n.m27197o("rootLayout");
            coordinatorLayout = null;
        }
        coordinatorLayout.addView(this.f12852P0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d5 */
    public static final boolean m15707d5(TextExtractionActivity textExtractionActivity, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            textExtractionActivity.m15686I4((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
        }
        return true;
    }

    /* JADX INFO: renamed from: e5 */
    private final void m15708e5() {
        CoordinatorLayout coordinatorLayout = new CoordinatorLayout(this);
        coordinatorLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.f12854R0 = coordinatorLayout;
        setContentView(coordinatorLayout);
    }

    /* JADX INFO: renamed from: f5 */
    private final void m15709f5() {
        Window window = getWindow();
        window.setBackgroundDrawable(new ColorDrawable(0));
        window.addFlags(512);
    }

    /* JADX INFO: renamed from: g5 */
    private final boolean m15711g5() {
        SharedPreferences sharedPreferencesM15843T1 = m15843T1();
        C6327h.a aVar = C6327h.f24159H0;
        if (sharedPreferencesM15843T1.getBoolean(aVar.m27282b(), false) || !C3034A.f12453a.m15015B(this)) {
            return false;
        }
        aVar.m27281a().mo7649g2(m12232H0(), null);
        return true;
    }

    /* JADX INFO: renamed from: u4 */
    private final void m15725u4(float f7) {
        View view = this.f12855S0;
        if (view == null) {
            AbstractC6118n.m27197o("bottomSheet");
            view = null;
        }
        view.animate().translationY(f7).setDuration(200L).setInterpolator(new DecelerateInterpolator()).start();
        this.f12866d1 = f7;
    }

    /* JADX INFO: renamed from: v4 */
    private final float m15726v4() {
        if (this.f12867e1.size() < 2) {
            return 0.0f;
        }
        C1435m c1435m = (C1435m) AbstractC1638q.m6570J(this.f12867e1);
        C1435m c1435m2 = (C1435m) AbstractC1638q.m6579S(this.f12867e1);
        long jLongValue = ((Number) c1435m2.m6070c()).longValue() - ((Number) c1435m.m6070c()).longValue();
        if (jLongValue == 0) {
            return 0.0f;
        }
        return ((((Number) c1435m2.m6071d()).floatValue() - ((Number) c1435m.m6071d()).floatValue()) / jLongValue) * zzbbn.zzq.zzf;
    }

    /* JADX INFO: renamed from: w4 */
    private final void m15727w4() {
        m15725u4(this.f12865c1);
        this.f12871i1 = false;
    }

    /* JADX INFO: renamed from: x4 */
    private final void m15728x4(final InterfaceC5367l interfaceC5367l) {
        if (this.f12851O0.isEmpty()) {
            Toast.makeText(this, R.string.empty_text, 0).show();
            return;
        }
        if (this.f12851O0.size() <= 1) {
            interfaceC5367l.invoke(AbstractC1638q.m6578R(this.f12851O0, "\n\n", null, null, 0, null, new InterfaceC5367l() { // from class: l1.A1
                @Override // p238e6.InterfaceC5367l
                public final Object invoke(Object obj) {
                    return TextExtractionActivity.m15730z4((C1435m) obj);
                }
            }, 30, null));
            return;
        }
        ArrayList arrayList = this.f12851O0;
        ArrayList arrayList2 = new ArrayList(AbstractC1638q.m6774s(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((String) ((C1435m) it.next()).m6070c());
        }
        new C7223x(this, arrayList2).m31879m(new C7223x.a() { // from class: l1.z1
            @Override // p371v1.C7223x.a
            /* JADX INFO: renamed from: a */
            public final void mo16605a(String str) {
                TextExtractionActivity.m15729y4(this.f24089a, interfaceC5367l, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y4 */
    public static final void m15729y4(TextExtractionActivity textExtractionActivity, InterfaceC5367l interfaceC5367l, String combinedText) {
        AbstractC6118n.m27187e(combinedText, "combinedText");
        if (AbstractC3041D.m15081f(textExtractionActivity, combinedText)) {
            interfaceC5367l.invoke(combinedText);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z4 */
    public static final CharSequence m15730z4(C1435m it) {
        AbstractC6118n.m27187e(it, "it");
        return (CharSequence) it.m6070c();
    }

    @Override // com.anas_mugally.clipboard.p221ui.ads.AbstractActivityC3130a
    /* JADX INFO: renamed from: D2 */
    protected Set mo15494D2() {
        if (m15845V1()) {
            return AbstractC1617O.m6652f(AbstractActivityC3130a.d.INTERSTITIAL, AbstractActivityC3130a.d.APP_OPEN, AbstractActivityC3130a.d.NATIVE);
        }
        return null;
    }

    @Override // com.anas_mugally.clipboard.p221ui.ads.BaseMyAppAdsActivity, com.anas_mugally.clipboard.p221ui.ads.AbstractActivityC3130a, com.anas_mugally.clipboard.p221ui.AbstractViewOnClickListenerC3111a, com.anas_mugally.clipboard.p221ui.AbstractActivityC3140d, androidx.fragment.app.AbstractActivityC2592j, p223d.AbstractActivityC5187q, p017C.AbstractActivityC0106g, android.app.Activity
    protected void onCreate(Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 34) {
            overrideActivityTransition(0, 0, 0);
        } else {
            overridePendingTransition(0, 0);
        }
        super.onCreate(bundle);
        try {
            setRequestedOrientation(m15693P4() ? 1 : 0);
        } catch (Exception unused) {
        }
        ArrayList arrayListM15681D4 = m15681D4();
        this.f12850N0 = arrayListM15681D4;
        AbstractC6118n.m27184b(arrayListM15681D4);
        if (arrayListM15681D4.isEmpty()) {
            finishAndRemoveTask();
            return;
        }
        m15709f5();
        m15705b5();
        AbstractC5166I.m23950b(mo12238b(), this, false, new InterfaceC5367l() { // from class: l1.E1
            @Override // p238e6.InterfaceC5367l
            public final Object invoke(Object obj) {
                return TextExtractionActivity.m15695R4(this.f23915a, (AbstractC5158A) obj);
            }
        }, 2, null);
    }

    @Override // com.anas_mugally.clipboard.p221ui.ads.BaseMyAppAdsActivity, androidx.appcompat.app.AbstractActivityC2242c, androidx.fragment.app.AbstractActivityC2592j, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.f12850N0 = null;
        this.f12852P0 = null;
        this.f12853Q0 = null;
        finishAndRemoveTask();
    }
}
