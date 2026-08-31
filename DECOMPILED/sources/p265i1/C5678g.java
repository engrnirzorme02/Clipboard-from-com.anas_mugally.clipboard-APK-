package p265i1;

import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.Toast;
import com.anas_mugally.clipboard.C3034A;
import com.anas_mugally.clipboard.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC6118n;
import p152T5.AbstractC1638q;
import p238e6.InterfaceC5367l;

/* JADX INFO: renamed from: i1.g */
/* JADX INFO: loaded from: classes.dex */
public final class C5678g {

    /* JADX INFO: renamed from: a */
    private final Context f21679a;

    /* JADX INFO: renamed from: b */
    private final WindowManager f21680b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC5367l f21681c;

    /* JADX INFO: renamed from: d */
    private boolean f21682d;

    /* JADX INFO: renamed from: e */
    private View f21683e;

    /* JADX INFO: renamed from: f */
    private final List f21684f;

    /* JADX INFO: renamed from: g */
    private final Handler f21685g;

    /* JADX INFO: renamed from: h */
    private boolean f21686h;

    /* JADX INFO: renamed from: i */
    private View f21687i;

    public C5678g(Context context, WindowManager windowManager, InterfaceC5367l onBubbleClick) {
        AbstractC6118n.m27187e(context, "context");
        AbstractC6118n.m27187e(windowManager, "windowManager");
        AbstractC6118n.m27187e(onBubbleClick, "onBubbleClick");
        this.f21679a = context;
        this.f21680b = windowManager;
        this.f21681c = onBubbleClick;
        this.f21684f = new ArrayList();
        this.f21685g = new Handler(Looper.getMainLooper());
    }

    /* JADX INFO: renamed from: g */
    private final void m25201g(final View view) {
        view.animate().scaleX(1.5f).scaleY(1.5f).alpha(0.0f).setDuration(150L).setInterpolator(new AccelerateInterpolator()).withEndAction(new Runnable() { // from class: i1.f
            @Override // java.lang.Runnable
            public final void run() {
                C5678g.m25202h(this.f21677a, view);
            }
        }).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final void m25202h(C5678g c5678g, View view) {
        c5678g.f21681c.invoke(Integer.valueOf(view.getId()));
        c5678g.m25214n();
    }

    /* JADX INFO: renamed from: j */
    private final void m25203j() {
        if (this.f21683e == null || this.f21682d != C3034A.f12453a.m15018E(this.f21679a)) {
            this.f21683e = LayoutInflater.from(this.f21679a).inflate(R.layout.bubble_actions_menu, (ViewGroup) null, false);
            this.f21682d = C3034A.f12453a.m15018E(this.f21679a);
            View view = this.f21683e;
            AbstractC6118n.m27184b(view);
            m25209r(view);
            View view2 = this.f21683e;
            if (view2 != null) {
                view2.setFocusableInTouchMode(true);
                view2.requestFocus();
                view2.setOnClickListener(new View.OnClickListener() { // from class: i1.b
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        C5678g.m25204k(this.f21673a, view3);
                    }
                });
                view2.setOnKeyListener(new View.OnKeyListener() { // from class: i1.c
                    @Override // android.view.View.OnKeyListener
                    public final boolean onKey(View view3, int i7, KeyEvent keyEvent) {
                        return C5678g.m25205l(this.f21674a, view3, i7, keyEvent);
                    }
                });
            }
        }
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-1, -1, C3034A.m15013z(C3034A.f12453a, false, 1, null), 770, -3);
        layoutParams.gravity = 8388659;
        layoutParams.dimAmount = 0.7f;
        try {
            this.f21680b.addView(this.f21683e, layoutParams);
            m25212v();
            this.f21686h = true;
        } catch (Exception unused) {
            Context context = this.f21679a;
            Toast.makeText(context, context.getString(R.string.failed_to_show_quick_access_buttons), 0).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final void m25204k(C5678g c5678g, View view) {
        c5678g.m25214n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final boolean m25205l(C5678g c5678g, View view, int i7, KeyEvent keyEvent) {
        c5678g.m25214n();
        return true;
    }

    /* JADX INFO: renamed from: m */
    private final void m25206m(View view, boolean z7) {
        this.f21687i = z7 ? view : null;
        view.animate().scaleX(z7 ? 1.1f : 1.0f).scaleY(z7 ? 1.1f : 1.0f).setDuration(150L).setInterpolator(new OvershootInterpolator()).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final void m25207o(C5678g c5678g) {
        View view = c5678g.f21683e;
        if (view != null) {
            c5678g.m25208q(view);
        }
    }

    /* JADX INFO: renamed from: q */
    private final void m25208q(View view) {
        try {
            this.f21680b.removeView(view);
            this.f21686h = false;
            this.f21687i = null;
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: r */
    private final void m25209r(View view) {
        Iterator it = AbstractC1638q.m6767l(Integer.valueOf(R.id.search), Integer.valueOf(R.id.add_text), Integer.valueOf(R.id.brows_notes), Integer.valueOf(R.id.temporary_texts), Integer.valueOf(R.id.ai), Integer.valueOf(R.id.screen_scanner), Integer.valueOf(R.id.scroll_scanner), Integer.valueOf(R.id.bubble_setting), Integer.valueOf(R.id.settings), Integer.valueOf(R.id.pro_setting)).iterator();
        while (it.hasNext()) {
            View viewFindViewById = view.findViewById(((Number) it.next()).intValue());
            viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: i1.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C5678g.m25210s(this.f21676a, view2);
                }
            });
            List list = this.f21684f;
            AbstractC6118n.m27184b(viewFindViewById);
            list.add(viewFindViewById);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final void m25210s(C5678g c5678g, View view) {
        for (View view2 : c5678g.f21684f) {
            if (!AbstractC6118n.m27183a(view2, view)) {
                view2.setVisibility(4);
            }
        }
        AbstractC6118n.m27184b(view);
        c5678g.m25201g(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final void m25211u(C5678g c5678g) {
        c5678g.m25203j();
    }

    /* JADX INFO: renamed from: v */
    private final void m25212v() {
        for (View view : this.f21684f) {
            view.setAlpha(0.0f);
            view.setScaleX(0.5f);
            view.setScaleY(0.5f);
            view.setVisibility(0);
        }
        Iterator it = this.f21684f.iterator();
        while (it.hasNext()) {
            ((View) it.next()).animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(200L).setInterpolator(new OvershootInterpolator()).start();
        }
    }

    /* JADX INFO: renamed from: i */
    public final View m25213i(float f7, float f8) {
        if (!this.f21686h) {
            return null;
        }
        for (View view : this.f21684f) {
            Rect rect = new Rect();
            view.getGlobalVisibleRect(rect);
            if (rect.contains((int) f7, (int) f8)) {
                if (!AbstractC6118n.m27183a(this.f21687i, view)) {
                    View view2 = this.f21687i;
                    if (view2 != null) {
                        m25206m(view2, false);
                    }
                    m25206m(view, true);
                }
                return view;
            }
        }
        View view3 = this.f21687i;
        if (view3 != null) {
            m25206m(view3, false);
            this.f21687i = null;
        }
        return null;
    }

    /* JADX INFO: renamed from: n */
    public final void m25214n() {
        if (this.f21686h) {
            this.f21685g.post(new Runnable() { // from class: i1.d
                @Override // java.lang.Runnable
                public final void run() {
                    C5678g.m25207o(this.f21675a);
                }
            });
        }
    }

    /* JADX INFO: renamed from: p */
    public final boolean m25215p() {
        return this.f21686h;
    }

    /* JADX INFO: renamed from: t */
    public final void m25216t() {
        if (this.f21686h) {
            return;
        }
        this.f21685g.post(new Runnable() { // from class: i1.a
            @Override // java.lang.Runnable
            public final void run() {
                C5678g.m25211u(this.f21672a);
            }
        });
    }
}
