package com.google.android.gms.measurement.internal;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.internal.measurement.zzhr;
import com.google.android.gms.internal.measurement.zzhs;
import com.google.android.gms.internal.measurement.zzhw;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.J6 */
/* JADX INFO: loaded from: classes2.dex */
final class C4070J6 {

    /* JADX INFO: renamed from: a */
    private zzhs f15276a;

    /* JADX INFO: renamed from: b */
    private Long f15277b;

    /* JADX INFO: renamed from: c */
    private long f15278c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ C4214e f15279d;

    /* synthetic */ C4070J6(C4214e c4214e, byte[] bArr) {
        Objects.requireNonNull(c4214e);
        this.f15279d = c4214e;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:70:0x01d1  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX INFO: renamed from: a */
    final zzhs m18535a(String str, zzhs zzhsVar) {
        Cursor cursorRawQuery;
        Pair pairCreate;
        Object obj;
        String strZzd = zzhsVar.zzd();
        List listZza = zzhsVar.zza();
        C4214e c4214e = this.f15279d;
        C4317q6 c4317q6 = c4214e.f15465b;
        c4317q6.m18903K0();
        Long l7 = (Long) C4349u6.m19080u(zzhsVar, "_eid");
        if (l7 != null) {
            if (strZzd.equals("_ep")) {
                AbstractC3718s.m18083l(l7);
                c4317q6.m18903K0();
                String str2 = (String) C4349u6.m19080u(zzhsVar, "_en");
                ?? r7 = 0;
                if (TextUtils.isEmpty(str2)) {
                    c4214e.f15066a.mo18421a().m18852p().m18835b("Extra parameter without an event name. eventId", l7);
                    return null;
                }
                if (this.f15276a == null || this.f15277b == null || l7.longValue() != this.f15277b.longValue()) {
                    C4342u c4342uM18898F0 = c4317q6.m18898F0();
                    c4342uM18898F0.mo18427h();
                    c4342uM18898F0.m18696j();
                    try {
                        try {
                            cursorRawQuery = c4342uM18898F0.m19051u0().rawQuery("select main_event, children_to_process from main_event_params where app_id=? and event_id=?", new String[]{str, l7.toString()});
                            try {
                                if (cursorRawQuery.moveToFirst()) {
                                    try {
                                        pairCreate = Pair.create((zzhs) ((zzhr) C4349u6.m19071W(zzhs.zzk(), cursorRawQuery.getBlob(0))).zzbc(), Long.valueOf(cursorRawQuery.getLong(1)));
                                        cursorRawQuery.close();
                                    } catch (IOException e7) {
                                        c4342uM18898F0.f15066a.mo18421a().m18851o().m18837d("Failed to merge main event. appId, eventId", C4313q2.m18846x(str), l7, e7);
                                        cursorRawQuery.close();
                                        pairCreate = null;
                                    }
                                    if (pairCreate != null || (obj = pairCreate.first) == null) {
                                        this.f15279d.f15066a.mo18421a().m18852p().m18836c("Extra parameter without existing main event. eventName, eventId", str2, l7);
                                        return null;
                                    }
                                    this.f15276a = (zzhs) obj;
                                    this.f15278c = ((Long) pairCreate.second).longValue();
                                    this.f15279d.f15465b.m18903K0();
                                    this.f15277b = (Long) C4349u6.m19080u(this.f15276a, "_eid");
                                } else {
                                    c4342uM18898F0.f15066a.mo18421a().m18859w().m18834a("Main event not found");
                                }
                            } catch (SQLiteException e8) {
                                e = e8;
                                c4342uM18898F0.f15066a.mo18421a().m18851o().m18835b("Error selecting main event", e);
                                if (cursorRawQuery != null) {
                                }
                                pairCreate = null;
                                if (pairCreate != null) {
                                }
                                this.f15279d.f15066a.mo18421a().m18852p().m18836c("Extra parameter without existing main event. eventName, eventId", str2, l7);
                                return null;
                            }
                        } catch (Throwable th) {
                            th = th;
                            r7 = c4317q6;
                            if (r7 != 0) {
                                r7.close();
                            }
                            throw th;
                        }
                    } catch (SQLiteException e9) {
                        e = e9;
                        cursorRawQuery = null;
                    } catch (Throwable th2) {
                        th = th2;
                        if (r7 != 0) {
                            r7.close();
                        }
                        throw th;
                    }
                    cursorRawQuery.close();
                    pairCreate = null;
                    if (pairCreate != null) {
                    }
                    this.f15279d.f15066a.mo18421a().m18852p().m18836c("Extra parameter without existing main event. eventName, eventId", str2, l7);
                    return null;
                }
                long j7 = this.f15278c - 1;
                this.f15278c = j7;
                if (j7 <= 0) {
                    C4342u c4342uM18898F1 = this.f15279d.f15465b.m18898F0();
                    c4342uM18898F1.mo18427h();
                    c4342uM18898F1.f15066a.mo18421a().m18859w().m18835b("Clearing complex main event info. appId", str);
                    try {
                        c4342uM18898F1.m19051u0().execSQL("delete from main_event_params where app_id=?", new String[]{str});
                    } catch (SQLiteException e10) {
                        c4342uM18898F1.f15066a.mo18421a().m18851o().m18835b("Error clearing complex main event", e10);
                    }
                } else {
                    this.f15279d.f15465b.m18898F0().m19012F(str, l7, this.f15278c, this.f15276a);
                }
                ArrayList arrayList = new ArrayList();
                for (zzhw zzhwVar : this.f15276a.zza()) {
                    this.f15279d.f15465b.m18903K0();
                    if (C4349u6.m19077r(zzhsVar, zzhwVar.zzb()) == null) {
                        arrayList.add(zzhwVar);
                    }
                }
                if (arrayList.isEmpty()) {
                    this.f15279d.f15066a.mo18421a().m18852p().m18835b("No unique parameters in main event. eventName", str2);
                } else {
                    arrayList.addAll(listZza);
                    listZza = arrayList;
                }
                strZzd = str2;
            } else {
                this.f15277b = l7;
                this.f15276a = zzhsVar;
                c4317q6.m18903K0();
                long jLongValue = ((Long) C4349u6.m19081v(zzhsVar, "_epc", 0L)).longValue();
                this.f15278c = jLongValue;
                if (jLongValue <= 0) {
                    c4214e.f15066a.mo18421a().m18852p().m18835b("Complex event with zero extra param count. eventName", strZzd);
                } else {
                    c4317q6.m18898F0().m19012F(str, (Long) AbstractC3718s.m18083l(l7), this.f15278c, zzhsVar);
                }
            }
        }
        zzhr zzhrVar = (zzhr) zzhsVar.zzcl();
        zzhrVar.zzl(strZzd);
        zzhrVar.zzi();
        zzhrVar.zzh(listZza);
        return (zzhs) zzhrVar.zzbc();
    }
}
