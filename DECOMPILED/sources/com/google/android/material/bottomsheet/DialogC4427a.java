package com.google.android.material.bottomsheet;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.appcompat.app.DialogC2255p;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.internal.AbstractC4529e;
import com.google.android.material.internal.AbstractC4546v;
import p029D3.C0191c;
import p069I3.C0622i;
import p111O.AbstractC1030Z;
import p111O.AbstractC1061m0;
import p111O.C0982A0;
import p111O.C1032a;
import p111O.InterfaceC0993G;
import p118P.C1170s;
import p325p3.AbstractC6742c;
import p325p3.AbstractC6746g;
import p325p3.AbstractC6748i;
import p325p3.AbstractC6751l;
import p397y3.AbstractC7539a;

/* JADX INFO: renamed from: com.google.android.material.bottomsheet.a */
/* JADX INFO: loaded from: classes2.dex */
public class DialogC4427a extends DialogC2255p {

    /* JADX INFO: renamed from: A */
    private C0191c f16517A;

    /* JADX INFO: renamed from: B */
    private BottomSheetBehavior.AbstractC4424g f16518B;

    /* JADX INFO: renamed from: f */
    private BottomSheetBehavior f16519f;

    /* JADX INFO: renamed from: r */
    private FrameLayout f16520r;

    /* JADX INFO: renamed from: s */
    private CoordinatorLayout f16521s;

    /* JADX INFO: renamed from: t */
    private FrameLayout f16522t;

    /* JADX INFO: renamed from: u */
    boolean f16523u;

    /* JADX INFO: renamed from: v */
    boolean f16524v;

    /* JADX INFO: renamed from: w */
    private boolean f16525w;

    /* JADX INFO: renamed from: x */
    private boolean f16526x;

    /* JADX INFO: renamed from: y */
    private f f16527y;

    /* JADX INFO: renamed from: z */
    private boolean f16528z;

    /* JADX INFO: renamed from: com.google.android.material.bottomsheet.a$a */
    class a implements InterfaceC0993G {
        a() {
        }

        @Override // p111O.InterfaceC0993G
        /* JADX INFO: renamed from: a */
        public C0982A0 mo4369a(View view, C0982A0 c0982a0) {
            if (DialogC4427a.this.f16527y != null) {
                DialogC4427a.this.f16519f.m19654G0(DialogC4427a.this.f16527y);
            }
            if (c0982a0 != null) {
                DialogC4427a dialogC4427a = DialogC4427a.this;
                dialogC4427a.f16527y = new f(dialogC4427a.f16522t, c0982a0, null);
                DialogC4427a.this.f16527y.m19707e(DialogC4427a.this.getWindow());
                DialogC4427a.this.f16519f.m19671c0(DialogC4427a.this.f16527y);
            }
            return c0982a0;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.bottomsheet.a$b */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DialogC4427a dialogC4427a = DialogC4427a.this;
            if (dialogC4427a.f16524v && dialogC4427a.isShowing() && DialogC4427a.this.m19705u()) {
                DialogC4427a.this.cancel();
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.bottomsheet.a$c */
    class c extends C1032a {
        c() {
        }

        @Override // p111O.C1032a
        /* JADX INFO: renamed from: g */
        public void mo4585g(View view, C1170s c1170s) {
            super.mo4585g(view, c1170s);
            if (!DialogC4427a.this.f16524v) {
                c1170s.m5077r0(false);
            } else {
                c1170s.m5051a(1048576);
                c1170s.m5077r0(true);
            }
        }

        @Override // p111O.C1032a
        /* JADX INFO: renamed from: j */
        public boolean mo4588j(View view, int i7, Bundle bundle) {
            if (i7 == 1048576) {
                DialogC4427a dialogC4427a = DialogC4427a.this;
                if (dialogC4427a.f16524v) {
                    dialogC4427a.cancel();
                    return true;
                }
            }
            return super.mo4588j(view, i7, bundle);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.bottomsheet.a$d */
    class d implements View.OnTouchListener {
        d() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.bottomsheet.a$e */
    class e extends BottomSheetBehavior.AbstractC4424g {
        e() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC4424g
        /* JADX INFO: renamed from: b */
        public void mo19685b(View view, float f7) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC4424g
        /* JADX INFO: renamed from: c */
        public void mo19686c(View view, int i7) {
            if (i7 == 5) {
                DialogC4427a.this.cancel();
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.bottomsheet.a$f */
    private static class f extends BottomSheetBehavior.AbstractC4424g {

        /* JADX INFO: renamed from: a */
        private final Boolean f16534a;

        /* JADX INFO: renamed from: b */
        private final C0982A0 f16535b;

        /* JADX INFO: renamed from: c */
        private Window f16536c;

        /* JADX INFO: renamed from: d */
        private boolean f16537d;

        /* synthetic */ f(View view, C0982A0 c0982a0, a aVar) {
            this(view, c0982a0);
        }

        /* JADX INFO: renamed from: d */
        private void m19706d(View view) {
            if (view.getTop() < this.f16535b.m4278l()) {
                Window window = this.f16536c;
                if (window != null) {
                    Boolean bool = this.f16534a;
                    AbstractC4529e.m20702f(window, bool == null ? this.f16537d : bool.booleanValue());
                }
                view.setPadding(view.getPaddingLeft(), this.f16535b.m4278l() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
                return;
            }
            if (view.getTop() != 0) {
                Window window2 = this.f16536c;
                if (window2 != null) {
                    AbstractC4529e.m20702f(window2, this.f16537d);
                }
                view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC4424g
        /* JADX INFO: renamed from: a */
        void mo19684a(View view) {
            m19706d(view);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC4424g
        /* JADX INFO: renamed from: b */
        public void mo19685b(View view, float f7) {
            m19706d(view);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC4424g
        /* JADX INFO: renamed from: c */
        public void mo19686c(View view, int i7) {
            m19706d(view);
        }

        /* JADX INFO: renamed from: e */
        void m19707e(Window window) {
            if (this.f16536c == window) {
                return;
            }
            this.f16536c = window;
            if (window != null) {
                this.f16537d = AbstractC1061m0.m4702a(window, window.getDecorView()).m4593b();
            }
        }

        private f(View view, C0982A0 c0982a0) {
            this.f16535b = c0982a0;
            C0622i c0622iM19679t0 = BottomSheetBehavior.m19645q0(view).m19679t0();
            ColorStateList colorStateListM2697D = c0622iM19679t0 != null ? c0622iM19679t0.m2697D() : view.getBackgroundTintList();
            if (colorStateListM2697D != null) {
                this.f16534a = Boolean.valueOf(AbstractC7539a.m33177h(colorStateListM2697D.getDefaultColor()));
                return;
            }
            Integer numM20829d = AbstractC4546v.m20829d(view);
            if (numM20829d != null) {
                this.f16534a = Boolean.valueOf(AbstractC7539a.m33177h(numM20829d.intValue()));
            } else {
                this.f16534a = null;
            }
        }
    }

    public DialogC4427a(Context context, int i7) {
        super(context, m19693g(context, i7));
        this.f16524v = true;
        this.f16525w = true;
        this.f16518B = new e();
        m9287j(1);
        m19699s();
    }

    /* JADX INFO: renamed from: g */
    private static int m19693g(Context context, int i7) {
        if (i7 != 0) {
            return i7;
        }
        TypedValue typedValue = new TypedValue();
        return context.getTheme().resolveAttribute(AbstractC6742c.f26246c, typedValue, true) ? typedValue.resourceId : AbstractC6751l.f26541f;
    }

    /* JADX INFO: renamed from: p */
    private FrameLayout m19698p() {
        if (this.f16520r == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), AbstractC6748i.f26452a, null);
            this.f16520r = frameLayout;
            this.f16521s = (CoordinatorLayout) frameLayout.findViewById(AbstractC6746g.f26422e);
            FrameLayout frameLayout2 = (FrameLayout) this.f16520r.findViewById(AbstractC6746g.f26423f);
            this.f16522t = frameLayout2;
            BottomSheetBehavior bottomSheetBehaviorM19645q0 = BottomSheetBehavior.m19645q0(frameLayout2);
            this.f16519f = bottomSheetBehaviorM19645q0;
            bottomSheetBehaviorM19645q0.m19671c0(this.f16518B);
            this.f16519f.m19661R0(this.f16524v);
            this.f16517A = new C0191c(this.f16519f, this.f16522t);
        }
        return this.f16520r;
    }

    /* JADX INFO: renamed from: s */
    private void m19699s() {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(new int[]{AbstractC6742c.f26272p});
        this.f16528z = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: v */
    private void m19700v() {
        C0191c c0191c = this.f16517A;
        if (c0191c == null) {
            return;
        }
        if (this.f16524v) {
            c0191c.m951c();
        } else {
            c0191c.m953f();
        }
    }

    /* JADX INFO: renamed from: w */
    private View m19701w(int i7, View view, ViewGroup.LayoutParams layoutParams) {
        m19698p();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f16520r.findViewById(AbstractC6746g.f26422e);
        if (i7 != 0 && view == null) {
            view = getLayoutInflater().inflate(i7, (ViewGroup) coordinatorLayout, false);
        }
        if (this.f16528z) {
            AbstractC1030Z.m4494t0(this.f16520r, new a());
        }
        this.f16522t.removeAllViews();
        if (layoutParams == null) {
            this.f16522t.addView(view);
        } else {
            this.f16522t.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(AbstractC6746g.f26416X).setOnClickListener(new b());
        AbstractC1030Z.m4474j0(this.f16522t, new c());
        this.f16522t.setOnTouchListener(new d());
        return this.f16520r;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        BottomSheetBehavior bottomSheetBehaviorM19702q = m19702q();
        if (!this.f16523u || bottomSheetBehaviorM19702q.m19680u0() == 5) {
            super.cancel();
        } else {
            bottomSheetBehaviorM19702q.m19669Z0(5);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            boolean z7 = this.f16528z && Color.alpha(window.getNavigationBarColor()) < 255;
            FrameLayout frameLayout = this.f16520r;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z7);
            }
            CoordinatorLayout coordinatorLayout = this.f16521s;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z7);
            }
            AbstractC1061m0.m4703b(window, !z7);
            f fVar = this.f16527y;
            if (fVar != null) {
                fVar.m19707e(window);
            }
        }
        m19700v();
    }

    @Override // androidx.appcompat.app.DialogC2255p, p223d.DialogC5193w, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        f fVar = this.f16527y;
        if (fVar != null) {
            fVar.m19707e(null);
        }
        C0191c c0191c = this.f16517A;
        if (c0191c != null) {
            c0191c.m953f();
        }
    }

    @Override // p223d.DialogC5193w, android.app.Dialog
    protected void onStart() {
        super.onStart();
        BottomSheetBehavior bottomSheetBehavior = this.f16519f;
        if (bottomSheetBehavior == null || bottomSheetBehavior.m19680u0() != 5) {
            return;
        }
        this.f16519f.m19669Z0(4);
    }

    /* JADX INFO: renamed from: q */
    public BottomSheetBehavior m19702q() {
        if (this.f16519f == null) {
            m19698p();
        }
        return this.f16519f;
    }

    /* JADX INFO: renamed from: r */
    public boolean m19703r() {
        return this.f16523u;
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z7) {
        super.setCancelable(z7);
        if (this.f16524v != z7) {
            this.f16524v = z7;
            BottomSheetBehavior bottomSheetBehavior = this.f16519f;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.m19661R0(z7);
            }
            if (getWindow() != null) {
                m19700v();
            }
        }
    }

    @Override // android.app.Dialog
    public void setCanceledOnTouchOutside(boolean z7) {
        super.setCanceledOnTouchOutside(z7);
        if (z7 && !this.f16524v) {
            this.f16524v = true;
        }
        this.f16525w = z7;
        this.f16526x = true;
    }

    @Override // androidx.appcompat.app.DialogC2255p, p223d.DialogC5193w, android.app.Dialog
    public void setContentView(int i7) {
        super.setContentView(m19701w(i7, null, null));
    }

    /* JADX INFO: renamed from: t */
    void m19704t() {
        this.f16519f.m19654G0(this.f16518B);
    }

    /* JADX INFO: renamed from: u */
    boolean m19705u() {
        if (!this.f16526x) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{R.attr.windowCloseOnTouchOutside});
            this.f16525w = typedArrayObtainStyledAttributes.getBoolean(0, true);
            typedArrayObtainStyledAttributes.recycle();
            this.f16526x = true;
        }
        return this.f16525w;
    }

    @Override // androidx.appcompat.app.DialogC2255p, p223d.DialogC5193w, android.app.Dialog
    public void setContentView(View view) {
        super.setContentView(m19701w(0, view, null));
    }

    @Override // androidx.appcompat.app.DialogC2255p, p223d.DialogC5193w, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(m19701w(0, view, layoutParams));
    }
}
