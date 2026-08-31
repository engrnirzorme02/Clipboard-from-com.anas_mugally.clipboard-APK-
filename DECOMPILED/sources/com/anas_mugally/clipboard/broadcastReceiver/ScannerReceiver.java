package com.anas_mugally.clipboard.broadcastReceiver;

import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.provider.Settings;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityWindowInfo;
import android.widget.Toast;
import com.anas_mugally.clipboard.C3034A;
import com.anas_mugally.clipboard.C3149w;
import com.anas_mugally.clipboard.C3150x;
import com.anas_mugally.clipboard.R;
import com.anas_mugally.clipboard.broadcastReceiver.ScannerReceiver;
import com.anas_mugally.clipboard.p221ui.TextExtractionActivity;
import com.anas_mugally.clipboard.service.MyAccessibilityService;
import com.google.android.gms.internal.ads.zzbbn;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.AbstractC6097l;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import p145S5.AbstractC1437o;
import p145S5.C1435m;
import p145S5.C1444v;
import p152T5.AbstractC1617O;
import p152T5.AbstractC1638q;
import p173W5.InterfaceC1875e;
import p180X5.AbstractC2005b;
import p238e6.InterfaceC5371p;
import p265i1.C5684m;
import p318o6.AbstractC6603C0;
import p318o6.AbstractC6626O;
import p318o6.AbstractC6672k;
import p318o6.C6656c0;
import p318o6.InterfaceC6624N;
import p318o6.InterfaceC6701y0;

/* JADX INFO: loaded from: classes.dex */
public final class ScannerReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: o */
    public static final C3047a f12574o = new C3047a(null);

    /* JADX INFO: renamed from: a */
    private long f12575a;

    /* JADX INFO: renamed from: b */
    private WindowManager f12576b;

    /* JADX INFO: renamed from: c */
    private C5684m f12577c;

    /* JADX INFO: renamed from: d */
    private int f12578d;

    /* JADX INFO: renamed from: f */
    private MyAccessibilityService f12580f;

    /* JADX INFO: renamed from: g */
    private List f12581g;

    /* JADX INFO: renamed from: h */
    private C3150x f12582h;

    /* JADX INFO: renamed from: i */
    private InterfaceC6701y0 f12583i;

    /* JADX INFO: renamed from: k */
    private Context f12585k;

    /* JADX INFO: renamed from: n */
    private long f12588n;

    /* JADX INFO: renamed from: e */
    private final List f12579e = AbstractC1638q.m6767l(C5684m.a.DOWN, C5684m.a.LEFT, C5684m.a.UP, C5684m.a.RIGHT);

    /* JADX INFO: renamed from: j */
    private final InterfaceC6624N f12584j = AbstractC6626O.m28098a(C6656c0.m28164c().plus(AbstractC6603C0.m27960b(null, 1, null)));

    /* JADX INFO: renamed from: l */
    private Handler f12586l = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: m */
    private long f12587m = 3000;

    /* JADX INFO: renamed from: com.anas_mugally.clipboard.broadcastReceiver.ScannerReceiver$a */
    public static final class C3047a {
        public /* synthetic */ C3047a(AbstractC6112h abstractC6112h) {
            this();
        }

        private C3047a() {
        }
    }

    /* JADX INFO: renamed from: com.anas_mugally.clipboard.broadcastReceiver.ScannerReceiver$b */
    static final class C3048b extends AbstractC6097l implements InterfaceC5371p {

        /* JADX INFO: renamed from: a */
        int f12589a;

        C3048b(InterfaceC1875e interfaceC1875e) {
            super(2, interfaceC1875e);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
            return ScannerReceiver.this.new C3048b(interfaceC1875e);
        }

        @Override // p238e6.InterfaceC5371p
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
            return ((C3048b) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final Object invokeSuspend(Object obj) {
            ArrayList arrayList;
            AbstractC2005b.m8369e();
            if (this.f12589a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1437o.m6082b(obj);
            ScannerReceiver scannerReceiver = ScannerReceiver.this;
            C3150x c3150x = scannerReceiver.f12582h;
            ArrayList arrayList2 = null;
            if (c3150x != null) {
                MyAccessibilityService myAccessibilityServiceM15245a = MyAccessibilityService.f12639O.m15245a();
                AbstractC6118n.m27184b(myAccessibilityServiceM15245a);
                List<AccessibilityWindowInfo> windows = myAccessibilityServiceM15245a.getWindows();
                if (windows != null) {
                    arrayList = new ArrayList(AbstractC1638q.m6774s(windows, 10));
                    Iterator<T> it = windows.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((AccessibilityWindowInfo) it.next()).getRoot());
                    }
                } else {
                    arrayList = null;
                }
                List<C1435m> listM16733b = c3150x.m16733b(arrayList, false);
                if (listM16733b != null) {
                    arrayList2 = new ArrayList(AbstractC1638q.m6774s(listM16733b, 10));
                    for (C1435m c1435m : listM16733b) {
                        Bundle bundle = new Bundle();
                        bundle.putString("string", (String) c1435m.m6070c());
                        bundle.putParcelable("rect", (Parcelable) c1435m.m6071d());
                        arrayList2.add(bundle);
                    }
                }
            }
            scannerReceiver.f12581g = arrayList2;
            return C1444v.f4971a;
        }
    }

    /* JADX INFO: renamed from: com.anas_mugally.clipboard.broadcastReceiver.ScannerReceiver$c */
    public static final class C3049c implements C5684m.b {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ long f12592b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ C5684m f12593c;

        C3049c(long j7, C5684m c5684m) {
            this.f12592b = j7;
            this.f12593c = c5684m;
        }

        @Override // p265i1.C5684m.b
        /* JADX INFO: renamed from: a */
        public void mo15138a(C5684m.a direction) {
            AbstractC6118n.m27187e(direction, "direction");
            List list = ScannerReceiver.this.f12581g;
            if (list != null && !list.isEmpty()) {
                ScannerReceiver.this.m15127q();
                ScannerReceiver.this.m15130w();
            } else if (System.currentTimeMillis() - this.f12592b > 60000) {
                Toast.makeText(this.f12593c.getContext(), R.string.stop_scan_mode, 0).show();
                this.f12593c.setAnimationListener(null);
                ScannerReceiver.this.m15130w();
            } else {
                ScannerReceiver scannerReceiver = ScannerReceiver.this;
                scannerReceiver.f12578d = (scannerReceiver.f12578d + 1) % ScannerReceiver.this.f12579e.size();
                this.f12593c.m25233h((C5684m.a) ScannerReceiver.this.f12579e.get(ScannerReceiver.this.f12578d));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final void m15110A(ScannerReceiver scannerReceiver, Intent intent) {
        scannerReceiver.m15124n(intent);
    }

    /* JADX INFO: renamed from: n */
    private final void m15124n(final Intent intent) {
        MyAccessibilityService myAccessibilityService = this.f12580f;
        if (myAccessibilityService == null) {
            AbstractC6118n.m27197o("accessibilityService");
            myAccessibilityService = null;
        }
        AccessibilityNodeInfo rootInActiveWindow = myAccessibilityService.getRootInActiveWindow();
        List<AccessibilityNodeInfo> listFindAccessibilityNodeInfosByViewId = rootInActiveWindow != null ? rootInActiveWindow.findAccessibilityNodeInfosByViewId("com.android.systemui:id/notification_panel") : null;
        if (listFindAccessibilityNodeInfosByViewId == null || listFindAccessibilityNodeInfosByViewId.isEmpty()) {
            m15133r(intent);
        } else if (System.currentTimeMillis() - this.f12588n < this.f12587m) {
            this.f12586l.postDelayed(new Runnable() { // from class: b1.c
                @Override // java.lang.Runnable
                public final void run() {
                    ScannerReceiver.m15125o(this.f12051a, intent);
                }
            }, 100L);
        } else {
            m15134u(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final void m15125o(ScannerReceiver scannerReceiver, Intent intent) {
        scannerReceiver.m15124n(intent);
    }

    /* JADX INFO: renamed from: p */
    private final void m15126p() {
        this.f12583i = AbstractC6672k.m28227d(this.f12584j, C6656c0.m28163b(), null, new C3048b(null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public final void m15127q() {
        Context context = this.f12585k;
        Context context2 = null;
        if (context == null) {
            AbstractC6118n.m27197o("context");
            context = null;
        }
        Intent intent = new Intent(context, (Class<?>) TextExtractionActivity.class);
        intent.addFlags(1350565888);
        intent.putParcelableArrayListExtra("list", new ArrayList<>(this.f12581g));
        Context context3 = this.f12585k;
        if (context3 == null) {
            AbstractC6118n.m27197o("context");
        } else {
            context2 = context3;
        }
        context2.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final void m15128s(ScannerReceiver scannerReceiver) {
        scannerReceiver.m15126p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final void m15129t(ScannerReceiver scannerReceiver) {
        MyAccessibilityService myAccessibilityService = scannerReceiver.f12580f;
        if (myAccessibilityService == null) {
            AbstractC6118n.m27197o("accessibilityService");
            myAccessibilityService = null;
        }
        myAccessibilityService.m15230U();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public final void m15130w() {
        InterfaceC6701y0 interfaceC6701y0 = this.f12583i;
        if (interfaceC6701y0 != null) {
            InterfaceC6701y0.a.m28291b(interfaceC6701y0, null, 1, null);
        }
        try {
            WindowManager windowManager = this.f12576b;
            if (windowManager != null) {
                windowManager.removeView(this.f12577c);
            }
        } catch (Exception unused) {
        }
        this.f12577c = null;
    }

    /* JADX INFO: renamed from: x */
    private final void m15131x() {
        Context context = this.f12585k;
        if (context == null) {
            AbstractC6118n.m27197o("context");
            context = null;
        }
        final C5684m c5684m = new C5684m(context, 800L);
        c5684m.setElevation(10.0f);
        final long jCurrentTimeMillis = System.currentTimeMillis();
        c5684m.setOnClickListener(new View.OnClickListener() { // from class: b1.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ScannerReceiver.m15132y(jCurrentTimeMillis, c5684m, this, view);
            }
        });
        c5684m.setAnimationListener(new C3049c(jCurrentTimeMillis, c5684m));
        c5684m.m25233h((C5684m.a) this.f12579e.get(this.f12578d));
        this.f12577c = c5684m;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-1, -1, C3034A.f12453a.m15050y(true), 67438344, -3);
        layoutParams.gravity = 8388659;
        if (Build.VERSION.SDK_INT >= 28) {
            layoutParams.layoutInDisplayCutoutMode = 1;
        }
        try {
            WindowManager windowManager = this.f12576b;
            if (windowManager != null) {
                windowManager.addView(this.f12577c, layoutParams);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final void m15132y(long j7, C5684m c5684m, ScannerReceiver scannerReceiver, View view) {
        if (System.currentTimeMillis() - j7 < 3000) {
            return;
        }
        Toast.makeText(c5684m.getContext(), R.string.stop_scan_mode, 0).show();
        c5684m.setAnimationListener(null);
        scannerReceiver.m15130w();
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        AbstractC6118n.m27187e(context, "context");
        AbstractC6118n.m27187e(intent, "intent");
        this.f12585k = context;
        String action = intent.getAction();
        if (action != null && AbstractC1617O.m6652f("com.anas_mugally.clipboard.action_extract_text", "com.anas_mugally.clipboard.action_extract_text_while_scrolling").contains(action) && C3034A.f12453a.m15028b(context)) {
            ContentResolver contentResolver = context.getContentResolver();
            AbstractC6118n.m27186d(contentResolver, "getContentResolver(...)");
            this.f12575a = (long) (m15135v(contentResolver) * zzbbn.zzq.zzf);
            MyAccessibilityService myAccessibilityServiceM15245a = MyAccessibilityService.f12639O.m15245a();
            AbstractC6118n.m27184b(myAccessibilityServiceM15245a);
            this.f12580f = myAccessibilityServiceM15245a;
            boolean booleanExtra = intent.getBooleanExtra(C3149w.f13206f.m16727a(), false);
            if (booleanExtra) {
                MyAccessibilityService myAccessibilityService = this.f12580f;
                if (myAccessibilityService == null) {
                    AbstractC6118n.m27197o("accessibilityService");
                    myAccessibilityService = null;
                }
                myAccessibilityService.m15225L();
            }
            if (intent.getBooleanExtra("direct", false) && !booleanExtra) {
                this.f12575a = 0L;
            }
            m15136z(intent);
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m15133r(Intent intent) {
        AbstractC6118n.m27187e(intent, "intent");
        if (!AbstractC6118n.m27183a(intent.getAction(), "com.anas_mugally.clipboard.action_extract_text")) {
            if (AbstractC6118n.m27183a(intent.getAction(), "com.anas_mugally.clipboard.action_extract_text_while_scrolling")) {
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: b1.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        ScannerReceiver.m15129t(this.f12054a);
                    }
                }, this.f12575a);
                return;
            }
            return;
        }
        MyAccessibilityService myAccessibilityService = this.f12580f;
        if (myAccessibilityService == null) {
            AbstractC6118n.m27197o("accessibilityService");
            myAccessibilityService = null;
        }
        Object systemService = myAccessibilityService.getSystemService("window");
        AbstractC6118n.m27185c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.f12576b = (WindowManager) systemService;
        this.f12582h = new C3150x();
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: b1.d
            @Override // java.lang.Runnable
            public final void run() {
                ScannerReceiver.m15128s(this.f12053a);
            }
        }, this.f12575a);
        m15131x();
    }

    /* JADX INFO: renamed from: u */
    public final void m15134u(Intent intent) {
        AbstractC6118n.m27187e(intent, "intent");
        m15133r(intent);
    }

    /* JADX INFO: renamed from: v */
    public final float m15135v(ContentResolver contentResolver) {
        float f7;
        float f8;
        float f9;
        AbstractC6118n.m27187e(contentResolver, "contentResolver");
        try {
            f7 = Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
        } catch (Exception unused) {
            f7 = 1.0f;
        }
        try {
            f8 = Settings.Global.getFloat(contentResolver, "transition_animation_scale", 1.0f);
        } catch (Exception unused2) {
            f8 = 1.0f;
        }
        try {
            f9 = Settings.Global.getFloat(contentResolver, "window_animation_scale", 1.0f);
        } catch (Exception unused3) {
            f9 = 1.0f;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(f7);
        sb.append(' ');
        sb.append(f8);
        sb.append(' ');
        sb.append(f9);
        Log.d("anas_animation", sb.toString());
        Float fValueOf = Float.valueOf(Math.max(f7, Math.max(f8, f9)));
        if (fValueOf.floatValue() <= 0.0f) {
            fValueOf = null;
        }
        if (fValueOf != null) {
            return fValueOf.floatValue();
        }
        return 1.0f;
    }

    /* JADX INFO: renamed from: z */
    public final void m15136z(final Intent intent) {
        AbstractC6118n.m27187e(intent, "intent");
        this.f12588n = System.currentTimeMillis();
        this.f12586l.postDelayed(new Runnable() { // from class: b1.b
            @Override // java.lang.Runnable
            public final void run() {
                ScannerReceiver.m15110A(this.f12049a, intent);
            }
        }, this.f12575a);
    }
}
