package com.anas_mugally.clipboard.service;

import android.R;
import android.accessibilityservice.AccessibilityService;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.Log;
import android.view.KeyEvent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityWindowInfo;
import androidx.lifecycle.C2611C;
import androidx.lifecycle.InterfaceC2612D;
import com.anas_mugally.clipboard.AbstractC3041D;
import com.anas_mugally.clipboard.C3034A;
import com.anas_mugally.clipboard.MyApplication;
import com.anas_mugally.clipboard.broadcastReceiver.ScannerReceiver;
import com.anas_mugally.clipboard.broadcastReceiver.ShowOrHidePrimaryBubbleReceiver;
import com.anas_mugally.clipboard.database.AppDatabase;
import com.anas_mugally.clipboard.p221ui.accessibilitySetting.AccessibilitySettingActivity;
import com.anas_mugally.clipboard.p221ui.accessibilitySetting.AccessibilitySettingFullActivity;
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
import p145S5.AbstractC1430h;
import p145S5.AbstractC1437o;
import p145S5.C1444v;
import p145S5.InterfaceC1429g;
import p173W5.InterfaceC1875e;
import p180X5.AbstractC2005b;
import p187Y5.AbstractC2060b;
import p187Y5.InterfaceC2059a;
import p225d1.C5210b;
import p238e6.InterfaceC5356a;
import p238e6.InterfaceC5371p;
import p281k1.C5915F;
import p281k1.C5961s;
import p281k1.C5963u;
import p281k1.SharedPreferencesOnSharedPreferenceChangeListenerC5948g0;
import p302m6.AbstractC6406h;
import p318o6.AbstractC6626O;
import p318o6.AbstractC6634S0;
import p318o6.AbstractC6645Y;
import p318o6.AbstractC6672k;
import p318o6.C6656c0;
import p318o6.InterfaceC6598A;
import p318o6.InterfaceC6624N;
import p318o6.InterfaceC6701y0;

/* JADX INFO: loaded from: classes.dex */
public final class MyAccessibilityService extends AccessibilityService implements C5963u.a, SharedPreferences.OnSharedPreferenceChangeListener {

    /* JADX INFO: renamed from: O */
    public static final C3071b f12639O = new C3071b(null);

    /* JADX INFO: renamed from: P */
    private static final long f12640P = 500;

    /* JADX INFO: renamed from: Q */
    private static MyAccessibilityService f12641Q;

    /* JADX INFO: renamed from: R */
    private static long f12642R;

    /* JADX INFO: renamed from: A */
    private Boolean f12643A;

    /* JADX INFO: renamed from: G */
    private C3079a f12649G;

    /* JADX INFO: renamed from: H */
    private boolean f12650H;

    /* JADX INFO: renamed from: J */
    private InterfaceC6701y0 f12652J;

    /* JADX INFO: renamed from: K */
    public String[] f12653K;

    /* JADX INFO: renamed from: L */
    public String[] f12654L;

    /* JADX INFO: renamed from: M */
    private Integer[] f12655M;

    /* JADX INFO: renamed from: N */
    private Boolean[] f12656N;

    /* JADX INFO: renamed from: a */
    private long f12657a;

    /* JADX INFO: renamed from: b */
    private String f12658b;

    /* JADX INFO: renamed from: e */
    private SharedPreferencesOnSharedPreferenceChangeListenerC5948g0 f12661e;

    /* JADX INFO: renamed from: f */
    private C5963u f12662f;

    /* JADX INFO: renamed from: r */
    private C5915F f12663r;

    /* JADX INFO: renamed from: s */
    private C5961s f12664s;

    /* JADX INFO: renamed from: v */
    private String[] f12667v;

    /* JADX INFO: renamed from: w */
    private Boolean f12668w;

    /* JADX INFO: renamed from: x */
    private Boolean f12669x;

    /* JADX INFO: renamed from: y */
    private Boolean f12670y;

    /* JADX INFO: renamed from: z */
    private Boolean f12671z;

    /* JADX INFO: renamed from: c */
    private final InterfaceC2612D f12659c = new InterfaceC2612D() { // from class: j1.e
        @Override // androidx.lifecycle.InterfaceC2612D
        /* JADX INFO: renamed from: b */
        public final void mo12097b(Object obj) {
            MyAccessibilityService.m15196H(this.f22958a, ((Boolean) obj).booleanValue());
        }
    };

    /* JADX INFO: renamed from: d */
    private final InterfaceC1429g f12660d = AbstractC1430h.m6066b(new InterfaceC5356a() { // from class: j1.f
        @Override // p238e6.InterfaceC5356a
        public final Object invoke() {
            return MyAccessibilityService.m15199M(this.f22959a);
        }
    });

    /* JADX INFO: renamed from: t */
    private String f12665t = "Copy";

    /* JADX INFO: renamed from: u */
    private String f12666u = "Cut";

    /* JADX INFO: renamed from: B */
    private final InterfaceC1429g f12644B = AbstractC1430h.m6066b(new InterfaceC5356a() { // from class: j1.g
        @Override // p238e6.InterfaceC5356a
        public final Object invoke() {
            return MyAccessibilityService.m15202S(this.f22960a);
        }
    });

    /* JADX INFO: renamed from: C */
    private final C2611C f12645C = new C2611C();

    /* JADX INFO: renamed from: D */
    private InterfaceC6701y0 f12646D = AbstractC6634S0.m28112b(null, 1, null);

    /* JADX INFO: renamed from: E */
    private final InterfaceC6624N f12647E = AbstractC6626O.m28098a(C6656c0.m28163b().plus(AbstractC6634S0.m28112b(null, 1, null)));

    /* JADX INFO: renamed from: F */
    private final InterfaceC6624N f12648F = AbstractC6626O.m28098a(C6656c0.m28163b().plus(AbstractC6634S0.m28112b(null, 1, null)));

    /* JADX INFO: renamed from: I */
    private final InterfaceC6624N f12651I = AbstractC6626O.m28098a(C6656c0.m28164c().plus(AbstractC6634S0.m28112b(null, 1, null)));

    /* JADX INFO: renamed from: com.anas_mugally.clipboard.service.MyAccessibilityService$a */
    public enum EnumC3070a {
        RUNNING,
        DISABLED,
        DISABLED_BY_USER,
        DISABLED_BY_SYSTEM,
        ERROR;


        /* JADX INFO: renamed from: r */
        private static final /* synthetic */ InterfaceC2059a f12678r = AbstractC2060b.m8524a(m15244c());
    }

    /* JADX INFO: renamed from: com.anas_mugally.clipboard.service.MyAccessibilityService$b */
    public static final class C3071b {
        public /* synthetic */ C3071b(AbstractC6112h abstractC6112h) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final MyAccessibilityService m15245a() {
            return MyAccessibilityService.f12641Q;
        }

        /* JADX INFO: renamed from: b */
        public final long m15246b() {
            return MyAccessibilityService.f12640P;
        }

        /* JADX INFO: renamed from: c */
        public final EnumC3070a m15247c(Context context, Class serviceClass) {
            AbstractC6118n.m27187e(context, "context");
            AbstractC6118n.m27187e(serviceClass, "serviceClass");
            try {
                Object systemService = context.getSystemService("accessibility");
                AbstractC6118n.m27185c(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
                AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
                if (!accessibilityManager.isEnabled()) {
                    return EnumC3070a.DISABLED;
                }
                List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(-1);
                AbstractC6118n.m27184b(enabledAccessibilityServiceList);
                boolean z7 = false;
                if (enabledAccessibilityServiceList == null || !enabledAccessibilityServiceList.isEmpty()) {
                    Iterator<T> it = enabledAccessibilityServiceList.iterator();
                    while (it.hasNext()) {
                        ServiceInfo serviceInfo = ((AccessibilityServiceInfo) it.next()).getResolveInfo().serviceInfo;
                        if (AbstractC6118n.m27183a(serviceInfo.packageName, context.getPackageName()) && AbstractC6118n.m27183a(serviceInfo.name, serviceClass.getName())) {
                            z7 = true;
                            break;
                        }
                    }
                }
                int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(new ComponentName(context, (Class<?>) serviceClass));
                if (!z7) {
                    return EnumC3070a.DISABLED;
                }
                if (componentEnabledSetting == 2) {
                    return EnumC3070a.DISABLED_BY_SYSTEM;
                }
                if (componentEnabledSetting == 3) {
                    return EnumC3070a.DISABLED_BY_USER;
                }
                return m15248d() ? EnumC3070a.RUNNING : EnumC3070a.ERROR;
            } catch (Exception unused) {
                return EnumC3070a.ERROR;
            }
        }

        /* JADX INFO: renamed from: d */
        public final boolean m15248d() {
            return System.currentTimeMillis() - MyAccessibilityService.f12642R <= 3600000;
        }

        /* JADX INFO: renamed from: e */
        public final void m15249e() {
            MyAccessibilityService myAccessibilityServiceM15245a = m15245a();
            if (myAccessibilityServiceM15245a != null) {
                myAccessibilityServiceM15245a.m15193D();
            }
            MyAccessibilityService myAccessibilityServiceM15245a2 = m15245a();
            if (myAccessibilityServiceM15245a2 != null) {
                myAccessibilityServiceM15245a2.m15194E();
            }
        }

        private C3071b() {
        }
    }

    /* JADX INFO: renamed from: com.anas_mugally.clipboard.service.MyAccessibilityService$c */
    static final class C3072c extends AbstractC6097l implements InterfaceC5371p {

        /* JADX INFO: renamed from: a */
        int f12679a;

        C3072c(InterfaceC1875e interfaceC1875e) {
            super(2, interfaceC1875e);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
            return MyAccessibilityService.this.new C3072c(interfaceC1875e);
        }

        @Override // p238e6.InterfaceC5371p
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
            return ((C3072c) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final Object invokeSuspend(Object obj) {
            Object objE = AbstractC2005b.m8369e();
            int i7 = this.f12679a;
            if (i7 == 0) {
                AbstractC1437o.m6082b(obj);
                this.f12679a = 1;
                if (AbstractC6645Y.m28137a(300L, this) == objE) {
                    return objE;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1437o.m6082b(obj);
            }
            if (MyAccessibilityService.this.f12650H) {
                MyAccessibilityService.this.m15197I();
                MyAccessibilityService.this.f12650H = false;
            }
            return C1444v.f4971a;
        }
    }

    /* JADX INFO: renamed from: com.anas_mugally.clipboard.service.MyAccessibilityService$d */
    static final class C3073d extends AbstractC6097l implements InterfaceC5371p {

        /* JADX INFO: renamed from: a */
        int f12681a;

        C3073d(InterfaceC1875e interfaceC1875e) {
            super(2, interfaceC1875e);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
            return MyAccessibilityService.this.new C3073d(interfaceC1875e);
        }

        @Override // p238e6.InterfaceC5371p
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
            return ((C3073d) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final Object invokeSuspend(Object obj) {
            Object objE = AbstractC2005b.m8369e();
            int i7 = this.f12681a;
            if (i7 == 0) {
                AbstractC1437o.m6082b(obj);
                this.f12681a = 1;
                if (AbstractC6645Y.m28137a(100L, this) == objE) {
                    return objE;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1437o.m6082b(obj);
            }
            MyAccessibilityService.this.m15197I();
            MyAccessibilityService.this.f12650H = false;
            return C1444v.f4971a;
        }
    }

    /* JADX INFO: renamed from: com.anas_mugally.clipboard.service.MyAccessibilityService$e */
    static final class C3074e extends AbstractC6097l implements InterfaceC5371p {

        /* JADX INFO: renamed from: a */
        int f12683a;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ String f12685c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C3074e(String str, InterfaceC1875e interfaceC1875e) {
            super(2, interfaceC1875e);
            this.f12685c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
            return MyAccessibilityService.this.new C3074e(this.f12685c, interfaceC1875e);
        }

        @Override // p238e6.InterfaceC5371p
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
            return ((C3074e) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final Object invokeSuspend(Object obj) {
            AbstractC2005b.m8369e();
            if (this.f12683a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1437o.m6082b(obj);
            AppDatabase.f12597p.m15148b(MyAccessibilityService.this).mo15145F().mo14856e(new C5210b(0, 0L, this.f12685c, 3, null));
            return C1444v.f4971a;
        }
    }

    /* JADX INFO: renamed from: com.anas_mugally.clipboard.service.MyAccessibilityService$f */
    static final class C3075f extends AbstractC6097l implements InterfaceC5371p {

        /* JADX INFO: renamed from: a */
        int f12686a;

        C3075f(InterfaceC1875e interfaceC1875e) {
            super(2, interfaceC1875e);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
            return MyAccessibilityService.this.new C3075f(interfaceC1875e);
        }

        @Override // p238e6.InterfaceC5371p
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
            return ((C3075f) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final Object invokeSuspend(Object obj) {
            Object objE = AbstractC2005b.m8369e();
            int i7 = this.f12686a;
            boolean z7 = true;
            if (i7 == 0) {
                AbstractC1437o.m6082b(obj);
                this.f12686a = 1;
                if (AbstractC6645Y.m28137a(500L, this) == objE) {
                    return objE;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1437o.m6082b(obj);
            }
            List<AccessibilityWindowInfo> windows = MyAccessibilityService.this.getWindows();
            AbstractC6118n.m27186d(windows, "getWindows(...)");
            if (windows != null && windows.isEmpty()) {
                z7 = false;
                break;
            }
            Iterator<T> it = windows.iterator();
            do {
                if (!it.hasNext()) {
                    z7 = false;
                    break;
                }
            } while (((AccessibilityWindowInfo) it.next()).getType() != 2);
            if (!AbstractC6118n.m27183a(MyAccessibilityService.this.m15242w().m12669f(), AbstractC6087b.m27120a(z7))) {
                MyAccessibilityService.this.m15242w().mo12525o(AbstractC6087b.m27120a(z7));
            }
            return C1444v.f4971a;
        }
    }

    /* JADX INFO: renamed from: A */
    private final SharedPreferences m15190A() {
        return (SharedPreferences) this.f12644B.getValue();
    }

    /* JADX INFO: renamed from: B */
    private final void m15191B() {
        InterfaceC6701y0 interfaceC6701y0 = this.f12652J;
        if (interfaceC6701y0 != null) {
            InterfaceC6701y0.a.m28291b(interfaceC6701y0, null, 1, null);
        }
        if (!this.f12650H) {
            this.f12650H = true;
        }
        Log.d("anas_scroll", String.valueOf(this.f12650H));
        this.f12652J = AbstractC6672k.m28227d(this.f12651I, null, null, new C3072c(null), 3, null);
    }

    /* JADX INFO: renamed from: C */
    private final void m15192C() {
        if (this.f12650H) {
            InterfaceC6701y0 interfaceC6701y0 = this.f12652J;
            if (interfaceC6701y0 != null) {
                InterfaceC6701y0.a.m28291b(interfaceC6701y0, null, 1, null);
            }
            this.f12652J = AbstractC6672k.m28227d(this.f12651I, null, null, new C3073d(null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public final void m15193D() {
        this.f12655M = new Integer[]{4, 3, 187};
        C3034A c3034a = C3034A.f12453a;
        m15227P(new String[]{C3034A.m15012p(c3034a, this, "accessibility_back", null, 4, null), C3034A.m15012p(c3034a, this, "accessibility_home", null, 4, null), C3034A.m15012p(c3034a, this, "accessibility_recent", null, 4, null)});
        m15228Q(new String[]{"com.android.systemui:id/back", "com.android.systemui:id/home", "com.android.systemui:id/recent_apps"});
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public final void m15194E() {
        SharedPreferences sharedPreferencesM15190A = m15190A();
        C3034A c3034a = C3034A.f12453a;
        this.f12668w = Boolean.valueOf(sharedPreferencesM15190A.getBoolean(c3034a.m15031e(), true));
        this.f12669x = Boolean.valueOf(m15190A().getBoolean(c3034a.m15014A(), true));
        this.f12670y = Boolean.valueOf(m15190A().getBoolean(c3034a.m15032f(), true));
        this.f12671z = Boolean.valueOf(m15190A().getBoolean(c3034a.m15037k(), true));
        this.f12643A = Boolean.valueOf(m15190A().getBoolean(c3034a.m15033g(), true));
        this.f12656N = new Boolean[]{Boolean.valueOf(m15190A().getBoolean(c3034a.m15034h()[0] + "enable", false)), Boolean.valueOf(m15190A().getBoolean(c3034a.m15034h()[1] + "enable", false)), Boolean.valueOf(m15190A().getBoolean(c3034a.m15034h()[2] + "enable", false))};
        this.f12667v = new String[]{m15190A().getString(c3034a.m15034h()[0] + "feature", null), m15190A().getString(c3034a.m15034h()[1] + "feature", null), m15190A().getString(c3034a.m15034h()[2] + "feature", null)};
    }

    /* JADX INFO: renamed from: G */
    private final boolean m15195G(AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        String string;
        try {
            int textSelectionStart = accessibilityNodeInfo.getTextSelectionStart();
            int textSelectionEnd = accessibilityNodeInfo.getTextSelectionEnd();
            Bundle bundle = new Bundle();
            if (textSelectionEnd == -1) {
                StringBuilder sb = new StringBuilder();
                CharSequence text = accessibilityNodeInfo.getText();
                AbstractC6118n.m27186d(text, "getText(...)");
                sb.append(text.subSequence(0, textSelectionStart).toString());
                sb.append(str);
                CharSequence text2 = accessibilityNodeInfo.getText();
                AbstractC6118n.m27186d(text2, "getText(...)");
                sb.append(text2.subSequence(textSelectionStart, text2.length()).toString());
                string = sb.toString();
            } else {
                StringBuilder sb2 = new StringBuilder();
                CharSequence text3 = accessibilityNodeInfo.getText();
                AbstractC6118n.m27186d(text3, "getText(...)");
                sb2.append(text3.subSequence(0, textSelectionStart).toString());
                sb2.append(str);
                CharSequence text4 = accessibilityNodeInfo.getText();
                AbstractC6118n.m27186d(text4, "getText(...)");
                sb2.append(text4.subSequence(textSelectionEnd, text4.length()).toString());
                string = sb2.toString();
            }
            bundle.putCharSequence("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE", string);
            accessibilityNodeInfo.performAction(2097152, bundle);
            bundle.clear();
            bundle.putInt("ACTION_ARGUMENT_SELECTION_START_INT", str.length() + textSelectionStart);
            bundle.putInt("ACTION_ARGUMENT_SELECTION_START_INT", str.length() + textSelectionStart);
            bundle.putInt("ACTION_ARGUMENT_SELECTION_END_INT", textSelectionStart + str.length());
            accessibilityNodeInfo.performAction(131072, bundle);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final void m15196H(MyAccessibilityService myAccessibilityService, boolean z7) {
        if (z7) {
            C5961s c5961s = myAccessibilityService.f12664s;
            if (c5961s != null) {
                c5961s.m26893f0();
                return;
            }
            return;
        }
        C5961s c5961s2 = myAccessibilityService.f12664s;
        if (c5961s2 != null) {
            c5961s2.m26892E();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public final void m15197I() {
        ArrayList arrayList;
        List<AccessibilityWindowInfo> windows = getWindows();
        if (windows != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : windows) {
                if (((AccessibilityWindowInfo) obj).getType() != 3) {
                    arrayList2.add(obj);
                }
            }
            arrayList = new ArrayList();
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                AccessibilityNodeInfo root = ((AccessibilityWindowInfo) it.next()).getRoot();
                if (root != null) {
                    arrayList.add(root);
                }
            }
        } else {
            arrayList = null;
        }
        C3079a c3079a = this.f12649G;
        if (c3079a != null) {
            c3079a.m15308s(arrayList);
        }
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ boolean m15198K(MyAccessibilityService myAccessibilityService, String str, boolean z7, AccessibilityNodeInfo accessibilityNodeInfo, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            accessibilityNodeInfo = null;
        }
        return myAccessibilityService.m15224J(str, z7, accessibilityNodeInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final PowerManager m15199M(MyAccessibilityService myAccessibilityService) {
        Object systemService = myAccessibilityService.getSystemService("power");
        AbstractC6118n.m27185c(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        return (PowerManager) systemService;
    }

    /* JADX INFO: renamed from: O */
    private final void m15200O() {
        m15223F();
        Boolean bool = this.f12670y;
        Boolean bool2 = Boolean.TRUE;
        if (AbstractC6118n.m27183a(bool, bool2) && this.f12664s == null) {
            this.f12664s = C5961s.f23646t.m26910a();
        }
        if ((AbstractC6118n.m27183a(this.f12643A, bool2) || AbstractC6118n.m27183a(this.f12671z, bool2)) && this.f12662f == null) {
            C5963u c5963uM26928a = C5963u.f23690h.m26928a();
            this.f12662f = c5963uM26928a;
            AbstractC6118n.m27184b(c5963uM26928a);
            c5963uM26928a.m26923d(this);
        }
        if (AbstractC6118n.m27183a(this.f12671z, bool2) && this.f12663r == null) {
            this.f12663r = C5915F.f23488j.m26698a();
        }
        if (this.f12649G == null) {
            this.f12649G = C3079a.f12707p.m15310a();
        }
    }

    /* JADX INFO: renamed from: R */
    private final void m15201R(String str) {
        this.f12657a = System.currentTimeMillis();
        this.f12658b = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final SharedPreferences m15202S(MyAccessibilityService myAccessibilityService) {
        return myAccessibilityService.getSharedPreferences("SHARED_NAME", 0);
    }

    /* JADX INFO: renamed from: X */
    private final void m15203X(CharSequence charSequence, int i7, String str) {
        try {
            if (!AbstractC6118n.m27183a(m15241v()[i7], str) && (charSequence == null || charSequence.length() == 0 || !AbstractC6118n.m27183a(m15240u()[i7], charSequence))) {
                return;
            }
            m15208b0(i7);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: Y */
    private final void m15204Y() {
        InterfaceC6701y0.a.m28291b(this.f12646D, null, 1, null);
        InterfaceC6598A interfaceC6598AM28112b = AbstractC6634S0.m28112b(null, 1, null);
        this.f12646D = interfaceC6598AM28112b;
        AbstractC6672k.m28227d(this.f12647E, interfaceC6598AM28112b, null, new C3075f(null), 2, null);
    }

    /* JADX INFO: renamed from: Z */
    private final void m15205Z() {
        SharedPreferences sharedPreferencesM15190A = m15190A();
        StringBuilder sb = new StringBuilder();
        C3034A c3034a = C3034A.f12453a;
        sb.append(c3034a.m15034h()[0]);
        sb.append("enable");
        this.f12656N = new Boolean[]{Boolean.valueOf(sharedPreferencesM15190A.getBoolean(sb.toString(), false)), Boolean.valueOf(m15190A().getBoolean(c3034a.m15034h()[1] + "enable", false)), Boolean.valueOf(m15190A().getBoolean(c3034a.m15034h()[2] + "enable", false))};
        this.f12667v = new String[]{m15190A().getString(c3034a.m15034h()[0] + "feature", null), m15190A().getString(c3034a.m15034h()[1] + "feature", null), m15190A().getString(c3034a.m15034h()[2] + "feature", null)};
    }

    /* JADX INFO: renamed from: a0 */
    private final void m15206a0() {
        AccessibilitySettingActivity.C3112a c3112a = AccessibilitySettingActivity.f12918V;
        c3112a.m16034c(false);
        m15190A().edit().putBoolean(C3034A.f12453a.m15031e(), true).putBoolean("firstEnableAccessibilityService", false).apply();
        Intent intent = new Intent(this, (Class<?>) (c3112a.m16032a() ? AccessibilitySettingFullActivity.class : AccessibilitySettingActivity.class));
        intent.putExtra("fromAccessibility", true);
        intent.addFlags(268566528);
        startActivity(intent);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: b0 */
    private final void m15208b0(int i7) {
        try {
            String[] strArr = this.f12667v;
            AbstractC6118n.m27184b(strArr);
            String str = strArr[i7];
            if (str != null) {
                switch (str.hashCode()) {
                    case -1944272188:
                        if (str.equals("BrowseYourNotes")) {
                            Intent intent = new Intent(this, (Class<?>) BrowseNotesDialogActivity.class);
                            intent.addFlags(268468224);
                            startActivity(intent);
                        }
                        break;
                    case -1091245464:
                        if (str.equals("AITextProcessing")) {
                            Intent intent2 = new Intent(this, (Class<?>) AiTextProcessingActivity.class);
                            intent2.addFlags(268468224);
                            startActivity(intent2);
                        }
                        break;
                    case 348197157:
                        if (str.equals("ExtractTextFromTheScreen")) {
                            Intent intent3 = new Intent(this, (Class<?>) ScannerReceiver.class);
                            intent3.setAction("com.anas_mugally.clipboard.action_extract_text");
                            intent3.putExtra("direct", true);
                            sendBroadcast(intent3);
                        }
                        break;
                    case 551197810:
                        if (str.equals("BrowseYourTemporaryTexts")) {
                            Intent intent4 = new Intent(this, (Class<?>) BrowserTemporaryTextActivity.class);
                            intent4.addFlags(268468224);
                            startActivity(intent4);
                        }
                        break;
                    case 1326118473:
                        if (str.equals("ExtractTextFromTheScreenWhileScrolling")) {
                            Intent intent5 = new Intent(this, (Class<?>) ScannerReceiver.class);
                            intent5.setAction("com.anas_mugally.clipboard.action_extract_text_while_scrolling");
                            intent5.putExtra("direct", true);
                            sendBroadcast(intent5);
                        }
                        break;
                    case 1451766257:
                        if (str.equals("AddNewNote")) {
                            Intent intent6 = new Intent(this, (Class<?>) AddNoteActivity.class);
                            intent6.addFlags(268468224);
                            startActivity(intent6);
                        }
                        break;
                    case 1659109527:
                        if (str.equals("Show/HideTheMainAppBubble")) {
                            Intent intent7 = new Intent(this, (Class<?>) ShowOrHidePrimaryBubbleReceiver.class);
                            intent7.setAction("com.anas_mugally.clipboard.SHOW_HIDE_PRIMARY_BUBBLE_ACTION");
                            sendBroadcast(intent7);
                        }
                        break;
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: m */
    private final boolean m15219m(AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        try {
            Bundle bundle = new Bundle();
            bundle.putCharSequence("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE", str);
            accessibilityNodeInfo.performAction(2097152, bundle);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: n */
    private final void m15220n() {
        Boolean bool = this.f12643A;
        Boolean bool2 = Boolean.TRUE;
        if (AbstractC6118n.m27183a(bool, bool2) || AbstractC6118n.m27183a(this.f12671z, bool2) || this.f12662f == null) {
            return;
        }
        m15236q();
    }

    /* JADX INFO: renamed from: y */
    private final PowerManager m15221y() {
        return (PowerManager) this.f12660d.getValue();
    }

    /* JADX INFO: renamed from: z */
    private final boolean m15222z() {
        return m15221y().isInteractive();
    }

    /* JADX INFO: renamed from: F */
    public final void m15223F() {
        if (AbstractC6118n.m27183a(this.f12669x, Boolean.TRUE) && this.f12661e == null) {
            PrimaryBubbleService.C3078a c3078a = PrimaryBubbleService.f12704a;
            if (!c3078a.m15278b()) {
                this.f12661e = SharedPreferencesOnSharedPreferenceChangeListenerC5948g0.f23553a0.m26816c(this);
            } else {
                c3078a.m15280d(this);
                this.f12661e = SharedPreferencesOnSharedPreferenceChangeListenerC5948g0.f23553a0.m26816c(this);
            }
        }
    }

    /* JADX INFO: renamed from: J */
    public final boolean m15224J(String text, boolean z7, AccessibilityNodeInfo accessibilityNodeInfo) {
        AbstractC6118n.m27187e(text, "text");
        if (accessibilityNodeInfo == null) {
            accessibilityNodeInfo = m15239t(getRootInActiveWindow());
        }
        if (accessibilityNodeInfo != null) {
            accessibilityNodeInfo.performAction(1);
        }
        if (accessibilityNodeInfo != null) {
            return (z7 || accessibilityNodeInfo.getTextSelectionStart() == -1) ? m15219m(accessibilityNodeInfo, text) : m15195G(accessibilityNodeInfo, text);
        }
        return false;
    }

    /* JADX INFO: renamed from: L */
    public final void m15225L() {
        performGlobalAction(1);
    }

    /* JADX INFO: renamed from: N */
    public final void m15226N() {
        this.f12645C.mo12676p(this.f12659c);
    }

    /* JADX INFO: renamed from: P */
    public final void m15227P(String[] strArr) {
        AbstractC6118n.m27187e(strArr, "<set-?>");
        this.f12653K = strArr;
    }

    /* JADX INFO: renamed from: Q */
    public final void m15228Q(String[] strArr) {
        AbstractC6118n.m27187e(strArr, "<set-?>");
        this.f12654L = strArr;
    }

    /* JADX INFO: renamed from: T */
    public final void m15229T() {
        this.f12665t = getString(R.string.copy);
        this.f12666u = getString(R.string.cut);
        f12639O.m15249e();
        m15200O();
    }

    /* JADX INFO: renamed from: U */
    public final void m15230U() {
        C3079a c3079a = this.f12649G;
        if (c3079a != null) {
            c3079a.m15309z();
        }
        m15197I();
    }

    /* JADX INFO: renamed from: V */
    public final void m15231V() {
        m15237r();
        m15234o();
        m15235p();
        m15236q();
        m15238s();
    }

    /* JADX INFO: renamed from: W */
    public final void m15232W() {
        if (!AbstractC6118n.m27183a(this.f12670y, Boolean.TRUE) || this.f12645C.m12672i()) {
            return;
        }
        this.f12645C.m12675l(this.f12659c);
    }

    @Override // p281k1.C5963u.a
    /* JADX INFO: renamed from: a */
    public void mo15233a(String text) {
        C5915F c5915f;
        AbstractC6118n.m27187e(text, "text");
        if (AbstractC3041D.m15087l(text)) {
            Boolean bool = this.f12671z;
            Boolean bool2 = Boolean.TRUE;
            if (AbstractC6118n.m27183a(bool, bool2) && (c5915f = this.f12663r) != null) {
                c5915f.m26697v(text);
            }
            if (AbstractC6118n.m27183a(this.f12643A, bool2)) {
                AbstractC6672k.m28227d(this.f12648F, null, null, new C3074e(text, null), 3, null);
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m15234o() {
        C5961s c5961s = this.f12664s;
        if (c5961s != null) {
            c5961s.m26895w();
        }
        this.f12664s = null;
    }

    @Override // android.accessibilityservice.AccessibilityService
    public void onAccessibilityEvent(AccessibilityEvent aEvent) {
        AccessibilityNodeInfo source;
        CharSequence text;
        C3079a c3079a;
        C3079a c3079a2;
        CharSequence className;
        AbstractC6118n.m27187e(aEvent, "aEvent");
        try {
            f12642R = System.currentTimeMillis();
            if (this.f12668w == null || this.f12656N == null || this.f12667v == null) {
                f12639O.m15249e();
            }
            Boolean bool = this.f12668w;
            AbstractC6118n.m27184b(bool);
            if (bool.booleanValue() && m15222z()) {
                int eventType = aEvent.getEventType();
                Log.d("anas_event", AccessibilityEvent.eventTypeToString(eventType));
                Log.d("anas_event", String.valueOf(aEvent.getClassName()));
                String string = null;
                if (eventType == 2 && AbstractC6118n.m27183a(aEvent.getPackageName(), "com.android.systemui")) {
                    for (int i7 = 0; i7 < 3; i7++) {
                        Boolean[] boolArr = this.f12656N;
                        AbstractC6118n.m27184b(boolArr);
                        if (boolArr[i7].booleanValue()) {
                            AccessibilityNodeInfo source2 = aEvent.getSource();
                            CharSequence contentDescription = source2 != null ? source2.getContentDescription() : null;
                            AccessibilityNodeInfo source3 = aEvent.getSource();
                            m15203X(contentDescription, i7, source3 != null ? source3.getViewIdResourceName() : null);
                        }
                    }
                } else if (this.f12662f != null && !AbstractC6118n.m27183a(getPackageName(), aEvent.getPackageName()) && eventType == 1) {
                    String string2 = aEvent.getText().toString();
                    CharSequence contentDescription2 = aEvent.getContentDescription();
                    string = contentDescription2 != null ? contentDescription2.toString() : null;
                    if (AbstractC6406h.m27564w(string2, this.f12665t, true) || AbstractC6406h.m27564w(string2, this.f12666u, true) || ((string != null && AbstractC6406h.m27564w(string, this.f12665t, true)) || (string != null && AbstractC6406h.m27564w(string, this.f12666u, true)))) {
                        C5963u c5963u = this.f12662f;
                        AbstractC6118n.m27184b(c5963u);
                        c5963u.m26926i(true);
                    }
                } else if (this.f12662f != null && ((eventType == 64 && AbstractC6118n.m27183a(aEvent.getClassName(), "android.widget.Toast")) || !(eventType != 2 || (className = aEvent.getClassName()) == null || className.equals("android.widget.EditText")))) {
                    C5963u c5963u2 = this.f12662f;
                    AbstractC6118n.m27184b(c5963u2);
                    c5963u2.m26926i(false);
                } else if (eventType == 4096 && (c3079a2 = this.f12649G) != null && c3079a2.m15307r()) {
                    m15191B();
                } else if (eventType == 2097152 && (c3079a = this.f12649G) != null && c3079a.m15307r()) {
                    m15192C();
                } else if ((eventType == 8 || eventType == 8192) && !AbstractC6118n.m27183a(getPackageName(), aEvent.getPackageName()) && (source = aEvent.getSource()) != null && source.isEditable()) {
                    AccessibilityNodeInfo source4 = aEvent.getSource();
                    if (source4 != null && (text = source4.getText()) != null) {
                        string = text.toString();
                    }
                    m15201R(string);
                }
                Boolean bool2 = this.f12670y;
                AbstractC6118n.m27184b(bool2);
                if (!bool2.booleanValue() || eventType == 4096 || eventType == 2097152) {
                    return;
                }
                m15204Y();
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        f12641Q = this;
        m15190A().registerOnSharedPreferenceChangeListener(this);
    }

    @Override // android.app.Service
    public void onDestroy() {
        m15231V();
        m15190A().unregisterOnSharedPreferenceChangeListener(this);
        f12641Q = null;
        super.onDestroy();
    }

    @Override // android.accessibilityservice.AccessibilityService
    public void onInterrupt() {
    }

    @Override // android.accessibilityservice.AccessibilityService
    protected boolean onKeyEvent(KeyEvent keyEvent) {
        f12642R = System.currentTimeMillis();
        return super.onKeyEvent(keyEvent);
    }

    @Override // android.accessibilityservice.AccessibilityService
    protected void onServiceConnected() {
        f12642R = System.currentTimeMillis();
        super.onServiceConnected();
        m15229T();
        if (AccessibilitySettingActivity.f12918V.m16033b()) {
            m15206a0();
        }
        MyApplication myApplicationM15105a = MyApplication.f12496a.m15105a();
        AbstractC6118n.m27184b(myApplicationM15105a);
        myApplicationM15105a.m15104j(true);
        AccessibilityServiceInfo serviceInfo = getServiceInfo();
        serviceInfo.eventTypes = 2109547;
        serviceInfo.feedbackType = 16;
        serviceInfo.flags = 90;
        serviceInfo.notificationTimeout = 100L;
        setServiceInfo(serviceInfo);
        m15232W();
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        boolean z7;
        try {
            C3034A c3034a = C3034A.f12453a;
            if (AbstractC6118n.m27183a(str, c3034a.m15031e())) {
                z7 = sharedPreferences != null ? sharedPreferences.getBoolean(str, true) : true;
                if (AbstractC6118n.m27183a(this.f12668w, Boolean.valueOf(z7))) {
                    return;
                }
                this.f12668w = Boolean.valueOf(z7);
                if (z7) {
                    m15200O();
                    return;
                } else {
                    m15231V();
                    return;
                }
            }
            if (AbstractC6118n.m27183a(str, c3034a.m15014A())) {
                z7 = sharedPreferences != null ? sharedPreferences.getBoolean(str, true) : true;
                if (AbstractC6118n.m27183a(this.f12669x, Boolean.valueOf(z7))) {
                    return;
                }
                this.f12669x = Boolean.valueOf(z7);
                if (z7) {
                    m15223F();
                    return;
                } else {
                    m15237r();
                    return;
                }
            }
            if (AbstractC6118n.m27183a(str, c3034a.m15032f())) {
                z7 = sharedPreferences != null ? sharedPreferences.getBoolean(str, true) : true;
                if (AbstractC6118n.m27183a(this.f12670y, Boolean.valueOf(z7))) {
                    return;
                }
                AbstractC6118n.m27183a(this.f12670y, Boolean.TRUE);
                this.f12670y = Boolean.valueOf(z7);
                if (!z7) {
                    m15226N();
                    m15234o();
                    return;
                } else {
                    if (this.f12664s == null) {
                        this.f12664s = C5961s.f23646t.m26910a();
                    }
                    m15232W();
                    return;
                }
            }
            if (AbstractC6118n.m27183a(str, c3034a.m15037k())) {
                z7 = sharedPreferences != null ? sharedPreferences.getBoolean(str, true) : true;
                if (AbstractC6118n.m27183a(this.f12671z, Boolean.valueOf(z7))) {
                    return;
                }
                this.f12671z = Boolean.valueOf(z7);
                if (!z7) {
                    m15235p();
                    m15220n();
                    return;
                }
                if (this.f12663r == null) {
                    this.f12663r = C5915F.f23488j.m26698a();
                }
                if (this.f12662f == null) {
                    C5963u c5963uM26928a = C5963u.f23690h.m26928a();
                    this.f12662f = c5963uM26928a;
                    AbstractC6118n.m27184b(c5963uM26928a);
                    c5963uM26928a.m26923d(this);
                    return;
                }
                return;
            }
            if (AbstractC6118n.m27183a(str, c3034a.m15038l())) {
                int i7 = sharedPreferences != null ? sharedPreferences.getInt(str, 2) : 2;
                C5915F c5915f = this.f12663r;
                if (c5915f != null) {
                    c5915f.m26695p(i7);
                    return;
                }
                return;
            }
            if (AbstractC6118n.m27183a(str, c3034a.m15036j())) {
                float f7 = sharedPreferences != null ? sharedPreferences.getFloat(str, 35.0f) : 35.0f;
                C5915F c5915f2 = this.f12663r;
                if (c5915f2 != null) {
                    c5915f2.m26694o(f7);
                    return;
                }
                return;
            }
            if (AbstractC6118n.m27183a(str, c3034a.m15033g())) {
                z7 = sharedPreferences != null ? sharedPreferences.getBoolean(str, true) : true;
                if (AbstractC6118n.m27183a(this.f12643A, Boolean.valueOf(z7))) {
                    return;
                }
                this.f12643A = Boolean.valueOf(z7);
                if (!z7) {
                    m15220n();
                    return;
                } else {
                    if (this.f12662f == null) {
                        C5963u c5963uM26928a2 = C5963u.f23690h.m26928a();
                        this.f12662f = c5963uM26928a2;
                        AbstractC6118n.m27184b(c5963uM26928a2);
                        c5963uM26928a2.m26923d(this);
                        return;
                    }
                    return;
                }
            }
            if (!AbstractC6118n.m27183a(str, c3034a.m15034h()[0] + "feature")) {
                if (!AbstractC6118n.m27183a(str, c3034a.m15034h()[1] + "feature")) {
                    if (!AbstractC6118n.m27183a(str, c3034a.m15034h()[2] + "feature")) {
                        if (!AbstractC6118n.m27183a(str, c3034a.m15034h()[0] + "enable")) {
                            if (!AbstractC6118n.m27183a(str, c3034a.m15034h()[1] + "enable")) {
                                if (!AbstractC6118n.m27183a(str, c3034a.m15034h()[2] + "enable")) {
                                    return;
                                }
                            }
                        }
                        m15205Z();
                        return;
                    }
                }
            }
            m15205Z();
        } catch (Exception e7) {
            Log.e("AnasMyAccessibilityService", "Error in onSharedPreferenceChanged", e7);
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m15235p() {
        C5915F c5915f = this.f12663r;
        if (c5915f != null) {
            c5915f.m26696q();
        }
        this.f12663r = null;
    }

    /* JADX INFO: renamed from: q */
    public final void m15236q() {
        C5963u c5963u = this.f12662f;
        if (c5963u != null) {
            c5963u.m26927k(this);
        }
        C5963u c5963u2 = this.f12662f;
        if (c5963u2 != null) {
            c5963u2.m26924e();
        }
        this.f12662f = null;
    }

    /* JADX INFO: renamed from: r */
    public final void m15237r() {
        SharedPreferencesOnSharedPreferenceChangeListenerC5948g0 sharedPreferencesOnSharedPreferenceChangeListenerC5948g0 = this.f12661e;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC5948g0 != null) {
            sharedPreferencesOnSharedPreferenceChangeListenerC5948g0.m26811M();
        }
        this.f12661e = null;
    }

    /* JADX INFO: renamed from: s */
    public final void m15238s() {
        C3079a c3079a = this.f12649G;
        if (c3079a != null) {
            c3079a.m15306o();
        }
        this.f12649G = null;
        AbstractC6626O.m28101d(this.f12651I, null, 1, null);
    }

    /* JADX INFO: renamed from: t */
    public final AccessibilityNodeInfo m15239t(AccessibilityNodeInfo accessibilityNodeInfo) {
        if (accessibilityNodeInfo == null) {
            return null;
        }
        if (accessibilityNodeInfo.isEditable() && accessibilityNodeInfo.isFocused()) {
            return accessibilityNodeInfo;
        }
        int childCount = accessibilityNodeInfo.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            AccessibilityNodeInfo accessibilityNodeInfoM15239t = m15239t(accessibilityNodeInfo.getChild(i7));
            if (accessibilityNodeInfoM15239t != null) {
                return accessibilityNodeInfoM15239t;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: u */
    public final String[] m15240u() {
        String[] strArr = this.f12653K;
        if (strArr != null) {
            return strArr;
        }
        AbstractC6118n.m27197o("arrayDescriptionButton");
        return null;
    }

    /* JADX INFO: renamed from: v */
    public final String[] m15241v() {
        String[] strArr = this.f12654L;
        if (strArr != null) {
            return strArr;
        }
        AbstractC6118n.m27197o("arrayIdSystemUiButton");
        return null;
    }

    /* JADX INFO: renamed from: w */
    public final C2611C m15242w() {
        return this.f12645C;
    }

    /* JADX INFO: renamed from: x */
    public final String m15243x() {
        if (System.currentTimeMillis() - this.f12657a < 4000) {
            return this.f12658b;
        }
        return null;
    }
}
