package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbzh;
import com.google.android.gms.internal.ads.zzdvo;
import com.google.android.gms.internal.ads.zzdvs;
import com.google.android.gms.internal.ads.zzgpd;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import p380w2.C7351t;
import p404z2.AbstractC7599p;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.util.u */
/* JADX INFO: loaded from: classes.dex */
public final class C3501u {

    /* JADX INFO: renamed from: a */
    private final Context f14320a;

    /* JADX INFO: renamed from: b */
    private final zzdvs f14321b;

    /* JADX INFO: renamed from: c */
    private String f14322c;

    /* JADX INFO: renamed from: d */
    private String f14323d;

    /* JADX INFO: renamed from: e */
    private String f14324e;

    /* JADX INFO: renamed from: f */
    private String f14325f;

    /* JADX INFO: renamed from: g */
    private int f14326g;

    /* JADX INFO: renamed from: h */
    private int f14327h;

    /* JADX INFO: renamed from: i */
    private PointF f14328i;

    /* JADX INFO: renamed from: j */
    private PointF f14329j;

    /* JADX INFO: renamed from: k */
    private Handler f14330k;

    /* JADX INFO: renamed from: l */
    private Runnable f14331l;

    public C3501u(Context context) {
        this.f14326g = 0;
        this.f14331l = new Runnable() { // from class: com.google.android.gms.ads.internal.util.t
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f14289a.m17572g();
            }
        };
        this.f14320a = context;
        this.f14327h = ViewConfiguration.get(context).getScaledTouchSlop();
        C7351t.m32365w().m17489a();
        this.f14330k = C7351t.m32365w().m17490b();
        this.f14321b = C7351t.m32361s().m17587b();
    }

    /* JADX INFO: renamed from: s */
    private final boolean m17563s(float f7, float f8, float f9, float f10) {
        return Math.abs(this.f14328i.x - f7) < ((float) this.f14327h) && Math.abs(this.f14328i.y - f8) < ((float) this.f14327h) && Math.abs(this.f14329j.x - f9) < ((float) this.f14327h) && Math.abs(this.f14329j.y - f10) < ((float) this.f14327h);
    }

    /* JADX INFO: renamed from: t */
    private final void m17564t(Context context) {
        final int i7;
        ArrayList arrayList = new ArrayList();
        int iM17565u = m17565u(arrayList, "None", true);
        final int iM17565u2 = m17565u(arrayList, "Shake", true);
        final int iM17565u3 = m17565u(arrayList, "Flick", true);
        int iOrdinal = this.f14321b.zzf().ordinal();
        if (iOrdinal != 1) {
            i7 = iOrdinal != 2 ? iM17565u : iM17565u3;
        } else {
            i7 = iM17565u2;
        }
        C7351t.m32349g();
        AlertDialog.Builder builderM17424o = C3431F0.m17424o(context);
        final AtomicInteger atomicInteger = new AtomicInteger(i7);
        builderM17424o.setTitle("Setup gesture");
        builderM17424o.setSingleChoiceItems((CharSequence[]) arrayList.toArray(new String[0]), i7, new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.k
            @Override // android.content.DialogInterface.OnClickListener
            public final /* synthetic */ void onClick(DialogInterface dialogInterface, int i8) {
                atomicInteger.set(i8);
            }
        });
        builderM17424o.setNegativeButton("Dismiss", new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.l
            @Override // android.content.DialogInterface.OnClickListener
            public final /* synthetic */ void onClick(DialogInterface dialogInterface, int i8) {
                this.f14260a.m17567b();
            }
        });
        builderM17424o.setPositiveButton("Save", new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.m
            @Override // android.content.DialogInterface.OnClickListener
            public final /* synthetic */ void onClick(DialogInterface dialogInterface, int i8) {
                this.f14264a.m17574i(atomicInteger, i7, iM17565u2, iM17565u3, dialogInterface, i8);
            }
        });
        builderM17424o.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.ads.internal.util.n
            @Override // android.content.DialogInterface.OnCancelListener
            public final /* synthetic */ void onCancel(DialogInterface dialogInterface) {
                this.f14275a.m17567b();
            }
        });
        builderM17424o.create().show();
    }

    /* JADX INFO: renamed from: u */
    private static final int m17565u(List list, String str, boolean z7) {
        if (!z7) {
            return -1;
        }
        list.add(str);
        return list.size() - 1;
    }

    /* JADX INFO: renamed from: a */
    public final void m17566a(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int historySize = motionEvent.getHistorySize();
        int pointerCount = motionEvent.getPointerCount();
        if (actionMasked == 0) {
            this.f14326g = 0;
            this.f14328i = new PointF(motionEvent.getX(0), motionEvent.getY(0));
            return;
        }
        int i7 = this.f14326g;
        if (i7 == -1) {
            return;
        }
        if (i7 == 0) {
            if (actionMasked == 5) {
                this.f14326g = 5;
                this.f14329j = new PointF(motionEvent.getX(1), motionEvent.getY(1));
                this.f14330k.postDelayed(this.f14331l, ((Long) C3250D.m17200c().zzd(zzbci.zzfq)).longValue());
                return;
            }
            return;
        }
        if (i7 == 5) {
            if (pointerCount == 2) {
                if (actionMasked != 2) {
                    return;
                }
                boolean z7 = false;
                for (int i8 = 0; i8 < historySize; i8++) {
                    z7 |= !m17563s(motionEvent.getHistoricalX(0, i8), motionEvent.getHistoricalY(0, i8), motionEvent.getHistoricalX(1, i8), motionEvent.getHistoricalY(1, i8));
                }
                if (m17563s(motionEvent.getX(), motionEvent.getY(), motionEvent.getX(1), motionEvent.getY(1)) && !z7) {
                    return;
                }
            }
            this.f14326g = -1;
            this.f14330k.removeCallbacks(this.f14331l);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m17567b() {
        try {
            Context context = this.f14320a;
            if (!(context instanceof Activity)) {
                int i7 = AbstractC3490o0.f14278b;
                AbstractC7599p.m33330e("Can not create dialog without Activity Context");
                return;
            }
            String str = "Creative preview (enabled)";
            if (true == TextUtils.isEmpty(C7351t.m32361s().m17594i())) {
                str = "Creative preview";
            }
            String str2 = true != C7351t.m32361s().m17598m() ? "Troubleshooting" : "Troubleshooting (enabled)";
            ArrayList arrayList = new ArrayList();
            final int iM17565u = m17565u(arrayList, "Ad information", true);
            final int iM17565u2 = m17565u(arrayList, str, true);
            final int iM17565u3 = m17565u(arrayList, str2, true);
            boolean zBooleanValue = ((Boolean) C3250D.m17200c().zzd(zzbci.zzjX)).booleanValue();
            final int iM17565u4 = m17565u(arrayList, "Open ad inspector", zBooleanValue);
            final int iM17565u5 = m17565u(arrayList, "Ad inspector settings", zBooleanValue);
            C7351t.m32349g();
            AlertDialog.Builder builderM17424o = C3431F0.m17424o(context);
            builderM17424o.setTitle("Select a debug mode").setItems((CharSequence[]) arrayList.toArray(new String[0]), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.e
                @Override // android.content.DialogInterface.OnClickListener
                public final /* synthetic */ void onClick(DialogInterface dialogInterface, int i8) {
                    this.f14236a.m17573h(iM17565u, iM17565u2, iM17565u3, iM17565u4, iM17565u5, dialogInterface, i8);
                }
            });
            builderM17424o.create().show();
        } catch (WindowManager.BadTokenException e7) {
            AbstractC3490o0.m17546l("", e7);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m17568c(String str) {
        this.f14323d = str;
    }

    /* JADX INFO: renamed from: d */
    public final void m17569d(String str) {
        this.f14324e = str;
    }

    /* JADX INFO: renamed from: e */
    public final void m17570e(String str) {
        this.f14322c = str;
    }

    /* JADX INFO: renamed from: f */
    public final void m17571f(String str) {
        this.f14325f = str;
    }

    /* JADX INFO: renamed from: g */
    final /* synthetic */ void m17572g() {
        this.f14326g = 4;
        m17567b();
    }

    /* JADX INFO: renamed from: h */
    final /* synthetic */ void m17573h(int i7, int i8, int i9, int i10, int i11, DialogInterface dialogInterface, int i12) {
        if (i12 != i7) {
            if (i12 == i8) {
                int i13 = AbstractC3490o0.f14278b;
                AbstractC7599p.m33326a("Debug mode [Creative Preview] selected.");
                zzbzh.zza.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.g
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.f14244a.m17580o();
                    }
                });
                return;
            }
            if (i12 == i9) {
                int i14 = AbstractC3490o0.f14278b;
                AbstractC7599p.m33326a("Debug mode [Troubleshooting] selected.");
                zzbzh.zza.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.h
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.f14246a.m17581p();
                    }
                });
                return;
            }
            if (i12 == i10) {
                zzdvs zzdvsVar = this.f14321b;
                final zzgpd zzgpdVar = zzbzh.zzf;
                zzgpd zzgpdVar2 = zzbzh.zza;
                if (zzdvsVar.zzs()) {
                    zzgpdVar.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.r
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.f14282a.m17577l();
                        }
                    });
                    return;
                } else {
                    zzgpdVar2.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.q
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.f14280a.m17576k(zzgpdVar);
                        }
                    });
                    return;
                }
            }
            if (i12 == i11) {
                zzdvs zzdvsVar2 = this.f14321b;
                final zzgpd zzgpdVar3 = zzbzh.zzf;
                zzgpd zzgpdVar4 = zzbzh.zza;
                if (zzdvsVar2.zzs()) {
                    zzgpdVar3.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.f
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.f14243a.m17579n();
                        }
                    });
                    return;
                } else {
                    zzgpdVar4.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.s
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.f14284a.m17578m(zzgpdVar3);
                        }
                    });
                    return;
                }
            }
            return;
        }
        Context context = this.f14320a;
        if (!(context instanceof Activity)) {
            int i15 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33330e("Can not create dialog without Activity Context");
            return;
        }
        String str = this.f14322c;
        final String str2 = "No debug information";
        if (!TextUtils.isEmpty(str)) {
            Uri uriBuild = new Uri.Builder().encodedQuery(str.replaceAll("\\+", "%20")).build();
            StringBuilder sb = new StringBuilder();
            C7351t.m32349g();
            Map mapM17430u = C3431F0.m17430u(uriBuild);
            for (String str3 : mapM17430u.keySet()) {
                sb.append(str3);
                sb.append(" = ");
                sb.append((String) mapM17430u.get(str3));
                sb.append("\n\n");
            }
            String strTrim = sb.toString().trim();
            if (!TextUtils.isEmpty(strTrim)) {
                str2 = strTrim;
            }
        }
        C7351t.m32349g();
        AlertDialog.Builder builderM17424o = C3431F0.m17424o(context);
        builderM17424o.setMessage(str2);
        builderM17424o.setTitle("Ad Information");
        builderM17424o.setPositiveButton("Share", new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.o
            @Override // android.content.DialogInterface.OnClickListener
            public final /* synthetic */ void onClick(DialogInterface dialogInterface2, int i16) {
                this.f14276a.m17575j(str2, dialogInterface2, i16);
            }
        });
        builderM17424o.setNegativeButton("Close", DialogInterfaceOnClickListenerC3491p.f14279a);
        builderM17424o.create().show();
    }

    /* JADX INFO: renamed from: i */
    final /* synthetic */ void m17574i(AtomicInteger atomicInteger, int i7, int i8, int i9, DialogInterface dialogInterface, int i10) {
        if (atomicInteger.get() != i7) {
            if (atomicInteger.get() == i8) {
                this.f14321b.zze(zzdvo.SHAKE);
            } else if (atomicInteger.get() == i9) {
                this.f14321b.zze(zzdvo.FLICK);
            } else {
                this.f14321b.zze(zzdvo.NONE);
            }
        }
        m17567b();
    }

    /* JADX INFO: renamed from: j */
    final /* synthetic */ void m17575j(String str, DialogInterface dialogInterface, int i7) {
        C7351t.m32349g();
        C3431F0.m17434y(this.f14320a, Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", str), "Share via"));
    }

    /* JADX INFO: renamed from: k */
    final /* synthetic */ void m17576k(zzgpd zzgpdVar) {
        C3509y c3509yM32361s = C7351t.m32361s();
        Context context = this.f14320a;
        if (c3509yM32361s.m17590e(context, this.f14323d, this.f14324e)) {
            zzgpdVar.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.j
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f14252a.m17583r();
                }
            });
        } else {
            C7351t.m32361s().m17591f(context, this.f14323d, this.f14324e);
        }
    }

    /* JADX INFO: renamed from: l */
    final /* synthetic */ void m17577l() {
        C7351t.m32361s().m17588c(this.f14320a);
    }

    /* JADX INFO: renamed from: m */
    final /* synthetic */ void m17578m(zzgpd zzgpdVar) {
        C3509y c3509yM32361s = C7351t.m32361s();
        Context context = this.f14320a;
        if (c3509yM32361s.m17590e(context, this.f14323d, this.f14324e)) {
            zzgpdVar.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.i
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f14249a.m17582q();
                }
            });
        } else {
            C7351t.m32361s().m17591f(context, this.f14323d, this.f14324e);
        }
    }

    /* JADX INFO: renamed from: n */
    final /* synthetic */ void m17579n() {
        m17564t(this.f14320a);
    }

    /* JADX INFO: renamed from: o */
    final /* synthetic */ void m17580o() {
        C3509y c3509yM32361s = C7351t.m32361s();
        Context context = this.f14320a;
        String str = this.f14323d;
        String str2 = this.f14324e;
        if (!c3509yM32361s.m17589d(context, str, str2)) {
            c3509yM32361s.m17599n(context, "In-app preview failed to load because of a system error. Please try again later.", true, true);
            return;
        }
        if ("2".equals(c3509yM32361s.f14354f)) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33326a("Creative is not pushed for this device.");
            c3509yM32361s.m17599n(context, "There was no creative pushed from DFP to the device.", false, false);
        } else if ("1".equals(c3509yM32361s.f14354f)) {
            int i8 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33326a("The app is not linked for creative preview.");
            c3509yM32361s.m17591f(context, str, str2);
        } else if ("0".equals(c3509yM32361s.f14354f)) {
            int i9 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33326a("Device is linked for in app preview.");
            c3509yM32361s.m17599n(context, "The device is successfully linked for creative preview.", false, true);
        }
    }

    /* JADX INFO: renamed from: p */
    final /* synthetic */ void m17581p() {
        C3509y c3509yM32361s = C7351t.m32361s();
        String str = this.f14323d;
        String str2 = this.f14324e;
        String str3 = this.f14325f;
        boolean zM17598m = c3509yM32361s.m17598m();
        Context context = this.f14320a;
        c3509yM32361s.m17597l(c3509yM32361s.m17590e(context, str, str2));
        if (!c3509yM32361s.m17598m()) {
            c3509yM32361s.m17591f(context, str, str2);
            return;
        }
        if (!zM17598m && !TextUtils.isEmpty(str3)) {
            c3509yM32361s.m17593h(context, str2, str3, str);
        }
        int i7 = AbstractC3490o0.f14278b;
        AbstractC7599p.m33326a("Device is linked for debug signals.");
        c3509yM32361s.m17599n(context, "The device is successfully linked for troubleshooting.", false, true);
    }

    /* JADX INFO: renamed from: q */
    final /* synthetic */ void m17582q() {
        m17564t(this.f14320a);
    }

    /* JADX INFO: renamed from: r */
    final /* synthetic */ void m17583r() {
        C7351t.m32361s().m17588c(this.f14320a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append("{Dialog: ");
        sb.append(this.f14322c);
        sb.append(",DebugSignal: ");
        sb.append(this.f14325f);
        sb.append(",AFMA Version: ");
        sb.append(this.f14324e);
        sb.append(",Ad Unit ID: ");
        sb.append(this.f14323d);
        sb.append("}");
        return sb.toString();
    }

    public C3501u(Context context, String str) {
        this(context);
        this.f14322c = str;
    }
}
