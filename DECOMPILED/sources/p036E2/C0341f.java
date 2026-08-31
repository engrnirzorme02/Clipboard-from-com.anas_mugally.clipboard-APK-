package p036E2;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbeb;
import com.google.android.gms.internal.ads.zzbyb;
import com.google.android.gms.internal.ads.zzbyi;
import com.google.android.gms.internal.ads.zzfhr;
import com.google.android.gms.internal.ads.zzfib;
import com.google.android.gms.internal.ads.zzgoq;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import p157U3.InterfaceFutureC1673e;
import p380w2.C7351t;
import p404z2.AbstractC7599p;

/* JADX INFO: renamed from: E2.f */
/* JADX INFO: loaded from: classes.dex */
final class C0341f implements zzgoq {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ InterfaceFutureC1673e f1380a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ zzbyi f1381b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ zzbyb f1382c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ zzfhr f1383d;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ BinderC0375w f1384e;

    C0341f(BinderC0375w binderC0375w, InterfaceFutureC1673e interfaceFutureC1673e, zzbyi zzbyiVar, zzbyb zzbybVar, zzfhr zzfhrVar) {
        this.f1380a = interfaceFutureC1673e;
        this.f1381b = zzbyiVar;
        this.f1382c = zzbybVar;
        this.f1383d = zzfhrVar;
        Objects.requireNonNull(binderC0375w);
        this.f1384e = binderC0375w;
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final void zza(Throwable th) {
        String message = th.getMessage();
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzik)).booleanValue()) {
            C7351t.m32354l().zzh(th, "SignalGeneratorImpl.generateSignals");
        } else {
            C7351t.m32354l().zzg(th, "SignalGeneratorImpl.generateSignals");
        }
        zzfib zzfibVarM1576z1 = BinderC0375w.m1576z1(this.f1380a, this.f1381b);
        if (((Boolean) zzbeb.zze.zze()).booleanValue() && zzfibVarM1576z1 != null) {
            zzfhr zzfhrVar = this.f1383d;
            zzfhrVar.zzj(th);
            zzfhrVar.zzd(false);
            zzfibVarM1576z1.zza(zzfhrVar);
            zzfibVarM1576z1.zzh();
        }
        zzbyb zzbybVar = this.f1382c;
        if (zzbybVar == null) {
            return;
        }
        try {
            if (!"Unknown format is no longer supported.".equals(message)) {
                StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 16);
                sb.append("Internal error. ");
                sb.append(message);
                message = sb.toString();
            }
            zzbybVar.zzb(message);
        } catch (RemoteException e7) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33329d("", e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        InterfaceFutureC1673e interfaceFutureC1673e = this.f1380a;
        AtomicBoolean atomicBooleanM1591Y0 = this.f1384e.m1591Y0();
        C0318M c0318m = (C0318M) obj;
        zzfib zzfibVarM1576z1 = BinderC0375w.m1576z1(interfaceFutureC1673e, this.f1381b);
        atomicBooleanM1591Y0.set(true);
        if (!((Boolean) C3250D.m17200c().zzd(zzbci.zzie)).booleanValue()) {
            try {
                zzbyb zzbybVar = this.f1382c;
                if (zzbybVar != null) {
                    zzbybVar.zzb("QueryInfo generation has been disabled.");
                }
            } catch (RemoteException e7) {
                String strConcat = "QueryInfo generation has been disabled.".concat(e7.toString());
                int i7 = AbstractC3490o0.f14278b;
                AbstractC7599p.m33328c(strConcat);
            }
            if (!((Boolean) zzbeb.zze.zze()).booleanValue() || zzfibVarM1576z1 == null) {
                return;
            }
            zzfhr zzfhrVar = this.f1383d;
            zzfhrVar.zzk("QueryInfo generation has been disabled.");
            zzfhrVar.zzd(false);
            zzfibVarM1576z1.zza(zzfhrVar);
            zzfibVarM1576z1.zzh();
            return;
        }
        try {
            if (c0318m == null) {
                zzbyb zzbybVar2 = this.f1382c;
                if (zzbybVar2 != null) {
                    zzbybVar2.zzc(null, null, null);
                }
                zzfhr zzfhrVar2 = this.f1383d;
                zzfhrVar2.zzd(true);
                if (!((Boolean) zzbeb.zze.zze()).booleanValue() || zzfibVarM1576z1 == null) {
                    return;
                }
                zzfibVarM1576z1.zza(zzfhrVar2);
                zzfibVarM1576z1.zzh();
                return;
            }
            try {
                if (TextUtils.isEmpty((!TextUtils.isEmpty(c0318m.f1316c) ? new JSONObject(c0318m.f1316c) : new JSONObject(c0318m.f1315b)).optString("request_id", ""))) {
                    int i8 = AbstractC3490o0.f14278b;
                    AbstractC7599p.m33331f("The request ID is empty in request JSON.");
                    zzbyb zzbybVar3 = this.f1382c;
                    if (zzbybVar3 != null) {
                        zzbybVar3.zzb("Internal error: request ID is empty in request JSON.");
                    }
                    zzfhr zzfhrVar3 = this.f1383d;
                    zzfhrVar3.zzk("Request ID empty");
                    zzfhrVar3.zzd(false);
                    if (!((Boolean) zzbeb.zze.zze()).booleanValue() || zzfibVarM1576z1 == null) {
                        return;
                    }
                    zzfibVarM1576z1.zza(zzfhrVar3);
                    zzfibVarM1576z1.zzh();
                    return;
                }
                Bundle bundle = c0318m.f1319f;
                BinderC0375w binderC0375w = this.f1384e;
                if (binderC0375w.m1583Q0() && bundle != null && bundle.getInt(binderC0375w.m1585S0(), -1) == -1) {
                    bundle.putInt(binderC0375w.m1585S0(), binderC0375w.m1586T0().get());
                }
                if (binderC0375w.m1582P0() && bundle != null && TextUtils.isEmpty(bundle.getString(binderC0375w.m1584R0()))) {
                    if (TextUtils.isEmpty(binderC0375w.m1588V0())) {
                        binderC0375w.m1589W0(C7351t.m32349g().m17439O(binderC0375w.m1577A1(), binderC0375w.m1587U0().f30226a));
                    }
                    bundle.putString(binderC0375w.m1584R0(), binderC0375w.m1588V0());
                }
                zzbyb zzbybVar4 = this.f1382c;
                if (zzbybVar4 != null) {
                    if (TextUtils.isEmpty(c0318m.f1316c)) {
                        zzbybVar4.zzc(c0318m.f1314a, c0318m.f1315b, bundle);
                    } else {
                        zzbybVar4.zzc(c0318m.f1314a, c0318m.f1316c, bundle);
                    }
                }
                this.f1383d.zzd(true);
                if (!((Boolean) zzbeb.zze.zze()).booleanValue() || zzfibVarM1576z1 == null) {
                    return;
                }
                zzfibVarM1576z1.zza(this.f1383d);
                zzfibVarM1576z1.zzh();
            } catch (JSONException e8) {
                int i9 = AbstractC3490o0.f14278b;
                AbstractC7599p.m33331f("Failed to create JSON object from the request string.");
                zzbyb zzbybVar5 = this.f1382c;
                if (zzbybVar5 != null) {
                    String string = e8.toString();
                    StringBuilder sb = new StringBuilder(string.length() + 33);
                    sb.append("Internal error for request JSON: ");
                    sb.append(string);
                    zzbybVar5.zzb(sb.toString());
                }
                zzfhr zzfhrVar4 = this.f1383d;
                zzfhrVar4.zzj(e8);
                zzfhrVar4.zzd(false);
                C7351t.m32354l().zzg(e8, "SignalGeneratorImpl.generateSignals.onSuccess");
                if (!((Boolean) zzbeb.zze.zze()).booleanValue() || zzfibVarM1576z1 == null) {
                    return;
                }
                zzfibVarM1576z1.zza(zzfhrVar4);
                zzfibVarM1576z1.zzh();
            }
        } catch (RemoteException e9) {
            zzfhr zzfhrVar5 = this.f1383d;
            zzfhrVar5.zzj(e9);
            zzfhrVar5.zzd(false);
            int i10 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33329d("", e9);
            C7351t.m32354l().zzg(e9, "SignalGeneratorImpl.generateSignals.onSuccess");
        } finally {
            if (((Boolean) zzbeb.zze.zze()).booleanValue() && zzfibVarM1576z1 != null) {
                zzfibVarM1576z1.zza(this.f1383d);
                zzfibVarM1576z1.zzh();
            }
        }
    }
}
