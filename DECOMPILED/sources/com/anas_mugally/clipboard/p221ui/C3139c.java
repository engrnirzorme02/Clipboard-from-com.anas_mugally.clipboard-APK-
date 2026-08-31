package com.anas_mugally.clipboard.p221ui;

import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.OverScroller;
import android.widget.TextView;
import android.widget.Toast;
import com.anas_mugally.clipboard.AbstractC3081u;
import com.anas_mugally.clipboard.ActionsLayout;
import com.anas_mugally.clipboard.C3034A;
import com.anas_mugally.clipboard.MyApplication;
import com.anas_mugally.clipboard.R;
import com.anas_mugally.clipboard.database.AppDatabase;
import com.anas_mugally.clipboard.p221ui.C3139c;
import com.google.android.gms.internal.ads.zzbbn;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import kotlin.jvm.internal.C6129y;
import kotlin.jvm.internal.C6130z;
import p000.C5446g;
import p145S5.AbstractC1430h;
import p145S5.C1444v;
import p145S5.InterfaceC1429g;
import p238e6.InterfaceC5356a;
import p238e6.InterfaceC5371p;
import p281k1.C5920K;
import p371v1.C7213n;

/* JADX INFO: renamed from: com.anas_mugally.clipboard.ui.c */
/* JADX INFO: loaded from: classes.dex */
public final class C3139c {

    /* JADX INFO: renamed from: o */
    public static final a f13112o = new a(null);

    /* JADX INFO: renamed from: p */
    private static volatile C3139c f13113p;

    /* JADX INFO: renamed from: a */
    private final Context f13114a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC1429g f13115b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC1429g f13116c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC1429g f13117d;

    /* JADX INFO: renamed from: e */
    private final InterfaceC1429g f13118e;

    /* JADX INFO: renamed from: f */
    private View f13119f;

    /* JADX INFO: renamed from: g */
    private WindowManager f13120g;

    /* JADX INFO: renamed from: h */
    private boolean f13121h;

    /* JADX INFO: renamed from: i */
    private final SharedPreferences f13122i;

    /* JADX INFO: renamed from: j */
    private final InterfaceC1429g f13123j;

    /* JADX INFO: renamed from: k */
    private VelocityTracker f13124k;

    /* JADX INFO: renamed from: l */
    private final Handler f13125l;

    /* JADX INFO: renamed from: m */
    private final b f13126m;

    /* JADX INFO: renamed from: n */
    private final InterfaceC1429g f13127n;

    /* JADX INFO: renamed from: com.anas_mugally.clipboard.ui.c$a */
    public static final class a {
        public /* synthetic */ a(AbstractC6112h abstractC6112h) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C3139c m16456a(Context context) {
            C3139c c3139c;
            AbstractC6118n.m27187e(context, "context");
            C3139c c3139c2 = C3139c.f13113p;
            if (c3139c2 != null) {
                return c3139c2;
            }
            synchronized (this) {
                c3139c = C3139c.f13113p;
                if (c3139c == null) {
                    Context applicationContext = context.getApplicationContext();
                    AbstractC6118n.m27186d(applicationContext, "getApplicationContext(...)");
                    c3139c = new C3139c(applicationContext, null);
                    C3139c.f13113p = c3139c;
                }
            }
            return c3139c;
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: com.anas_mugally.clipboard.ui.c$b */
    public static final class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            WindowManager.LayoutParams layoutParams;
            if (C3139c.this.f13119f == null || C3139c.this.f13120g == null) {
                return;
            }
            if (!C3139c.this.m16453z().computeScrollOffset()) {
                View view = C3139c.this.f13119f;
                ViewGroup.LayoutParams layoutParams2 = view != null ? view.getLayoutParams() : null;
                layoutParams = layoutParams2 instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams2 : null;
                if (layoutParams != null) {
                    C3139c.this.m16413F(layoutParams);
                    return;
                }
                return;
            }
            View view2 = C3139c.this.f13119f;
            ViewGroup.LayoutParams layoutParams3 = view2 != null ? view2.getLayoutParams() : null;
            layoutParams = layoutParams3 instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams3 : null;
            if (layoutParams == null) {
                return;
            }
            layoutParams.x = C3139c.this.m16453z().getCurrX();
            layoutParams.y = C3139c.this.m16453z().getCurrY();
            try {
                WindowManager windowManager = C3139c.this.f13120g;
                if (windowManager != null) {
                    windowManager.updateViewLayout(C3139c.this.f13119f, layoutParams);
                }
            } catch (Exception e7) {
                Log.e("FloatingTextOverlay", "Error updating view layout during fling", e7);
            }
            C3139c.this.f13125l.post(this);
        }
    }

    /* JADX INFO: renamed from: com.anas_mugally.clipboard.ui.c$c */
    public static final class c implements C7213n.a {
        c() {
        }

        @Override // p371v1.C7213n.a
        /* JADX INFO: renamed from: a */
        public void mo15502a(String error) {
            AbstractC6118n.m27187e(error, "error");
            Toast.makeText(C3139c.this.f13114a, error, 0).show();
        }

        @Override // p371v1.C7213n.a
        /* JADX INFO: renamed from: b */
        public void mo15503b(String categoryName) {
            AbstractC6118n.m27187e(categoryName, "categoryName");
            Toast.makeText(C3139c.this.f13114a, C3139c.this.f13114a.getString(R.string.done_add_to_clipboard, categoryName), 0).show();
            C3139c.this.m16454C();
        }
    }

    public /* synthetic */ C3139c(Context context, AbstractC6112h abstractC6112h) {
        this(context);
    }

    /* JADX INFO: renamed from: A */
    private final int m16409A() {
        return ((Number) this.f13127n.getValue()).intValue();
    }

    /* JADX INFO: renamed from: B */
    private final void m16410B(int i7, String str) {
        Map<Integer, ImageButton> itemViewMap;
        ImageButton imageButton;
        Context context;
        View view = this.f13119f;
        ActionsLayout actionsLayout = view != null ? (ActionsLayout) view.findViewById(R.id.floating_actions_layout) : null;
        if (actionsLayout == null || (itemViewMap = actionsLayout.getItemViewMap()) == null || (imageButton = itemViewMap.get(Integer.valueOf(i7))) == null || (context = actionsLayout.getContext()) == null) {
            return;
        }
        new C7213n(context, AppDatabase.f12597p.m15148b(this.f13114a)).m31850m(imageButton, str, new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final int m16411D(C3139c c3139c) {
        return (int) (((double) c3139c.m16451x()) * 0.9d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final int m16412E(C3139c c3139c) {
        return (int) (((double) c3139c.m16452y()) * 0.95d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public final void m16413F(WindowManager.LayoutParams layoutParams) {
        SharedPreferences.Editor editorEdit = this.f13122i.edit();
        editorEdit.putInt("overlay_width", layoutParams.width);
        editorEdit.putInt("overlay_height", layoutParams.height);
        editorEdit.putInt("overlay_x", layoutParams.x);
        editorEdit.putInt("overlay_y", layoutParams.y);
        editorEdit.apply();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final int m16414G(C3139c c3139c) {
        return c3139c.f13114a.getResources().getDisplayMetrics().heightPixels;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final int m16415H(C3139c c3139c) {
        return c3139c.f13114a.getResources().getDisplayMetrics().widthPixels;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final OverScroller m16416I(C3139c c3139c) {
        return new OverScroller(c3139c.f13114a);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:11:0x0026  */
    /* JADX INFO: renamed from: J */
    private final void m16417J() {
        View view = this.f13119f;
        ActionsLayout actionsLayout = view != null ? (ActionsLayout) view.findViewById(R.id.floating_actions_layout) : null;
        if (Build.VERSION.SDK_INT >= 28) {
            MyApplication myApplicationM15105a = MyApplication.f12496a.m15105a();
            AbstractC6118n.m27184b(myApplicationM15105a);
            if (!AbstractC3081u.m15315b(myApplicationM15105a)) {
                if (actionsLayout != null) {
                    actionsLayout.removeItem(R.id.send_text);
                }
            }
        } else if (actionsLayout != null) {
            actionsLayout.removeItem(R.id.send_text);
        }
        if (actionsLayout != null) {
            actionsLayout.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: l1.O
                @Override // android.view.MenuItem.OnMenuItemClickListener
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    return C3139c.m16418K(this.f23954a, menuItem);
                }
            });
        }
        if (actionsLayout != null) {
            actionsLayout.setOnMoreAppsItemClickListener(new InterfaceC5371p() { // from class: l1.P
                @Override // p238e6.InterfaceC5371p
                public final Object invoke(Object obj, Object obj2) {
                    return C3139c.m16419L(this.f23957a, (ComponentName) obj, (ActionsLayout.EnumC3037c) obj2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final boolean m16418K(C3139c c3139c, MenuItem menuItem) {
        AbstractC6118n.m27187e(menuItem, "menuItem");
        if (menuItem.getItemId() == R.id.save) {
            c3139c.m16410B(menuItem.getItemId(), c3139c.m16448u());
            return true;
        }
        new C5920K(c3139c.f13114a, c3139c.m16448u(), false).m26716i(menuItem.getItemId());
        c3139c.m16454C();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C1444v m16419L(C3139c c3139c, ComponentName componentName, ActionsLayout.EnumC3037c type) {
        AbstractC6118n.m27187e(type, "type");
        C5446g.m24648f(C5446g.f20735a, c3139c.f13114a, c3139c.m16448u(), componentName, type, 0, 8, null);
        c3139c.m16454C();
        return C1444v.f4971a;
    }

    /* JADX INFO: renamed from: M */
    private final void m16420M() {
        View view = this.f13119f;
        ImageButton imageButton = view != null ? (ImageButton) view.findViewById(R.id.btn_close) : null;
        if (imageButton != null) {
            imageButton.setOnClickListener(new View.OnClickListener() { // from class: l1.Q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C3139c.m16421N(this.f23960a, view2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final void m16421N(C3139c c3139c, View view) {
        c3139c.m16454C();
    }

    /* JADX INFO: renamed from: O */
    private final void m16422O(WindowManager.LayoutParams layoutParams) {
        final C3139c c3139c;
        final WindowManager.LayoutParams layoutParams2;
        View view = this.f13119f;
        LinearLayout linearLayout = view != null ? (LinearLayout) view.findViewById(R.id.header_layout) : null;
        final C6130z c6130z = new C6130z();
        final C6130z c6130z2 = new C6130z();
        final C6129y c6129y = new C6129y();
        final C6129y c6129y2 = new C6129y();
        if (linearLayout != null) {
            c3139c = this;
            layoutParams2 = layoutParams;
            linearLayout.setOnTouchListener(new View.OnTouchListener() { // from class: l1.S
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    return C3139c.m16423P(this.f23967a, c6130z, layoutParams2, c6130z2, c6129y, c6129y2, view2, motionEvent);
                }
            });
        } else {
            c3139c = this;
            layoutParams2 = layoutParams;
        }
        View view2 = c3139c.f13119f;
        View viewFindViewById = view2 != null ? view2.findViewById(R.id.resize_handle_bottom_right) : null;
        AbstractC6118n.m27184b(viewFindViewById);
        m16424Q(viewFindViewById, layoutParams2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final boolean m16423P(C3139c c3139c, C6130z c6130z, WindowManager.LayoutParams layoutParams, C6130z c6130z2, C6129y c6129y, C6129y c6129y2, View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            c3139c.m16453z().forceFinished(true);
            c3139c.f13125l.removeCallbacks(c3139c.f13126m);
            VelocityTracker velocityTrackerObtain = VelocityTracker.obtain();
            c3139c.f13124k = velocityTrackerObtain;
            if (velocityTrackerObtain != null) {
                velocityTrackerObtain.addMovement(motionEvent);
            }
            c6130z.f23887a = layoutParams.x;
            c6130z2.f23887a = layoutParams.y;
            c6129y.f23886a = motionEvent.getRawX();
            c6129y2.f23886a = motionEvent.getRawY();
            return true;
        }
        if (action != 1) {
            if (action != 2) {
                if (action != 3) {
                    return false;
                }
                VelocityTracker velocityTracker = c3139c.f13124k;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                }
                c3139c.f13124k = null;
                return true;
            }
            VelocityTracker velocityTracker2 = c3139c.f13124k;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            layoutParams.x = c6130z.f23887a + ((int) (motionEvent.getRawX() - c6129y.f23886a));
            layoutParams.y = c6130z2.f23887a + ((int) (motionEvent.getRawY() - c6129y2.f23886a));
            WindowManager windowManager = c3139c.f13120g;
            if (windowManager != null) {
                windowManager.updateViewLayout(c3139c.f13119f, layoutParams);
            }
            return true;
        }
        VelocityTracker velocityTracker3 = c3139c.f13124k;
        if (velocityTracker3 != null) {
            velocityTracker3.addMovement(motionEvent);
        }
        VelocityTracker velocityTracker4 = c3139c.f13124k;
        if (velocityTracker4 != null) {
            velocityTracker4.computeCurrentVelocity(zzbbn.zzq.zzf);
        }
        VelocityTracker velocityTracker5 = c3139c.f13124k;
        int xVelocity = velocityTracker5 != null ? (int) velocityTracker5.getXVelocity() : 0;
        VelocityTracker velocityTracker6 = c3139c.f13124k;
        int yVelocity = velocityTracker6 != null ? (int) velocityTracker6.getYVelocity() : 0;
        if (Math.abs(xVelocity) > ViewConfiguration.get(c3139c.f13114a).getScaledMinimumFlingVelocity() || Math.abs(yVelocity) > ViewConfiguration.get(c3139c.f13114a).getScaledMinimumFlingVelocity()) {
            DisplayMetrics displayMetrics = c3139c.f13114a.getResources().getDisplayMetrics();
            int i7 = displayMetrics.widthPixels;
            int i8 = displayMetrics.heightPixels;
            int i9 = layoutParams.width;
            int i10 = (-(i7 - i9)) / 2;
            int i11 = (i7 - i9) / 2;
            int i12 = layoutParams.height;
            c3139c.m16453z().fling(layoutParams.x, layoutParams.y, xVelocity, yVelocity, i10, i11, (-(i8 - i12)) / 2, (i8 - i12) / 2);
            c3139c.f13125l.post(c3139c.f13126m);
        }
        VelocityTracker velocityTracker7 = c3139c.f13124k;
        if (velocityTracker7 != null) {
            velocityTracker7.recycle();
        }
        c3139c.f13124k = null;
        c3139c.m16413F(layoutParams);
        return true;
    }

    /* JADX INFO: renamed from: Q */
    private final void m16424Q(View view, final WindowManager.LayoutParams layoutParams) {
        final C6130z c6130z = new C6130z();
        final C6130z c6130z2 = new C6130z();
        final C6130z c6130z3 = new C6130z();
        final C6130z c6130z4 = new C6130z();
        final C6129y c6129y = new C6129y();
        final C6129y c6129y2 = new C6129y();
        final boolean z7 = this.f13114a.getResources().getConfiguration().getLayoutDirection() == 1;
        view.setOnTouchListener(new View.OnTouchListener() { // from class: l1.I
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                return C3139c.m16425R(c6130z, layoutParams, c6130z2, c6130z3, c6130z4, c6129y, c6129y2, z7, this, view2, motionEvent);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final boolean m16425R(C6130z c6130z, WindowManager.LayoutParams layoutParams, C6130z c6130z2, C6130z c6130z3, C6130z c6130z4, C6129y c6129y, C6129y c6129y2, boolean z7, C3139c c3139c, View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            c6130z.f23887a = layoutParams.width;
            c6130z2.f23887a = layoutParams.height;
            c6130z3.f23887a = layoutParams.x;
            c6130z4.f23887a = layoutParams.y;
            c6129y.f23886a = motionEvent.getRawX();
            c6129y2.f23886a = motionEvent.getRawY();
            return true;
        }
        if (action == 1) {
            c3139c.m16413F(layoutParams);
            return true;
        }
        if (action != 2) {
            return false;
        }
        int rawX = (int) (motionEvent.getRawX() - c6129y.f23886a);
        int rawY = (int) (motionEvent.getRawY() - c6129y2.f23886a);
        if (z7) {
            rawX = -rawX;
        }
        int i7 = c6130z.f23887a + rawX;
        layoutParams.width = i7;
        layoutParams.x = c6130z3.f23887a + (rawX / 2);
        int i8 = c6130z2.f23887a + rawY;
        layoutParams.height = i8;
        layoutParams.y = c6130z4.f23887a + (rawY / 2);
        if (i7 < 300) {
            layoutParams.width = 300;
        }
        if (i8 < 400) {
            layoutParams.height = 400;
        }
        WindowManager windowManager = c3139c.f13120g;
        if (windowManager != null) {
            windowManager.updateViewLayout(c3139c.f13119f, layoutParams);
        }
        return true;
    }

    /* JADX INFO: renamed from: S */
    private final void m16426S(String str) {
        View view = this.f13119f;
        TextView textView = view != null ? (TextView) view.findViewById(R.id.floating_text_content) : null;
        if (textView != null) {
            textView.setText(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final int m16427U() {
        return C3034A.f12453a.m15050y(false);
    }

    /* JADX INFO: renamed from: t */
    private final WindowManager.LayoutParams m16447t() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, m16409A(), 8, -3);
        layoutParams.gravity = 17;
        int iM16450w = this.f13122i.getInt("overlay_width", 800);
        int iM16449v = this.f13122i.getInt("overlay_height", zzbbn.zzq.zzf);
        if (iM16450w > m16450w()) {
            iM16450w = m16450w();
        }
        if (iM16450w < 300) {
            iM16450w = 300;
        }
        if (iM16449v > m16449v()) {
            iM16449v = m16449v();
        }
        if (iM16449v < 400) {
            iM16449v = 400;
        }
        layoutParams.width = iM16450w;
        layoutParams.height = iM16449v;
        layoutParams.x = this.f13122i.getInt("overlay_x", 0);
        layoutParams.y = this.f13122i.getInt("overlay_y", 0);
        return layoutParams;
    }

    /* JADX INFO: renamed from: u */
    private final String m16448u() {
        try {
            View view = this.f13119f;
            TextView textView = view != null ? (TextView) view.findViewById(R.id.floating_text_content) : null;
            AbstractC6118n.m27184b(textView);
            if (!textView.hasSelection()) {
                return textView.getText().toString();
            }
            String strSubstring = textView.getText().toString().substring(textView.getSelectionStart(), textView.getSelectionEnd());
            AbstractC6118n.m27186d(strSubstring, "substring(...)");
            return strSubstring;
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: v */
    private final int m16449v() {
        return ((Number) this.f13118e.getValue()).intValue();
    }

    /* JADX INFO: renamed from: w */
    private final int m16450w() {
        return ((Number) this.f13117d.getValue()).intValue();
    }

    /* JADX INFO: renamed from: x */
    private final int m16451x() {
        return ((Number) this.f13116c.getValue()).intValue();
    }

    /* JADX INFO: renamed from: y */
    private final int m16452y() {
        return ((Number) this.f13115b.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public final OverScroller m16453z() {
        return (OverScroller) this.f13123j.getValue();
    }

    /* JADX INFO: renamed from: C */
    public final void m16454C() {
        WindowManager windowManager;
        try {
            View view = this.f13119f;
            if (view == null || (windowManager = this.f13120g) == null) {
                return;
            }
            if (windowManager != null) {
                windowManager.removeView(view);
            }
            this.f13119f = null;
            this.f13121h = false;
        } catch (Exception e7) {
            Log.e("FloatingTextOverlay", "Error removing floating overlay", e7);
        }
    }

    /* JADX INFO: renamed from: T */
    public final void m16455T(String text) {
        AbstractC6118n.m27187e(text, "text");
        if (this.f13121h) {
            m16426S(text);
            return;
        }
        try {
            Object systemService = this.f13114a.getSystemService("window");
            AbstractC6118n.m27185c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            this.f13120g = (WindowManager) systemService;
            this.f13119f = LayoutInflater.from(new ContextThemeWrapper(this.f13114a, R.style.Theme_ClipboardTextSaved)).inflate(R.layout.floating_text_overlay, (ViewGroup) null);
            WindowManager.LayoutParams layoutParamsM16447t = m16447t();
            m16426S(text);
            m16420M();
            m16417J();
            m16422O(layoutParamsM16447t);
            WindowManager windowManager = this.f13120g;
            if (windowManager != null) {
                windowManager.addView(this.f13119f, layoutParamsM16447t);
            }
            this.f13121h = true;
        } catch (Exception e7) {
            Log.e("FloatingTextOverlay", "Error showing floating overlay", e7);
            Toast.makeText(this.f13114a, R.string.please_enbale_show_over_app, 0).show();
        }
    }

    private C3139c(Context context) {
        this.f13114a = context;
        this.f13115b = AbstractC1430h.m6066b(new InterfaceC5356a() { // from class: l1.H
            @Override // p238e6.InterfaceC5356a
            public final Object invoke() {
                return Integer.valueOf(C3139c.m16415H(this.f23922a));
            }
        });
        this.f13116c = AbstractC1430h.m6066b(new InterfaceC5356a() { // from class: l1.J
            @Override // p238e6.InterfaceC5356a
            public final Object invoke() {
                return Integer.valueOf(C3139c.m16414G(this.f23939a));
            }
        });
        this.f13117d = AbstractC1430h.m6066b(new InterfaceC5356a() { // from class: l1.K
            @Override // p238e6.InterfaceC5356a
            public final Object invoke() {
                return Integer.valueOf(C3139c.m16412E(this.f23942a));
            }
        });
        this.f13118e = AbstractC1430h.m6066b(new InterfaceC5356a() { // from class: l1.L
            @Override // p238e6.InterfaceC5356a
            public final Object invoke() {
                return Integer.valueOf(C3139c.m16411D(this.f23945a));
            }
        });
        this.f13122i = context.getSharedPreferences("SHARED_NAME", 0);
        this.f13123j = AbstractC1430h.m6066b(new InterfaceC5356a() { // from class: l1.M
            @Override // p238e6.InterfaceC5356a
            public final Object invoke() {
                return C3139c.m16416I(this.f23949a);
            }
        });
        this.f13125l = new Handler(Looper.getMainLooper());
        this.f13126m = new b();
        this.f13127n = AbstractC1430h.m6066b(new InterfaceC5356a() { // from class: l1.N
            @Override // p238e6.InterfaceC5356a
            public final Object invoke() {
                return Integer.valueOf(C3139c.m16427U());
            }
        });
    }
}
