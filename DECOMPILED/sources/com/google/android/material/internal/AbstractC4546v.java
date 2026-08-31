package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import androidx.core.content.AbstractC2436b;
import com.google.android.material.drawable.AbstractC4498d;
import p111O.AbstractC1030Z;
import p111O.C0982A0;
import p111O.C1034a1;
import p111O.InterfaceC0993G;

/* JADX INFO: renamed from: com.google.android.material.internal.v */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4546v {

    /* JADX INFO: renamed from: com.google.android.material.internal.v$a */
    class a implements InterfaceC0993G {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ c f17381a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ d f17382b;

        a(c cVar, d dVar) {
            this.f17381a = cVar;
            this.f17382b = dVar;
        }

        @Override // p111O.InterfaceC0993G
        /* JADX INFO: renamed from: a */
        public C0982A0 mo4369a(View view, C0982A0 c0982a0) {
            return this.f17381a.mo19682a(view, c0982a0, new d(this.f17382b));
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.internal.v$b */
    class b implements View.OnAttachStateChangeListener {
        b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
            view.requestApplyInsets();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.internal.v$c */
    public interface c {
        /* JADX INFO: renamed from: a */
        C0982A0 mo19682a(View view, C0982A0 c0982a0, d dVar);
    }

    /* JADX INFO: renamed from: b */
    public static void m20827b(View view, c cVar) {
        AbstractC1030Z.m4494t0(view, new a(cVar, new d(view.getPaddingStart(), view.getPaddingTop(), view.getPaddingEnd(), view.getPaddingBottom())));
        m20836k(view);
    }

    /* JADX INFO: renamed from: c */
    public static float m20828c(Context context, int i7) {
        return TypedValue.applyDimension(1, i7, context.getResources().getDisplayMetrics());
    }

    /* JADX INFO: renamed from: d */
    public static Integer m20829d(View view) {
        ColorStateList colorStateListM20435g = AbstractC4498d.m20435g(view.getBackground());
        if (colorStateListM20435g != null) {
            return Integer.valueOf(colorStateListM20435g.getDefaultColor());
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static ViewGroup m20830e(View view) {
        if (view == null) {
            return null;
        }
        View rootView = view.getRootView();
        ViewGroup viewGroup = (ViewGroup) rootView.findViewById(R.id.content);
        if (viewGroup != null) {
            return viewGroup;
        }
        if (rootView == view || !(rootView instanceof ViewGroup)) {
            return null;
        }
        return (ViewGroup) rootView;
    }

    /* JADX INFO: renamed from: f */
    private static InputMethodManager m20831f(View view) {
        return (InputMethodManager) AbstractC2436b.getSystemService(view.getContext(), InputMethodManager.class);
    }

    /* JADX INFO: renamed from: g */
    public static float m20832g(View view) {
        float elevation = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            elevation += ((View) parent).getElevation();
        }
        return elevation;
    }

    /* JADX INFO: renamed from: h */
    public static void m20833h(View view, boolean z7) {
        C1034a1 c1034a1M4437I;
        if (z7 && (c1034a1M4437I = AbstractC1030Z.m4437I(view)) != null) {
            c1034a1M4437I.m4592a(C0982A0.p.m4329b());
            return;
        }
        InputMethodManager inputMethodManagerM20831f = m20831f(view);
        if (inputMethodManagerM20831f != null) {
            inputMethodManagerM20831f.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    /* JADX INFO: renamed from: i */
    public static boolean m20834i(View view) {
        return view.getLayoutDirection() == 1;
    }

    /* JADX INFO: renamed from: j */
    public static PorterDuff.Mode m20835j(int i7, PorterDuff.Mode mode) {
        if (i7 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i7 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i7 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i7) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m20836k(View view) {
        if (view.isAttachedToWindow()) {
            view.requestApplyInsets();
        } else {
            view.addOnAttachStateChangeListener(new b());
        }
    }

    /* JADX INFO: renamed from: l */
    public static void m20837l(final View view, final boolean z7) {
        view.requestFocus();
        view.post(new Runnable() { // from class: com.google.android.material.internal.u
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC4546v.m20838m(view, z7);
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public static void m20838m(View view, boolean z7) {
        C1034a1 c1034a1M4437I;
        if (!z7 || (c1034a1M4437I = AbstractC1030Z.m4437I(view)) == null) {
            m20831f(view).showSoftInput(view, 1);
        } else {
            c1034a1M4437I.m4596e(C0982A0.p.m4329b());
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.internal.v$d */
    public static class d {

        /* JADX INFO: renamed from: a */
        public int f17383a;

        /* JADX INFO: renamed from: b */
        public int f17384b;

        /* JADX INFO: renamed from: c */
        public int f17385c;

        /* JADX INFO: renamed from: d */
        public int f17386d;

        public d(int i7, int i8, int i9, int i10) {
            this.f17383a = i7;
            this.f17384b = i8;
            this.f17385c = i9;
            this.f17386d = i10;
        }

        public d(d dVar) {
            this.f17383a = dVar.f17383a;
            this.f17384b = dVar.f17384b;
            this.f17385c = dVar.f17385c;
            this.f17386d = dVar.f17386d;
        }
    }
}
