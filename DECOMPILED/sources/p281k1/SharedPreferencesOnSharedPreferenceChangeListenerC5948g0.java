package p281k1;

import android.animation.ValueAnimator;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Insets;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.ContextThemeWrapper;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.OrientationEventListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityWindowInfo;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.cardview.widget.CardView;
import com.anas_mugally.clipboard.AbstractC3041D;
import com.anas_mugally.clipboard.C3034A;
import com.anas_mugally.clipboard.C3150x;
import com.anas_mugally.clipboard.R;
import com.anas_mugally.clipboard.broadcastReceiver.ScannerReceiver;
import com.anas_mugally.clipboard.database.AppDatabase;
import com.anas_mugally.clipboard.p221ui.BubbleCustomizationActivity;
import com.anas_mugally.clipboard.p221ui.SearchActivity;
import com.anas_mugally.clipboard.p221ui.SettingActivity;
import com.anas_mugally.clipboard.p221ui.TextDialogActivity;
import com.anas_mugally.clipboard.p221ui.accessibilitySetting.AccessibilitySettingActivity;
import com.anas_mugally.clipboard.p221ui.addText.AddNoteActivity;
import com.anas_mugally.clipboard.p221ui.notes.BrowseNotesDialogActivity;
import com.anas_mugally.clipboard.p221ui.p222ai.AiTextProcessingActivity;
import com.anas_mugally.clipboard.p221ui.temporaryNotes.BrowserTemporaryTextActivity;
import com.anas_mugally.clipboard.service.MyAccessibilityService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.AbstractC6087b;
import kotlin.coroutines.jvm.internal.AbstractC6097l;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import kotlin.jvm.internal.C6099B;
import kotlin.jvm.internal.C6128x;
import kotlin.jvm.internal.C6129y;
import p000.C5446g;
import p145S5.AbstractC1430h;
import p145S5.AbstractC1437o;
import p145S5.C1435m;
import p145S5.C1444v;
import p145S5.InterfaceC1429g;
import p152T5.AbstractC1638q;
import p173W5.InterfaceC1875e;
import p180X5.AbstractC2005b;
import p225d1.C5211c;
import p238e6.InterfaceC5356a;
import p238e6.InterfaceC5367l;
import p238e6.InterfaceC5371p;
import p265i1.C5678g;
import p265i1.C5681j;
import p318o6.AbstractC6615I0;
import p318o6.AbstractC6626O;
import p318o6.AbstractC6634S0;
import p318o6.AbstractC6645Y;
import p318o6.AbstractC6668i;
import p318o6.AbstractC6672k;
import p318o6.C6656c0;
import p318o6.InterfaceC6624N;
import p318o6.InterfaceC6701y0;

/* JADX INFO: renamed from: k1.g0 */
/* JADX INFO: loaded from: classes.dex */
public final class SharedPreferencesOnSharedPreferenceChangeListenerC5948g0 implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* JADX INFO: renamed from: b0 */
    private static SharedPreferencesOnSharedPreferenceChangeListenerC5948g0 f23554b0;

    /* JADX INFO: renamed from: c0 */
    private static int f23555c0;

    /* JADX INFO: renamed from: A */
    private int f23562A;

    /* JADX INFO: renamed from: B */
    private int f23563B;

    /* JADX INFO: renamed from: C */
    private int f23564C;

    /* JADX INFO: renamed from: D */
    private int f23565D;

    /* JADX INFO: renamed from: E */
    private int f23566E;

    /* JADX INFO: renamed from: F */
    private float f23567F;

    /* JADX INFO: renamed from: G */
    private int f23568G;

    /* JADX INFO: renamed from: H */
    private OrientationEventListener f23569H;

    /* JADX INFO: renamed from: I */
    private int f23570I;

    /* JADX INFO: renamed from: J */
    private int f23571J;

    /* JADX INFO: renamed from: K */
    private C1435m f23572K;

    /* JADX INFO: renamed from: L */
    private final int f23573L;

    /* JADX INFO: renamed from: M */
    private TextView f23574M;

    /* JADX INFO: renamed from: N */
    private ViewGroup f23575N;

    /* JADX INFO: renamed from: O */
    private WindowManager.LayoutParams f23576O;

    /* JADX INFO: renamed from: P */
    private boolean f23577P;

    /* JADX INFO: renamed from: Q */
    private int f23578Q;

    /* JADX INFO: renamed from: R */
    private int f23579R;

    /* JADX INFO: renamed from: S */
    private ViewGroup f23580S;

    /* JADX INFO: renamed from: T */
    private WindowManager.LayoutParams f23581T;

    /* JADX INFO: renamed from: U */
    private AccessibilityNodeInfo f23582U;

    /* JADX INFO: renamed from: V */
    private final WindowManager.LayoutParams f23583V;

    /* JADX INFO: renamed from: W */
    private final InterfaceC6624N f23584W;

    /* JADX INFO: renamed from: X */
    private C5681j f23585X;

    /* JADX INFO: renamed from: Y */
    private WindowManager f23586Y;

    /* JADX INFO: renamed from: Z */
    private final InterfaceC1429g f23587Z;

    /* JADX INFO: renamed from: a */
    private final Context f23588a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC1429g f23589b;

    /* JADX INFO: renamed from: c */
    private int f23590c;

    /* JADX INFO: renamed from: d */
    private boolean f23591d;

    /* JADX INFO: renamed from: e */
    private final MyAccessibilityService f23592e;

    /* JADX INFO: renamed from: f */
    private int f23593f;

    /* JADX INFO: renamed from: r */
    private int f23594r;

    /* JADX INFO: renamed from: s */
    private int f23595s;

    /* JADX INFO: renamed from: t */
    private float f23596t;

    /* JADX INFO: renamed from: u */
    private float f23597u;

    /* JADX INFO: renamed from: v */
    private final long f23598v;

    /* JADX INFO: renamed from: w */
    private ViewGroup f23599w;

    /* JADX INFO: renamed from: x */
    private WindowManager.LayoutParams f23600x;

    /* JADX INFO: renamed from: y */
    private int f23601y;

    /* JADX INFO: renamed from: z */
    private int f23602z;

    /* JADX INFO: renamed from: a0 */
    public static final a f23553a0 = new a(null);

    /* JADX INFO: renamed from: d0 */
    private static int f23556d0 = 1;

    /* JADX INFO: renamed from: e0 */
    private static int f23557e0 = 2;

    /* JADX INFO: renamed from: f0 */
    private static int f23558f0 = 3;

    /* JADX INFO: renamed from: g0 */
    private static int f23559g0 = 4;

    /* JADX INFO: renamed from: h0 */
    private static int f23560h0 = 5;

    /* JADX INFO: renamed from: i0 */
    private static int f23561i0 = 6;

    /* JADX INFO: renamed from: k1.g0$a */
    public static final class a {
        public /* synthetic */ a(AbstractC6112h abstractC6112h) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final void m26814a() {
            SharedPreferencesOnSharedPreferenceChangeListenerC5948g0 sharedPreferencesOnSharedPreferenceChangeListenerC5948g0M26815b = m26815b();
            AbstractC6118n.m27184b(sharedPreferencesOnSharedPreferenceChangeListenerC5948g0M26815b);
            C5681j c5681jM26812j0 = sharedPreferencesOnSharedPreferenceChangeListenerC5948g0M26815b.m26812j0();
            if (c5681jM26812j0 != null) {
                c5681jM26812j0.m25222f(null, null);
            }
        }

        /* JADX INFO: renamed from: b */
        public final SharedPreferencesOnSharedPreferenceChangeListenerC5948g0 m26815b() {
            return SharedPreferencesOnSharedPreferenceChangeListenerC5948g0.f23554b0;
        }

        /* JADX INFO: renamed from: c */
        public final SharedPreferencesOnSharedPreferenceChangeListenerC5948g0 m26816c(Context context) {
            SharedPreferencesOnSharedPreferenceChangeListenerC5948g0 sharedPreferencesOnSharedPreferenceChangeListenerC5948g0M26815b;
            AbstractC6118n.m27187e(context, "context");
            SharedPreferencesOnSharedPreferenceChangeListenerC5948g0 sharedPreferencesOnSharedPreferenceChangeListenerC5948g0M26815b2 = m26815b();
            if (sharedPreferencesOnSharedPreferenceChangeListenerC5948g0M26815b2 != null) {
                return sharedPreferencesOnSharedPreferenceChangeListenerC5948g0M26815b2;
            }
            synchronized (this) {
                a aVar = SharedPreferencesOnSharedPreferenceChangeListenerC5948g0.f23553a0;
                sharedPreferencesOnSharedPreferenceChangeListenerC5948g0M26815b = aVar.m26815b();
                if (sharedPreferencesOnSharedPreferenceChangeListenerC5948g0M26815b == null) {
                    sharedPreferencesOnSharedPreferenceChangeListenerC5948g0M26815b = new SharedPreferencesOnSharedPreferenceChangeListenerC5948g0(context, null);
                    aVar.m26824k(sharedPreferencesOnSharedPreferenceChangeListenerC5948g0M26815b);
                }
            }
            return sharedPreferencesOnSharedPreferenceChangeListenerC5948g0M26815b;
        }

        /* JADX INFO: renamed from: d */
        public final int m26817d() {
            return SharedPreferencesOnSharedPreferenceChangeListenerC5948g0.f23559g0;
        }

        /* JADX INFO: renamed from: e */
        public final int m26818e() {
            return SharedPreferencesOnSharedPreferenceChangeListenerC5948g0.f23556d0;
        }

        /* JADX INFO: renamed from: f */
        public final int m26819f() {
            return SharedPreferencesOnSharedPreferenceChangeListenerC5948g0.f23557e0;
        }

        /* JADX INFO: renamed from: g */
        public final int m26820g() {
            return SharedPreferencesOnSharedPreferenceChangeListenerC5948g0.f23561i0;
        }

        /* JADX INFO: renamed from: h */
        public final int m26821h() {
            return SharedPreferencesOnSharedPreferenceChangeListenerC5948g0.f23560h0;
        }

        /* JADX INFO: renamed from: i */
        public final int m26822i() {
            return SharedPreferencesOnSharedPreferenceChangeListenerC5948g0.f23555c0;
        }

        /* JADX INFO: renamed from: j */
        public final int m26823j() {
            return SharedPreferencesOnSharedPreferenceChangeListenerC5948g0.f23558f0;
        }

        /* JADX INFO: renamed from: k */
        public final void m26824k(SharedPreferencesOnSharedPreferenceChangeListenerC5948g0 sharedPreferencesOnSharedPreferenceChangeListenerC5948g0) {
            SharedPreferencesOnSharedPreferenceChangeListenerC5948g0.f23554b0 = sharedPreferencesOnSharedPreferenceChangeListenerC5948g0;
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: k1.g0$b */
    static final class b extends AbstractC6097l implements InterfaceC5371p {

        /* JADX INFO: renamed from: a */
        int f23603a;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ AccessibilityNodeInfo f23605c;

        /* JADX INFO: renamed from: k1.g0$b$a */
        static final class a extends AbstractC6097l implements InterfaceC5371p {

            /* JADX INFO: renamed from: a */
            int f23606a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ SharedPreferencesOnSharedPreferenceChangeListenerC5948g0 f23607b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ List f23608c;

            /* JADX INFO: renamed from: d */
            final /* synthetic */ AccessibilityNodeInfo f23609d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(SharedPreferencesOnSharedPreferenceChangeListenerC5948g0 sharedPreferencesOnSharedPreferenceChangeListenerC5948g0, List list, AccessibilityNodeInfo accessibilityNodeInfo, InterfaceC1875e interfaceC1875e) {
                super(2, interfaceC1875e);
                this.f23607b = sharedPreferencesOnSharedPreferenceChangeListenerC5948g0;
                this.f23608c = list;
                this.f23609d = accessibilityNodeInfo;
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
                return new a(this.f23607b, this.f23608c, this.f23609d, interfaceC1875e);
            }

            @Override // p238e6.InterfaceC5371p
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
                return ((a) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final Object invokeSuspend(Object obj) {
                String strM24112f;
                AbstractC2005b.m8369e();
                if (this.f23606a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1437o.m6082b(obj);
                MyAccessibilityService myAccessibilityService = this.f23607b.f23592e;
                if (myAccessibilityService != null) {
                    C5211c c5211c = (C5211c) AbstractC1638q.m6572L(this.f23608c);
                    if (c5211c == null || (strM24112f = c5211c.m24112f()) == null) {
                        strM24112f = "";
                    }
                    AbstractC6087b.m27120a(myAccessibilityService.m15224J(strM24112f, false, this.f23609d));
                }
                return C1444v.f4971a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(AccessibilityNodeInfo accessibilityNodeInfo, InterfaceC1875e interfaceC1875e) {
            super(2, interfaceC1875e);
            this.f23605c = accessibilityNodeInfo;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
            return SharedPreferencesOnSharedPreferenceChangeListenerC5948g0.this.new b(this.f23605c, interfaceC1875e);
        }

        @Override // p238e6.InterfaceC5371p
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
            return ((b) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final Object invokeSuspend(Object obj) {
            Object objE = AbstractC2005b.m8369e();
            int i7 = this.f23603a;
            if (i7 == 0) {
                AbstractC1437o.m6082b(obj);
                List listMo14868i = SharedPreferencesOnSharedPreferenceChangeListenerC5948g0.this.m26763e0().mo15146G().mo14868i(1);
                AbstractC6615I0 abstractC6615I0M28164c = C6656c0.m28164c();
                a aVar = new a(SharedPreferencesOnSharedPreferenceChangeListenerC5948g0.this, listMo14868i, this.f23605c, null);
                this.f23603a = 1;
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

    /* JADX INFO: renamed from: k1.g0$c */
    static final class c extends AbstractC6097l implements InterfaceC5371p {

        /* JADX INFO: renamed from: a */
        int f23610a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C6128x f23611b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ C6128x f23612c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ C5678g f23613d;

        /* JADX INFO: renamed from: k1.g0$c$a */
        static final class a extends AbstractC6097l implements InterfaceC5371p {

            /* JADX INFO: renamed from: a */
            int f23614a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ C6128x f23615b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ C6128x f23616c;

            /* JADX INFO: renamed from: d */
            final /* synthetic */ C5678g f23617d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C6128x c6128x, C6128x c6128x2, C5678g c5678g, InterfaceC1875e interfaceC1875e) {
                super(2, interfaceC1875e);
                this.f23615b = c6128x;
                this.f23616c = c6128x2;
                this.f23617d = c5678g;
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
                return new a(this.f23615b, this.f23616c, this.f23617d, interfaceC1875e);
            }

            @Override // p238e6.InterfaceC5371p
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
                return ((a) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final Object invokeSuspend(Object obj) {
                AbstractC2005b.m8369e();
                if (this.f23614a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1437o.m6082b(obj);
                if (!this.f23615b.f23885a) {
                    this.f23616c.f23885a = true;
                    this.f23617d.m25216t();
                }
                return C1444v.f4971a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C6128x c6128x, C6128x c6128x2, C5678g c5678g, InterfaceC1875e interfaceC1875e) {
            super(2, interfaceC1875e);
            this.f23611b = c6128x;
            this.f23612c = c6128x2;
            this.f23613d = c5678g;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
            return new c(this.f23611b, this.f23612c, this.f23613d, interfaceC1875e);
        }

        @Override // p238e6.InterfaceC5371p
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
            return ((c) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
        
            if (p318o6.AbstractC6668i.m28186g(r8, r1, r7) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objE = AbstractC2005b.m8369e();
            int i7 = this.f23610a;
            if (i7 == 0) {
                AbstractC1437o.m6082b(obj);
                this.f23610a = 1;
                if (AbstractC6645Y.m28137a(300L, this) != objE) {
                }
                return objE;
            }
            if (i7 == 1) {
                AbstractC1437o.m6082b(obj);
            } else {
                if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1437o.m6082b(obj);
            }
            return C1444v.f4971a;
            AbstractC6615I0 abstractC6615I0M28164c = C6656c0.m28164c();
            a aVar = new a(this.f23611b, this.f23612c, this.f23613d, null);
            this.f23610a = 2;
        }
    }

    /* JADX INFO: renamed from: k1.g0$d */
    static final class d extends AbstractC6097l implements InterfaceC5371p {

        /* JADX INFO: renamed from: a */
        int f23618a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C6099B f23619b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ SharedPreferencesOnSharedPreferenceChangeListenerC5948g0 f23620c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(C6099B c6099b, SharedPreferencesOnSharedPreferenceChangeListenerC5948g0 sharedPreferencesOnSharedPreferenceChangeListenerC5948g0, InterfaceC1875e interfaceC1875e) {
            super(2, interfaceC1875e);
            this.f23619b = c6099b;
            this.f23620c = sharedPreferencesOnSharedPreferenceChangeListenerC5948g0;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
            return new d(this.f23619b, this.f23620c, interfaceC1875e);
        }

        @Override // p238e6.InterfaceC5371p
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
            return ((d) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final Object invokeSuspend(Object obj) {
            ArrayList arrayList;
            List<AccessibilityWindowInfo> windows;
            AbstractC2005b.m8369e();
            if (this.f23618a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1437o.m6082b(obj);
            C6099B c6099b = this.f23619b;
            C3150x c3150xM26771i0 = this.f23620c.m26771i0();
            MyAccessibilityService myAccessibilityService = this.f23620c.f23592e;
            if (myAccessibilityService == null || (windows = myAccessibilityService.getWindows()) == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(AbstractC1638q.m6774s(windows, 10));
                Iterator<T> it = windows.iterator();
                while (it.hasNext()) {
                    arrayList.add(((AccessibilityWindowInfo) it.next()).getRoot());
                }
            }
            int i7 = this.f23620c.f23590c;
            a aVar = SharedPreferencesOnSharedPreferenceChangeListenerC5948g0.f23553a0;
            c6099b.f23859a = c3150xM26771i0.m16733b(arrayList, (i7 == aVar.m26819f() || this.f23620c.f23590c == aVar.m26817d()) ? false : true);
            return C1444v.f4971a;
        }
    }

    /* JADX INFO: renamed from: k1.g0$e */
    public static final class e extends OrientationEventListener {
        e(Context context) {
            super(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: b */
        public static final void m26831b(SharedPreferencesOnSharedPreferenceChangeListenerC5948g0 sharedPreferencesOnSharedPreferenceChangeListenerC5948g0) {
            sharedPreferencesOnSharedPreferenceChangeListenerC5948g0.m26782o0();
        }

        @Override // android.view.OrientationEventListener
        public void onOrientationChanged(int i7) {
            int i8 = SharedPreferencesOnSharedPreferenceChangeListenerC5948g0.this.f23588a.getResources().getConfiguration().orientation;
            if (i8 != SharedPreferencesOnSharedPreferenceChangeListenerC5948g0.this.f23566E) {
                SharedPreferencesOnSharedPreferenceChangeListenerC5948g0.this.f23566E = i8;
                Handler handler = new Handler(Looper.getMainLooper());
                final SharedPreferencesOnSharedPreferenceChangeListenerC5948g0 sharedPreferencesOnSharedPreferenceChangeListenerC5948g0 = SharedPreferencesOnSharedPreferenceChangeListenerC5948g0.this;
                handler.postDelayed(new Runnable() { // from class: k1.h0
                    @Override // java.lang.Runnable
                    public final void run() {
                        SharedPreferencesOnSharedPreferenceChangeListenerC5948g0.e.m26831b(sharedPreferencesOnSharedPreferenceChangeListenerC5948g0);
                    }
                }, 100L);
            }
        }
    }

    public /* synthetic */ SharedPreferencesOnSharedPreferenceChangeListenerC5948g0(Context context, AbstractC6112h abstractC6112h) {
        this(context);
    }

    /* JADX INFO: renamed from: B0 */
    public static /* synthetic */ void m26725B0(SharedPreferencesOnSharedPreferenceChangeListenerC5948g0 sharedPreferencesOnSharedPreferenceChangeListenerC5948g0, float f7, boolean z7, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            z7 = false;
        }
        sharedPreferencesOnSharedPreferenceChangeListenerC5948g0.m26804A0(f7, z7);
    }

    /* JADX INFO: renamed from: F0 */
    private final void m26730F0(float f7, float f8, float f9, float f10) {
        WindowManager.LayoutParams layoutParams = this.f23600x;
        WindowManager.LayoutParams layoutParams2 = null;
        if (layoutParams == null) {
            AbstractC6118n.m27197o("primaryParams");
            layoutParams = null;
        }
        layoutParams.x = (int) (f9 + f7);
        WindowManager.LayoutParams layoutParams3 = this.f23600x;
        if (layoutParams3 == null) {
            AbstractC6118n.m27197o("primaryParams");
            layoutParams3 = null;
        }
        layoutParams3.y = (int) (f10 + f8);
        WindowManager windowManager = this.f23586Y;
        if (windowManager != null) {
            ViewGroup viewGroup = this.f23599w;
            WindowManager.LayoutParams layoutParams4 = this.f23600x;
            if (layoutParams4 == null) {
                AbstractC6118n.m27197o("primaryParams");
            } else {
                layoutParams2 = layoutParams4;
            }
            windowManager.updateViewLayout(viewGroup, layoutParams2);
        }
    }

    /* JADX INFO: renamed from: G */
    private final void m26731G(final WindowManager.LayoutParams layoutParams, int i7, int i8) {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(layoutParams.x, i7);
        ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(layoutParams.y, i8);
        valueAnimatorOfInt.setDuration(this.f23598v);
        valueAnimatorOfInt2.setDuration(this.f23598v);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: k1.Z
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                SharedPreferencesOnSharedPreferenceChangeListenerC5948g0.m26732H(layoutParams, this, valueAnimator);
            }
        });
        valueAnimatorOfInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: k1.a0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                SharedPreferencesOnSharedPreferenceChangeListenerC5948g0.m26733I(layoutParams, this, valueAnimator);
            }
        });
        valueAnimatorOfInt.start();
        valueAnimatorOfInt2.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final void m26732H(WindowManager.LayoutParams layoutParams, SharedPreferencesOnSharedPreferenceChangeListenerC5948g0 sharedPreferencesOnSharedPreferenceChangeListenerC5948g0, ValueAnimator animation) {
        WindowManager windowManager;
        AbstractC6118n.m27187e(animation, "animation");
        Object animatedValue = animation.getAnimatedValue();
        AbstractC6118n.m27185c(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        layoutParams.x = ((Integer) animatedValue).intValue();
        ViewGroup viewGroup = sharedPreferencesOnSharedPreferenceChangeListenerC5948g0.f23599w;
        if (viewGroup == null || (windowManager = sharedPreferencesOnSharedPreferenceChangeListenerC5948g0.f23586Y) == null) {
            return;
        }
        windowManager.updateViewLayout(viewGroup, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final void m26733I(WindowManager.LayoutParams layoutParams, SharedPreferencesOnSharedPreferenceChangeListenerC5948g0 sharedPreferencesOnSharedPreferenceChangeListenerC5948g0, ValueAnimator animation) {
        AbstractC6118n.m27187e(animation, "animation");
        Object animatedValue = animation.getAnimatedValue();
        AbstractC6118n.m27185c(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        layoutParams.y = ((Integer) animatedValue).intValue();
        ViewGroup viewGroup = sharedPreferencesOnSharedPreferenceChangeListenerC5948g0.f23599w;
        WindowManager windowManager = sharedPreferencesOnSharedPreferenceChangeListenerC5948g0.f23586Y;
        if (windowManager != null) {
            windowManager.updateViewLayout(viewGroup, layoutParams);
        }
    }

    /* JADX INFO: renamed from: I0 */
    private final void m26734I0() {
        CardView cardView;
        ViewGroup viewGroup = this.f23599w;
        if (viewGroup == null || (cardView = (CardView) viewGroup.findViewById(R.id.bubble_icon)) == null) {
            return;
        }
        cardView.setRadius((float) (((double) this.f23595s) / 2.8d));
    }

    /* JADX INFO: renamed from: J */
    private final void m26735J() {
        WindowInsets windowInsets;
        Point pointM26774k0 = m26774k0();
        this.f23570I = pointM26774k0.x;
        this.f23571J = pointM26774k0.y;
        C3034A c3034a = C3034A.f12453a;
        this.f23565D = c3034a.m15016C(this.f23588a);
        this.f23564C = m26767g0();
        int i7 = (int) (5 * Resources.getSystem().getDisplayMetrics().density);
        if (!c3034a.m15018E(this.f23588a) || Build.VERSION.SDK_INT < 30) {
            this.f23601y = this.f23565D + i7;
            this.f23562A = i7;
            int i8 = this.f23570I - i7;
            int i9 = this.f23595s;
            this.f23563B = i8 - i9;
            this.f23602z = ((this.f23571J - this.f23564C) - i7) - i9;
        } else {
            WindowManager windowManager = this.f23586Y;
            Insets insetsIgnoringVisibility = null;
            WindowMetrics currentWindowMetrics = windowManager != null ? windowManager.getCurrentWindowMetrics() : null;
            if (currentWindowMetrics != null && (windowInsets = currentWindowMetrics.getWindowInsets()) != null) {
                insetsIgnoringVisibility = windowInsets.getInsetsIgnoringVisibility(WindowInsets.Type.systemBars());
            }
            this.f23601y = (insetsIgnoringVisibility != null ? insetsIgnoringVisibility.top : this.f23565D) + i7;
            this.f23562A = (insetsIgnoringVisibility != null ? insetsIgnoringVisibility.left : 0) + i7;
            this.f23563B = ((this.f23570I - (insetsIgnoringVisibility != null ? insetsIgnoringVisibility.right : 0)) - i7) - this.f23595s;
            this.f23602z = ((this.f23571J - (insetsIgnoringVisibility != null ? insetsIgnoringVisibility.bottom : this.f23564C)) - i7) - this.f23595s;
        }
        if (this.f23563B < this.f23562A) {
            this.f23563B = (this.f23570I - this.f23595s) - i7;
        }
        if (this.f23602z < this.f23601y) {
            this.f23602z = (this.f23571J - this.f23595s) - i7;
        }
    }

    /* JADX INFO: renamed from: K */
    private final void m26736K() {
        m26755a0();
        m26797w0();
        WindowManager.LayoutParams layoutParams = this.f23600x;
        if (layoutParams == null) {
            AbstractC6118n.m27197o("primaryParams");
            layoutParams = null;
        }
        m26731G(layoutParams, this.f23594r, this.f23593f);
    }

    /* JADX INFO: renamed from: K0 */
    private final void m26737K0(float f7, float f8, float f9, float f10) {
        C1435m c1435m = this.f23572K;
        double dDoubleValue = ((Number) c1435m.m6068a()).doubleValue();
        double dDoubleValue2 = ((Number) c1435m.m6069b()).doubleValue();
        float f11 = f9 + f7;
        double d7 = f11;
        Number numberValueOf = d7 > dDoubleValue ? Double.valueOf(dDoubleValue + ((d7 - dDoubleValue) * 2.3d)) : Float.valueOf(f11);
        float f12 = f10 + f8;
        double d8 = f12;
        Number numberValueOf2 = d8 > dDoubleValue2 ? Double.valueOf(dDoubleValue2 + ((d8 - dDoubleValue2) * ((double) 2))) : Float.valueOf(f12);
        WindowManager.LayoutParams layoutParams = this.f23583V;
        int iIntValue = numberValueOf.intValue() - this.f23573L;
        ViewGroup viewGroup = this.f23599w;
        AbstractC6118n.m27184b(viewGroup);
        layoutParams.x = iIntValue - viewGroup.getWidth();
        int iIntValue2 = numberValueOf2.intValue() - this.f23573L;
        ViewGroup viewGroup2 = this.f23599w;
        AbstractC6118n.m27184b(viewGroup2);
        layoutParams.y = iIntValue2 - viewGroup2.getHeight();
        WindowManager windowManager = this.f23586Y;
        if (windowManager != null) {
            windowManager.updateViewLayout(this.f23574M, this.f23583V);
        }
    }

    /* JADX INFO: renamed from: L */
    private final boolean m26738L(int i7, int i8) {
        boolean z7 = this.f23568G == 1;
        int i9 = 0 - (!z7 ? this.f23595s / 2 : 0);
        int i10 = this.f23570I + (z7 ? this.f23595s / 2 : 0);
        if (i7 <= i9) {
            this.f23578Q = -1;
            this.f23579R = i8;
            return true;
        }
        if (i7 + this.f23595s < i10) {
            return false;
        }
        this.f23578Q = 1;
        this.f23579R = i8;
        return true;
    }

    /* JADX INFO: renamed from: L0 */
    private final void m26739L0() {
        m26735J();
        this.f23572K = m26769h0();
        this.f23593f = Math.max(this.f23601y, Math.min((int) (this.f23571J * this.f23567F), this.f23602z));
        int i7 = this.f23568G;
        if (i7 == -1) {
            int i8 = (int) (this.f23595s * this.f23597u);
            this.f23594r = Math.max(this.f23562A - i8, -i8);
        } else if (i7 != 1) {
            int i9 = (int) (this.f23595s * this.f23597u);
            this.f23594r = Math.max(this.f23562A - i9, Math.min(this.f23594r, this.f23563B + i9));
        } else {
            int i10 = this.f23595s;
            int i11 = (int) (i10 * this.f23597u);
            this.f23594r = Math.min(this.f23563B + i11, (this.f23570I - i10) + i11);
        }
        int i12 = this.f23593f;
        if (i12 < 0 || i12 > this.f23571J - this.f23595s) {
            this.f23593f = (this.f23571J / 2) - (this.f23595s / 2);
            this.f23567F = 0.35f;
        }
        int i13 = this.f23594r;
        int i14 = this.f23595s;
        if (i13 < (-i14) || i13 > this.f23570I) {
            this.f23568G = 1;
            int i15 = (int) (i14 * this.f23597u);
            this.f23594r = Math.min(this.f23563B + i15, (this.f23570I - i14) + i15);
        }
        WindowManager.LayoutParams layoutParams = this.f23600x;
        if (layoutParams == null || this.f23599w == null) {
            return;
        }
        WindowManager.LayoutParams layoutParams2 = null;
        if (layoutParams == null) {
            AbstractC6118n.m27197o("primaryParams");
            layoutParams = null;
        }
        layoutParams.y = this.f23593f;
        WindowManager.LayoutParams layoutParams3 = this.f23600x;
        if (layoutParams3 == null) {
            AbstractC6118n.m27197o("primaryParams");
            layoutParams3 = null;
        }
        layoutParams3.x = this.f23594r;
        try {
            WindowManager windowManager = this.f23586Y;
            if (windowManager != null) {
                ViewGroup viewGroup = this.f23599w;
                WindowManager.LayoutParams layoutParams4 = this.f23600x;
                if (layoutParams4 == null) {
                    AbstractC6118n.m27197o("primaryParams");
                } else {
                    layoutParams2 = layoutParams4;
                }
                windowManager.updateViewLayout(viewGroup, layoutParams2);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: M0 */
    private final void m26740M0(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i7 = this.f23590c;
        if (i7 == f23555c0) {
            m26742O(accessibilityNodeInfo);
        } else {
            m26757b0(i7, accessibilityNodeInfo);
        }
    }

    /* JADX INFO: renamed from: N */
    private final void m26741N(int i7, int i8) {
        this.f23568G = i7;
        this.f23567F = i8 / this.f23571J;
        SharedPreferences.Editor editorEdit = m26776l0().edit();
        editorEdit.putInt("primaryBubblePositionMode", this.f23568G);
        editorEdit.putFloat("primaryBubbleYPercentage", this.f23567F);
        editorEdit.apply();
        m26739L0();
        m26755a0();
        WindowManager.LayoutParams layoutParams = this.f23600x;
        if (layoutParams == null) {
            AbstractC6118n.m27197o("primaryParams");
            layoutParams = null;
        }
        m26731G(layoutParams, this.f23594r, this.f23593f);
    }

    /* JADX INFO: renamed from: O */
    private final void m26742O(final AccessibilityNodeInfo accessibilityNodeInfo) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(new ContextThemeWrapper(this.f23588a, R.style.Theme_ClipboardTextSaved));
        View viewInflate = layoutInflaterFrom.inflate(R.layout.actions_dialog, (ViewGroup) null);
        AbstractC6118n.m27185c(viewInflate, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) viewInflate;
        this.f23580S = viewGroup;
        this.f23582U = accessibilityNodeInfo;
        if (viewGroup != null) {
            viewGroup.setOnTouchListener(new View.OnTouchListener() { // from class: k1.W
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return SharedPreferencesOnSharedPreferenceChangeListenerC5948g0.m26743P(this.f23519a, view, motionEvent);
                }
            });
        }
        ViewGroup viewGroup2 = this.f23580S;
        ViewGroup viewGroup3 = viewGroup2 != null ? (ViewGroup) viewGroup2.findViewById(R.id.actions_container) : null;
        String[] stringArray = this.f23588a.getResources().getStringArray(R.array.pick_options);
        AbstractC6118n.m27186d(stringArray, "getStringArray(...)");
        Integer[] numArr = {Integer.valueOf(R.drawable.ic_clear), Integer.valueOf(R.drawable.export_notes_24px), Integer.valueOf(R.drawable.ic_clipboard_outline), Integer.valueOf(R.drawable.ic_ai_outline), Integer.valueOf(R.drawable.round_content_app_paste_24), Integer.valueOf(R.drawable.round_content_paste_24)};
        if (viewGroup3 != null) {
            viewGroup3.removeAllViews();
        }
        int length = stringArray.length;
        int i7 = 0;
        final int i8 = 0;
        while (i7 < length) {
            String str = stringArray[i7];
            int i9 = i8 + 1;
            View viewInflate2 = layoutInflaterFrom.inflate(R.layout.quick_action_item, (ViewGroup) null);
            viewInflate2.setOnClickListener(new View.OnClickListener() { // from class: k1.X
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SharedPreferencesOnSharedPreferenceChangeListenerC5948g0.m26744Q(this.f23520a, i8, accessibilityNodeInfo, view);
                }
            });
            ((TextView) viewInflate2.findViewById(R.id.text)).setText(str);
            ((ImageView) viewInflate2.findViewById(R.id.icon)).setImageResource(numArr[i8].intValue());
            if (viewGroup3 != null) {
                viewGroup3.addView(viewInflate2);
            }
            i7++;
            i8 = i9;
        }
        ViewGroup viewGroup4 = this.f23580S;
        View viewFindViewById = viewGroup4 != null ? viewGroup4.findViewById(R.id.btn_cancel) : null;
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: k1.Y
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SharedPreferencesOnSharedPreferenceChangeListenerC5948g0.m26745R(this.f23523a, view);
                }
            });
        }
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, m26778m0(), 262664, -3);
        this.f23581T = layoutParams;
        try {
            WindowManager windowManager = this.f23586Y;
            if (windowManager != null) {
                windowManager.addView(this.f23580S, layoutParams);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final boolean m26743P(SharedPreferencesOnSharedPreferenceChangeListenerC5948g0 sharedPreferencesOnSharedPreferenceChangeListenerC5948g0, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 4) {
            return false;
        }
        sharedPreferencesOnSharedPreferenceChangeListenerC5948g0.m26753Z();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final void m26744Q(SharedPreferencesOnSharedPreferenceChangeListenerC5948g0 sharedPreferencesOnSharedPreferenceChangeListenerC5948g0, int i7, AccessibilityNodeInfo accessibilityNodeInfo, View view) {
        sharedPreferencesOnSharedPreferenceChangeListenerC5948g0.m26757b0(i7 + 1, accessibilityNodeInfo);
        sharedPreferencesOnSharedPreferenceChangeListenerC5948g0.m26753Z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final void m26745R(SharedPreferencesOnSharedPreferenceChangeListenerC5948g0 sharedPreferencesOnSharedPreferenceChangeListenerC5948g0, View view) {
        sharedPreferencesOnSharedPreferenceChangeListenerC5948g0.m26753Z();
    }

    /* JADX INFO: renamed from: S */
    private final void m26746S() {
        WindowManager.LayoutParams layoutParams = null;
        View viewInflate = LayoutInflater.from(this.f23588a).inflate(R.layout.primary_bubble, (ViewGroup) null);
        AbstractC6118n.m27185c(viewInflate, "null cannot be cast to non-null type android.view.ViewGroup");
        this.f23599w = (ViewGroup) viewInflate;
        ViewGroup viewGroup = this.f23599w;
        AbstractC6118n.m27184b(viewGroup);
        TextView textView = new TextView(viewGroup.getContext());
        textView.setText("+");
        textView.setTextSize(20.0f);
        textView.setTextColor(-256);
        textView.setVisibility(8);
        textView.setElevation(1.0f);
        textView.setGravity(17);
        textView.getPaint().setFakeBoldText(true);
        this.f23574M = textView;
        WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams(-2, -2, m26778m0(), 520, -3);
        layoutParams2.gravity = 8388659;
        int i7 = this.f23595s;
        layoutParams2.width = i7;
        layoutParams2.height = i7;
        layoutParams2.y = this.f23593f;
        layoutParams2.x = this.f23594r;
        layoutParams2.alpha = this.f23596t;
        this.f23600x = layoutParams2;
        m26734I0();
        m26799x0();
        if (this.f23592e != null) {
            m26803z0();
        }
        try {
            WindowManager windowManager = this.f23586Y;
            if (windowManager != null) {
                ViewGroup viewGroup2 = this.f23599w;
                WindowManager.LayoutParams layoutParams3 = this.f23600x;
                if (layoutParams3 == null) {
                    AbstractC6118n.m27197o("primaryParams");
                } else {
                    layoutParams = layoutParams3;
                }
                windowManager.addView(viewGroup2, layoutParams);
            }
            WindowManager windowManager2 = this.f23586Y;
            if (windowManager2 != null) {
                windowManager2.addView(this.f23574M, this.f23583V);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: T */
    private final void m26747T(final int i7, final int i8) {
        String string;
        View viewInflate = LayoutInflater.from(new ContextThemeWrapper(this.f23588a, R.style.Theme_ClipboardTextSaved)).inflate(R.layout.confirmation_dialog, (ViewGroup) null);
        AbstractC6118n.m27185c(viewInflate, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) viewInflate;
        this.f23575N = viewGroup;
        if (viewGroup != null) {
            viewGroup.setOnTouchListener(new View.OnTouchListener() { // from class: k1.Q
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return SharedPreferencesOnSharedPreferenceChangeListenerC5948g0.m26750W(this.f23510a, view, motionEvent);
                }
            });
        }
        ViewGroup viewGroup2 = this.f23575N;
        TextView textView = viewGroup2 != null ? (TextView) viewGroup2.findViewById(R.id.dialog_title) : null;
        ViewGroup viewGroup3 = this.f23575N;
        TextView textView2 = viewGroup3 != null ? (TextView) viewGroup3.findViewById(R.id.dialog_message) : null;
        ViewGroup viewGroup4 = this.f23575N;
        CheckBox checkBox = viewGroup4 != null ? (CheckBox) viewGroup4.findViewById(R.id.dialog_checkbox) : null;
        ViewGroup viewGroup5 = this.f23575N;
        View viewFindViewById = viewGroup5 != null ? viewGroup5.findViewById(R.id.btn_confirm) : null;
        ViewGroup viewGroup6 = this.f23575N;
        View viewFindViewById2 = viewGroup6 != null ? viewGroup6.findViewById(R.id.btn_cancel) : null;
        if (i7 != -1) {
            string = i7 != 1 ? "" : this.f23588a.getString(R.string.right_position);
        } else {
            string = this.f23588a.getString(R.string.left_postition);
        }
        AbstractC6118n.m27184b(string);
        if (textView != null) {
            textView.setText(this.f23588a.getString(R.string.change_bubble_location_title));
        }
        if (textView2 != null) {
            textView2.setText(this.f23588a.getString(R.string.change_bubble_location_des, string));
        }
        if (checkBox != null) {
            checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: k1.S
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z7) {
                    SharedPreferencesOnSharedPreferenceChangeListenerC5948g0.m26751X(this.f23511a, compoundButton, z7);
                }
            });
        }
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: k1.T
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SharedPreferencesOnSharedPreferenceChangeListenerC5948g0.m26748U(this.f23512a, i7, i8, view);
                }
            });
        }
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: k1.U
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SharedPreferencesOnSharedPreferenceChangeListenerC5948g0.m26749V(this.f23515a, view);
                }
            });
        }
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, m26778m0(), 262664, -3);
        layoutParams.gravity = 17;
        this.f23576O = layoutParams;
        try {
            WindowManager windowManager = this.f23586Y;
            if (windowManager != null) {
                windowManager.addView(this.f23575N, layoutParams);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final void m26748U(SharedPreferencesOnSharedPreferenceChangeListenerC5948g0 sharedPreferencesOnSharedPreferenceChangeListenerC5948g0, int i7, int i8, View view) {
        sharedPreferencesOnSharedPreferenceChangeListenerC5948g0.m26741N(i7, i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public static final void m26749V(SharedPreferencesOnSharedPreferenceChangeListenerC5948g0 sharedPreferencesOnSharedPreferenceChangeListenerC5948g0, View view) {
        sharedPreferencesOnSharedPreferenceChangeListenerC5948g0.m26736K();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public static final boolean m26750W(SharedPreferencesOnSharedPreferenceChangeListenerC5948g0 sharedPreferencesOnSharedPreferenceChangeListenerC5948g0, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 4) {
            return false;
        }
        sharedPreferencesOnSharedPreferenceChangeListenerC5948g0.m26736K();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public static final void m26751X(SharedPreferencesOnSharedPreferenceChangeListenerC5948g0 sharedPreferencesOnSharedPreferenceChangeListenerC5948g0, CompoundButton v7, boolean z7) {
        AbstractC6118n.m27187e(v7, "v");
        if (z7) {
            Toast.makeText(sharedPreferencesOnSharedPreferenceChangeListenerC5948g0.f23588a, R.string.restore_icon_dialog_settings, 0).show();
        }
        sharedPreferencesOnSharedPreferenceChangeListenerC5948g0.m26776l0().edit().putBoolean("primaryBubblePositionChangeAuto", !z7).apply();
        sharedPreferencesOnSharedPreferenceChangeListenerC5948g0.m26805C0(!z7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public static final AppDatabase m26752Y(SharedPreferencesOnSharedPreferenceChangeListenerC5948g0 sharedPreferencesOnSharedPreferenceChangeListenerC5948g0) {
        return AppDatabase.f12597p.m15148b(sharedPreferencesOnSharedPreferenceChangeListenerC5948g0.f23588a);
    }

    /* JADX INFO: renamed from: Z */
    private final void m26753Z() {
        ViewGroup viewGroup = this.f23580S;
        if (viewGroup != null) {
            try {
                WindowManager windowManager = this.f23586Y;
                if (windowManager != null) {
                    windowManager.removeView(viewGroup);
                    C1444v c1444v = C1444v.f4971a;
                }
            } catch (Exception unused) {
                C1444v c1444v2 = C1444v.f4971a;
            }
        }
        this.f23580S = null;
        this.f23581T = null;
        this.f23582U = null;
    }

    /* JADX INFO: renamed from: a0 */
    private final void m26755a0() {
        ViewGroup viewGroup = this.f23575N;
        if (viewGroup != null) {
            try {
                WindowManager windowManager = this.f23586Y;
                if (windowManager != null) {
                    windowManager.removeView(viewGroup);
                    C1444v c1444v = C1444v.f4971a;
                }
            } catch (Exception unused) {
                C1444v c1444v2 = C1444v.f4971a;
            }
        }
        this.f23575N = null;
        this.f23576O = null;
        this.f23577P = false;
    }

    /* JADX INFO: renamed from: b0 */
    private final void m26757b0(int i7, final AccessibilityNodeInfo accessibilityNodeInfo) {
        MyAccessibilityService myAccessibilityService;
        if (i7 == f23561i0) {
            if (accessibilityNodeInfo != null) {
                final String strM26925g = C5963u.f23690h.m26928a().m26925g();
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: k1.V
                    @Override // java.lang.Runnable
                    public final void run() {
                        SharedPreferencesOnSharedPreferenceChangeListenerC5948g0.m26759c0(this.f23516a, strM26925g, accessibilityNodeInfo);
                    }
                }, 200L);
                return;
            }
            return;
        }
        if (i7 == f23559g0) {
            if (accessibilityNodeInfo != null) {
                CharSequence text = accessibilityNodeInfo.getText();
                String string = ((text == null && (text = accessibilityNodeInfo.getContentDescription()) == null) ? "" : text).toString();
                if (string.length() > 0) {
                    Intent intent = new Intent(this.f23588a, (Class<?>) AiTextProcessingActivity.class);
                    intent.setAction("android.intent.action.SEND");
                    intent.setType("text/plain");
                    intent.putExtra("android.intent.extra.TEXT", string);
                    intent.addFlags(268468224);
                    this.f23588a.startActivity(intent);
                    return;
                }
                return;
            }
            return;
        }
        if (i7 == f23557e0) {
            if (accessibilityNodeInfo != null) {
                CharSequence text2 = accessibilityNodeInfo.getText();
                String string2 = ((text2 == null && (text2 = accessibilityNodeInfo.getContentDescription()) == null) ? "" : text2).toString();
                if (string2.length() > 0) {
                    m26785q0(string2);
                    return;
                }
                return;
            }
            return;
        }
        if (i7 == f23560h0) {
            if (accessibilityNodeInfo != null) {
                AbstractC6672k.m28227d(AbstractC6626O.m28098a(C6656c0.m28163b()), null, null, new b(accessibilityNodeInfo, null), 3, null);
            }
        } else if (i7 == f23558f0) {
            if (accessibilityNodeInfo != null) {
                C5961s.f23646t.m26910a().m26894g0(accessibilityNodeInfo);
            }
        } else {
            if (i7 != f23556d0 || accessibilityNodeInfo == null || (myAccessibilityService = this.f23592e) == null) {
                return;
            }
            myAccessibilityService.m15224J("", true, accessibilityNodeInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public static final void m26759c0(SharedPreferencesOnSharedPreferenceChangeListenerC5948g0 sharedPreferencesOnSharedPreferenceChangeListenerC5948g0, String str, AccessibilityNodeInfo accessibilityNodeInfo) {
        MyAccessibilityService myAccessibilityService = sharedPreferencesOnSharedPreferenceChangeListenerC5948g0.f23592e;
        if (myAccessibilityService != null) {
            if (str == null) {
                str = "";
            }
            myAccessibilityService.m15224J(str, false, accessibilityNodeInfo);
        }
    }

    /* JADX INFO: renamed from: d0 */
    private final C1435m m26761d0(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return new C1435m(Integer.valueOf(iArr[0] + (view.getWidth() / 2)), Integer.valueOf(iArr[1] + (view.getHeight() / 2)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public final AppDatabase m26763e0() {
        return (AppDatabase) this.f23589b.getValue();
    }

    /* JADX INFO: renamed from: f0 */
    private final AccessibilityNodeInfo m26765f0(Rect rect) {
        Object next;
        Rect rect2 = new Rect();
        Iterator it = m26771i0().m16735d().iterator();
        while (it.hasNext()) {
            next = it.next();
            ((AccessibilityNodeInfo) next).getBoundsInScreen(rect2);
            if (rect2.contains(rect)) {
                return (AccessibilityNodeInfo) next;
            }
        }
        next = null;
        return (AccessibilityNodeInfo) next;
    }

    /* JADX INFO: renamed from: g0 */
    private final int m26767g0() {
        WindowInsets windowInsets;
        int identifier = this.f23588a.getResources().getIdentifier("navigation_bar_height", "dimen", "android");
        int dimensionPixelSize = identifier > 0 ? this.f23588a.getResources().getDimensionPixelSize(identifier) : 0;
        if (Build.VERSION.SDK_INT >= 30) {
            WindowManager windowManager = this.f23586Y;
            Insets insetsIgnoringVisibility = null;
            WindowMetrics currentWindowMetrics = windowManager != null ? windowManager.getCurrentWindowMetrics() : null;
            if (currentWindowMetrics != null && (windowInsets = currentWindowMetrics.getWindowInsets()) != null) {
                insetsIgnoringVisibility = windowInsets.getInsetsIgnoringVisibility(WindowInsets.Type.navigationBars());
            }
            if (insetsIgnoringVisibility != null && insetsIgnoringVisibility.bottom > 0) {
                dimensionPixelSize = insetsIgnoringVisibility.bottom;
            }
        }
        return dimensionPixelSize == 0 ? (int) (48 * Resources.getSystem().getDisplayMetrics().density) : dimensionPixelSize;
    }

    /* JADX INFO: renamed from: h0 */
    private final C1435m m26769h0() {
        Point pointM26774k0 = m26774k0();
        this.f23570I = pointM26774k0.x;
        this.f23571J = pointM26774k0.y;
        return this.f23588a.getResources().getConfiguration().orientation == 1 ? new C1435m(Double.valueOf(((double) this.f23570I) * 0.6d), Double.valueOf(((double) this.f23571J) * 0.8d)) : new C1435m(Double.valueOf(((double) this.f23570I) * 0.8d), Double.valueOf(((double) this.f23571J) * 0.6d));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public final C3150x m26771i0() {
        return (C3150x) this.f23587Z.getValue();
    }

    /* JADX INFO: renamed from: k0 */
    private final Point m26774k0() {
        Point point = new Point();
        try {
            if (Build.VERSION.SDK_INT >= 30) {
                WindowManager windowManager = this.f23586Y;
                WindowMetrics currentWindowMetrics = windowManager != null ? windowManager.getCurrentWindowMetrics() : null;
                Rect bounds = currentWindowMetrics != null ? currentWindowMetrics.getBounds() : null;
                if (bounds != null) {
                    point.x = bounds.width();
                    point.y = bounds.height();
                }
            }
            if (point.x == 0 || point.y == 0) {
                WindowManager windowManager2 = this.f23586Y;
                Display defaultDisplay = windowManager2 != null ? windowManager2.getDefaultDisplay() : null;
                if (defaultDisplay != null) {
                    defaultDisplay.getRealSize(point);
                }
            }
            if (point.x == 0 || point.y == 0) {
                DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
                point.x = displayMetrics.widthPixels;
                point.y = displayMetrics.heightPixels;
                return point;
            }
        } catch (Exception unused) {
            DisplayMetrics displayMetrics2 = Resources.getSystem().getDisplayMetrics();
            point.x = displayMetrics2.widthPixels;
            point.y = displayMetrics2.heightPixels;
        }
        return point;
    }

    /* JADX INFO: renamed from: l0 */
    private final SharedPreferences m26776l0() {
        SharedPreferences sharedPreferences = this.f23588a.getSharedPreferences("SHARED_NAME", 0);
        AbstractC6118n.m27186d(sharedPreferences, "getSharedPreferences(...)");
        return sharedPreferences;
    }

    /* JADX INFO: renamed from: m0 */
    private final int m26778m0() {
        return C3034A.f12453a.m15050y(true);
    }

    /* JADX INFO: renamed from: n0 */
    private final void m26780n0(int i7) {
        switch (i7) {
            case R.id.add_text /* 2131296339 */:
                this.f23588a.startActivity(new Intent(this.f23588a, (Class<?>) AddNoteActivity.class).addFlags(268468224));
                break;
            case R.id.ai /* 2131296343 */:
                this.f23588a.startActivity(new Intent(this.f23588a, (Class<?>) AiTextProcessingActivity.class).addFlags(268468224));
                break;
            case R.id.brows_notes /* 2131296389 */:
                this.f23588a.startActivity(new Intent(this.f23588a, (Class<?>) BrowseNotesDialogActivity.class).addFlags(268468224));
                break;
            case R.id.bubble_setting /* 2131296442 */:
                this.f23588a.startActivity(new Intent(this.f23588a, (Class<?>) BubbleCustomizationActivity.class).addFlags(872415232));
                break;
            case R.id.pro_setting /* 2131296891 */:
                this.f23588a.startActivity(new Intent(this.f23588a, (Class<?>) AccessibilitySettingActivity.class).addFlags(872415232));
                break;
            case R.id.screen_scanner /* 2131296937 */:
            case R.id.scroll_scanner /* 2131296943 */:
                Intent intent = new Intent(this.f23588a, (Class<?>) ScannerReceiver.class);
                intent.setAction(i7 == R.id.screen_scanner ? "com.anas_mugally.clipboard.action_extract_text" : "com.anas_mugally.clipboard.action_extract_text_while_scrolling");
                this.f23588a.sendBroadcast(intent);
                break;
            case R.id.search /* 2131296945 */:
                this.f23588a.startActivity(new Intent(this.f23588a, (Class<?>) SearchActivity.class).addFlags(872415232));
                break;
            case R.id.settings /* 2131296965 */:
                this.f23588a.startActivity(new Intent(this.f23588a, (Class<?>) SettingActivity.class).addFlags(872415232));
                break;
            case R.id.temporary_texts /* 2131297043 */:
                this.f23588a.startActivity(new Intent(this.f23588a, (Class<?>) BrowserTemporaryTextActivity.class).addFlags(268468224));
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public final void m26782o0() {
        try {
            m26735J();
            m26739L0();
            WindowManager.LayoutParams layoutParams = this.f23600x;
            if (layoutParams == null || this.f23599w == null) {
                return;
            }
            WindowManager.LayoutParams layoutParams2 = null;
            if (layoutParams == null) {
                AbstractC6118n.m27197o("primaryParams");
                layoutParams = null;
            }
            layoutParams.alpha = this.f23596t;
            WindowManager windowManager = this.f23586Y;
            if (windowManager != null) {
                ViewGroup viewGroup = this.f23599w;
                WindowManager.LayoutParams layoutParams3 = this.f23600x;
                if (layoutParams3 == null) {
                    AbstractC6118n.m27197o("primaryParams");
                } else {
                    layoutParams2 = layoutParams3;
                }
                windowManager.updateViewLayout(viewGroup, layoutParams2);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: q0 */
    private final void m26785q0(String str) {
        if (AbstractC3041D.m15081f(this.f23588a, str)) {
            C5446g.m24648f(C5446g.f20735a, this.f23588a, str, new ComponentName(this.f23588a, (Class<?>) TextDialogActivity.class), null, 268468224, 4, null);
        }
    }

    /* JADX INFO: renamed from: r0 */
    private final void m26787r0(final View view) {
        Context context = this.f23588a;
        WindowManager windowManager = this.f23586Y;
        AbstractC6118n.m27184b(windowManager);
        final C5678g c5678g = new C5678g(context, windowManager, new InterfaceC5367l() { // from class: k1.d0
            @Override // p238e6.InterfaceC5367l
            public final Object invoke(Object obj) {
                return SharedPreferencesOnSharedPreferenceChangeListenerC5948g0.m26789s0(this.f23533a, ((Integer) obj).intValue());
            }
        });
        final C6129y c6129y = new C6129y();
        final C6129y c6129y2 = new C6129y();
        final C6128x c6128x = new C6128x();
        final C6128x c6128x2 = new C6128x();
        final C6099B c6099b = new C6099B();
        final C6099B c6099b2 = new C6099B();
        final C6099B c6099b3 = new C6099B();
        final C6129y c6129y3 = new C6129y();
        final C6129y c6129y4 = new C6129y();
        final C6099B c6099b4 = new C6099B();
        final C6128x c6128x3 = new C6128x();
        view.setOnClickListener(new View.OnClickListener() { // from class: k1.e0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SharedPreferencesOnSharedPreferenceChangeListenerC5948g0.m26791t0(c5678g, view2);
            }
        });
        final float f7 = 10.0f;
        final float f8 = 50.0f;
        view.setOnTouchListener(new View.OnTouchListener() { // from class: k1.f0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                return SharedPreferencesOnSharedPreferenceChangeListenerC5948g0.m26793u0(this.f23538a, c6099b2, c6128x, c6128x2, c6128x3, c6129y, c6129y2, c6129y3, c6129y4, c6099b4, c6099b3, f7, f8, c5678g, c6099b, view, view2, motionEvent);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public static final C1444v m26789s0(SharedPreferencesOnSharedPreferenceChangeListenerC5948g0 sharedPreferencesOnSharedPreferenceChangeListenerC5948g0, int i7) {
        sharedPreferencesOnSharedPreferenceChangeListenerC5948g0.m26780n0(i7);
        return C1444v.f4971a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public static final void m26791t0(C5678g c5678g, View view) {
        c5678g.m25216t();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:108:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:110:0x01f2  */
    /* JADX INFO: renamed from: u0 */
    public static final boolean m26793u0(SharedPreferencesOnSharedPreferenceChangeListenerC5948g0 sharedPreferencesOnSharedPreferenceChangeListenerC5948g0, C6099B c6099b, C6128x c6128x, C6128x c6128x2, C6128x c6128x3, C6129y c6129y, C6129y c6129y2, C6129y c6129y3, C6129y c6129y4, C6099B c6099b2, C6099B c6099b3, float f7, float f8, C5678g c5678g, C6099B c6099b4, View view, View view2, MotionEvent motionEvent) {
        WindowManager.LayoutParams layoutParams;
        List list;
        View view3;
        WindowManager.LayoutParams layoutParams2;
        int action = motionEvent.getAction();
        if (action == 0) {
            sharedPreferencesOnSharedPreferenceChangeListenerC5948g0.m26804A0(1.0f, true);
            c6099b.f23859a = null;
            c6128x.f23885a = false;
            c6128x2.f23885a = false;
            c6128x3.f23885a = false;
            c6129y.f23886a = motionEvent.getRawX();
            c6129y2.f23886a = motionEvent.getRawY();
            c6129y3.f23886a = sharedPreferencesOnSharedPreferenceChangeListenerC5948g0.f23594r;
            c6129y4.f23886a = sharedPreferencesOnSharedPreferenceChangeListenerC5948g0.f23593f;
            c6099b2.f23859a = null;
            c6099b3.f23859a = AbstractC6672k.m28227d(sharedPreferencesOnSharedPreferenceChangeListenerC5948g0.f23584W, null, null, new c(c6128x, c6128x2, c5678g, null), 3, null);
            return true;
        }
        if (action != 1) {
            if (action == 2) {
                float rawX = motionEvent.getRawX() - c6129y.f23886a;
                float rawY = motionEvent.getRawY() - c6129y2.f23886a;
                float fSqrt = (float) Math.sqrt((rawX * rawX) + (rawY * rawY));
                if (fSqrt > f7) {
                    if (fSqrt > f8) {
                        if (!c6128x.f23885a && !c6128x2.f23885a && !c5678g.m25215p()) {
                            c6128x.f23885a = true;
                            InterfaceC6701y0 interfaceC6701y0 = (InterfaceC6701y0) c6099b3.f23859a;
                            if (interfaceC6701y0 != null) {
                                InterfaceC6701y0.a.m28291b(interfaceC6701y0, null, 1, null);
                            }
                            TextView textView = sharedPreferencesOnSharedPreferenceChangeListenerC5948g0.f23574M;
                            if (textView != null) {
                                textView.setVisibility(0);
                            }
                            c6099b4.f23859a = AbstractC6672k.m28227d(sharedPreferencesOnSharedPreferenceChangeListenerC5948g0.f23584W, null, null, new d(c6099b, sharedPreferencesOnSharedPreferenceChangeListenerC5948g0, null), 3, null);
                        }
                        if (!c6128x2.f23885a) {
                            sharedPreferencesOnSharedPreferenceChangeListenerC5948g0.m26737K0(rawX, rawY, c6129y3.f23886a, c6129y4.f23886a);
                            List list2 = (List) c6099b.f23859a;
                            if (list2 != null) {
                                TextView textView2 = sharedPreferencesOnSharedPreferenceChangeListenerC5948g0.f23574M;
                                AbstractC6118n.m27184b(textView2);
                                C1435m c1435mM26761d0 = sharedPreferencesOnSharedPreferenceChangeListenerC5948g0.m26761d0(textView2);
                                C1435m c1435mM16734c = sharedPreferencesOnSharedPreferenceChangeListenerC5948g0.m26771i0().m16734c(list2, ((Number) c1435mM26761d0.m6068a()).intValue(), ((Number) c1435mM26761d0.m6069b()).intValue());
                                boolean z7 = (c1435mM16734c == null || sharedPreferencesOnSharedPreferenceChangeListenerC5948g0.m26765f0((Rect) c1435mM16734c.m6071d()) == null) ? false : true;
                                C5681j c5681j = sharedPreferencesOnSharedPreferenceChangeListenerC5948g0.f23585X;
                                if (c5681j != null) {
                                    c5681j.m25222f(Boolean.valueOf(z7), c1435mM16734c != null ? (Rect) c1435mM16734c.m6071d() : null);
                                }
                            }
                        }
                    }
                    sharedPreferencesOnSharedPreferenceChangeListenerC5948g0.m26730F0(rawX, rawY, c6129y3.f23886a, c6129y4.f23886a);
                    if (c5678g.m25215p()) {
                        WindowManager.LayoutParams layoutParams3 = sharedPreferencesOnSharedPreferenceChangeListenerC5948g0.f23600x;
                        if (layoutParams3 == null) {
                            AbstractC6118n.m27197o("primaryParams");
                            layoutParams3 = null;
                        }
                        float f9 = layoutParams3.x;
                        WindowManager.LayoutParams layoutParams4 = sharedPreferencesOnSharedPreferenceChangeListenerC5948g0.f23600x;
                        if (layoutParams4 == null) {
                            AbstractC6118n.m27197o("primaryParams");
                            layoutParams2 = null;
                        } else {
                            layoutParams2 = layoutParams4;
                        }
                        c6099b2.f23859a = c5678g.m25213i(f9, layoutParams2.y);
                    }
                }
                return true;
            }
            if (action != 3) {
                return false;
            }
        }
        InterfaceC6701y0 interfaceC6701y1 = (InterfaceC6701y0) c6099b3.f23859a;
        if (interfaceC6701y1 != null) {
            InterfaceC6701y0.a.m28291b(interfaceC6701y1, null, 1, null);
        }
        Object obj = c6099b2.f23859a;
        if (((View) obj) != null && (view3 = (View) obj) != null) {
            view3.performClick();
        }
        sharedPreferencesOnSharedPreferenceChangeListenerC5948g0.m26804A0(sharedPreferencesOnSharedPreferenceChangeListenerC5948g0.f23596t, true);
        boolean z8 = c6128x.f23885a;
        if (z8 && !c6128x2.f23885a) {
            if (C3034A.f12453a.m15028b(sharedPreferencesOnSharedPreferenceChangeListenerC5948g0.f23588a) && (list = (List) c6099b.f23859a) != null) {
                TextView textView3 = sharedPreferencesOnSharedPreferenceChangeListenerC5948g0.f23574M;
                AbstractC6118n.m27184b(textView3);
                C1435m c1435mM26761d1 = sharedPreferencesOnSharedPreferenceChangeListenerC5948g0.m26761d0(textView3);
                C1435m c1435mM16734c2 = sharedPreferencesOnSharedPreferenceChangeListenerC5948g0.m26771i0().m16734c(list, ((Number) c1435mM26761d1.m6068a()).intValue(), ((Number) c1435mM26761d1.m6069b()).intValue());
                if (c1435mM16734c2 != null) {
                    AccessibilityNodeInfo accessibilityNodeInfoM26765f0 = sharedPreferencesOnSharedPreferenceChangeListenerC5948g0.m26765f0((Rect) c1435mM16734c2.m6071d());
                    if (accessibilityNodeInfoM26765f0 != null) {
                        c6128x3.f23885a = true;
                        sharedPreferencesOnSharedPreferenceChangeListenerC5948g0.m26740M0(accessibilityNodeInfoM26765f0);
                    } else if (((CharSequence) c1435mM16734c2.m6070c()).length() > 0) {
                        c6128x3.f23885a = true;
                        sharedPreferencesOnSharedPreferenceChangeListenerC5948g0.m26785q0((String) c1435mM16734c2.m6070c());
                    }
                }
            }
            TextView textView4 = sharedPreferencesOnSharedPreferenceChangeListenerC5948g0.f23574M;
            if (textView4 != null) {
                textView4.setVisibility(8);
            }
            InterfaceC6701y0 interfaceC6701y2 = (InterfaceC6701y0) c6099b4.f23859a;
            if (interfaceC6701y2 != null) {
                InterfaceC6701y0.a.m28291b(interfaceC6701y2, null, 1, null);
            }
            c6099b4.f23859a = null;
        } else if (!z8 && !c6128x2.f23885a) {
            view.performClick();
        }
        if (!c6128x.f23885a || c6128x2.f23885a || c6128x3.f23885a || !sharedPreferencesOnSharedPreferenceChangeListenerC5948g0.f23591d) {
            sharedPreferencesOnSharedPreferenceChangeListenerC5948g0.m26797w0();
            layoutParams = sharedPreferencesOnSharedPreferenceChangeListenerC5948g0.f23600x;
            if (layoutParams == null) {
                AbstractC6118n.m27197o("primaryParams");
                layoutParams = null;
            }
            sharedPreferencesOnSharedPreferenceChangeListenerC5948g0.m26731G(layoutParams, sharedPreferencesOnSharedPreferenceChangeListenerC5948g0.f23594r, sharedPreferencesOnSharedPreferenceChangeListenerC5948g0.f23593f);
        } else {
            WindowManager.LayoutParams layoutParams5 = sharedPreferencesOnSharedPreferenceChangeListenerC5948g0.f23600x;
            if (layoutParams5 == null) {
                AbstractC6118n.m27197o("primaryParams");
                layoutParams5 = null;
            }
            int i7 = layoutParams5.x;
            WindowManager.LayoutParams layoutParams6 = sharedPreferencesOnSharedPreferenceChangeListenerC5948g0.f23600x;
            if (layoutParams6 == null) {
                AbstractC6118n.m27197o("primaryParams");
                layoutParams6 = null;
            }
            if (sharedPreferencesOnSharedPreferenceChangeListenerC5948g0.m26738L(i7, layoutParams6.y)) {
                sharedPreferencesOnSharedPreferenceChangeListenerC5948g0.f23577P = true;
                sharedPreferencesOnSharedPreferenceChangeListenerC5948g0.m26747T(sharedPreferencesOnSharedPreferenceChangeListenerC5948g0.f23578Q, sharedPreferencesOnSharedPreferenceChangeListenerC5948g0.f23579R);
            } else {
                sharedPreferencesOnSharedPreferenceChangeListenerC5948g0.m26797w0();
                layoutParams = sharedPreferencesOnSharedPreferenceChangeListenerC5948g0.f23600x;
                if (layoutParams == null) {
                    AbstractC6118n.m27197o("primaryParams");
                    layoutParams = null;
                }
                sharedPreferencesOnSharedPreferenceChangeListenerC5948g0.m26731G(layoutParams, sharedPreferencesOnSharedPreferenceChangeListenerC5948g0.f23594r, sharedPreferencesOnSharedPreferenceChangeListenerC5948g0.f23593f);
            }
        }
        if (!sharedPreferencesOnSharedPreferenceChangeListenerC5948g0.f23577P) {
            f23553a0.m26814a();
        }
        c6099b2.f23859a = null;
        c6099b.f23859a = null;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v0 */
    public static final C3150x m26795v0() {
        return new C3150x();
    }

    /* JADX INFO: renamed from: w0 */
    private final void m26797w0() {
        int i7 = this.f23595s;
        int i8 = (int) (i7 * this.f23597u);
        int i9 = this.f23568G;
        if (i9 == -1) {
            this.f23594r = Math.max(this.f23562A - i8, -i8);
        } else if (i9 == 1) {
            this.f23594r = Math.min(this.f23563B + i8, (this.f23570I - i7) + i8);
        }
        WindowManager.LayoutParams layoutParams = this.f23600x;
        if (layoutParams == null) {
            AbstractC6118n.m27197o("primaryParams");
            layoutParams = null;
        }
        layoutParams.y = this.f23593f;
    }

    /* JADX INFO: renamed from: x0 */
    private final void m26799x0() {
        ViewGroup viewGroup = this.f23599w;
        View viewFindViewById = viewGroup != null ? viewGroup.findViewById(R.id.bubble_icon) : null;
        if (viewFindViewById != null) {
            m26787r0(viewFindViewById);
        }
    }

    /* JADX INFO: renamed from: y0 */
    private final void m26801y0() {
        OrientationEventListener orientationEventListener;
        e eVar = new e(this.f23588a);
        this.f23569H = eVar;
        if (!eVar.canDetectOrientation() || (orientationEventListener = this.f23569H) == null) {
            return;
        }
        orientationEventListener.enable();
    }

    /* JADX INFO: renamed from: z0 */
    private final void m26803z0() {
        C5681j c5681j = new C5681j(this.f23588a);
        c5681j.setBackgroundColor(0);
        this.f23585X = c5681j;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-1, -1, m26778m0(), 536, -3);
        try {
            WindowManager windowManager = this.f23586Y;
            if (windowManager != null) {
                windowManager.addView(this.f23585X, layoutParams);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: A0 */
    public final void m26804A0(float f7, boolean z7) {
        if (f7 < 0.0f || f7 > 1.0f) {
            return;
        }
        if (!z7) {
            this.f23596t = f7;
        }
        WindowManager.LayoutParams layoutParams = this.f23600x;
        if (layoutParams == null || this.f23599w == null) {
            return;
        }
        WindowManager.LayoutParams layoutParams2 = null;
        if (layoutParams == null) {
            AbstractC6118n.m27197o("primaryParams");
            layoutParams = null;
        }
        layoutParams.alpha = f7;
        try {
            WindowManager windowManager = this.f23586Y;
            if (windowManager != null) {
                ViewGroup viewGroup = this.f23599w;
                WindowManager.LayoutParams layoutParams3 = this.f23600x;
                if (layoutParams3 == null) {
                    AbstractC6118n.m27197o("primaryParams");
                } else {
                    layoutParams2 = layoutParams3;
                }
                windowManager.updateViewLayout(viewGroup, layoutParams2);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: C0 */
    public final void m26805C0(boolean z7) {
        this.f23591d = z7;
    }

    /* JADX INFO: renamed from: D0 */
    public final void m26806D0(float f7) {
        if (f7 < 0.0f || f7 > 1.0f) {
            return;
        }
        this.f23597u = f7;
        m26739L0();
    }

    /* JADX INFO: renamed from: E0 */
    public final void m26807E0(int i7) {
        this.f23568G = i7;
        m26739L0();
    }

    /* JADX INFO: renamed from: G0 */
    public final void m26808G0(int i7) {
        if (i7 <= 0) {
            return;
        }
        int i8 = this.f23595s;
        this.f23595s = C3034A.f12453a.m15020G(this.f23588a, i7);
        WindowManager.LayoutParams layoutParams = this.f23600x;
        if (layoutParams == null || this.f23599w == null) {
            return;
        }
        WindowManager.LayoutParams layoutParams2 = null;
        if (layoutParams == null) {
            AbstractC6118n.m27197o("primaryParams");
            layoutParams = null;
        }
        layoutParams.width = this.f23595s;
        WindowManager.LayoutParams layoutParams3 = this.f23600x;
        if (layoutParams3 == null) {
            AbstractC6118n.m27197o("primaryParams");
            layoutParams3 = null;
        }
        layoutParams3.height = this.f23595s;
        m26735J();
        m26739L0();
        m26734I0();
        try {
            WindowManager windowManager = this.f23586Y;
            if (windowManager != null) {
                ViewGroup viewGroup = this.f23599w;
                WindowManager.LayoutParams layoutParams4 = this.f23600x;
                if (layoutParams4 == null) {
                    AbstractC6118n.m27197o("primaryParams");
                } else {
                    layoutParams2 = layoutParams4;
                }
                windowManager.updateViewLayout(viewGroup, layoutParams2);
            }
        } catch (Exception unused) {
            this.f23595s = i8;
        }
    }

    /* JADX INFO: renamed from: H0 */
    public final void m26809H0(float f7) {
        if (f7 < 0.0f || f7 > 1.0f) {
            return;
        }
        this.f23567F = f7;
        this.f23593f = Math.max(this.f23601y, Math.min((int) (this.f23571J * f7), this.f23602z));
        WindowManager.LayoutParams layoutParams = this.f23600x;
        if (layoutParams == null || this.f23599w == null) {
            return;
        }
        WindowManager.LayoutParams layoutParams2 = null;
        if (layoutParams == null) {
            AbstractC6118n.m27197o("primaryParams");
            layoutParams = null;
        }
        layoutParams.y = this.f23593f;
        try {
            WindowManager windowManager = this.f23586Y;
            if (windowManager != null) {
                ViewGroup viewGroup = this.f23599w;
                WindowManager.LayoutParams layoutParams3 = this.f23600x;
                if (layoutParams3 == null) {
                    AbstractC6118n.m27197o("primaryParams");
                } else {
                    layoutParams2 = layoutParams3;
                }
                windowManager.updateViewLayout(viewGroup, layoutParams2);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: J0 */
    public final void m26810J0(int i7) {
        this.f23590c = i7;
    }

    /* JADX INFO: renamed from: M */
    public final void m26811M() {
        WindowManager windowManager;
        WindowManager windowManager2;
        try {
            f23553a0.m26814a();
            f23554b0 = null;
            OrientationEventListener orientationEventListener = this.f23569H;
            if (orientationEventListener != null) {
                orientationEventListener.disable();
            }
            this.f23569H = null;
            ViewGroup viewGroup = this.f23599w;
            if (viewGroup != null && (windowManager2 = this.f23586Y) != null) {
                windowManager2.removeView(viewGroup);
            }
            TextView textView = this.f23574M;
            if (textView != null && (windowManager = this.f23586Y) != null) {
                windowManager.removeView(textView);
            }
            this.f23599w = null;
            this.f23574M = null;
            C5681j c5681j = this.f23585X;
            if (c5681j != null) {
                WindowManager windowManager3 = this.f23586Y;
                if (windowManager3 != null) {
                    windowManager3.removeView(c5681j);
                }
                this.f23585X = null;
            }
            m26755a0();
            m26753Z();
            AbstractC6626O.m28101d(this.f23584W, null, 1, null);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final C5681j m26812j0() {
        return this.f23585X;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (AbstractC6118n.m27183a(str, "primaryBubbleSize")) {
            m26808G0(sharedPreferences != null ? sharedPreferences.getInt("primaryBubbleSize", 40) : 40);
            return;
        }
        if (AbstractC6118n.m27183a(str, "primaryBubbleAlpha")) {
            m26725B0(this, sharedPreferences != null ? sharedPreferences.getFloat("primaryBubbleAlpha", 0.6f) : 0.6f, false, 2, null);
            return;
        }
        if (AbstractC6118n.m27183a(str, "primaryBubbleInEdge")) {
            m26806D0(sharedPreferences != null ? sharedPreferences.getFloat("primaryBubbleInEdge", 0.4f) : 0.4f);
            return;
        }
        if (AbstractC6118n.m27183a(str, "primaryBubbleYPercentage")) {
            m26809H0(sharedPreferences != null ? sharedPreferences.getFloat("primaryBubbleYPercentage", 0.5f) : 0.5f);
            return;
        }
        if (AbstractC6118n.m27183a(str, "primaryBubblePositionMode")) {
            m26807E0(sharedPreferences != null ? sharedPreferences.getInt("primaryBubblePositionMode", 1) : 1);
            return;
        }
        if (AbstractC6118n.m27183a(str, "primaryBubblePositionChangeAuto")) {
            m26805C0(sharedPreferences != null ? sharedPreferences.getBoolean("primaryBubblePositionChangeAuto", true) : true);
            return;
        }
        C3034A c3034a = C3034A.f12453a;
        if (AbstractC6118n.m27183a(str, c3034a.m15017D())) {
            m26810J0(sharedPreferences != null ? sharedPreferences.getInt(c3034a.m15017D(), f23555c0) : f23555c0);
        }
    }

    /* JADX INFO: renamed from: p0 */
    public final void m26813p0() {
        if (f23554b0 != null) {
            return;
        }
        f23554b0 = this;
        Context applicationContext = this.f23592e;
        if (applicationContext == null) {
            applicationContext = this.f23588a.getApplicationContext();
        }
        Object systemService = applicationContext.getSystemService("window");
        AbstractC6118n.m27185c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.f23586Y = (WindowManager) systemService;
        m26735J();
        m26776l0().registerOnSharedPreferenceChangeListener(this);
        this.f23568G = m26776l0().getInt("primaryBubblePositionMode", 1);
        C3034A c3034a = C3034A.f12453a;
        this.f23595s = c3034a.m15020G(this.f23588a, m26776l0().getInt("primaryBubbleSize", 40));
        this.f23596t = m26776l0().getFloat("primaryBubbleAlpha", 0.6f);
        this.f23597u = m26776l0().getFloat("primaryBubbleInEdge", 0.4f);
        this.f23590c = m26776l0().getInt(c3034a.m15017D(), f23555c0);
        this.f23591d = m26776l0().getBoolean("primaryBubblePositionChangeAuto", true);
        this.f23567F = m26776l0().getFloat("primaryBubbleYPercentage", 0.35f);
        this.f23566E = this.f23588a.getResources().getConfiguration().orientation;
        m26739L0();
        if (this.f23599w == null) {
            m26746S();
        }
        m26801y0();
    }

    private SharedPreferencesOnSharedPreferenceChangeListenerC5948g0(Context context) {
        this.f23588a = context;
        this.f23589b = AbstractC1430h.m6066b(new InterfaceC5356a() { // from class: k1.b0
            @Override // p238e6.InterfaceC5356a
            public final Object invoke() {
                return SharedPreferencesOnSharedPreferenceChangeListenerC5948g0.m26752Y(this.f23530a);
            }
        });
        this.f23590c = f23555c0;
        this.f23591d = true;
        this.f23592e = MyAccessibilityService.f12639O.m15245a();
        this.f23598v = 50L;
        this.f23566E = 1;
        this.f23567F = 0.35f;
        this.f23568G = 1;
        this.f23572K = m26769h0();
        this.f23573L = C3034A.f12453a.m15020G(context, 10);
        this.f23578Q = 1;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.type = m26778m0();
        layoutParams.flags = 792;
        layoutParams.format = -3;
        layoutParams.alpha = 1.0f;
        layoutParams.gravity = 51;
        this.f23583V = layoutParams;
        this.f23584W = AbstractC6626O.m28098a(C6656c0.m28162a().plus(AbstractC6634S0.m28112b(null, 1, null)));
        this.f23587Z = AbstractC1430h.m6066b(new InterfaceC5356a() { // from class: k1.c0
            @Override // p238e6.InterfaceC5356a
            public final Object invoke() {
                return SharedPreferencesOnSharedPreferenceChangeListenerC5948g0.m26795v0();
            }
        });
        m26813p0();
    }
}
