package p036E2;

import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import androidx.browser.customtabs.AbstractC2379b;
import androidx.browser.customtabs.AbstractC2380c;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.client.C3349h2;
import com.google.android.gms.ads.internal.client.C3353i2;
import com.google.android.gms.ads.internal.client.C3369m2;
import com.google.android.gms.ads.internal.util.AbstractC3456V;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import com.google.android.gms.dynamic.BinderC3773b;
import com.google.android.gms.dynamic.InterfaceC3772a;
import com.google.android.gms.internal.ads.zzauu;
import com.google.android.gms.internal.ads.zzauv;
import com.google.android.gms.internal.ads.zzbbz;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbdn;
import com.google.android.gms.internal.ads.zzbeb;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbtl;
import com.google.android.gms.internal.ads.zzbto;
import com.google.android.gms.internal.ads.zzbyb;
import com.google.android.gms.internal.ads.zzbyd;
import com.google.android.gms.internal.ads.zzbyi;
import com.google.android.gms.internal.ads.zzbzh;
import com.google.android.gms.internal.ads.zzcgv;
import com.google.android.gms.internal.ads.zzcva;
import com.google.android.gms.internal.ads.zzdbr;
import com.google.android.gms.internal.ads.zzdnx;
import com.google.android.gms.internal.ads.zzdru;
import com.google.android.gms.internal.ads.zzdsr;
import com.google.android.gms.internal.ads.zzfdb;
import com.google.android.gms.internal.ads.zzfdg;
import com.google.android.gms.internal.ads.zzfeb;
import com.google.android.gms.internal.ads.zzfhr;
import com.google.android.gms.internal.ads.zzfib;
import com.google.android.gms.internal.ads.zzfie;
import com.google.android.gms.internal.ads.zzfjv;
import com.google.android.gms.internal.ads.zzggr;
import com.google.android.gms.internal.ads.zzghs;
import com.google.android.gms.internal.ads.zzgoa;
import com.google.android.gms.internal.ads.zzgob;
import com.google.android.gms.internal.ads.zzgol;
import com.google.android.gms.internal.ads.zzgot;
import com.google.android.gms.internal.ads.zzgpd;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;
import p157U3.InterfaceFutureC1673e;
import p314o2.C6556h;
import p314o2.EnumC6551c;
import p380w2.C7351t;
import p404z2.AbstractC7599p;
import p404z2.C7584a;

/* JADX INFO: renamed from: E2.w */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC0375w extends zzbyd {

    /* JADX INFO: renamed from: R */
    protected static final List f1478R = new ArrayList(Arrays.asList("/aclk", "/pcs/click", "/dbm/clk"));

    /* JADX INFO: renamed from: S */
    protected static final List f1479S = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com"));

    /* JADX INFO: renamed from: T */
    protected static final List f1480T = new ArrayList(Arrays.asList("/pagead/adview", "/pcs/view", "/pagead/conversion", "/dbm/ad"));

    /* JADX INFO: renamed from: U */
    protected static final List f1481U = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"));

    /* JADX INFO: renamed from: E */
    private final C7584a f1486E;

    /* JADX INFO: renamed from: F */
    private String f1487F;

    /* JADX INFO: renamed from: H */
    private final List f1489H;

    /* JADX INFO: renamed from: I */
    private final List f1490I;

    /* JADX INFO: renamed from: J */
    private final List f1491J;

    /* JADX INFO: renamed from: K */
    private final List f1492K;

    /* JADX INFO: renamed from: O */
    private final zzbdn f1496O;

    /* JADX INFO: renamed from: P */
    private final C0352k0 f1497P;

    /* JADX INFO: renamed from: Q */
    private final C0334b0 f1498Q;

    /* JADX INFO: renamed from: a */
    private final zzcgv f1499a;

    /* JADX INFO: renamed from: b */
    private Context f1500b;

    /* JADX INFO: renamed from: c */
    private final zzauu f1501c;

    /* JADX INFO: renamed from: d */
    private final zzfdg f1502d;

    /* JADX INFO: renamed from: e */
    private final zzfeb f1503e;

    /* JADX INFO: renamed from: f */
    private final zzgpd f1504f;

    /* JADX INFO: renamed from: r */
    private final ScheduledExecutorService f1505r;

    /* JADX INFO: renamed from: s */
    private zzbto f1506s;

    /* JADX INFO: renamed from: v */
    private final zzdsr f1509v;

    /* JADX INFO: renamed from: w */
    private final zzfjv f1510w;

    /* JADX INFO: renamed from: t */
    private Point f1507t = new Point();

    /* JADX INFO: renamed from: u */
    private Point f1508u = new Point();

    /* JADX INFO: renamed from: D */
    private final AtomicInteger f1485D = new AtomicInteger(0);

    /* JADX INFO: renamed from: L */
    private final AtomicBoolean f1493L = new AtomicBoolean(false);

    /* JADX INFO: renamed from: M */
    private final AtomicBoolean f1494M = new AtomicBoolean(false);

    /* JADX INFO: renamed from: N */
    private final AtomicInteger f1495N = new AtomicInteger(0);

    /* JADX INFO: renamed from: x */
    private final boolean f1511x = ((Boolean) C3250D.m17200c().zzd(zzbci.zzhH)).booleanValue();

    /* JADX INFO: renamed from: y */
    private final boolean f1512y = ((Boolean) C3250D.m17200c().zzd(zzbci.zzhG)).booleanValue();

    /* JADX INFO: renamed from: z */
    private final boolean f1513z = ((Boolean) C3250D.m17200c().zzd(zzbci.zzhJ)).booleanValue();

    /* JADX INFO: renamed from: A */
    private final boolean f1482A = ((Boolean) C3250D.m17200c().zzd(zzbci.zzhL)).booleanValue();

    /* JADX INFO: renamed from: B */
    private final String f1483B = (String) C3250D.m17200c().zzd(zzbci.zzhK);

    /* JADX INFO: renamed from: C */
    private final String f1484C = (String) C3250D.m17200c().zzd(zzbci.zzhM);

    /* JADX INFO: renamed from: G */
    private final String f1488G = (String) C3250D.m17200c().zzd(zzbci.zzhN);

    BinderC0375w(zzcgv zzcgvVar, Context context, zzauu zzauuVar, zzfeb zzfebVar, zzgpd zzgpdVar, ScheduledExecutorService scheduledExecutorService, zzdsr zzdsrVar, zzfjv zzfjvVar, C7584a c7584a, zzbdn zzbdnVar, zzfdg zzfdgVar, C0352k0 c0352k0, C0334b0 c0334b0) {
        List listM1575l1;
        this.f1499a = zzcgvVar;
        this.f1500b = context;
        this.f1501c = zzauuVar;
        this.f1502d = zzfdgVar;
        this.f1503e = zzfebVar;
        this.f1504f = zzgpdVar;
        this.f1505r = scheduledExecutorService;
        this.f1509v = zzdsrVar;
        this.f1510w = zzfjvVar;
        this.f1486E = c7584a;
        this.f1496O = zzbdnVar;
        this.f1497P = c0352k0;
        this.f1498Q = c0334b0;
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzhO)).booleanValue()) {
            this.f1489H = m1575l1((String) C3250D.m17200c().zzd(zzbci.zzhP));
            this.f1490I = m1575l1((String) C3250D.m17200c().zzd(zzbci.zzhQ));
            this.f1491J = m1575l1((String) C3250D.m17200c().zzd(zzbci.zzhR));
            listM1575l1 = m1575l1((String) C3250D.m17200c().zzd(zzbci.zzhS));
        } else {
            this.f1489H = f1478R;
            this.f1490I = f1479S;
            this.f1491J = f1480T;
            listM1575l1 = f1481U;
        }
        this.f1492K = listM1575l1;
    }

    /* JADX INFO: renamed from: b1 */
    static final /* synthetic */ Uri m1565b1(Uri uri, String str) {
        return !TextUtils.isEmpty(str) ? m1574k1(uri, "nas", str) : uri;
    }

    /* JADX INFO: renamed from: c1 */
    private final void m1566c1(final List list, final InterfaceC3772a interfaceC3772a, zzbtl zzbtlVar, boolean z7) {
        if (!((Boolean) C3250D.m17200c().zzd(zzbci.zzie)).booleanValue()) {
            try {
                zzbtlVar.zzf("The updating URL feature is not enabled.");
                return;
            } catch (RemoteException e7) {
                int i7 = AbstractC3490o0.f14278b;
                AbstractC7599p.m33329d("", e7);
                return;
            }
        }
        zzgpd zzgpdVar = this.f1504f;
        InterfaceFutureC1673e interfaceFutureC1673eSubmit = zzgpdVar.submit(new Callable() { // from class: E2.k
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.f1408a.m1596p1(list, interfaceC3772a);
            }
        });
        if (m1573j1()) {
            interfaceFutureC1673eSubmit = zzgot.zzj(interfaceFutureC1673eSubmit, new zzgob() { // from class: E2.m
                @Override // com.google.android.gms.internal.ads.zzgob
                public final /* synthetic */ InterfaceFutureC1673e zza(Object obj) {
                    return this.f1424a.m1597q1((ArrayList) obj);
                }
            }, zzgpdVar);
        } else {
            int i8 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33330e("Asset view map is empty.");
        }
        zzgot.zzq(interfaceFutureC1673eSubmit, new C0343g(this, zzbtlVar, z7), this.f1499a.zzb());
    }

    /* JADX INFO: renamed from: d1 */
    private final void m1567d1(List list, final InterfaceC3772a interfaceC3772a, zzbtl zzbtlVar, boolean z7) {
        InterfaceFutureC1673e interfaceFutureC1673eSubmit;
        if (!((Boolean) C3250D.m17200c().zzd(zzbci.zzie)).booleanValue()) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33331f("The updating URL feature is not enabled.");
            try {
                zzbtlVar.zzf("The updating URL feature is not enabled.");
                return;
            } catch (RemoteException e7) {
                AbstractC7599p.m33329d("", e7);
                return;
            }
        }
        Iterator it = list.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            if (m1594n1((Uri) it.next())) {
                i8++;
            }
        }
        if (i8 > 1) {
            String strValueOf = String.valueOf(list);
            int i9 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33331f("Multiple google urls found: ".concat(strValueOf));
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            final Uri uri = (Uri) it2.next();
            if (m1594n1(uri)) {
                zzgpd zzgpdVar = this.f1504f;
                interfaceFutureC1673eSubmit = zzgpdVar.submit(new Callable() { // from class: E2.n
                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ Object call() {
                        return this.f1430a.m1598r1(uri, interfaceC3772a);
                    }
                });
                if (m1573j1()) {
                    interfaceFutureC1673eSubmit = zzgot.zzj(interfaceFutureC1673eSubmit, new zzgob() { // from class: E2.o
                        @Override // com.google.android.gms.internal.ads.zzgob
                        public final /* synthetic */ InterfaceFutureC1673e zza(Object obj) {
                            return this.f1435a.m1599s1((Uri) obj);
                        }
                    }, zzgpdVar);
                } else {
                    int i10 = AbstractC3490o0.f14278b;
                    AbstractC7599p.m33330e("Asset view map is empty.");
                }
            } else {
                String strValueOf2 = String.valueOf(uri);
                int i11 = AbstractC3490o0.f14278b;
                AbstractC7599p.m33331f("Not a Google URL: ".concat(strValueOf2));
                interfaceFutureC1673eSubmit = zzgot.zza(uri);
            }
            arrayList.add(interfaceFutureC1673eSubmit);
        }
        zzgot.zzq(zzgot.zzl(arrayList), new C0345h(this, zzbtlVar, z7), this.f1499a.zzb());
    }

    /* JADX INFO: renamed from: e1 */
    private final void m1568e1() {
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzkr)).booleanValue()) {
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzku)).booleanValue()) {
                return;
            }
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzky)).booleanValue() && this.f1493L.getAndSet(true)) {
                return;
            }
            m1605y1();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f1, reason: merged with bridge method [inline-methods] */
    public final void m1605y1() {
        BinderC0375w binderC0375w;
        InterfaceFutureC1673e interfaceFutureC1673eZza;
        if (((Boolean) zzben.zze.zze()).booleanValue()) {
            this.f1497P.m1534a();
            return;
        }
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzlS)).booleanValue()) {
            interfaceFutureC1673eZza = zzgot.zzf(new zzgoa() { // from class: E2.p
                @Override // com.google.android.gms.internal.ads.zzgoa
                public final /* synthetic */ InterfaceFutureC1673e zza() {
                    return this.f1437a.m1600t1();
                }
            }, zzbzh.zza);
            binderC0375w = this;
        } else {
            binderC0375w = this;
            interfaceFutureC1673eZza = binderC0375w.m1571h1(this.f1500b, null, EnumC6551c.BANNER.name(), null, null, 0, null, new Bundle(), null).zza();
        }
        zzgot.zzq(interfaceFutureC1673eZza, new C0347i(this), binderC0375w.f1499a.zzb());
    }

    /* JADX INFO: renamed from: g1 */
    private static boolean m1570g1(Uri uri, List list, List list2) {
        String host = uri.getHost();
        String path = uri.getPath();
        if (host != null && path != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (path.contains((String) it.next())) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        if (host.endsWith((String) it2.next())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:35:0x0085  */
    /* JADX INFO: renamed from: h1 */
    private final AbstractC0339e m1571h1(Context context, String str, String str2, C3369m2 c3369m2, C3349h2 c3349h2, int i7, String str3, Bundle bundle, zzbyi zzbyiVar) {
        C3369m2 c3369m3;
        byte b7;
        zzfdb zzfdbVar = new zzfdb();
        if ("REWARDED".equals(str2)) {
            zzfdbVar.zzj().zza(2);
        } else if ("REWARDED_INTERSTITIAL".equals(str2)) {
            zzfdbVar.zzj().zza(3);
        }
        InterfaceC0337d interfaceC0337dZzp = this.f1499a.zzp();
        zzcva zzcvaVar = new zzcva();
        zzcvaVar.zza(context);
        if (str == null) {
            str = "adUnitId";
        }
        zzfdbVar.zzg(str);
        zzfdbVar.zza(c3349h2 == null ? new C3353i2().m17232a() : c3349h2);
        if (c3369m2 == null) {
            switch (str2) {
                case "NATIVE":
                    b7 = 3;
                    break;
                case "APP_OPEN_AD":
                    b7 = 4;
                    break;
                case "REWARDED":
                    b7 = 1;
                    break;
                case "REWARDED_INTERSTITIAL":
                    b7 = 2;
                    break;
                case "BANNER":
                    b7 = 0;
                    break;
                default:
                    b7 = -1;
                    break;
            }
            if (b7 == 0) {
                c3369m3 = new C3369m2(context, C6556h.f24740i);
            } else if (b7 == 1 || b7 == 2) {
                c3369m3 = C3369m2.m17289V();
            } else if (b7 != 3) {
                c3369m3 = b7 != 4 ? new C3369m2() : C3369m2.m17290W();
            } else {
                c3369m3 = C3369m2.m17288U();
            }
        } else {
            c3369m3 = c3369m2;
        }
        zzfdbVar.zzc(c3369m3);
        zzfdbVar.zzu(true);
        zzfdbVar.zzv(bundle);
        zzcvaVar.zzb(zzfdbVar.zzz());
        zzcvaVar.zzh(i7);
        interfaceC0337dZzp.zzc(zzcvaVar.zze());
        C0378z c0378z = new C0378z();
        c0378z.m1607a(str2);
        c0378z.m1608b(str3);
        c0378z.m1609c(zzbyiVar);
        interfaceC0337dZzp.zzb(new C0306A(c0378z, null));
        new zzdbr();
        return interfaceC0337dZzp.zza();
    }

    /* JADX INFO: renamed from: i1 */
    private final InterfaceFutureC1673e m1572i1(final String str) {
        final zzdnx[] zzdnxVarArr = new zzdnx[1];
        InterfaceFutureC1673e interfaceFutureC1673eZzb = this.f1503e.zzb();
        zzgob zzgobVar = new zzgob() { // from class: E2.u
            @Override // com.google.android.gms.internal.ads.zzgob
            public final /* synthetic */ InterfaceFutureC1673e zza(Object obj) {
                return this.f1467a.m1602v1(zzdnxVarArr, str, (zzdnx) obj);
            }
        };
        zzgpd zzgpdVar = this.f1504f;
        InterfaceFutureC1673e interfaceFutureC1673eZzj = zzgot.zzj(interfaceFutureC1673eZzb, zzgobVar, zzgpdVar);
        interfaceFutureC1673eZzj.addListener(new Runnable() { // from class: E2.l
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f1416a.m1603w1(zzdnxVarArr);
            }
        }, zzgpdVar);
        return (zzgol) zzgot.zzg((zzgol) zzgot.zzk((zzgol) zzgot.zzi(zzgol.zzw(interfaceFutureC1673eZzj), ((Integer) C3250D.m17200c().zzd(zzbci.zzif)).intValue(), TimeUnit.MILLISECONDS, this.f1505r), C0367s.f1457a, zzgpdVar), Exception.class, C0369t.f1462a, zzgpdVar);
    }

    /* JADX INFO: renamed from: j1 */
    private final boolean m1573j1() {
        Map map;
        zzbto zzbtoVar = this.f1506s;
        return (zzbtoVar == null || (map = zzbtoVar.zzb) == null || map.isEmpty()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k1 */
    public static final Uri m1574k1(Uri uri, String str, String str2) {
        String string = uri.toString();
        int iIndexOf = string.indexOf("&adurl=");
        if (iIndexOf == -1) {
            iIndexOf = string.indexOf("?adurl=");
        }
        if (iIndexOf == -1) {
            return uri.buildUpon().appendQueryParameter(str, str2).build();
        }
        int i7 = iIndexOf + 1;
        return Uri.parse(string.substring(0, i7) + str + "=" + str2 + "&" + string.substring(i7));
    }

    /* JADX INFO: renamed from: l1 */
    private static final List m1575l1(String str) {
        String[] strArrSplit = TextUtils.split(str, ",");
        ArrayList arrayList = new ArrayList();
        for (String str2 : strArrSplit) {
            if (!zzghs.zzc(str2)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: z1 */
    static /* synthetic */ zzfib m1576z1(InterfaceFutureC1673e interfaceFutureC1673e, zzbyi zzbyiVar) {
        if (!zzfie.zza() || !((Boolean) zzbeb.zze.zze()).booleanValue()) {
            return null;
        }
        try {
            zzfib zzfibVarZzb = ((AbstractC0339e) zzgot.zzr(interfaceFutureC1673e)).zzb();
            zzfibVarZzb.zzb(new ArrayList(Collections.singletonList(zzbyiVar.zzb)));
            C3349h2 c3349h2 = zzbyiVar.zzd;
            zzfibVarZzb.zzc(c3349h2 == null ? "" : c3349h2.f13936A);
            zzfibVarZzb.zzd(c3349h2.f13961x);
            return zzfibVarZzb;
        } catch (ExecutionException e7) {
            C7351t.m32354l().zzg(e7, "SignalGeneratorImpl.getConfiguredCriticalUserJourney");
            return null;
        }
    }

    /* JADX INFO: renamed from: A1 */
    final /* synthetic */ Context m1577A1() {
        return this.f1500b;
    }

    /* JADX INFO: renamed from: L0 */
    final /* synthetic */ zzdsr m1578L0() {
        return this.f1509v;
    }

    /* JADX INFO: renamed from: M0 */
    final /* synthetic */ zzfjv m1579M0() {
        return this.f1510w;
    }

    /* JADX INFO: renamed from: N0 */
    final /* synthetic */ boolean m1580N0() {
        return this.f1511x;
    }

    /* JADX INFO: renamed from: O0 */
    final /* synthetic */ boolean m1581O0() {
        return this.f1512y;
    }

    /* JADX INFO: renamed from: P0 */
    final /* synthetic */ boolean m1582P0() {
        return this.f1513z;
    }

    /* JADX INFO: renamed from: Q0 */
    final /* synthetic */ boolean m1583Q0() {
        return this.f1482A;
    }

    /* JADX INFO: renamed from: R0 */
    final /* synthetic */ String m1584R0() {
        return this.f1483B;
    }

    /* JADX INFO: renamed from: S0 */
    final /* synthetic */ String m1585S0() {
        return this.f1484C;
    }

    /* JADX INFO: renamed from: T0 */
    final /* synthetic */ AtomicInteger m1586T0() {
        return this.f1485D;
    }

    /* JADX INFO: renamed from: U0 */
    final /* synthetic */ C7584a m1587U0() {
        return this.f1486E;
    }

    /* JADX INFO: renamed from: V0 */
    final /* synthetic */ String m1588V0() {
        return this.f1487F;
    }

    /* JADX INFO: renamed from: W0 */
    final /* synthetic */ void m1589W0(String str) {
        this.f1487F = str;
    }

    /* JADX INFO: renamed from: X0 */
    final /* synthetic */ String m1590X0() {
        return this.f1488G;
    }

    /* JADX INFO: renamed from: Y0 */
    final /* synthetic */ AtomicBoolean m1591Y0() {
        return this.f1494M;
    }

    /* JADX INFO: renamed from: Z0 */
    final /* synthetic */ AtomicInteger m1592Z0() {
        return this.f1495N;
    }

    /* JADX INFO: renamed from: m1 */
    final boolean m1593m1(Uri uri) {
        return m1570g1(uri, this.f1491J, this.f1492K);
    }

    /* JADX INFO: renamed from: n1 */
    final boolean m1594n1(Uri uri) {
        return m1570g1(uri, this.f1489H, this.f1490I);
    }

    /* JADX INFO: renamed from: o1 */
    final /* synthetic */ AbstractC0339e m1595o1(zzbyi zzbyiVar, int i7, Bundle bundle) {
        return m1571h1(this.f1500b, zzbyiVar.zza, zzbyiVar.zzb, zzbyiVar.zzc, zzbyiVar.zzd, i7, zzbyiVar.zzf, bundle, zzbyiVar);
    }

    /* JADX INFO: renamed from: p1 */
    final /* synthetic */ ArrayList m1596p1(List list, InterfaceC3772a interfaceC3772a) throws Exception {
        zzauu zzauuVar = this.f1501c;
        String strZzj = zzauuVar.zzb() != null ? zzauuVar.zzb().zzj(this.f1500b, (View) BinderC3773b.m18220M0(interfaceC3772a), null) : "";
        if (TextUtils.isEmpty(strZzj)) {
            throw new Exception("Failed to get view signals.");
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (m1593m1(uri)) {
                arrayList.add(m1574k1(uri, "ms", strZzj));
            } else {
                String strValueOf = String.valueOf(uri);
                int i7 = AbstractC3490o0.f14278b;
                AbstractC7599p.m33331f("Not a Google URL: ".concat(strValueOf));
                arrayList.add(uri);
            }
        }
        if (arrayList.isEmpty()) {
            throw new Exception("Empty impression URLs result.");
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: q1 */
    final /* synthetic */ InterfaceFutureC1673e m1597q1(final ArrayList arrayList) {
        return zzgot.zzk(m1572i1("google.afma.nativeAds.getPublisherCustomRenderedImpressionSignals"), new zzggr() { // from class: E2.q
            @Override // com.google.android.gms.internal.ads.zzggr
            public final /* synthetic */ Object apply(Object obj) {
                return this.f1441a.m1601u1(arrayList, (String) obj);
            }
        }, this.f1504f);
    }

    /* JADX INFO: renamed from: r1 */
    final /* synthetic */ Uri m1598r1(Uri uri, InterfaceC3772a interfaceC3772a) throws Exception {
        zzfdg zzfdgVar;
        try {
            uri = (!((Boolean) C3250D.m17200c().zzd(zzbci.zzmN)).booleanValue() || (zzfdgVar = this.f1502d) == null) ? this.f1501c.zzd(uri, this.f1500b, (View) BinderC3773b.m18220M0(interfaceC3772a), null) : zzfdgVar.zza(uri, this.f1500b, (View) BinderC3773b.m18220M0(interfaceC3772a), null);
        } catch (zzauv e7) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33332g("", e7);
        }
        if (uri.getQueryParameter("ms") != null) {
            return uri;
        }
        throw new Exception("Failed to append spam signals to click url.");
    }

    /* JADX INFO: renamed from: s1 */
    final /* synthetic */ InterfaceFutureC1673e m1599s1(final Uri uri) {
        return zzgot.zzk(m1572i1("google.afma.nativeAds.getPublisherCustomRenderedClickSignals"), new zzggr(this) { // from class: E2.r
            @Override // com.google.android.gms.internal.ads.zzggr
            public final /* synthetic */ Object apply(Object obj) {
                return BinderC0375w.m1565b1(uri, (String) obj);
            }
        }, this.f1504f);
    }

    /* JADX INFO: renamed from: t1 */
    final /* synthetic */ InterfaceFutureC1673e m1600t1() {
        return m1571h1(this.f1500b, null, EnumC6551c.BANNER.name(), null, null, 0, null, new Bundle(), null).zza();
    }

    /* JADX INFO: renamed from: u1 */
    final /* synthetic */ ArrayList m1601u1(List list, String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (!m1593m1(uri) || TextUtils.isEmpty(str)) {
                arrayList.add(uri);
            } else {
                arrayList.add(m1574k1(uri, "nas", str));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: v1 */
    final /* synthetic */ InterfaceFutureC1673e m1602v1(zzdnx[] zzdnxVarArr, String str, zzdnx zzdnxVar) throws JSONException {
        zzdnxVarArr[0] = zzdnxVar;
        Context context = this.f1500b;
        zzbto zzbtoVar = this.f1506s;
        Map map = zzbtoVar.zzb;
        JSONObject jSONObjectM17496e = AbstractC3456V.m17496e(context, map, map, zzbtoVar.zza, null);
        JSONObject jSONObjectM17493b = AbstractC3456V.m17493b(this.f1500b, this.f1506s.zza);
        JSONObject jSONObjectM17494c = AbstractC3456V.m17494c(this.f1506s.zza);
        JSONObject jSONObjectM17495d = AbstractC3456V.m17495d(this.f1500b, this.f1506s.zza);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("asset_view_signal", jSONObjectM17496e);
        jSONObject.put("ad_view_signal", jSONObjectM17493b);
        jSONObject.put("scroll_view_signal", jSONObjectM17494c);
        jSONObject.put("lock_screen_signal", jSONObjectM17495d);
        if ("google.afma.nativeAds.getPublisherCustomRenderedClickSignals".equals(str)) {
            jSONObject.put("click_signal", AbstractC3456V.m17497f(null, this.f1500b, this.f1508u, this.f1507t));
        }
        return zzdnxVar.zzc(str, jSONObject);
    }

    /* JADX INFO: renamed from: w1 */
    final /* synthetic */ void m1603w1(zzdnx[] zzdnxVarArr) {
        zzdnx zzdnxVar = zzdnxVarArr[0];
        if (zzdnxVar != null) {
            this.f1503e.zzc(zzgot.zza(zzdnxVar));
        }
    }

    /* JADX INFO: renamed from: x1 */
    final /* synthetic */ void m1604x1(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (m1594n1((Uri) it.next())) {
                this.f1485D.getAndIncrement();
                return;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:28:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:29:0x00fb  */
    @Override // com.google.android.gms.internal.ads.zzbye
    public final void zze(InterfaceC3772a interfaceC3772a, final zzbyi zzbyiVar, zzbyb zzbybVar) {
        zzbyi zzbyiVar2;
        InterfaceFutureC1673e interfaceFutureC1673eZza;
        InterfaceFutureC1673e interfaceFutureC1673eZza2;
        InterfaceFutureC1673e interfaceFutureC1673eZzj;
        InterfaceFutureC1673e interfaceFutureC1673e;
        final Bundle bundle = new Bundle();
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzcr)).booleanValue()) {
            bundle.putLong(zzdru.PUBLIC_API_CALL.zza(), zzbyiVar.zzd.f13946K);
            bundle.putLong(zzdru.DYNAMITE_ENTER.zza(), C7351t.m32357o().mo18159a());
        }
        Context context = (Context) BinderC3773b.m18220M0(interfaceC3772a);
        this.f1500b = context;
        zzfhr zzfhrVarZzn = zzfhr.zzn(context, 22);
        zzfhrVarZzn.zza();
        int i7 = 0;
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzhX)).booleanValue()) {
            C3349h2 c3349h2 = zzbyiVar.zzd;
            if (c3349h2.f13951c.getBoolean("optimize_for_app_start", false) && Objects.equals(AbstractC0335c.m1521c(c3349h2), "requester_type_8")) {
                i7 = 2;
                if (zzbyiVar.zze != 2) {
                    i7 = 1;
                }
            }
        }
        final int i8 = i7;
        String str = zzbyiVar.zzb;
        if ("UNKNOWN".equals(str)) {
            List arrayList = new ArrayList();
            zzbbz zzbbzVar = zzbci.zzhW;
            if (!((String) C3250D.m17200c().zzd(zzbbzVar)).isEmpty()) {
                arrayList = Arrays.asList(((String) C3250D.m17200c().zzd(zzbbzVar)).split(","));
            }
            if (arrayList.contains(AbstractC0335c.m1521c(zzbyiVar.zzd))) {
                interfaceFutureC1673eZza = zzgot.zzc(new IllegalArgumentException("Unknown format is no longer supported."));
                interfaceFutureC1673eZza2 = zzgot.zzc(new IllegalArgumentException("Unknown format is no longer supported."));
                zzbyiVar2 = zzbyiVar;
            } else {
                if (((Boolean) C3250D.m17200c().zzd(zzbci.zzlS)).booleanValue()) {
                    zzgpd zzgpdVar = zzbzh.zza;
                    InterfaceFutureC1673e interfaceFutureC1673eSubmit = zzgpdVar.submit(new Callable() { // from class: E2.v
                        @Override // java.util.concurrent.Callable
                        public final /* synthetic */ Object call() {
                            return this.f1471a.m1595o1(zzbyiVar, i8, bundle);
                        }
                    });
                    interfaceFutureC1673eZzj = zzgot.zzj(interfaceFutureC1673eSubmit, C0349j.f1404a, zzgpdVar);
                    zzbyiVar2 = zzbyiVar;
                    interfaceFutureC1673e = interfaceFutureC1673eSubmit;
                } else {
                    AbstractC0339e abstractC0339eM1571h1 = m1571h1(this.f1500b, zzbyiVar.zza, str, zzbyiVar.zzc, zzbyiVar.zzd, i8, zzbyiVar.zzf, bundle, zzbyiVar);
                    zzbyiVar2 = zzbyiVar;
                    interfaceFutureC1673eZza = zzgot.zza(abstractC0339eM1571h1);
                    interfaceFutureC1673eZza2 = abstractC0339eM1571h1.zza();
                }
            }
            interfaceFutureC1673e = interfaceFutureC1673eZza;
            interfaceFutureC1673eZzj = interfaceFutureC1673eZza2;
        } else {
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzlS)).booleanValue()) {
                zzgpd zzgpdVar2 = zzbzh.zza;
                InterfaceFutureC1673e interfaceFutureC1673eSubmit2 = zzgpdVar2.submit(new Callable() { // from class: E2.v
                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ Object call() {
                        return this.f1471a.m1595o1(zzbyiVar, i8, bundle);
                    }
                });
                interfaceFutureC1673eZzj = zzgot.zzj(interfaceFutureC1673eSubmit2, C0349j.f1404a, zzgpdVar2);
                zzbyiVar2 = zzbyiVar;
                interfaceFutureC1673e = interfaceFutureC1673eSubmit2;
            } else {
                AbstractC0339e abstractC0339eM1571h2 = m1571h1(this.f1500b, zzbyiVar.zza, str, zzbyiVar.zzc, zzbyiVar.zzd, i8, zzbyiVar.zzf, bundle, zzbyiVar);
                zzbyiVar2 = zzbyiVar;
                interfaceFutureC1673eZza = zzgot.zza(abstractC0339eM1571h2);
                interfaceFutureC1673eZza2 = abstractC0339eM1571h2.zza();
                interfaceFutureC1673e = interfaceFutureC1673eZza;
                interfaceFutureC1673eZzj = interfaceFutureC1673eZza2;
            }
        }
        zzgot.zzq(interfaceFutureC1673eZzj, new C0341f(this, interfaceFutureC1673e, zzbyiVar2, zzbybVar, zzfhrVarZzn), this.f1499a.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzbye
    public final void zzf(InterfaceC3772a interfaceC3772a) {
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzie)).booleanValue()) {
            MotionEvent motionEvent = (MotionEvent) BinderC3773b.m18220M0(interfaceC3772a);
            zzbto zzbtoVar = this.f1506s;
            this.f1507t = AbstractC3456V.m17499h(motionEvent, zzbtoVar == null ? null : zzbtoVar.zza);
            if (motionEvent.getAction() == 0) {
                this.f1508u = this.f1507t;
            }
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            Point point = this.f1507t;
            motionEventObtain.setLocation(point.x, point.y);
            this.f1501c.zzc(motionEventObtain);
            motionEventObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbye
    public final void zzg(List list, InterfaceC3772a interfaceC3772a, zzbtl zzbtlVar) {
        m1566c1(list, interfaceC3772a, zzbtlVar, false);
    }

    @Override // com.google.android.gms.internal.ads.zzbye
    public final void zzh(List list, InterfaceC3772a interfaceC3772a, zzbtl zzbtlVar) {
        m1567d1(list, interfaceC3772a, zzbtlVar, false);
    }

    @Override // com.google.android.gms.internal.ads.zzbye
    public final void zzi(zzbto zzbtoVar) {
        this.f1506s = zzbtoVar;
        this.f1503e.zza(1);
    }

    @Override // com.google.android.gms.internal.ads.zzbye
    public final void zzj(InterfaceC3772a interfaceC3772a) {
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzkq)).booleanValue()) {
            zzbbz zzbbzVar = zzbci.zzhV;
            if (!((Boolean) C3250D.m17200c().zzd(zzbbzVar)).booleanValue()) {
                m1568e1();
            }
            WebView webView = (WebView) BinderC3773b.m18220M0(interfaceC3772a);
            if (webView == null) {
                int i7 = AbstractC3490o0.f14278b;
                AbstractC7599p.m33328c("The webView cannot be null.");
                return;
            }
            C0334b0 c0334b0 = this.f1498Q;
            final C0342f0 c0342f0 = new C0342f0(webView, c0334b0, zzbzh.zzf);
            webView.addJavascriptInterface(new C0331a(webView, this.f1501c, this.f1509v, this.f1510w, this.f1502d, this.f1497P, c0334b0, c0342f0), "gmaSdk");
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzkA)).booleanValue()) {
                C7351t.m32354l().zzm();
            }
            if (((Boolean) zzben.zzc.zze()).booleanValue()) {
                c0334b0.m1517a(webView);
                if (((Boolean) zzben.zzd.zze()).booleanValue()) {
                    zzbzh.zzd.scheduleWithFixedDelay(new Runnable() { // from class: E2.e0
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            c0342f0.zza();
                        }
                    }, 0L, ((Integer) C3250D.m17200c().zzd(zzbci.zzkB)).intValue(), TimeUnit.MILLISECONDS);
                }
            }
            if (((Boolean) C3250D.m17200c().zzd(zzbbzVar)).booleanValue()) {
                m1568e1();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbye
    public final void zzk(List list, InterfaceC3772a interfaceC3772a, zzbtl zzbtlVar) {
        m1566c1(list, interfaceC3772a, zzbtlVar, true);
    }

    @Override // com.google.android.gms.internal.ads.zzbye
    public final void zzl(List list, InterfaceC3772a interfaceC3772a, zzbtl zzbtlVar) {
        m1567d1(list, interfaceC3772a, zzbtlVar, true);
    }

    @Override // com.google.android.gms.internal.ads.zzbye
    public final InterfaceC3772a zzm(InterfaceC3772a interfaceC3772a, InterfaceC3772a interfaceC3772a2, String str, InterfaceC3772a interfaceC3772a3) {
        if (!((Boolean) C3250D.m17200c().zzd(zzbci.zzkE)).booleanValue()) {
            return BinderC3773b.m18221N0(null);
        }
        Context context = (Context) BinderC3773b.m18220M0(interfaceC3772a);
        AbstractC2380c abstractC2380c = (AbstractC2380c) BinderC3773b.m18220M0(interfaceC3772a2);
        AbstractC2379b abstractC2379b = (AbstractC2379b) BinderC3773b.m18220M0(interfaceC3772a3);
        zzbdn zzbdnVar = this.f1496O;
        zzbdnVar.zza(context, abstractC2380c, str, abstractC2379b);
        if (((Boolean) zzben.zze.zze()).booleanValue()) {
            this.f1497P.m1534a();
        }
        if (((Boolean) zzben.zzc.zze()).booleanValue()) {
            this.f1498Q.m1517a(null);
        }
        return BinderC3773b.m18221N0(zzbdnVar.zzb());
    }
}
