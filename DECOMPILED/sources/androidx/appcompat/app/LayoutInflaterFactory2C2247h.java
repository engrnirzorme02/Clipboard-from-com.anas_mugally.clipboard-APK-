package androidx.appcompat.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.view.AbstractC2266b;
import androidx.appcompat.view.AbstractWindowCallbackC2273i;
import androidx.appcompat.view.C2268d;
import androidx.appcompat.view.C2269e;
import androidx.appcompat.view.C2270f;
import androidx.appcompat.view.C2271g;
import androidx.appcompat.view.menu.C2278c;
import androidx.appcompat.view.menu.C2280e;
import androidx.appcompat.view.menu.InterfaceC2285j;
import androidx.appcompat.view.menu.InterfaceC2286k;
import androidx.appcompat.widget.AbstractC2362k0;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.C2348d0;
import androidx.appcompat.widget.C2359j;
import androidx.appcompat.widget.C2360j0;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.InterfaceC2309G;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.collection.C2400k;
import androidx.core.content.AbstractC2436b;
import androidx.core.widget.AbstractC2457h;
import androidx.lifecycle.AbstractC2650l;
import androidx.lifecycle.InterfaceC2657s;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;
import p017C.AbstractC0101b;
import p017C.AbstractC0109j;
import p025D.AbstractC0165h;
import p081K.C0718j;
import p111O.AbstractC1030Z;
import p111O.AbstractC1057k0;
import p111O.AbstractC1076u;
import p111O.AbstractC1078v;
import p111O.C0982A0;
import p111O.C1053i0;
import p111O.InterfaceC0993G;
import p255h.AbstractC5520a;
import p255h.AbstractC5522c;
import p255h.AbstractC5525f;
import p255h.AbstractC5526g;
import p255h.AbstractC5528i;
import p255h.AbstractC5529j;
import p263i.AbstractC5659a;

/* JADX INFO: renamed from: androidx.appcompat.app.h */
/* JADX INFO: loaded from: classes.dex */
class LayoutInflaterFactory2C2247h extends AbstractC2245f implements C2280e.a, LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: u0 */
    private static final C2400k f7337u0 = new C2400k();

    /* JADX INFO: renamed from: v0 */
    private static final boolean f7338v0 = false;

    /* JADX INFO: renamed from: w0 */
    private static final int[] f7339w0 = {R.attr.windowBackground};

    /* JADX INFO: renamed from: x0 */
    private static final boolean f7340x0 = !"robolectric".equals(Build.FINGERPRINT);

    /* JADX INFO: renamed from: A */
    MenuInflater f7341A;

    /* JADX INFO: renamed from: B */
    private CharSequence f7342B;

    /* JADX INFO: renamed from: C */
    private InterfaceC2309G f7343C;

    /* JADX INFO: renamed from: D */
    private f f7344D;

    /* JADX INFO: renamed from: E */
    private r f7345E;

    /* JADX INFO: renamed from: F */
    AbstractC2266b f7346F;

    /* JADX INFO: renamed from: G */
    ActionBarContextView f7347G;

    /* JADX INFO: renamed from: H */
    PopupWindow f7348H;

    /* JADX INFO: renamed from: I */
    Runnable f7349I;

    /* JADX INFO: renamed from: J */
    C1053i0 f7350J;

    /* JADX INFO: renamed from: K */
    private boolean f7351K;

    /* JADX INFO: renamed from: L */
    private boolean f7352L;

    /* JADX INFO: renamed from: M */
    ViewGroup f7353M;

    /* JADX INFO: renamed from: N */
    private TextView f7354N;

    /* JADX INFO: renamed from: O */
    private View f7355O;

    /* JADX INFO: renamed from: P */
    private boolean f7356P;

    /* JADX INFO: renamed from: Q */
    private boolean f7357Q;

    /* JADX INFO: renamed from: R */
    boolean f7358R;

    /* JADX INFO: renamed from: S */
    boolean f7359S;

    /* JADX INFO: renamed from: T */
    boolean f7360T;

    /* JADX INFO: renamed from: U */
    boolean f7361U;

    /* JADX INFO: renamed from: V */
    boolean f7362V;

    /* JADX INFO: renamed from: W */
    private boolean f7363W;

    /* JADX INFO: renamed from: X */
    private q[] f7364X;

    /* JADX INFO: renamed from: Y */
    private q f7365Y;

    /* JADX INFO: renamed from: Z */
    private boolean f7366Z;

    /* JADX INFO: renamed from: a0 */
    private boolean f7367a0;

    /* JADX INFO: renamed from: b0 */
    private boolean f7368b0;

    /* JADX INFO: renamed from: c0 */
    boolean f7369c0;

    /* JADX INFO: renamed from: d0 */
    private Configuration f7370d0;

    /* JADX INFO: renamed from: e0 */
    private int f7371e0;

    /* JADX INFO: renamed from: f0 */
    private int f7372f0;

    /* JADX INFO: renamed from: g0 */
    private int f7373g0;

    /* JADX INFO: renamed from: h0 */
    private boolean f7374h0;

    /* JADX INFO: renamed from: i0 */
    private n f7375i0;

    /* JADX INFO: renamed from: j0 */
    private n f7376j0;

    /* JADX INFO: renamed from: k0 */
    boolean f7377k0;

    /* JADX INFO: renamed from: l0 */
    int f7378l0;

    /* JADX INFO: renamed from: m0 */
    private final Runnable f7379m0;

    /* JADX INFO: renamed from: n0 */
    private boolean f7380n0;

    /* JADX INFO: renamed from: o0 */
    private Rect f7381o0;

    /* JADX INFO: renamed from: p0 */
    private Rect f7382p0;

    /* JADX INFO: renamed from: q0 */
    private C2257r f7383q0;

    /* JADX INFO: renamed from: r0 */
    private C2259t f7384r0;

    /* JADX INFO: renamed from: s0 */
    private OnBackInvokedDispatcher f7385s0;

    /* JADX INFO: renamed from: t0 */
    private OnBackInvokedCallback f7386t0;

    /* JADX INFO: renamed from: u */
    final Object f7387u;

    /* JADX INFO: renamed from: v */
    final Context f7388v;

    /* JADX INFO: renamed from: w */
    Window f7389w;

    /* JADX INFO: renamed from: x */
    private l f7390x;

    /* JADX INFO: renamed from: y */
    final InterfaceC2243d f7391y;

    /* JADX INFO: renamed from: z */
    AbstractC2240a f7392z;

    /* JADX INFO: renamed from: androidx.appcompat.app.h$a */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LayoutInflaterFactory2C2247h layoutInflaterFactory2C2247h = LayoutInflaterFactory2C2247h.this;
            if ((layoutInflaterFactory2C2247h.f7378l0 & 1) != 0) {
                layoutInflaterFactory2C2247h.m9238f0(0);
            }
            LayoutInflaterFactory2C2247h layoutInflaterFactory2C2247h2 = LayoutInflaterFactory2C2247h.this;
            if ((layoutInflaterFactory2C2247h2.f7378l0 & 4096) != 0) {
                layoutInflaterFactory2C2247h2.m9238f0(108);
            }
            LayoutInflaterFactory2C2247h layoutInflaterFactory2C2247h3 = LayoutInflaterFactory2C2247h.this;
            layoutInflaterFactory2C2247h3.f7377k0 = false;
            layoutInflaterFactory2C2247h3.f7378l0 = 0;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.h$b */
    class b implements InterfaceC0993G {
        b() {
        }

        @Override // p111O.InterfaceC0993G
        /* JADX INFO: renamed from: a */
        public C0982A0 mo4369a(View view, C0982A0 c0982a0) {
            int iM4278l = c0982a0.m4278l();
            int iM9235c1 = LayoutInflaterFactory2C2247h.this.m9235c1(c0982a0, null);
            if (iM4278l != iM9235c1) {
                c0982a0 = c0982a0.m4282q(c0982a0.m4276j(), iM9235c1, c0982a0.m4277k(), c0982a0.m4275i());
            }
            return AbstractC1030Z.m4450V(view, c0982a0);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.h$c */
    class c implements ContentFrameLayout.InterfaceC2305a {
        c() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.InterfaceC2305a
        /* JADX INFO: renamed from: a */
        public void mo9248a() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.InterfaceC2305a
        public void onDetachedFromWindow() {
            LayoutInflaterFactory2C2247h.this.m9236d0();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.h$d */
    class d implements Runnable {

        /* JADX INFO: renamed from: androidx.appcompat.app.h$d$a */
        class a extends AbstractC1057k0 {
            a() {
            }

            @Override // p111O.InterfaceC1055j0
            /* JADX INFO: renamed from: b */
            public void mo4696b(View view) {
                LayoutInflaterFactory2C2247h.this.f7347G.setAlpha(1.0f);
                LayoutInflaterFactory2C2247h.this.f7350J.m4689g(null);
                LayoutInflaterFactory2C2247h.this.f7350J = null;
            }

            @Override // p111O.AbstractC1057k0, p111O.InterfaceC1055j0
            /* JADX INFO: renamed from: c */
            public void mo4697c(View view) {
                LayoutInflaterFactory2C2247h.this.f7347G.setVisibility(0);
            }
        }

        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LayoutInflaterFactory2C2247h layoutInflaterFactory2C2247h = LayoutInflaterFactory2C2247h.this;
            layoutInflaterFactory2C2247h.f7348H.showAtLocation(layoutInflaterFactory2C2247h.f7347G, 55, 0, 0);
            LayoutInflaterFactory2C2247h.this.m9239g0();
            if (!LayoutInflaterFactory2C2247h.this.m9222R0()) {
                LayoutInflaterFactory2C2247h.this.f7347G.setAlpha(1.0f);
                LayoutInflaterFactory2C2247h.this.f7347G.setVisibility(0);
            } else {
                LayoutInflaterFactory2C2247h.this.f7347G.setAlpha(0.0f);
                LayoutInflaterFactory2C2247h layoutInflaterFactory2C2247h2 = LayoutInflaterFactory2C2247h.this;
                layoutInflaterFactory2C2247h2.f7350J = AbstractC1030Z.m4463e(layoutInflaterFactory2C2247h2.f7347G).m4684b(1.0f);
                LayoutInflaterFactory2C2247h.this.f7350J.m4689g(new a());
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.h$e */
    class e extends AbstractC1057k0 {
        e() {
        }

        @Override // p111O.InterfaceC1055j0
        /* JADX INFO: renamed from: b */
        public void mo4696b(View view) {
            LayoutInflaterFactory2C2247h.this.f7347G.setAlpha(1.0f);
            LayoutInflaterFactory2C2247h.this.f7350J.m4689g(null);
            LayoutInflaterFactory2C2247h.this.f7350J = null;
        }

        @Override // p111O.AbstractC1057k0, p111O.InterfaceC1055j0
        /* JADX INFO: renamed from: c */
        public void mo4697c(View view) {
            LayoutInflaterFactory2C2247h.this.f7347G.setVisibility(0);
            if (LayoutInflaterFactory2C2247h.this.f7347G.getParent() instanceof View) {
                AbstractC1030Z.m4468g0((View) LayoutInflaterFactory2C2247h.this.f7347G.getParent());
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.h$f */
    private final class f implements InterfaceC2285j.a {
        f() {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC2285j.a
        /* JADX INFO: renamed from: c */
        public void mo9249c(C2280e c2280e, boolean z7) {
            LayoutInflaterFactory2C2247h.this.m9228W(c2280e);
        }

        @Override // androidx.appcompat.view.menu.InterfaceC2285j.a
        /* JADX INFO: renamed from: d */
        public boolean mo9250d(C2280e c2280e) {
            Window.Callback callbackM9245s0 = LayoutInflaterFactory2C2247h.this.m9245s0();
            if (callbackM9245s0 == null) {
                return true;
            }
            callbackM9245s0.onMenuOpened(108, c2280e);
            return true;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.h$g */
    class g implements AbstractC2266b.a {

        /* JADX INFO: renamed from: a */
        private AbstractC2266b.a f7400a;

        /* JADX INFO: renamed from: androidx.appcompat.app.h$g$a */
        class a extends AbstractC1057k0 {
            a() {
            }

            @Override // p111O.InterfaceC1055j0
            /* JADX INFO: renamed from: b */
            public void mo4696b(View view) {
                LayoutInflaterFactory2C2247h.this.f7347G.setVisibility(8);
                LayoutInflaterFactory2C2247h layoutInflaterFactory2C2247h = LayoutInflaterFactory2C2247h.this;
                PopupWindow popupWindow = layoutInflaterFactory2C2247h.f7348H;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (layoutInflaterFactory2C2247h.f7347G.getParent() instanceof View) {
                    AbstractC1030Z.m4468g0((View) LayoutInflaterFactory2C2247h.this.f7347G.getParent());
                }
                LayoutInflaterFactory2C2247h.this.f7347G.m9635k();
                LayoutInflaterFactory2C2247h.this.f7350J.m4689g(null);
                LayoutInflaterFactory2C2247h layoutInflaterFactory2C2247h2 = LayoutInflaterFactory2C2247h.this;
                layoutInflaterFactory2C2247h2.f7350J = null;
                AbstractC1030Z.m4468g0(layoutInflaterFactory2C2247h2.f7353M);
            }
        }

        public g(AbstractC2266b.a aVar) {
            this.f7400a = aVar;
        }

        @Override // androidx.appcompat.view.AbstractC2266b.a
        /* JADX INFO: renamed from: a */
        public void mo9251a(AbstractC2266b abstractC2266b) {
            this.f7400a.mo9251a(abstractC2266b);
            LayoutInflaterFactory2C2247h layoutInflaterFactory2C2247h = LayoutInflaterFactory2C2247h.this;
            if (layoutInflaterFactory2C2247h.f7348H != null) {
                layoutInflaterFactory2C2247h.f7389w.getDecorView().removeCallbacks(LayoutInflaterFactory2C2247h.this.f7349I);
            }
            LayoutInflaterFactory2C2247h layoutInflaterFactory2C2247h2 = LayoutInflaterFactory2C2247h.this;
            if (layoutInflaterFactory2C2247h2.f7347G != null) {
                layoutInflaterFactory2C2247h2.m9239g0();
                LayoutInflaterFactory2C2247h layoutInflaterFactory2C2247h3 = LayoutInflaterFactory2C2247h.this;
                layoutInflaterFactory2C2247h3.f7350J = AbstractC1030Z.m4463e(layoutInflaterFactory2C2247h3.f7347G).m4684b(0.0f);
                LayoutInflaterFactory2C2247h.this.f7350J.m4689g(new a());
            }
            LayoutInflaterFactory2C2247h layoutInflaterFactory2C2247h4 = LayoutInflaterFactory2C2247h.this;
            InterfaceC2243d interfaceC2243d = layoutInflaterFactory2C2247h4.f7391y;
            if (interfaceC2243d != null) {
                interfaceC2243d.mo9132k(layoutInflaterFactory2C2247h4.f7346F);
            }
            LayoutInflaterFactory2C2247h layoutInflaterFactory2C2247h5 = LayoutInflaterFactory2C2247h.this;
            layoutInflaterFactory2C2247h5.f7346F = null;
            AbstractC1030Z.m4468g0(layoutInflaterFactory2C2247h5.f7353M);
            LayoutInflaterFactory2C2247h.this.m9232a1();
        }

        @Override // androidx.appcompat.view.AbstractC2266b.a
        /* JADX INFO: renamed from: b */
        public boolean mo9252b(AbstractC2266b abstractC2266b, Menu menu) {
            return this.f7400a.mo9252b(abstractC2266b, menu);
        }

        @Override // androidx.appcompat.view.AbstractC2266b.a
        /* JADX INFO: renamed from: c */
        public boolean mo9253c(AbstractC2266b abstractC2266b, Menu menu) {
            AbstractC1030Z.m4468g0(LayoutInflaterFactory2C2247h.this.f7353M);
            return this.f7400a.mo9253c(abstractC2266b, menu);
        }

        @Override // androidx.appcompat.view.AbstractC2266b.a
        /* JADX INFO: renamed from: d */
        public boolean mo9254d(AbstractC2266b abstractC2266b, MenuItem menuItem) {
            return this.f7400a.mo9254d(abstractC2266b, menuItem);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.h$h */
    static class h {
        /* JADX INFO: renamed from: a */
        static boolean m9255a(PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }

        /* JADX INFO: renamed from: b */
        static String m9256b(Locale locale) {
            return locale.toLanguageTag();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.h$i */
    static class i {
        /* JADX INFO: renamed from: a */
        static void m9257a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (locales.equals(locales2)) {
                return;
            }
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }

        /* JADX INFO: renamed from: b */
        static C0718j m9258b(Configuration configuration) {
            return C0718j.m3472b(configuration.getLocales().toLanguageTags());
        }

        /* JADX INFO: renamed from: c */
        public static void m9259c(C0718j c0718j) {
            LocaleList.setDefault(LocaleList.forLanguageTags(c0718j.m3478g()));
        }

        /* JADX INFO: renamed from: d */
        static void m9260d(Configuration configuration, C0718j c0718j) {
            configuration.setLocales(LocaleList.forLanguageTags(c0718j.m3478g()));
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.h$j */
    static class j {
        /* JADX INFO: renamed from: a */
        static void m9261a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i7 = configuration.colorMode & 3;
            int i8 = configuration2.colorMode;
            if (i7 != (i8 & 3)) {
                configuration3.colorMode |= i8 & 3;
            }
            int i9 = configuration.colorMode & 12;
            int i10 = configuration2.colorMode;
            if (i9 != (i10 & 12)) {
                configuration3.colorMode |= i10 & 12;
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.h$k */
    static class k {
        /* JADX INFO: renamed from: a */
        static OnBackInvokedDispatcher m9262a(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }

        /* JADX INFO: renamed from: b */
        static OnBackInvokedCallback m9263b(Object obj, final LayoutInflaterFactory2C2247h layoutInflaterFactory2C2247h) {
            Objects.requireNonNull(layoutInflaterFactory2C2247h);
            OnBackInvokedCallback onBackInvokedCallback = new OnBackInvokedCallback() { // from class: androidx.appcompat.app.n
                public final void onBackInvoked() {
                    layoutInflaterFactory2C2247h.m9211A0();
                }
            };
            AbstractC2249j.m9280a(obj).registerOnBackInvokedCallback(1000000, onBackInvokedCallback);
            return onBackInvokedCallback;
        }

        /* JADX INFO: renamed from: c */
        static void m9264c(Object obj, Object obj2) {
            AbstractC2249j.m9280a(obj).unregisterOnBackInvokedCallback(AbstractC2248i.m9279a(obj2));
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.h$l */
    class l extends AbstractWindowCallbackC2273i {

        /* JADX INFO: renamed from: b */
        private boolean f7403b;

        /* JADX INFO: renamed from: c */
        private boolean f7404c;

        /* JADX INFO: renamed from: d */
        private boolean f7405d;

        l(Window.Callback callback) {
            super(callback);
        }

        /* JADX INFO: renamed from: b */
        public boolean m9265b(Window.Callback callback, KeyEvent keyEvent) {
            try {
                this.f7404c = true;
                return callback.dispatchKeyEvent(keyEvent);
            } finally {
                this.f7404c = false;
            }
        }

        /* JADX INFO: renamed from: c */
        public void m9266c(Window.Callback callback) {
            try {
                this.f7403b = true;
                callback.onContentChanged();
            } finally {
                this.f7403b = false;
            }
        }

        /* JADX INFO: renamed from: d */
        public void m9267d(Window.Callback callback, int i7, Menu menu) {
            try {
                this.f7405d = true;
                callback.onPanelClosed(i7, menu);
            } finally {
                this.f7405d = false;
            }
        }

        @Override // androidx.appcompat.view.AbstractWindowCallbackC2273i, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            if (this.f7404c) {
                return m9407a().dispatchKeyEvent(keyEvent);
            }
            return LayoutInflaterFactory2C2247h.this.m9237e0(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // androidx.appcompat.view.AbstractWindowCallbackC2273i, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || LayoutInflaterFactory2C2247h.this.m9213D0(keyEvent.getKeyCode(), keyEvent);
        }

        /* JADX INFO: renamed from: e */
        final ActionMode m9268e(ActionMode.Callback callback) {
            C2270f.a aVar = new C2270f.a(LayoutInflaterFactory2C2247h.this.f7388v, callback);
            AbstractC2266b abstractC2266bM9225U0 = LayoutInflaterFactory2C2247h.this.m9225U0(aVar);
            if (abstractC2266bM9225U0 != null) {
                return aVar.m9385e(abstractC2266bM9225U0);
            }
            return null;
        }

        @Override // android.view.Window.Callback
        public void onContentChanged() {
            if (this.f7403b) {
                m9407a().onContentChanged();
            }
        }

        @Override // androidx.appcompat.view.AbstractWindowCallbackC2273i, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i7, Menu menu) {
            if (i7 != 0 || (menu instanceof C2280e)) {
                return super.onCreatePanelMenu(i7, menu);
            }
            return false;
        }

        @Override // androidx.appcompat.view.AbstractWindowCallbackC2273i, android.view.Window.Callback
        public View onCreatePanelView(int i7) {
            return super.onCreatePanelView(i7);
        }

        @Override // androidx.appcompat.view.AbstractWindowCallbackC2273i, android.view.Window.Callback
        public boolean onMenuOpened(int i7, Menu menu) {
            super.onMenuOpened(i7, menu);
            LayoutInflaterFactory2C2247h.this.m9215G0(i7);
            return true;
        }

        @Override // androidx.appcompat.view.AbstractWindowCallbackC2273i, android.view.Window.Callback
        public void onPanelClosed(int i7, Menu menu) {
            if (this.f7405d) {
                m9407a().onPanelClosed(i7, menu);
            } else {
                super.onPanelClosed(i7, menu);
                LayoutInflaterFactory2C2247h.this.m9216H0(i7);
            }
        }

        @Override // androidx.appcompat.view.AbstractWindowCallbackC2273i, android.view.Window.Callback
        public boolean onPreparePanel(int i7, View view, Menu menu) {
            C2280e c2280e = menu instanceof C2280e ? (C2280e) menu : null;
            if (i7 == 0 && c2280e == null) {
                return false;
            }
            if (c2280e != null) {
                c2280e.m9525f0(true);
            }
            boolean zOnPreparePanel = super.onPreparePanel(i7, view, menu);
            if (c2280e != null) {
                c2280e.m9525f0(false);
            }
            return zOnPreparePanel;
        }

        @Override // androidx.appcompat.view.AbstractWindowCallbackC2273i, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List list, Menu menu, int i7) {
            C2280e c2280e;
            q qVarM9243q0 = LayoutInflaterFactory2C2247h.this.m9243q0(0, true);
            if (qVarM9243q0 == null || (c2280e = qVarM9243q0.f7424j) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i7);
            } else {
                super.onProvideKeyboardShortcuts(list, c2280e, i7);
            }
        }

        @Override // android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }

        @Override // androidx.appcompat.view.AbstractWindowCallbackC2273i, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i7) {
            return (LayoutInflaterFactory2C2247h.this.m9246y0() && i7 == 0) ? m9268e(callback) : super.onWindowStartingActionMode(callback, i7);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.h$m */
    private class m extends n {

        /* JADX INFO: renamed from: c */
        private final PowerManager f7407c;

        m(Context context) {
            super();
            this.f7407c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // androidx.appcompat.app.LayoutInflaterFactory2C2247h.n
        /* JADX INFO: renamed from: b */
        IntentFilter mo9269b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.LayoutInflaterFactory2C2247h.n
        /* JADX INFO: renamed from: c */
        public int mo9270c() {
            return h.m9255a(this.f7407c) ? 2 : 1;
        }

        @Override // androidx.appcompat.app.LayoutInflaterFactory2C2247h.n
        /* JADX INFO: renamed from: d */
        public void mo9271d() {
            LayoutInflaterFactory2C2247h.this.m9220Q();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.h$n */
    abstract class n {

        /* JADX INFO: renamed from: a */
        private BroadcastReceiver f7409a;

        /* JADX INFO: renamed from: androidx.appcompat.app.h$n$a */
        class a extends BroadcastReceiver {
            a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                n.this.mo9271d();
            }
        }

        n() {
        }

        /* JADX INFO: renamed from: a */
        void m9272a() {
            BroadcastReceiver broadcastReceiver = this.f7409a;
            if (broadcastReceiver != null) {
                try {
                    LayoutInflaterFactory2C2247h.this.f7388v.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f7409a = null;
            }
        }

        /* JADX INFO: renamed from: b */
        abstract IntentFilter mo9269b();

        /* JADX INFO: renamed from: c */
        abstract int mo9270c();

        /* JADX INFO: renamed from: d */
        abstract void mo9271d();

        /* JADX INFO: renamed from: e */
        void m9273e() {
            m9272a();
            IntentFilter intentFilterMo9269b = mo9269b();
            if (intentFilterMo9269b == null || intentFilterMo9269b.countActions() == 0) {
                return;
            }
            if (this.f7409a == null) {
                this.f7409a = new a();
            }
            LayoutInflaterFactory2C2247h.this.f7388v.registerReceiver(this.f7409a, intentFilterMo9269b);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.h$o */
    private class o extends n {

        /* JADX INFO: renamed from: c */
        private final C2262w f7412c;

        o(C2262w c2262w) {
            super();
            this.f7412c = c2262w;
        }

        @Override // androidx.appcompat.app.LayoutInflaterFactory2C2247h.n
        /* JADX INFO: renamed from: b */
        IntentFilter mo9269b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.LayoutInflaterFactory2C2247h.n
        /* JADX INFO: renamed from: c */
        public int mo9270c() {
            return this.f7412c.m9327d() ? 2 : 1;
        }

        @Override // androidx.appcompat.app.LayoutInflaterFactory2C2247h.n
        /* JADX INFO: renamed from: d */
        public void mo9271d() {
            LayoutInflaterFactory2C2247h.this.m9220Q();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.h$p */
    private class p extends ContentFrameLayout {
        public p(Context context) {
            super(context);
        }

        /* JADX INFO: renamed from: b */
        private boolean m9274b(int i7, int i8) {
            return i7 < -5 || i8 < -5 || i7 > getWidth() + 5 || i8 > getHeight() + 5;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return LayoutInflaterFactory2C2247h.this.m9237e0(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !m9274b((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            LayoutInflaterFactory2C2247h.this.m9229Y(0);
            return true;
        }

        @Override // android.view.View
        public void setBackgroundResource(int i7) {
            setBackgroundDrawable(AbstractC5659a.m25175b(getContext(), i7));
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.h$q */
    protected static final class q {

        /* JADX INFO: renamed from: a */
        int f7415a;

        /* JADX INFO: renamed from: b */
        int f7416b;

        /* JADX INFO: renamed from: c */
        int f7417c;

        /* JADX INFO: renamed from: d */
        int f7418d;

        /* JADX INFO: renamed from: e */
        int f7419e;

        /* JADX INFO: renamed from: f */
        int f7420f;

        /* JADX INFO: renamed from: g */
        ViewGroup f7421g;

        /* JADX INFO: renamed from: h */
        View f7422h;

        /* JADX INFO: renamed from: i */
        View f7423i;

        /* JADX INFO: renamed from: j */
        C2280e f7424j;

        /* JADX INFO: renamed from: k */
        C2278c f7425k;

        /* JADX INFO: renamed from: l */
        Context f7426l;

        /* JADX INFO: renamed from: m */
        boolean f7427m;

        /* JADX INFO: renamed from: n */
        boolean f7428n;

        /* JADX INFO: renamed from: o */
        boolean f7429o;

        /* JADX INFO: renamed from: p */
        public boolean f7430p;

        /* JADX INFO: renamed from: q */
        boolean f7431q = false;

        /* JADX INFO: renamed from: r */
        boolean f7432r;

        /* JADX INFO: renamed from: s */
        Bundle f7433s;

        q(int i7) {
            this.f7415a = i7;
        }

        /* JADX INFO: renamed from: a */
        InterfaceC2286k m9275a(InterfaceC2285j.a aVar) {
            if (this.f7424j == null) {
                return null;
            }
            if (this.f7425k == null) {
                C2278c c2278c = new C2278c(this.f7426l, AbstractC5526g.f21088j);
                this.f7425k = c2278c;
                c2278c.mo9436h(aVar);
                this.f7424j.m9517b(this.f7425k);
            }
            return this.f7425k.m9472b(this.f7421g);
        }

        /* JADX INFO: renamed from: b */
        public boolean m9276b() {
            if (this.f7422h == null) {
                return false;
            }
            return this.f7423i != null || this.f7425k.m9471a().getCount() > 0;
        }

        /* JADX INFO: renamed from: c */
        void m9277c(C2280e c2280e) {
            C2278c c2278c;
            C2280e c2280e2 = this.f7424j;
            if (c2280e == c2280e2) {
                return;
            }
            if (c2280e2 != null) {
                c2280e2.m9506R(this.f7425k);
            }
            this.f7424j = c2280e;
            if (c2280e == null || (c2278c = this.f7425k) == null) {
                return;
            }
            c2280e.m9517b(c2278c);
        }

        /* JADX INFO: renamed from: d */
        void m9278d(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme themeNewTheme = context.getResources().newTheme();
            themeNewTheme.setTo(context.getTheme());
            themeNewTheme.resolveAttribute(AbstractC5520a.f20963a, typedValue, true);
            int i7 = typedValue.resourceId;
            if (i7 != 0) {
                themeNewTheme.applyStyle(i7, true);
            }
            themeNewTheme.resolveAttribute(AbstractC5520a.f20954E, typedValue, true);
            int i8 = typedValue.resourceId;
            if (i8 != 0) {
                themeNewTheme.applyStyle(i8, true);
            } else {
                themeNewTheme.applyStyle(AbstractC5528i.f21110b, true);
            }
            C2268d c2268d = new C2268d(context, 0);
            c2268d.getTheme().setTo(themeNewTheme);
            this.f7426l = c2268d;
            TypedArray typedArrayObtainStyledAttributes = c2268d.obtainStyledAttributes(AbstractC5529j.f21346y0);
            this.f7416b = typedArrayObtainStyledAttributes.getResourceId(AbstractC5529j.f21120B0, 0);
            this.f7420f = typedArrayObtainStyledAttributes.getResourceId(AbstractC5529j.f21115A0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.h$r */
    private final class r implements InterfaceC2285j.a {
        r() {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC2285j.a
        /* JADX INFO: renamed from: c */
        public void mo9249c(C2280e c2280e, boolean z7) {
            C2280e c2280eMo9495F = c2280e.mo9495F();
            boolean z8 = c2280eMo9495F != c2280e;
            LayoutInflaterFactory2C2247h layoutInflaterFactory2C2247h = LayoutInflaterFactory2C2247h.this;
            if (z8) {
                c2280e = c2280eMo9495F;
            }
            q qVarM9240j0 = layoutInflaterFactory2C2247h.m9240j0(c2280e);
            if (qVarM9240j0 != null) {
                if (!z8) {
                    LayoutInflaterFactory2C2247h.this.m9230Z(qVarM9240j0, z7);
                } else {
                    LayoutInflaterFactory2C2247h.this.m9226V(qVarM9240j0.f7415a, qVarM9240j0, c2280eMo9495F);
                    LayoutInflaterFactory2C2247h.this.m9230Z(qVarM9240j0, true);
                }
            }
        }

        @Override // androidx.appcompat.view.menu.InterfaceC2285j.a
        /* JADX INFO: renamed from: d */
        public boolean mo9250d(C2280e c2280e) {
            Window.Callback callbackM9245s0;
            if (c2280e != c2280e.mo9495F()) {
                return true;
            }
            LayoutInflaterFactory2C2247h layoutInflaterFactory2C2247h = LayoutInflaterFactory2C2247h.this;
            if (!layoutInflaterFactory2C2247h.f7358R || (callbackM9245s0 = layoutInflaterFactory2C2247h.m9245s0()) == null || LayoutInflaterFactory2C2247h.this.f7369c0) {
                return true;
            }
            callbackM9245s0.onMenuOpened(108, c2280e);
            return true;
        }
    }

    LayoutInflaterFactory2C2247h(Activity activity, InterfaceC2243d interfaceC2243d) {
        this(activity, null, interfaceC2243d, activity);
    }

    /* JADX INFO: renamed from: C0 */
    private boolean m9178C0(int i7, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        q qVarM9243q0 = m9243q0(i7, true);
        if (qVarM9243q0.f7429o) {
            return false;
        }
        return m9182M0(qVarM9243q0, keyEvent);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    /* JADX INFO: renamed from: F0 */
    private boolean m9179F0(int i7, KeyEvent keyEvent) {
        boolean zM9182M0;
        InterfaceC2309G interfaceC2309G;
        if (this.f7346F != null) {
            return false;
        }
        boolean zMo9652f = true;
        q qVarM9243q0 = m9243q0(i7, true);
        if (i7 != 0 || (interfaceC2309G = this.f7343C) == null || !interfaceC2309G.mo9650d() || ViewConfiguration.get(this.f7388v).hasPermanentMenuKey()) {
            boolean z7 = qVarM9243q0.f7429o;
            if (z7 || qVarM9243q0.f7428n) {
                m9230Z(qVarM9243q0, true);
                zMo9652f = z7;
            } else if (qVarM9243q0.f7427m) {
                if (qVarM9243q0.f7432r) {
                    qVarM9243q0.f7427m = false;
                    zM9182M0 = m9182M0(qVarM9243q0, keyEvent);
                } else {
                    zM9182M0 = true;
                }
                if (zM9182M0) {
                    m9180J0(qVarM9243q0, keyEvent);
                } else {
                    zMo9652f = false;
                }
            } else {
                zMo9652f = false;
            }
        } else if (this.f7343C.mo9648b()) {
            zMo9652f = this.f7343C.mo9652f();
        } else if (this.f7369c0 || !m9182M0(qVarM9243q0, keyEvent)) {
            zMo9652f = false;
        } else {
            zMo9652f = this.f7343C.mo9653g();
        }
        if (zMo9652f) {
            AudioManager audioManager = (AudioManager) this.f7388v.getApplicationContext().getSystemService("audio");
            if (audioManager != null) {
                audioManager.playSoundEffect(0);
                return zMo9652f;
            }
            Log.w("AppCompatDelegate", "Couldn't get audio manager");
        }
        return zMo9652f;
    }

    /* JADX WARN: Code duplicated, block: B:64:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: J0 */
    private void m9180J0(q qVar, KeyEvent keyEvent) {
        int i7;
        ViewGroup.LayoutParams layoutParams;
        if (qVar.f7429o || this.f7369c0) {
            return;
        }
        if (qVar.f7415a == 0 && (this.f7388v.getResources().getConfiguration().screenLayout & 15) == 4) {
            return;
        }
        Window.Callback callbackM9245s0 = m9245s0();
        if (callbackM9245s0 != null && !callbackM9245s0.onMenuOpened(qVar.f7415a, qVar.f7424j)) {
            m9230Z(qVar, true);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f7388v.getSystemService("window");
        if (windowManager != null && m9182M0(qVar, keyEvent)) {
            ViewGroup viewGroup = qVar.f7421g;
            if (viewGroup != null && !qVar.f7431q) {
                View view = qVar.f7423i;
                if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.width == -1) {
                    i7 = -1;
                }
                qVar.f7428n = false;
                WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams(i7, -2, qVar.f7418d, qVar.f7419e, 1002, 8519680, -3);
                layoutParams2.gravity = qVar.f7417c;
                layoutParams2.windowAnimations = qVar.f7420f;
                windowManager.addView(qVar.f7421g, layoutParams2);
                qVar.f7429o = true;
                if (qVar.f7415a == 0) {
                    m9232a1();
                }
            }
            if (viewGroup == null) {
                if (!m9208v0(qVar) || qVar.f7421g == null) {
                    return;
                }
            } else if (qVar.f7431q && viewGroup.getChildCount() > 0) {
                qVar.f7421g.removeAllViews();
            }
            if (!m9207u0(qVar) || !qVar.m9276b()) {
                qVar.f7431q = true;
                return;
            }
            ViewGroup.LayoutParams layoutParams3 = qVar.f7422h.getLayoutParams();
            if (layoutParams3 == null) {
                layoutParams3 = new ViewGroup.LayoutParams(-2, -2);
            }
            qVar.f7421g.setBackgroundResource(qVar.f7416b);
            ViewParent parent = qVar.f7422h.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(qVar.f7422h);
            }
            qVar.f7421g.addView(qVar.f7422h, layoutParams3);
            if (!qVar.f7422h.hasFocus()) {
                qVar.f7422h.requestFocus();
            }
            i7 = -2;
            qVar.f7428n = false;
            WindowManager.LayoutParams layoutParams4 = new WindowManager.LayoutParams(i7, -2, qVar.f7418d, qVar.f7419e, 1002, 8519680, -3);
            layoutParams4.gravity = qVar.f7417c;
            layoutParams4.windowAnimations = qVar.f7420f;
            windowManager.addView(qVar.f7421g, layoutParams4);
            qVar.f7429o = true;
            if (qVar.f7415a == 0) {
                m9232a1();
            }
        }
    }

    /* JADX INFO: renamed from: L0 */
    private boolean m9181L0(q qVar, int i7, KeyEvent keyEvent, int i8) {
        C2280e c2280e;
        boolean zPerformShortcut = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((qVar.f7427m || m9182M0(qVar, keyEvent)) && (c2280e = qVar.f7424j) != null) {
            zPerformShortcut = c2280e.performShortcut(i7, keyEvent, i8);
        }
        if (zPerformShortcut && (i8 & 1) == 0 && this.f7343C == null) {
            m9230Z(qVar, true);
        }
        return zPerformShortcut;
    }

    /* JADX INFO: renamed from: M0 */
    private boolean m9182M0(q qVar, KeyEvent keyEvent) {
        InterfaceC2309G interfaceC2309G;
        InterfaceC2309G interfaceC2309G2;
        InterfaceC2309G interfaceC2309G3;
        if (this.f7369c0) {
            return false;
        }
        if (qVar.f7427m) {
            return true;
        }
        q qVar2 = this.f7365Y;
        if (qVar2 != null && qVar2 != qVar) {
            m9230Z(qVar2, false);
        }
        Window.Callback callbackM9245s0 = m9245s0();
        if (callbackM9245s0 != null) {
            qVar.f7423i = callbackM9245s0.onCreatePanelView(qVar.f7415a);
        }
        int i7 = qVar.f7415a;
        boolean z7 = i7 == 0 || i7 == 108;
        if (z7 && (interfaceC2309G3 = this.f7343C) != null) {
            interfaceC2309G3.mo9649c();
        }
        if (qVar.f7423i == null) {
            if (z7) {
                m9218K0();
            }
            C2280e c2280e = qVar.f7424j;
            if (c2280e == null || qVar.f7432r) {
                if (c2280e == null && (!m9209w0(qVar) || qVar.f7424j == null)) {
                    return false;
                }
                if (z7 && this.f7343C != null) {
                    if (this.f7344D == null) {
                        this.f7344D = new f();
                    }
                    this.f7343C.mo9647a(qVar.f7424j, this.f7344D);
                }
                qVar.f7424j.m9528i0();
                if (!callbackM9245s0.onCreatePanelMenu(qVar.f7415a, qVar.f7424j)) {
                    qVar.m9277c(null);
                    if (z7 && (interfaceC2309G = this.f7343C) != null) {
                        interfaceC2309G.mo9647a(null, this.f7344D);
                    }
                    return false;
                }
                qVar.f7432r = false;
            }
            qVar.f7424j.m9528i0();
            Bundle bundle = qVar.f7433s;
            if (bundle != null) {
                qVar.f7424j.m9507S(bundle);
                qVar.f7433s = null;
            }
            if (!callbackM9245s0.onPreparePanel(0, qVar.f7423i, qVar.f7424j)) {
                if (z7 && (interfaceC2309G2 = this.f7343C) != null) {
                    interfaceC2309G2.mo9647a(null, this.f7344D);
                }
                qVar.f7424j.m9527h0();
                return false;
            }
            boolean z8 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            qVar.f7430p = z8;
            qVar.f7424j.setQwertyMode(z8);
            qVar.f7424j.m9527h0();
        }
        qVar.f7427m = true;
        qVar.f7428n = false;
        this.f7365Y = qVar;
        return true;
    }

    /* JADX INFO: renamed from: N0 */
    private void m9183N0(boolean z7) {
        InterfaceC2309G interfaceC2309G = this.f7343C;
        if (interfaceC2309G == null || !interfaceC2309G.mo9650d() || (ViewConfiguration.get(this.f7388v).hasPermanentMenuKey() && !this.f7343C.mo9651e())) {
            q qVarM9243q0 = m9243q0(0, true);
            qVarM9243q0.f7431q = true;
            m9230Z(qVarM9243q0, false);
            m9180J0(qVarM9243q0, null);
            return;
        }
        Window.Callback callbackM9245s0 = m9245s0();
        if (this.f7343C.mo9648b() && z7) {
            this.f7343C.mo9652f();
            if (this.f7369c0) {
                return;
            }
            callbackM9245s0.onPanelClosed(108, m9243q0(0, true).f7424j);
            return;
        }
        if (callbackM9245s0 == null || this.f7369c0) {
            return;
        }
        if (this.f7377k0 && (this.f7378l0 & 1) != 0) {
            this.f7389w.getDecorView().removeCallbacks(this.f7379m0);
            this.f7379m0.run();
        }
        q qVarM9243q1 = m9243q0(0, true);
        C2280e c2280e = qVarM9243q1.f7424j;
        if (c2280e == null || qVarM9243q1.f7432r || !callbackM9245s0.onPreparePanel(0, qVarM9243q1.f7423i, c2280e)) {
            return;
        }
        callbackM9245s0.onMenuOpened(108, qVarM9243q1.f7424j);
        this.f7343C.mo9653g();
    }

    /* JADX INFO: renamed from: O */
    private boolean m9184O(boolean z7) {
        return m9186P(z7, true);
    }

    /* JADX INFO: renamed from: O0 */
    private int m9185O0(int i7) {
        if (i7 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        }
        if (i7 != 9) {
            return i7;
        }
        Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
        return 109;
    }

    /* JADX INFO: renamed from: P */
    private boolean m9186P(boolean z7, boolean z8) {
        if (this.f7369c0) {
            return false;
        }
        int iM9190U = m9190U();
        int iM9247z0 = m9247z0(this.f7388v, iM9190U);
        C0718j c0718jM9223T = Build.VERSION.SDK_INT < 33 ? m9223T(this.f7388v) : null;
        if (!z8 && c0718jM9223T != null) {
            c0718jM9223T = m9242p0(this.f7388v.getResources().getConfiguration());
        }
        boolean zM9195Z0 = m9195Z0(iM9247z0, c0718jM9223T, z7);
        if (iM9190U == 0) {
            m9205o0(this.f7388v).m9273e();
        } else {
            n nVar = this.f7375i0;
            if (nVar != null) {
                nVar.m9272a();
            }
        }
        if (iM9190U == 3) {
            m9204n0(this.f7388v).m9273e();
            return zM9195Z0;
        }
        n nVar2 = this.f7376j0;
        if (nVar2 != null) {
            nVar2.m9272a();
        }
        return zM9195Z0;
    }

    /* JADX INFO: renamed from: R */
    private void m9187R() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.f7353M.findViewById(R.id.content);
        View decorView = this.f7389w.getDecorView();
        contentFrameLayout.m9740a(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray typedArrayObtainStyledAttributes = this.f7388v.obtainStyledAttributes(AbstractC5529j.f21346y0);
        typedArrayObtainStyledAttributes.getValue(AbstractC5529j.f21162K0, contentFrameLayout.getMinWidthMajor());
        typedArrayObtainStyledAttributes.getValue(AbstractC5529j.f21166L0, contentFrameLayout.getMinWidthMinor());
        int i7 = AbstractC5529j.f21154I0;
        if (typedArrayObtainStyledAttributes.hasValue(i7)) {
            typedArrayObtainStyledAttributes.getValue(i7, contentFrameLayout.getFixedWidthMajor());
        }
        int i8 = AbstractC5529j.f21158J0;
        if (typedArrayObtainStyledAttributes.hasValue(i8)) {
            typedArrayObtainStyledAttributes.getValue(i8, contentFrameLayout.getFixedWidthMinor());
        }
        int i9 = AbstractC5529j.f21145G0;
        if (typedArrayObtainStyledAttributes.hasValue(i9)) {
            typedArrayObtainStyledAttributes.getValue(i9, contentFrameLayout.getFixedHeightMajor());
        }
        int i10 = AbstractC5529j.f21150H0;
        if (typedArrayObtainStyledAttributes.hasValue(i10)) {
            typedArrayObtainStyledAttributes.getValue(i10, contentFrameLayout.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    /* JADX INFO: renamed from: S */
    private void m9188S(Window window) {
        if (this.f7389w != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof l) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        l lVar = new l(callback);
        this.f7390x = lVar;
        window.setCallback(lVar);
        C2348d0 c2348d0M10024u = C2348d0.m10024u(this.f7388v, null, f7339w0);
        Drawable drawableM10033h = c2348d0M10024u.m10033h(0);
        if (drawableM10033h != null) {
            window.setBackgroundDrawable(drawableM10033h);
        }
        c2348d0M10024u.m10046x();
        this.f7389w = window;
        if (Build.VERSION.SDK_INT < 33 || this.f7385s0 != null) {
            return;
        }
        mo9155J(null);
    }

    /* JADX INFO: renamed from: S0 */
    private boolean m9189S0(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f7389w.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || ((View) viewParent).isAttachedToWindow()) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    /* JADX INFO: renamed from: U */
    private int m9190U() {
        int i7 = this.f7371e0;
        return i7 != -100 ? i7 : AbstractC2245f.m9144m();
    }

    /* JADX INFO: renamed from: W0 */
    private void m9191W0() {
        if (this.f7352L) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    /* JADX INFO: renamed from: X */
    private void m9192X() {
        n nVar = this.f7375i0;
        if (nVar != null) {
            nVar.m9272a();
        }
        n nVar2 = this.f7376j0;
        if (nVar2 != null) {
            nVar2.m9272a();
        }
    }

    /* JADX INFO: renamed from: X0 */
    private AbstractActivityC2242c m9193X0() {
        for (Context baseContext = this.f7388v; baseContext != null; baseContext = ((ContextWrapper) baseContext).getBaseContext()) {
            if (baseContext instanceof AbstractActivityC2242c) {
                return (AbstractActivityC2242c) baseContext;
            }
            if (!(baseContext instanceof ContextWrapper)) {
                break;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Y0 */
    private void m9194Y0(Configuration configuration) {
        Activity activity = (Activity) this.f7387u;
        if (activity instanceof InterfaceC2657s) {
            if (((InterfaceC2657s) activity).mo419P().mo12626b().m12634d(AbstractC2650l.b.CREATED)) {
                activity.onConfigurationChanged(configuration);
            }
        } else {
            if (!this.f7368b0 || this.f7369c0) {
                return;
            }
            activity.onConfigurationChanged(configuration);
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x008c  */
    /* JADX INFO: renamed from: Z0 */
    private boolean m9195Z0(int i7, C0718j c0718j, boolean z7) {
        boolean z8;
        Configuration configurationM9196a0 = m9196a0(this.f7388v, i7, c0718j, null, false);
        int iM9203m0 = m9203m0(this.f7388v);
        Configuration configuration = this.f7370d0;
        if (configuration == null) {
            configuration = this.f7388v.getResources().getConfiguration();
        }
        int i8 = configuration.uiMode & 48;
        int i9 = configurationM9196a0.uiMode & 48;
        C0718j c0718jM9242p0 = m9242p0(configuration);
        C0718j c0718jM9242p1 = c0718j == null ? null : m9242p0(configurationM9196a0);
        int i10 = i8 != i9 ? 512 : 0;
        if (c0718jM9242p1 != null && !c0718jM9242p0.equals(c0718jM9242p1)) {
            i10 |= 8196;
        }
        boolean z9 = true;
        if (((~iM9203m0) & i10) != 0 && z7 && this.f7367a0 && (f7340x0 || this.f7368b0)) {
            Object obj = this.f7387u;
            if (!(obj instanceof Activity) || ((Activity) obj).isChild()) {
                z8 = false;
            } else {
                if (Build.VERSION.SDK_INT >= 31 && (i10 & 8192) != 0) {
                    ((Activity) this.f7387u).getWindow().getDecorView().setLayoutDirection(configurationM9196a0.getLayoutDirection());
                }
                AbstractC0101b.m387c((Activity) this.f7387u);
                z8 = true;
            }
        } else {
            z8 = false;
        }
        if (z8 || i10 == 0) {
            z9 = z8;
        } else {
            m9198b1(i9, c0718jM9242p1, (i10 & iM9203m0) == i10, null);
        }
        if (z9) {
            Object obj2 = this.f7387u;
            if (obj2 instanceof AbstractActivityC2242c) {
                if ((i10 & 512) != 0) {
                    ((AbstractActivityC2242c) obj2).m9125T0(i7);
                }
                if ((i10 & 4) != 0) {
                    ((AbstractActivityC2242c) this.f7387u).m9124S0(c0718j);
                }
            }
        }
        if (c0718jM9242p1 != null) {
            m9221Q0(m9242p0(this.f7388v.getResources().getConfiguration()));
        }
        return z9;
    }

    /* JADX INFO: renamed from: a0 */
    private Configuration m9196a0(Context context, int i7, C0718j c0718j, Configuration configuration, boolean z7) {
        int i8;
        if (i7 == 1) {
            i8 = 16;
        } else if (i7 != 2) {
            i8 = z7 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        } else {
            i8 = 32;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i8 | (configuration2.uiMode & (-49));
        if (c0718j != null) {
            m9219P0(configuration2, c0718j);
        }
        return configuration2;
    }

    /* JADX INFO: renamed from: b0 */
    private ViewGroup m9197b0() {
        ViewGroup viewGroup;
        TypedArray typedArrayObtainStyledAttributes = this.f7388v.obtainStyledAttributes(AbstractC5529j.f21346y0);
        int i7 = AbstractC5529j.f21130D0;
        if (!typedArrayObtainStyledAttributes.hasValue(i7)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(AbstractC5529j.f21170M0, false)) {
            mo9151F(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(i7, false)) {
            mo9151F(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(AbstractC5529j.f21135E0, false)) {
            mo9151F(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(AbstractC5529j.f21140F0, false)) {
            mo9151F(10);
        }
        this.f7361U = typedArrayObtainStyledAttributes.getBoolean(AbstractC5529j.f21351z0, false);
        typedArrayObtainStyledAttributes.recycle();
        m9201i0();
        this.f7389w.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f7388v);
        if (this.f7362V) {
            viewGroup = this.f7360T ? (ViewGroup) layoutInflaterFrom.inflate(AbstractC5526g.f21093o, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(AbstractC5526g.f21092n, (ViewGroup) null);
        } else if (this.f7361U) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(AbstractC5526g.f21084f, (ViewGroup) null);
            this.f7359S = false;
            this.f7358R = false;
        } else if (this.f7358R) {
            TypedValue typedValue = new TypedValue();
            this.f7388v.getTheme().resolveAttribute(AbstractC5520a.f20966d, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new C2268d(this.f7388v, typedValue.resourceId) : this.f7388v).inflate(AbstractC5526g.f21094p, (ViewGroup) null);
            InterfaceC2309G interfaceC2309G = (InterfaceC2309G) viewGroup.findViewById(AbstractC5525f.f21068p);
            this.f7343C = interfaceC2309G;
            interfaceC2309G.setWindowCallback(m9245s0());
            if (this.f7359S) {
                this.f7343C.mo9654h(109);
            }
            if (this.f7356P) {
                this.f7343C.mo9654h(2);
            }
            if (this.f7357Q) {
                this.f7343C.mo9654h(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f7358R + ", windowActionBarOverlay: " + this.f7359S + ", android:windowIsFloating: " + this.f7361U + ", windowActionModeOverlay: " + this.f7360T + ", windowNoTitle: " + this.f7362V + " }");
        }
        AbstractC1030Z.m4494t0(viewGroup, new b());
        if (this.f7343C == null) {
            this.f7354N = (TextView) viewGroup.findViewById(AbstractC5525f.f21049B);
        }
        AbstractC2362k0.m10113c(viewGroup);
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(AbstractC5525f.f21054b);
        ViewGroup viewGroup2 = (ViewGroup) this.f7389w.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f7389w.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new c());
        return viewGroup;
    }

    /* JADX INFO: renamed from: b1 */
    private void m9198b1(int i7, C0718j c0718j, boolean z7, Configuration configuration) {
        Resources resources = this.f7388v.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i7 | (resources.getConfiguration().uiMode & (-49));
        if (c0718j != null) {
            m9219P0(configuration2, c0718j);
        }
        resources.updateConfiguration(configuration2, null);
        int i8 = this.f7372f0;
        if (i8 != 0) {
            this.f7388v.setTheme(i8);
            this.f7388v.getTheme().applyStyle(this.f7372f0, true);
        }
        if (z7 && (this.f7387u instanceof Activity)) {
            m9194Y0(configuration2);
        }
    }

    /* JADX INFO: renamed from: d1 */
    private void m9199d1(View view) {
        view.setBackgroundColor((AbstractC1030Z.m4438J(view) & 8192) != 0 ? AbstractC2436b.getColor(this.f7388v, AbstractC5522c.f20991b) : AbstractC2436b.getColor(this.f7388v, AbstractC5522c.f20990a));
    }

    /* JADX INFO: renamed from: h0 */
    private void m9200h0() {
        if (this.f7352L) {
            return;
        }
        this.f7353M = m9197b0();
        CharSequence charSequenceM9244r0 = m9244r0();
        if (!TextUtils.isEmpty(charSequenceM9244r0)) {
            InterfaceC2309G interfaceC2309G = this.f7343C;
            if (interfaceC2309G != null) {
                interfaceC2309G.setWindowTitle(charSequenceM9244r0);
            } else if (m9218K0() != null) {
                m9218K0().mo9093s(charSequenceM9244r0);
            } else {
                TextView textView = this.f7354N;
                if (textView != null) {
                    textView.setText(charSequenceM9244r0);
                }
            }
        }
        m9187R();
        m9217I0(this.f7353M);
        this.f7352L = true;
        q qVarM9243q0 = m9243q0(0, false);
        if (this.f7369c0) {
            return;
        }
        if (qVarM9243q0 == null || qVarM9243q0.f7424j == null) {
            m9210x0(108);
        }
    }

    /* JADX INFO: renamed from: i0 */
    private void m9201i0() {
        if (this.f7389w == null) {
            Object obj = this.f7387u;
            if (obj instanceof Activity) {
                m9188S(((Activity) obj).getWindow());
            }
        }
        if (this.f7389w == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    /* JADX INFO: renamed from: k0 */
    private static Configuration m9202k0(Configuration configuration, Configuration configuration2) {
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = 0.0f;
        if (configuration2 != null && configuration.diff(configuration2) != 0) {
            float f7 = configuration.fontScale;
            float f8 = configuration2.fontScale;
            if (f7 != f8) {
                configuration3.fontScale = f8;
            }
            int i7 = configuration.mcc;
            int i8 = configuration2.mcc;
            if (i7 != i8) {
                configuration3.mcc = i8;
            }
            int i9 = configuration.mnc;
            int i10 = configuration2.mnc;
            if (i9 != i10) {
                configuration3.mnc = i10;
            }
            i.m9257a(configuration, configuration2, configuration3);
            int i11 = configuration.touchscreen;
            int i12 = configuration2.touchscreen;
            if (i11 != i12) {
                configuration3.touchscreen = i12;
            }
            int i13 = configuration.keyboard;
            int i14 = configuration2.keyboard;
            if (i13 != i14) {
                configuration3.keyboard = i14;
            }
            int i15 = configuration.keyboardHidden;
            int i16 = configuration2.keyboardHidden;
            if (i15 != i16) {
                configuration3.keyboardHidden = i16;
            }
            int i17 = configuration.navigation;
            int i18 = configuration2.navigation;
            if (i17 != i18) {
                configuration3.navigation = i18;
            }
            int i19 = configuration.navigationHidden;
            int i20 = configuration2.navigationHidden;
            if (i19 != i20) {
                configuration3.navigationHidden = i20;
            }
            int i21 = configuration.orientation;
            int i22 = configuration2.orientation;
            if (i21 != i22) {
                configuration3.orientation = i22;
            }
            int i23 = configuration.screenLayout & 15;
            int i24 = configuration2.screenLayout;
            if (i23 != (i24 & 15)) {
                configuration3.screenLayout |= i24 & 15;
            }
            int i25 = configuration.screenLayout & 192;
            int i26 = configuration2.screenLayout;
            if (i25 != (i26 & 192)) {
                configuration3.screenLayout |= i26 & 192;
            }
            int i27 = configuration.screenLayout & 48;
            int i28 = configuration2.screenLayout;
            if (i27 != (i28 & 48)) {
                configuration3.screenLayout |= i28 & 48;
            }
            int i29 = configuration.screenLayout & 768;
            int i30 = configuration2.screenLayout;
            if (i29 != (i30 & 768)) {
                configuration3.screenLayout |= i30 & 768;
            }
            j.m9261a(configuration, configuration2, configuration3);
            int i31 = configuration.uiMode & 15;
            int i32 = configuration2.uiMode;
            if (i31 != (i32 & 15)) {
                configuration3.uiMode |= i32 & 15;
            }
            int i33 = configuration.uiMode & 48;
            int i34 = configuration2.uiMode;
            if (i33 != (i34 & 48)) {
                configuration3.uiMode |= i34 & 48;
            }
            int i35 = configuration.screenWidthDp;
            int i36 = configuration2.screenWidthDp;
            if (i35 != i36) {
                configuration3.screenWidthDp = i36;
            }
            int i37 = configuration.screenHeightDp;
            int i38 = configuration2.screenHeightDp;
            if (i37 != i38) {
                configuration3.screenHeightDp = i38;
            }
            int i39 = configuration.smallestScreenWidthDp;
            int i40 = configuration2.smallestScreenWidthDp;
            if (i39 != i40) {
                configuration3.smallestScreenWidthDp = i40;
            }
            int i41 = configuration.densityDpi;
            int i42 = configuration2.densityDpi;
            if (i41 != i42) {
                configuration3.densityDpi = i42;
            }
        }
        return configuration3;
    }

    /* JADX INFO: renamed from: m0 */
    private int m9203m0(Context context) {
        if (!this.f7374h0 && (this.f7387u instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return 0;
            }
            try {
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, this.f7387u.getClass()), Build.VERSION.SDK_INT >= 29 ? 269221888 : 786432);
                if (activityInfo != null) {
                    this.f7373g0 = activityInfo.configChanges;
                }
            } catch (PackageManager.NameNotFoundException e7) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e7);
                this.f7373g0 = 0;
            }
        }
        this.f7374h0 = true;
        return this.f7373g0;
    }

    /* JADX INFO: renamed from: n0 */
    private n m9204n0(Context context) {
        if (this.f7376j0 == null) {
            this.f7376j0 = new m(context);
        }
        return this.f7376j0;
    }

    /* JADX INFO: renamed from: o0 */
    private n m9205o0(Context context) {
        if (this.f7375i0 == null) {
            this.f7375i0 = new o(C2262w.m9322a(context));
        }
        return this.f7375i0;
    }

    /* JADX INFO: renamed from: t0 */
    private void m9206t0() {
        m9200h0();
        if (this.f7358R && this.f7392z == null) {
            Object obj = this.f7387u;
            if (obj instanceof Activity) {
                this.f7392z = new C2264y((Activity) this.f7387u, this.f7359S);
            } else if (obj instanceof Dialog) {
                this.f7392z = new C2264y((Dialog) this.f7387u);
            }
            AbstractC2240a abstractC2240a = this.f7392z;
            if (abstractC2240a != null) {
                abstractC2240a.mo9091q(this.f7380n0);
            }
        }
    }

    /* JADX INFO: renamed from: u0 */
    private boolean m9207u0(q qVar) {
        View view = qVar.f7423i;
        if (view != null) {
            qVar.f7422h = view;
            return true;
        }
        if (qVar.f7424j == null) {
            return false;
        }
        if (this.f7345E == null) {
            this.f7345E = new r();
        }
        View view2 = (View) qVar.m9275a(this.f7345E);
        qVar.f7422h = view2;
        return view2 != null;
    }

    /* JADX INFO: renamed from: v0 */
    private boolean m9208v0(q qVar) {
        qVar.m9278d(m9241l0());
        qVar.f7421g = new p(qVar.f7426l);
        qVar.f7417c = 81;
        return true;
    }

    /* JADX INFO: renamed from: w0 */
    private boolean m9209w0(q qVar) {
        Resources.Theme themeNewTheme;
        Context context = this.f7388v;
        int i7 = qVar.f7415a;
        if ((i7 == 0 || i7 == 108) && this.f7343C != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(AbstractC5520a.f20966d, typedValue, true);
            if (typedValue.resourceId != 0) {
                themeNewTheme = context.getResources().newTheme();
                themeNewTheme.setTo(theme);
                themeNewTheme.applyStyle(typedValue.resourceId, true);
                themeNewTheme.resolveAttribute(AbstractC5520a.f20967e, typedValue, true);
            } else {
                theme.resolveAttribute(AbstractC5520a.f20967e, typedValue, true);
                themeNewTheme = null;
            }
            if (typedValue.resourceId != 0) {
                if (themeNewTheme == null) {
                    themeNewTheme = context.getResources().newTheme();
                    themeNewTheme.setTo(theme);
                }
                themeNewTheme.applyStyle(typedValue.resourceId, true);
            }
            if (themeNewTheme != null) {
                C2268d c2268d = new C2268d(context, 0);
                c2268d.getTheme().setTo(themeNewTheme);
                context = c2268d;
            }
        }
        C2280e c2280e = new C2280e(context);
        c2280e.mo9511W(this);
        qVar.m9277c(c2280e);
        return true;
    }

    /* JADX INFO: renamed from: x0 */
    private void m9210x0(int i7) {
        this.f7378l0 = (1 << i7) | this.f7378l0;
        if (this.f7377k0) {
            return;
        }
        AbstractC1030Z.m4458b0(this.f7389w.getDecorView(), this.f7379m0);
        this.f7377k0 = true;
    }

    @Override // androidx.appcompat.app.AbstractC2245f
    /* JADX INFO: renamed from: A */
    public void mo9148A(Bundle bundle) {
    }

    /* JADX INFO: renamed from: A0 */
    boolean m9211A0() {
        boolean z7 = this.f7366Z;
        this.f7366Z = false;
        q qVarM9243q0 = m9243q0(0, false);
        if (qVarM9243q0 != null && qVarM9243q0.f7429o) {
            if (!z7) {
                m9230Z(qVarM9243q0, true);
            }
            return true;
        }
        AbstractC2266b abstractC2266b = this.f7346F;
        if (abstractC2266b != null) {
            abstractC2266b.mo9352c();
            return true;
        }
        AbstractC2240a abstractC2240aMo9165r = mo9165r();
        return abstractC2240aMo9165r != null && abstractC2240aMo9165r.mo9081g();
    }

    @Override // androidx.appcompat.app.AbstractC2245f
    /* JADX INFO: renamed from: B */
    public void mo9149B() {
        m9186P(true, false);
    }

    /* JADX INFO: renamed from: B0 */
    boolean m9212B0(int i7, KeyEvent keyEvent) {
        if (i7 == 4) {
            this.f7366Z = (keyEvent.getFlags() & 128) != 0;
        } else if (i7 == 82) {
            m9178C0(0, keyEvent);
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.AbstractC2245f
    /* JADX INFO: renamed from: C */
    public void mo9150C() {
        AbstractC2240a abstractC2240aMo9165r = mo9165r();
        if (abstractC2240aMo9165r != null) {
            abstractC2240aMo9165r.mo9092r(false);
        }
    }

    /* JADX INFO: renamed from: D0 */
    boolean m9213D0(int i7, KeyEvent keyEvent) {
        AbstractC2240a abstractC2240aMo9165r = mo9165r();
        if (abstractC2240aMo9165r != null && abstractC2240aMo9165r.mo9088n(i7, keyEvent)) {
            return true;
        }
        q qVar = this.f7365Y;
        if (qVar != null && m9181L0(qVar, keyEvent.getKeyCode(), keyEvent, 1)) {
            q qVar2 = this.f7365Y;
            if (qVar2 != null) {
                qVar2.f7428n = true;
            }
            return true;
        }
        if (this.f7365Y == null) {
            q qVarM9243q0 = m9243q0(0, true);
            m9182M0(qVarM9243q0, keyEvent);
            boolean zM9181L0 = m9181L0(qVarM9243q0, keyEvent.getKeyCode(), keyEvent, 1);
            qVarM9243q0.f7427m = false;
            if (zM9181L0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: E0 */
    boolean m9214E0(int i7, KeyEvent keyEvent) {
        if (i7 != 4) {
            if (i7 == 82) {
                m9179F0(0, keyEvent);
                return true;
            }
        } else if (m9211A0()) {
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.AbstractC2245f
    /* JADX INFO: renamed from: F */
    public boolean mo9151F(int i7) {
        int iM9185O0 = m9185O0(i7);
        if (this.f7362V && iM9185O0 == 108) {
            return false;
        }
        if (this.f7358R && iM9185O0 == 1) {
            this.f7358R = false;
        }
        if (iM9185O0 == 1) {
            m9191W0();
            this.f7362V = true;
            return true;
        }
        if (iM9185O0 == 2) {
            m9191W0();
            this.f7356P = true;
            return true;
        }
        if (iM9185O0 == 5) {
            m9191W0();
            this.f7357Q = true;
            return true;
        }
        if (iM9185O0 == 10) {
            m9191W0();
            this.f7360T = true;
            return true;
        }
        if (iM9185O0 == 108) {
            m9191W0();
            this.f7358R = true;
            return true;
        }
        if (iM9185O0 != 109) {
            return this.f7389w.requestFeature(iM9185O0);
        }
        m9191W0();
        this.f7359S = true;
        return true;
    }

    @Override // androidx.appcompat.app.AbstractC2245f
    /* JADX INFO: renamed from: G */
    public void mo9152G(int i7) {
        m9200h0();
        ViewGroup viewGroup = (ViewGroup) this.f7353M.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f7388v).inflate(i7, viewGroup);
        this.f7390x.m9266c(this.f7389w.getCallback());
    }

    /* JADX INFO: renamed from: G0 */
    void m9215G0(int i7) {
        AbstractC2240a abstractC2240aMo9165r;
        if (i7 != 108 || (abstractC2240aMo9165r = mo9165r()) == null) {
            return;
        }
        abstractC2240aMo9165r.mo9082h(true);
    }

    @Override // androidx.appcompat.app.AbstractC2245f
    /* JADX INFO: renamed from: H */
    public void mo9153H(View view) {
        m9200h0();
        ViewGroup viewGroup = (ViewGroup) this.f7353M.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f7390x.m9266c(this.f7389w.getCallback());
    }

    /* JADX INFO: renamed from: H0 */
    void m9216H0(int i7) {
        if (i7 == 108) {
            AbstractC2240a abstractC2240aMo9165r = mo9165r();
            if (abstractC2240aMo9165r != null) {
                abstractC2240aMo9165r.mo9082h(false);
                return;
            }
            return;
        }
        if (i7 == 0) {
            q qVarM9243q0 = m9243q0(i7, true);
            if (qVarM9243q0.f7429o) {
                m9230Z(qVarM9243q0, false);
            }
        }
    }

    @Override // androidx.appcompat.app.AbstractC2245f
    /* JADX INFO: renamed from: I */
    public void mo9154I(View view, ViewGroup.LayoutParams layoutParams) {
        m9200h0();
        ViewGroup viewGroup = (ViewGroup) this.f7353M.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f7390x.m9266c(this.f7389w.getCallback());
    }

    /* JADX INFO: renamed from: I0 */
    void m9217I0(ViewGroup viewGroup) {
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002c  */
    @Override // androidx.appcompat.app.AbstractC2245f
    /* JADX INFO: renamed from: J */
    public void mo9155J(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        OnBackInvokedCallback onBackInvokedCallback;
        super.mo9155J(onBackInvokedDispatcher);
        OnBackInvokedDispatcher onBackInvokedDispatcher2 = this.f7385s0;
        if (onBackInvokedDispatcher2 != null && (onBackInvokedCallback = this.f7386t0) != null) {
            k.m9264c(onBackInvokedDispatcher2, onBackInvokedCallback);
            this.f7386t0 = null;
        }
        if (onBackInvokedDispatcher == null) {
            Object obj = this.f7387u;
            if (!(obj instanceof Activity) || ((Activity) obj).getWindow() == null) {
                this.f7385s0 = onBackInvokedDispatcher;
            } else {
                this.f7385s0 = k.m9262a((Activity) this.f7387u);
            }
        } else {
            this.f7385s0 = onBackInvokedDispatcher;
        }
        m9232a1();
    }

    @Override // androidx.appcompat.app.AbstractC2245f
    /* JADX INFO: renamed from: K */
    public void mo9156K(int i7) {
        this.f7372f0 = i7;
    }

    /* JADX INFO: renamed from: K0 */
    final AbstractC2240a m9218K0() {
        return this.f7392z;
    }

    @Override // androidx.appcompat.app.AbstractC2245f
    /* JADX INFO: renamed from: L */
    public final void mo9157L(CharSequence charSequence) {
        this.f7342B = charSequence;
        InterfaceC2309G interfaceC2309G = this.f7343C;
        if (interfaceC2309G != null) {
            interfaceC2309G.setWindowTitle(charSequence);
            return;
        }
        if (m9218K0() != null) {
            m9218K0().mo9093s(charSequence);
            return;
        }
        TextView textView = this.f7354N;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX INFO: renamed from: P0 */
    void m9219P0(Configuration configuration, C0718j c0718j) {
        i.m9260d(configuration, c0718j);
    }

    /* JADX INFO: renamed from: Q */
    public boolean m9220Q() {
        return m9184O(true);
    }

    /* JADX INFO: renamed from: Q0 */
    void m9221Q0(C0718j c0718j) {
        i.m9259c(c0718j);
    }

    /* JADX INFO: renamed from: R0 */
    final boolean m9222R0() {
        ViewGroup viewGroup;
        return this.f7352L && (viewGroup = this.f7353M) != null && viewGroup.isLaidOut();
    }

    /* JADX INFO: renamed from: T */
    C0718j m9223T(Context context) {
        C0718j c0718jM9146q;
        if (Build.VERSION.SDK_INT >= 33 || (c0718jM9146q = AbstractC2245f.m9146q()) == null) {
            return null;
        }
        C0718j c0718jM9242p0 = m9242p0(context.getApplicationContext().getResources().getConfiguration());
        C0718j c0718jM9319b = AbstractC2260u.m9319b(c0718jM9146q, c0718jM9242p0);
        return c0718jM9319b.m3476e() ? c0718jM9242p0 : c0718jM9319b;
    }

    /* JADX INFO: renamed from: T0 */
    boolean m9224T0() {
        if (this.f7385s0 == null) {
            return false;
        }
        q qVarM9243q0 = m9243q0(0, false);
        return (qVarM9243q0 != null && qVarM9243q0.f7429o) || this.f7346F != null;
    }

    /* JADX INFO: renamed from: U0 */
    public AbstractC2266b m9225U0(AbstractC2266b.a aVar) {
        InterfaceC2243d interfaceC2243d;
        if (aVar == null) {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        AbstractC2266b abstractC2266b = this.f7346F;
        if (abstractC2266b != null) {
            abstractC2266b.mo9352c();
        }
        g gVar = new g(aVar);
        AbstractC2240a abstractC2240aMo9165r = mo9165r();
        if (abstractC2240aMo9165r != null) {
            AbstractC2266b abstractC2266bMo9094t = abstractC2240aMo9165r.mo9094t(gVar);
            this.f7346F = abstractC2266bMo9094t;
            if (abstractC2266bMo9094t != null && (interfaceC2243d = this.f7391y) != null) {
                interfaceC2243d.mo9131i(abstractC2266bMo9094t);
            }
        }
        if (this.f7346F == null) {
            this.f7346F = m9227V0(gVar);
        }
        m9232a1();
        return this.f7346F;
    }

    /* JADX INFO: renamed from: V */
    void m9226V(int i7, q qVar, Menu menu) {
        if (menu == null) {
            if (qVar == null && i7 >= 0) {
                q[] qVarArr = this.f7364X;
                if (i7 < qVarArr.length) {
                    qVar = qVarArr[i7];
                }
            }
            if (qVar != null) {
                menu = qVar.f7424j;
            }
        }
        if ((qVar == null || qVar.f7429o) && !this.f7369c0) {
            this.f7390x.m9267d(this.f7389w.getCallback(), i7, menu);
        }
    }

    /* JADX INFO: renamed from: V0 */
    AbstractC2266b m9227V0(AbstractC2266b.a aVar) {
        AbstractC2266b abstractC2266bMo9133z;
        Context c2268d;
        InterfaceC2243d interfaceC2243d;
        m9239g0();
        AbstractC2266b abstractC2266b = this.f7346F;
        if (abstractC2266b != null) {
            abstractC2266b.mo9352c();
        }
        if (!(aVar instanceof g)) {
            aVar = new g(aVar);
        }
        InterfaceC2243d interfaceC2243d2 = this.f7391y;
        if (interfaceC2243d2 == null || this.f7369c0) {
            abstractC2266bMo9133z = null;
        } else {
            try {
                abstractC2266bMo9133z = interfaceC2243d2.mo9133z(aVar);
            } catch (AbstractMethodError unused) {
                abstractC2266bMo9133z = null;
            }
        }
        if (abstractC2266bMo9133z != null) {
            this.f7346F = abstractC2266bMo9133z;
        } else {
            if (this.f7347G == null) {
                if (this.f7361U) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = this.f7388v.getTheme();
                    theme.resolveAttribute(AbstractC5520a.f20966d, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme themeNewTheme = this.f7388v.getResources().newTheme();
                        themeNewTheme.setTo(theme);
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                        c2268d = new C2268d(this.f7388v, 0);
                        c2268d.getTheme().setTo(themeNewTheme);
                    } else {
                        c2268d = this.f7388v;
                    }
                    this.f7347G = new ActionBarContextView(c2268d);
                    PopupWindow popupWindow = new PopupWindow(c2268d, (AttributeSet) null, AbstractC5520a.f20968f);
                    this.f7348H = popupWindow;
                    AbstractC2457h.m10746b(popupWindow, 2);
                    this.f7348H.setContentView(this.f7347G);
                    this.f7348H.setWidth(-1);
                    c2268d.getTheme().resolveAttribute(AbstractC5520a.f20964b, typedValue, true);
                    this.f7347G.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, c2268d.getResources().getDisplayMetrics()));
                    this.f7348H.setHeight(-2);
                    this.f7349I = new d();
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) this.f7353M.findViewById(AbstractC5525f.f21060h);
                    if (viewStubCompat != null) {
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(m9241l0()));
                        this.f7347G = (ActionBarContextView) viewStubCompat.m9975a();
                    }
                }
            }
            if (this.f7347G != null) {
                m9239g0();
                this.f7347G.m9635k();
                C2269e c2269e = new C2269e(this.f7347G.getContext(), this.f7347G, aVar, this.f7348H == null);
                if (aVar.mo9252b(c2269e, c2269e.mo9354e())) {
                    c2269e.mo9358k();
                    this.f7347G.m9633h(c2269e);
                    this.f7346F = c2269e;
                    if (m9222R0()) {
                        this.f7347G.setAlpha(0.0f);
                        C1053i0 c1053i0M4684b = AbstractC1030Z.m4463e(this.f7347G).m4684b(1.0f);
                        this.f7350J = c1053i0M4684b;
                        c1053i0M4684b.m4689g(new e());
                    } else {
                        this.f7347G.setAlpha(1.0f);
                        this.f7347G.setVisibility(0);
                        if (this.f7347G.getParent() instanceof View) {
                            AbstractC1030Z.m4468g0((View) this.f7347G.getParent());
                        }
                    }
                    if (this.f7348H != null) {
                        this.f7389w.getDecorView().post(this.f7349I);
                    }
                } else {
                    this.f7346F = null;
                }
            }
        }
        AbstractC2266b abstractC2266b2 = this.f7346F;
        if (abstractC2266b2 != null && (interfaceC2243d = this.f7391y) != null) {
            interfaceC2243d.mo9131i(abstractC2266b2);
        }
        m9232a1();
        return this.f7346F;
    }

    /* JADX INFO: renamed from: W */
    void m9228W(C2280e c2280e) {
        if (this.f7363W) {
            return;
        }
        this.f7363W = true;
        this.f7343C.mo9655i();
        Window.Callback callbackM9245s0 = m9245s0();
        if (callbackM9245s0 != null && !this.f7369c0) {
            callbackM9245s0.onPanelClosed(108, c2280e);
        }
        this.f7363W = false;
    }

    /* JADX INFO: renamed from: Y */
    void m9229Y(int i7) {
        m9230Z(m9243q0(i7, true), true);
    }

    /* JADX INFO: renamed from: Z */
    void m9230Z(q qVar, boolean z7) {
        ViewGroup viewGroup;
        InterfaceC2309G interfaceC2309G;
        if (z7 && qVar.f7415a == 0 && (interfaceC2309G = this.f7343C) != null && interfaceC2309G.mo9648b()) {
            m9228W(qVar.f7424j);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f7388v.getSystemService("window");
        if (windowManager != null && qVar.f7429o && (viewGroup = qVar.f7421g) != null) {
            windowManager.removeView(viewGroup);
            if (z7) {
                m9226V(qVar.f7415a, qVar, null);
            }
        }
        qVar.f7427m = false;
        qVar.f7428n = false;
        qVar.f7429o = false;
        qVar.f7422h = null;
        qVar.f7431q = true;
        if (this.f7365Y == qVar) {
            this.f7365Y = null;
        }
        if (qVar.f7415a == 0) {
            m9232a1();
        }
    }

    @Override // androidx.appcompat.view.menu.C2280e.a
    /* JADX INFO: renamed from: a */
    public boolean mo9231a(C2280e c2280e, MenuItem menuItem) {
        q qVarM9240j0;
        Window.Callback callbackM9245s0 = m9245s0();
        if (callbackM9245s0 == null || this.f7369c0 || (qVarM9240j0 = m9240j0(c2280e.mo9495F())) == null) {
            return false;
        }
        return callbackM9245s0.onMenuItemSelected(qVarM9240j0.f7415a, menuItem);
    }

    /* JADX INFO: renamed from: a1 */
    void m9232a1() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean zM9224T0 = m9224T0();
            if (zM9224T0 && this.f7386t0 == null) {
                this.f7386t0 = k.m9263b(this.f7385s0, this);
            } else {
                if (zM9224T0 || (onBackInvokedCallback = this.f7386t0) == null) {
                    return;
                }
                k.m9264c(this.f7385s0, onBackInvokedCallback);
                this.f7386t0 = null;
            }
        }
    }

    @Override // androidx.appcompat.view.menu.C2280e.a
    /* JADX INFO: renamed from: b */
    public void mo9233b(C2280e c2280e) {
        m9183N0(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c0 */
    public View m9234c0(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z7;
        boolean zM9189S0 = false;
        if (this.f7383q0 == null) {
            TypedArray typedArrayObtainStyledAttributes = this.f7388v.obtainStyledAttributes(AbstractC5529j.f21346y0);
            String string = typedArrayObtainStyledAttributes.getString(AbstractC5529j.f21125C0);
            typedArrayObtainStyledAttributes.recycle();
            if (string == null) {
                this.f7383q0 = new C2257r();
            } else {
                try {
                    this.f7383q0 = (C2257r) this.f7388v.getClassLoader().loadClass(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.f7383q0 = new C2257r();
                }
            }
        }
        boolean z8 = f7338v0;
        if (z8) {
            if (this.f7384r0 == null) {
                this.f7384r0 = new C2259t();
            }
            if (this.f7384r0.m9317a(attributeSet)) {
                z7 = true;
            } else {
                if (!(attributeSet instanceof XmlPullParser)) {
                    zM9189S0 = m9189S0((ViewParent) view);
                } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                    zM9189S0 = true;
                }
                z7 = zM9189S0;
            }
        } else {
            z7 = zM9189S0;
        }
        return this.f7383q0.m9310r(view, str, context, attributeSet, z7, z8, true, C2360j0.m10105c());
    }

    /* JADX INFO: renamed from: c1 */
    final int m9235c1(C0982A0 c0982a0, Rect rect) {
        int iM4278l;
        boolean z7;
        boolean z8;
        if (c0982a0 != null) {
            iM4278l = c0982a0.m4278l();
        } else {
            iM4278l = rect != null ? rect.top : 0;
        }
        ActionBarContextView actionBarContextView = this.f7347G;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z7 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f7347G.getLayoutParams();
            boolean z9 = true;
            if (this.f7347G.isShown()) {
                if (this.f7381o0 == null) {
                    this.f7381o0 = new Rect();
                    this.f7382p0 = new Rect();
                }
                Rect rect2 = this.f7381o0;
                Rect rect3 = this.f7382p0;
                if (c0982a0 == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(c0982a0.m4276j(), c0982a0.m4278l(), c0982a0.m4277k(), c0982a0.m4275i());
                }
                AbstractC2362k0.m10111a(this.f7353M, rect2, rect3);
                int i7 = rect2.top;
                int i8 = rect2.left;
                int i9 = rect2.right;
                C0982A0 c0982a0M4433E = AbstractC1030Z.m4433E(this.f7353M);
                int iM4276j = c0982a0M4433E == null ? 0 : c0982a0M4433E.m4276j();
                int iM4277k = c0982a0M4433E == null ? 0 : c0982a0M4433E.m4277k();
                if (marginLayoutParams.topMargin == i7 && marginLayoutParams.leftMargin == i8 && marginLayoutParams.rightMargin == i9) {
                    z8 = false;
                } else {
                    marginLayoutParams.topMargin = i7;
                    marginLayoutParams.leftMargin = i8;
                    marginLayoutParams.rightMargin = i9;
                    z8 = true;
                }
                if (i7 <= 0 || this.f7355O != null) {
                    View view = this.f7355O;
                    if (view != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                        int i10 = marginLayoutParams2.height;
                        int i11 = marginLayoutParams.topMargin;
                        if (i10 != i11 || marginLayoutParams2.leftMargin != iM4276j || marginLayoutParams2.rightMargin != iM4277k) {
                            marginLayoutParams2.height = i11;
                            marginLayoutParams2.leftMargin = iM4276j;
                            marginLayoutParams2.rightMargin = iM4277k;
                            this.f7355O.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view2 = new View(this.f7388v);
                    this.f7355O = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = iM4276j;
                    layoutParams.rightMargin = iM4277k;
                    this.f7353M.addView(this.f7355O, -1, layoutParams);
                }
                View view3 = this.f7355O;
                z9 = view3 != null;
                if (z9 && view3.getVisibility() != 0) {
                    m9199d1(this.f7355O);
                }
                if (!this.f7360T && z9) {
                    iM4278l = 0;
                }
                z7 = z9;
                z9 = z8;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z7 = false;
            } else {
                z7 = false;
                z9 = false;
            }
            if (z9) {
                this.f7347G.setLayoutParams(marginLayoutParams);
            }
        }
        View view4 = this.f7355O;
        if (view4 != null) {
            view4.setVisibility(z7 ? 0 : 8);
        }
        return iM4278l;
    }

    /* JADX INFO: renamed from: d0 */
    void m9236d0() {
        C2280e c2280e;
        InterfaceC2309G interfaceC2309G = this.f7343C;
        if (interfaceC2309G != null) {
            interfaceC2309G.mo9655i();
        }
        if (this.f7348H != null) {
            this.f7389w.getDecorView().removeCallbacks(this.f7349I);
            if (this.f7348H.isShowing()) {
                try {
                    this.f7348H.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.f7348H = null;
        }
        m9239g0();
        q qVarM9243q0 = m9243q0(0, false);
        if (qVarM9243q0 == null || (c2280e = qVarM9243q0.f7424j) == null) {
            return;
        }
        c2280e.close();
    }

    @Override // androidx.appcompat.app.AbstractC2245f
    /* JADX INFO: renamed from: e */
    public void mo9158e(View view, ViewGroup.LayoutParams layoutParams) {
        m9200h0();
        ((ViewGroup) this.f7353M.findViewById(R.id.content)).addView(view, layoutParams);
        this.f7390x.m9266c(this.f7389w.getCallback());
    }

    /* JADX INFO: renamed from: e0 */
    boolean m9237e0(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.f7387u;
        if (((obj instanceof AbstractC1076u.a) || (obj instanceof DialogC2255p)) && (decorView = this.f7389w.getDecorView()) != null && AbstractC1076u.m4776d(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.f7390x.m9265b(this.f7389w.getCallback(), keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        return keyEvent.getAction() == 0 ? m9212B0(keyCode, keyEvent) : m9214E0(keyCode, keyEvent);
    }

    /* JADX INFO: renamed from: f0 */
    void m9238f0(int i7) {
        q qVarM9243q0;
        q qVarM9243q1 = m9243q0(i7, true);
        if (qVarM9243q1.f7424j != null) {
            Bundle bundle = new Bundle();
            qVarM9243q1.f7424j.m9509U(bundle);
            if (bundle.size() > 0) {
                qVarM9243q1.f7433s = bundle;
            }
            qVarM9243q1.f7424j.m9528i0();
            qVarM9243q1.f7424j.clear();
        }
        qVarM9243q1.f7432r = true;
        qVarM9243q1.f7431q = true;
        if ((i7 != 108 && i7 != 0) || this.f7343C == null || (qVarM9243q0 = m9243q0(0, false)) == null) {
            return;
        }
        qVarM9243q0.f7427m = false;
        m9182M0(qVarM9243q0, null);
    }

    @Override // androidx.appcompat.app.AbstractC2245f
    /* JADX INFO: renamed from: g */
    public Context mo9160g(Context context) {
        Context context2;
        this.f7367a0 = true;
        int iM9247z0 = m9247z0(context, m9190U());
        if (AbstractC2245f.m9147u(context)) {
            AbstractC2245f.m9138N(context);
        }
        C0718j c0718jM9223T = m9223T(context);
        if (context instanceof ContextThemeWrapper) {
            context2 = context;
            try {
                ((ContextThemeWrapper) context2).applyOverrideConfiguration(m9196a0(context2, iM9247z0, c0718jM9223T, null, false));
                return context2;
            } catch (IllegalStateException unused) {
            }
        } else {
            context2 = context;
        }
        if (context2 instanceof C2268d) {
            try {
                ((C2268d) context2).m9381a(m9196a0(context2, iM9247z0, c0718jM9223T, null, false));
                return context2;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!f7340x0) {
            return super.mo9160g(context2);
        }
        Configuration configuration = new Configuration();
        configuration.uiMode = -1;
        configuration.fontScale = 0.0f;
        Configuration configuration2 = context2.createConfigurationContext(configuration).getResources().getConfiguration();
        Configuration configuration3 = context2.getResources().getConfiguration();
        configuration2.uiMode = configuration3.uiMode;
        Configuration configurationM9196a0 = m9196a0(context2, iM9247z0, c0718jM9223T, !configuration2.equals(configuration3) ? m9202k0(configuration2, configuration3) : null, true);
        C2268d c2268d = new C2268d(context2, AbstractC5528i.f21111c);
        c2268d.m9381a(configurationM9196a0);
        try {
            if (context2.getTheme() != null) {
                AbstractC0165h.f.m833a(c2268d.getTheme());
            }
        } catch (NullPointerException unused3) {
        }
        return super.mo9160g(c2268d);
    }

    /* JADX INFO: renamed from: g0 */
    void m9239g0() {
        C1053i0 c1053i0 = this.f7350J;
        if (c1053i0 != null) {
            c1053i0.m4685c();
        }
    }

    @Override // androidx.appcompat.app.AbstractC2245f
    /* JADX INFO: renamed from: j */
    public View mo9161j(int i7) {
        m9200h0();
        return this.f7389w.findViewById(i7);
    }

    /* JADX INFO: renamed from: j0 */
    q m9240j0(Menu menu) {
        q[] qVarArr = this.f7364X;
        int length = qVarArr != null ? qVarArr.length : 0;
        for (int i7 = 0; i7 < length; i7++) {
            q qVar = qVarArr[i7];
            if (qVar != null && qVar.f7424j == menu) {
                return qVar;
            }
        }
        return null;
    }

    @Override // androidx.appcompat.app.AbstractC2245f
    /* JADX INFO: renamed from: l */
    public Context mo9162l() {
        return this.f7388v;
    }

    /* JADX INFO: renamed from: l0 */
    final Context m9241l0() {
        AbstractC2240a abstractC2240aMo9165r = mo9165r();
        Context contextMo9084j = abstractC2240aMo9165r != null ? abstractC2240aMo9165r.mo9084j() : null;
        return contextMo9084j == null ? this.f7388v : contextMo9084j;
    }

    @Override // androidx.appcompat.app.AbstractC2245f
    /* JADX INFO: renamed from: n */
    public int mo9163n() {
        return this.f7371e0;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return m9234c0(view, str, context, attributeSet);
    }

    @Override // androidx.appcompat.app.AbstractC2245f
    /* JADX INFO: renamed from: p */
    public MenuInflater mo9164p() {
        if (this.f7341A == null) {
            m9206t0();
            AbstractC2240a abstractC2240a = this.f7392z;
            this.f7341A = new C2271g(abstractC2240a != null ? abstractC2240a.mo9084j() : this.f7388v);
        }
        return this.f7341A;
    }

    /* JADX INFO: renamed from: p0 */
    C0718j m9242p0(Configuration configuration) {
        return i.m9258b(configuration);
    }

    /* JADX INFO: renamed from: q0 */
    protected q m9243q0(int i7, boolean z7) {
        q[] qVarArr = this.f7364X;
        if (qVarArr == null || qVarArr.length <= i7) {
            q[] qVarArr2 = new q[i7 + 1];
            if (qVarArr != null) {
                System.arraycopy(qVarArr, 0, qVarArr2, 0, qVarArr.length);
            }
            this.f7364X = qVarArr2;
            qVarArr = qVarArr2;
        }
        q qVar = qVarArr[i7];
        if (qVar != null) {
            return qVar;
        }
        q qVar2 = new q(i7);
        qVarArr[i7] = qVar2;
        return qVar2;
    }

    @Override // androidx.appcompat.app.AbstractC2245f
    /* JADX INFO: renamed from: r */
    public AbstractC2240a mo9165r() {
        m9206t0();
        return this.f7392z;
    }

    /* JADX INFO: renamed from: r0 */
    final CharSequence m9244r0() {
        Object obj = this.f7387u;
        return obj instanceof Activity ? ((Activity) obj).getTitle() : this.f7342B;
    }

    @Override // androidx.appcompat.app.AbstractC2245f
    /* JADX INFO: renamed from: s */
    public void mo9166s() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f7388v);
        if (layoutInflaterFrom.getFactory() == null) {
            AbstractC1078v.m4780a(layoutInflaterFrom, this);
        } else {
            if (layoutInflaterFrom.getFactory2() instanceof LayoutInflaterFactory2C2247h) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    /* JADX INFO: renamed from: s0 */
    final Window.Callback m9245s0() {
        return this.f7389w.getCallback();
    }

    @Override // androidx.appcompat.app.AbstractC2245f
    /* JADX INFO: renamed from: t */
    public void mo9167t() {
        if (m9218K0() == null || mo9165r().m9085k()) {
            return;
        }
        m9210x0(0);
    }

    @Override // androidx.appcompat.app.AbstractC2245f
    /* JADX INFO: renamed from: v */
    public void mo9168v(Configuration configuration) {
        AbstractC2240a abstractC2240aMo9165r;
        if (this.f7358R && this.f7352L && (abstractC2240aMo9165r = mo9165r()) != null) {
            abstractC2240aMo9165r.mo9086l(configuration);
        }
        C2359j.m10088b().m10095g(this.f7388v);
        this.f7370d0 = new Configuration(this.f7388v.getResources().getConfiguration());
        m9186P(false, false);
    }

    @Override // androidx.appcompat.app.AbstractC2245f
    /* JADX INFO: renamed from: w */
    public void mo9169w(Bundle bundle) {
        String strM427c;
        this.f7367a0 = true;
        m9184O(false);
        m9201i0();
        Object obj = this.f7387u;
        if (obj instanceof Activity) {
            try {
                strM427c = AbstractC0109j.m427c((Activity) obj);
            } catch (IllegalArgumentException unused) {
                strM427c = null;
            }
            if (strM427c != null) {
                AbstractC2240a abstractC2240aM9218K0 = m9218K0();
                if (abstractC2240aM9218K0 == null) {
                    this.f7380n0 = true;
                } else {
                    abstractC2240aM9218K0.mo9091q(true);
                }
            }
            AbstractC2245f.m9140d(this);
        }
        this.f7370d0 = new Configuration(this.f7388v.getResources().getConfiguration());
        this.f7368b0 = true;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0045  */
    @Override // androidx.appcompat.app.AbstractC2245f
    /* JADX INFO: renamed from: x */
    public void mo9170x() {
        if (this.f7387u instanceof Activity) {
            AbstractC2245f.m9135D(this);
        }
        if (this.f7377k0) {
            this.f7389w.getDecorView().removeCallbacks(this.f7379m0);
        }
        this.f7369c0 = true;
        if (this.f7371e0 != -100) {
            Object obj = this.f7387u;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                f7337u0.put(this.f7387u.getClass().getName(), Integer.valueOf(this.f7371e0));
            } else {
                f7337u0.remove(this.f7387u.getClass().getName());
            }
        } else {
            f7337u0.remove(this.f7387u.getClass().getName());
        }
        AbstractC2240a abstractC2240a = this.f7392z;
        if (abstractC2240a != null) {
            abstractC2240a.m9087m();
        }
        m9192X();
    }

    @Override // androidx.appcompat.app.AbstractC2245f
    /* JADX INFO: renamed from: y */
    public void mo9171y(Bundle bundle) {
        m9200h0();
    }

    /* JADX INFO: renamed from: y0 */
    public boolean m9246y0() {
        return this.f7351K;
    }

    @Override // androidx.appcompat.app.AbstractC2245f
    /* JADX INFO: renamed from: z */
    public void mo9172z() {
        AbstractC2240a abstractC2240aMo9165r = mo9165r();
        if (abstractC2240aMo9165r != null) {
            abstractC2240aMo9165r.mo9092r(true);
        }
    }

    /* JADX INFO: renamed from: z0 */
    int m9247z0(Context context, int i7) {
        if (i7 == -100) {
            return -1;
        }
        if (i7 != -1) {
            if (i7 == 0) {
                if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                    return -1;
                }
                return m9205o0(context).mo9270c();
            }
            if (i7 != 1 && i7 != 2) {
                if (i7 == 3) {
                    return m9204n0(context).mo9270c();
                }
                throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
            }
        }
        return i7;
    }

    LayoutInflaterFactory2C2247h(Dialog dialog, InterfaceC2243d interfaceC2243d) {
        this(dialog.getContext(), dialog.getWindow(), interfaceC2243d, dialog);
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    private LayoutInflaterFactory2C2247h(Context context, Window window, InterfaceC2243d interfaceC2243d, Object obj) {
        AbstractActivityC2242c abstractActivityC2242cM9193X0;
        this.f7350J = null;
        this.f7351K = true;
        this.f7371e0 = -100;
        this.f7379m0 = new a();
        this.f7388v = context;
        this.f7391y = interfaceC2243d;
        this.f7387u = obj;
        if (this.f7371e0 == -100 && (obj instanceof Dialog) && (abstractActivityC2242cM9193X0 = m9193X0()) != null) {
            this.f7371e0 = abstractActivityC2242cM9193X0.m9121O0().mo9163n();
        }
        if (this.f7371e0 == -100) {
            C2400k c2400k = f7337u0;
            Integer num = (Integer) c2400k.get(obj.getClass().getName());
            if (num != null) {
                this.f7371e0 = num.intValue();
                c2400k.remove(obj.getClass().getName());
            }
        }
        if (window != null) {
            m9188S(window);
        }
        C2359j.m10090h();
    }
}
