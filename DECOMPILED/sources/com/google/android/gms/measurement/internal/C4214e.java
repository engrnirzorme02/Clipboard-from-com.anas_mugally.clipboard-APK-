package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import androidx.collection.C2390a;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.internal.measurement.zzfe;
import com.google.android.gms.internal.measurement.zzff;
import com.google.android.gms.internal.measurement.zzfm;
import com.google.android.gms.internal.measurement.zzfn;
import com.google.android.gms.internal.measurement.zzhg;
import com.google.android.gms.internal.measurement.zzhq;
import com.google.android.gms.internal.measurement.zzhs;
import com.google.android.gms.internal.measurement.zzih;
import com.google.android.gms.internal.measurement.zzii;
import com.google.android.gms.internal.measurement.zzik;
import com.google.android.gms.internal.measurement.zziu;
import com.google.android.gms.internal.measurement.zzpu;
import java.io.IOException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.e */
/* JADX INFO: loaded from: classes2.dex */
final class C4214e extends AbstractC4197b6 {

    /* JADX INFO: renamed from: d */
    private String f15720d;

    /* JADX INFO: renamed from: e */
    private Set f15721e;

    /* JADX INFO: renamed from: f */
    private Map f15722f;

    /* JADX INFO: renamed from: g */
    private Long f15723g;

    /* JADX INFO: renamed from: h */
    private Long f15724h;

    C4214e(C4317q6 c4317q6) {
        super(c4317q6);
    }

    /* JADX INFO: renamed from: n */
    private final C4062I6 m18721n(Integer num) {
        if (this.f15722f.containsKey(num)) {
            return (C4062I6) this.f15722f.get(num);
        }
        C4062I6 c4062i6 = new C4062I6(this, this.f15720d, null);
        this.f15722f.put(num, c4062i6);
        return c4062i6;
    }

    /* JADX INFO: renamed from: o */
    private final boolean m18722o(int i7, int i8) {
        C4062I6 c4062i6 = (C4062I6) this.f15722f.get(Integer.valueOf(i7));
        if (c4062i6 == null) {
            return false;
        }
        return c4062i6.m18534c().get(i8);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4197b6
    /* JADX INFO: renamed from: l */
    protected final boolean mo18457l() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0247  */
    /* JADX WARN: Code duplicated, block: B:105:0x0257  */
    /* JADX WARN: Code duplicated, block: B:107:0x0262  */
    /* JADX WARN: Code duplicated, block: B:111:0x028e A[Catch: all -> 0x02a9, SQLiteException -> 0x02ab, LOOP:11: B:111:0x028e->B:515:?, LOOP_START, TryCatch #4 {all -> 0x02a9, blocks: (B:109:0x0288, B:111:0x028e, B:113:0x029f, B:119:0x02ad, B:122:0x02c2, B:131:0x02d0), top: B:436:0x027e }] */
    /* JADX WARN: Code duplicated, block: B:113:0x029f A[Catch: all -> 0x02a9, SQLiteException -> 0x02ab, TryCatch #4 {all -> 0x02a9, blocks: (B:109:0x0288, B:111:0x028e, B:113:0x029f, B:119:0x02ad, B:122:0x02c2, B:131:0x02d0), top: B:436:0x027e }] */
    /* JADX WARN: Code duplicated, block: B:122:0x02c2 A[Catch: all -> 0x02a9, SQLiteException -> 0x02ab, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x02a9, blocks: (B:109:0x0288, B:111:0x028e, B:113:0x029f, B:119:0x02ad, B:122:0x02c2, B:131:0x02d0), top: B:436:0x027e }] */
    /* JADX WARN: Code duplicated, block: B:137:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:140:0x030b  */
    /* JADX WARN: Code duplicated, block: B:142:0x0322  */
    /* JADX WARN: Code duplicated, block: B:166:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:168:0x03f7  */
    /* JADX WARN: Code duplicated, block: B:172:0x0404  */
    /* JADX WARN: Code duplicated, block: B:174:0x0424  */
    /* JADX WARN: Code duplicated, block: B:180:0x043b  */
    /* JADX WARN: Code duplicated, block: B:184:0x0457  */
    /* JADX WARN: Code duplicated, block: B:185:0x0460  */
    /* JADX WARN: Code duplicated, block: B:189:0x046e  */
    /* JADX WARN: Code duplicated, block: B:195:0x0485  */
    /* JADX WARN: Code duplicated, block: B:201:0x04bb  */
    /* JADX WARN: Code duplicated, block: B:204:0x04c4  */
    /* JADX WARN: Code duplicated, block: B:206:0x04ce  */
    /* JADX WARN: Code duplicated, block: B:208:0x04f0  */
    /* JADX WARN: Code duplicated, block: B:209:0x04f4  */
    /* JADX WARN: Code duplicated, block: B:214:0x050d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:239:0x0596  */
    /* JADX WARN: Code duplicated, block: B:242:0x05ab  */
    /* JADX WARN: Code duplicated, block: B:248:0x05e0  */
    /* JADX WARN: Code duplicated, block: B:256:0x0621  */
    /* JADX WARN: Code duplicated, block: B:263:0x0649 A[Catch: all -> 0x0652, SQLiteException -> 0x0654, TryCatch #3 {SQLiteException -> 0x0654, blocks: (B:258:0x0624, B:259:0x0628, B:261:0x0639, B:263:0x0649, B:268:0x0656, B:271:0x066c, B:270:0x065b, B:275:0x0679), top: B:434:0x0624 }] */
    /* JADX WARN: Code duplicated, block: B:274:0x0677  */
    /* JADX WARN: Code duplicated, block: B:276:0x067b A[PHI: r0 r7 r20 r22
      0x067b: PHI (r0v94 java.util.Map) = (r0v96 java.util.Map), (r0v102 java.util.Map) binds: [B:291:0x06b2, B:275:0x0679] A[DONT_GENERATE, DONT_INLINE]
      0x067b: PHI (r7v22 android.database.Cursor) = (r7v23 android.database.Cursor), (r7v24 android.database.Cursor) binds: [B:291:0x06b2, B:275:0x0679] A[DONT_GENERATE, DONT_INLINE]
      0x067b: PHI (r20v8 long) = (r20v9 long), (r20v12 long) binds: [B:291:0x06b2, B:275:0x0679] A[DONT_GENERATE, DONT_INLINE]
      0x067b: PHI (r22v12 com.google.android.gms.measurement.internal.C) = (r22v13 com.google.android.gms.measurement.internal.C), (r22v15 com.google.android.gms.measurement.internal.C) binds: [B:291:0x06b2, B:275:0x0679] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:297:0x06bf  */
    /* JADX WARN: Code duplicated, block: B:301:0x06d9  */
    /* JADX WARN: Code duplicated, block: B:307:0x070a  */
    /* JADX WARN: Code duplicated, block: B:309:0x0733 A[LOOP:10: B:305:0x0704->B:309:0x0733, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:313:0x0747  */
    /* JADX WARN: Code duplicated, block: B:317:0x075b  */
    /* JADX WARN: Code duplicated, block: B:320:0x0763  */
    /* JADX WARN: Code duplicated, block: B:323:0x0772  */
    /* JADX WARN: Code duplicated, block: B:325:0x0785  */
    /* JADX WARN: Code duplicated, block: B:329:0x07be A[Catch: all -> 0x07ef, SQLiteException -> 0x07ff, LOOP:3: B:329:0x07be->B:351:0x0826, LOOP_START, PHI: r3 r6
      0x07be: PHI (r3v44 java.lang.String) = (r3v36 java.lang.String), (r3v48 java.lang.String) binds: [B:328:0x07bc, B:351:0x0826] A[DONT_GENERATE, DONT_INLINE]
      0x07be: PHI (r6v35 java.util.Iterator) = (r6v27 java.util.Iterator), (r6v37 java.util.Iterator) binds: [B:328:0x07bc, B:351:0x0826] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #7 {all -> 0x07ef, blocks: (B:327:0x07b8, B:329:0x07be, B:330:0x07c3, B:332:0x07d4, B:335:0x07e6, B:341:0x07f9, B:348:0x081b, B:364:0x0844, B:345:0x0804, B:347:0x0814, B:355:0x0831), top: B:441:0x07b8 }] */
    /* JADX WARN: Code duplicated, block: B:334:0x07e4  */
    /* JADX WARN: Code duplicated, block: B:340:0x07f5  */
    /* JADX WARN: Code duplicated, block: B:351:0x0826 A[LOOP:3: B:329:0x07be->B:351:0x0826, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:354:0x082d  */
    /* JADX WARN: Code duplicated, block: B:356:0x0833 A[PHI: r0 r13 r18 r38
      0x0833: PHI (r0v154 java.util.Map) = (r0v156 java.util.Map), (r0v162 java.util.Map) binds: [B:365:0x0857, B:355:0x0831] A[DONT_GENERATE, DONT_INLINE]
      0x0833: PHI (r13v11 android.database.Cursor) = (r13v12 android.database.Cursor), (r13v13 android.database.Cursor) binds: [B:365:0x0857, B:355:0x0831] A[DONT_GENERATE, DONT_INLINE]
      0x0833: PHI (r18v7 java.lang.String) = (r18v8 java.lang.String), (r18v13 java.lang.String) binds: [B:365:0x0857, B:355:0x0831] A[DONT_GENERATE, DONT_INLINE]
      0x0833: PHI (r38v7 java.util.Iterator) = (r38v8 java.util.Iterator), (r38v11 java.util.Iterator) binds: [B:365:0x0857, B:355:0x0831] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:371:0x0864  */
    /* JADX WARN: Code duplicated, block: B:375:0x0876  */
    /* JADX WARN: Code duplicated, block: B:379:0x089b  */
    /* JADX WARN: Code duplicated, block: B:382:0x08ac  */
    /* JADX WARN: Code duplicated, block: B:384:0x08c3  */
    /* JADX WARN: Code duplicated, block: B:386:0x08d1  */
    /* JADX WARN: Code duplicated, block: B:388:0x08dc  */
    /* JADX WARN: Code duplicated, block: B:390:0x0909  */
    /* JADX WARN: Code duplicated, block: B:393:0x0913  */
    /* JADX WARN: Code duplicated, block: B:402:0x095c  */
    /* JADX WARN: Code duplicated, block: B:403:0x0965  */
    /* JADX WARN: Code duplicated, block: B:407:0x0976 A[PHI: r16 r39
      0x0976: PHI (r16v9 java.lang.String) = (r16v10 java.lang.String), (r2v25 java.lang.String) binds: [B:406:0x0974, B:404:0x0966] A[DONT_GENERATE, DONT_INLINE]
      0x0976: PHI (r39v3 java.util.Map) = (r39v4 java.util.Map), (r0v136 java.util.Map) binds: [B:406:0x0974, B:404:0x0966] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:412:0x099b  */
    /* JADX WARN: Code duplicated, block: B:425:0x0a23  */
    /* JADX WARN: Code duplicated, block: B:483:0x0821 A[EDGE_INSN: B:483:0x0821->B:350:0x0821 BREAK  A[LOOP:3: B:329:0x07be->B:351:0x0826], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:484:0x0888 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:486:0x097b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:487:0x0948 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:490:0x0970 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:491:0x09f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:494:0x0995 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:498:0x05b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:499:0x05d2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:501:0x05a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:502:0x05a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:507:0x06f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:508:0x06eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:512:0x0743 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:513:0x073d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:517:0x056f A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:524:0x0447 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:526:0x0435 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:529:0x0491 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:532:0x047f A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:543:0x0328 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:556:0x020d A[EDGE_INSN: B:556:0x020d->B:83:0x020d BREAK  A[LOOP:20: B:70:0x01c1->B:84:0x0212], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x016d  */
    /* JADX WARN: Code duplicated, block: B:61:0x01a2 A[Catch: all -> 0x01b0, SQLiteException -> 0x01b3, TRY_LEAVE, TryCatch #8 {all -> 0x01b0, blocks: (B:59:0x019c, B:61:0x01a2, B:69:0x01bc, B:70:0x01c1, B:71:0x01cb, B:72:0x01db, B:81:0x0207, B:74:0x01ea, B:78:0x01fa, B:80:0x0200, B:98:0x0230), top: B:443:0x019c }] */
    /* JADX WARN: Code duplicated, block: B:69:0x01bc A[Catch: all -> 0x01b0, SQLiteException -> 0x01b3, TRY_ENTER, TryCatch #8 {all -> 0x01b0, blocks: (B:59:0x019c, B:61:0x01a2, B:69:0x01bc, B:70:0x01c1, B:71:0x01cb, B:72:0x01db, B:81:0x0207, B:74:0x01ea, B:78:0x01fa, B:80:0x0200, B:98:0x0230), top: B:443:0x019c }] */
    /* JADX WARN: Code duplicated, block: B:84:0x0212 A[LOOP:20: B:70:0x01c1->B:84:0x0212, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 7 */
    /* JADX INFO: renamed from: m */
    final List m18723m(String str, List list, List list2, Long l7, Long l8, boolean z7) throws Throwable {
        int i7;
        int i8;
        boolean z8;
        Map map;
        Cursor cursor;
        boolean z9;
        String str2;
        Cursor cursorQuery;
        Map map2;
        HashSet hashSet;
        HashSet<Integer> hashSet2;
        Map map3;
        zzii zziiVar;
        BitSet bitSet;
        BitSet bitSet2;
        C2390a c2390a;
        zzii zziiVar2;
        List list3;
        int i9;
        boolean z10;
        Iterator it;
        zzik zzikVar;
        Long lValueOf;
        String str3;
        Map c2390a2;
        SQLiteDatabase sQLiteDatabaseM19051u0;
        ?? r7;
        Cursor cursorRawQuery;
        C2390a c2390a3;
        Iterator it2;
        Integer num;
        zzii zziiVar3;
        List list4;
        Map map4;
        HashSet hashSet3;
        Iterator it3;
        Integer numValueOf;
        List arrayList;
        String str4;
        String str5;
        String str6;
        C4070J6 c4070j6;
        C2390a c2390a4;
        Iterator it4;
        zzhs zzhsVar;
        zzhs zzhsVarM18535a;
        C4317q6 c4317q6;
        C4007C c4007cM19034Z;
        long j7;
        String strZzd;
        Map map5;
        C4007C c4007c;
        long j8;
        String str7;
        String str8;
        int iIntValue;
        Iterator it5;
        boolean zM18693k;
        Map map6;
        C4190b c4190b;
        C4342u c4342uM18898F0;
        String str9;
        C2390a c2390a5;
        Cursor cursor2;
        Cursor cursorQuery2;
        Integer numValueOf2;
        List arrayList2;
        String str10;
        String str11;
        ArrayList arrayList3;
        C4342u c4342uM18898F1;
        String str12;
        ContentValues contentValues;
        C2390a c2390a6;
        Iterator it6;
        String strZzc;
        Map map7;
        String str13;
        Iterator it7;
        boolean zM18711k;
        zzfn zzfnVar;
        C4164X2 c4164x2;
        Integer numValueOf3;
        C4206d c4206d;
        Integer numValueOf4;
        C4342u c4342uM18898F2;
        String str14;
        C2390a c2390a7;
        Cursor cursor3;
        Cursor cursorQuery3;
        Integer numValueOf5;
        List list5;
        List arrayList4;
        C2390a c2390a8;
        int i10;
        Cursor cursorQuery4;
        List arrayList5;
        AbstractC3718s.m18077f(str);
        AbstractC3718s.m18083l(list);
        AbstractC3718s.m18083l(list2);
        this.f15720d = str;
        this.f15721e = new HashSet();
        this.f15722f = new C2390a();
        this.f15723g = l7;
        this.f15724h = l8;
        Iterator it8 = list.iterator();
        while (true) {
            i7 = 0;
            i8 = 1;
            if (!it8.hasNext()) {
                z8 = false;
                break;
            }
            if ("_s".equals(((zzhs) it8.next()).zzd())) {
                z8 = true;
                break;
            }
        }
        zzpu.zza();
        C4164X2 c4164x3 = this.f15066a;
        boolean zM18800H = c4164x3.m18686w().m18800H(this.f15720d, AbstractC4209d2.f15609G0);
        zzpu.zza();
        boolean zM18800H2 = c4164x3.m18686w().m18800H(this.f15720d, AbstractC4209d2.f15607F0);
        if (z8) {
            C4342u c4342uM18898F3 = this.f15465b.m18898F0();
            String str15 = this.f15720d;
            c4342uM18898F3.m18696j();
            c4342uM18898F3.mo18427h();
            AbstractC3718s.m18077f(str15);
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("current_session_count", (Integer) 0);
            try {
                c4342uM18898F3.m19051u0().update("events", contentValues2, "app_id = ?", new String[]{str15});
            } catch (SQLiteException e7) {
                c4342uM18898F3.f15066a.mo18421a().m18851o().m18836c("Error resetting session-scoped event counts. appId", C4313q2.m18846x(str15), e7);
            }
        }
        Map map8 = Collections.EMPTY_MAP;
        String str16 = "data";
        String str17 = "audience_id";
        if (zM18800H2 && zM18800H) {
            C4342u c4342uM18898F4 = this.f15465b.m18898F0();
            String str18 = this.f15720d;
            AbstractC3718s.m18077f(str18);
            C2390a c2390a9 = new C2390a();
            try {
                cursorQuery4 = c4342uM18898F4.m19051u0().query("event_filters", new String[]{"audience_id", "data"}, "app_id=?", new String[]{str18}, null, null, null);
                try {
                    try {
                        if (cursorQuery4.moveToFirst()) {
                            while (true) {
                                try {
                                    zzff zzffVar = (zzff) ((zzfe) C4349u6.m19071W(zzff.zzn(), cursorQuery4.getBlob(i8))).zzbc();
                                    if (zzffVar.zzg()) {
                                        Integer numValueOf6 = Integer.valueOf(cursorQuery4.getInt(i7));
                                        List list6 = (List) c2390a9.get(numValueOf6);
                                        if (list6 == null) {
                                            arrayList5 = new ArrayList();
                                            c2390a9.put(numValueOf6, arrayList5);
                                        } else {
                                            arrayList5 = list6;
                                        }
                                        arrayList5.add(zzffVar);
                                    }
                                } catch (IOException e8) {
                                    c4342uM18898F4.f15066a.mo18421a().m18851o().m18836c("Failed to merge filter. appId", C4313q2.m18846x(str18), e8);
                                }
                                if (!cursorQuery4.moveToNext()) {
                                    break;
                                }
                                i7 = 0;
                                i8 = 1;
                            }
                            cursorQuery4.close();
                            map = c2390a9;
                        } else {
                            cursorQuery4.close();
                            map = map8;
                        }
                    } catch (SQLiteException e9) {
                        e = e9;
                        c4342uM18898F4.f15066a.mo18421a().m18851o().m18836c("Database error querying filters. appId", C4313q2.m18846x(str18), e);
                        map8 = Collections.EMPTY_MAP;
                        if (cursorQuery4 != null) {
                        }
                        map = map8;
                        C4342u c4342uM18898F5 = this.f15465b.m18898F0();
                        String str19 = this.f15720d;
                        c4342uM18898F5.m18696j();
                        c4342uM18898F5.mo18427h();
                        AbstractC3718s.m18077f(str19);
                        cursorQuery = c4342uM18898F5.m19051u0().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{str19}, null, null, null);
                        try {
                            try {
                                if (cursorQuery.moveToFirst()) {
                                    c2390a8 = new C2390a();
                                    while (true) {
                                        i10 = cursorQuery.getInt(0);
                                        try {
                                            c2390a8.put(Integer.valueOf(i10), (zzii) ((zzih) C4349u6.m19071W(zzii.zzi(), cursorQuery.getBlob(1))).zzbc());
                                            z9 = z8;
                                            str2 = str16;
                                        } catch (IOException e10) {
                                            z9 = z8;
                                            str2 = str16;
                                            try {
                                                c4342uM18898F5.f15066a.mo18421a().m18851o().m18837d("Failed to merge filter results. appId, audienceId, error", C4313q2.m18846x(str19), Integer.valueOf(i10), e10);
                                            } catch (SQLiteException e11) {
                                                e = e11;
                                                str17 = str17;
                                                c4342uM18898F5.f15066a.mo18421a().m18851o().m18836c("Database error querying filter results. appId", C4313q2.m18846x(str19), e);
                                                Map map9 = Collections.EMPTY_MAP;
                                                if (cursorQuery != null) {
                                                    cursorQuery.close();
                                                }
                                                map2 = map9;
                                                if (!map2.isEmpty()) {
                                                    hashSet = new HashSet(map2.keySet());
                                                    if (z9) {
                                                        String str20 = this.f15720d;
                                                        C4342u c4342uM18898F6 = this.f15465b.m18898F0();
                                                        str3 = this.f15720d;
                                                        c4342uM18898F6.m18696j();
                                                        c4342uM18898F6.mo18427h();
                                                        AbstractC3718s.m18077f(str3);
                                                        c2390a2 = new C2390a();
                                                        sQLiteDatabaseM19051u0 = c4342uM18898F6.m19051u0();
                                                        try {
                                                            try {
                                                                cursorRawQuery = sQLiteDatabaseM19051u0.rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str3, str3});
                                                                try {
                                                                    if (cursorRawQuery.moveToFirst()) {
                                                                        do {
                                                                            numValueOf = Integer.valueOf(cursorRawQuery.getInt(0));
                                                                            arrayList = (List) c2390a2.get(numValueOf);
                                                                            if (arrayList == null) {
                                                                                arrayList = new ArrayList();
                                                                                c2390a2.put(numValueOf, arrayList);
                                                                            }
                                                                            arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                                                                        } while (cursorRawQuery.moveToNext());
                                                                    } else {
                                                                        c2390a2 = Collections.EMPTY_MAP;
                                                                    }
                                                                } catch (SQLiteException e12) {
                                                                    e = e12;
                                                                    c4342uM18898F6.f15066a.mo18421a().m18851o().m18836c("Database error querying scoped filters. appId", C4313q2.m18846x(str3), e);
                                                                    c2390a2 = Collections.EMPTY_MAP;
                                                                    if (cursorRawQuery != null) {
                                                                    }
                                                                    AbstractC3718s.m18077f(str20);
                                                                    AbstractC3718s.m18083l(map2);
                                                                    c2390a3 = new C2390a();
                                                                    if (!map2.isEmpty()) {
                                                                        it2 = map2.keySet().iterator();
                                                                        while (it2.hasNext()) {
                                                                            num = (Integer) it2.next();
                                                                            num.intValue();
                                                                            zziiVar3 = (zzii) map2.get(num);
                                                                            list4 = (List) c2390a2.get(num);
                                                                            if (list4 != null) {
                                                                            }
                                                                            map4 = c2390a2;
                                                                            hashSet3 = hashSet;
                                                                            it3 = it2;
                                                                            c2390a3.put(num, zziiVar3);
                                                                            c2390a2 = map4;
                                                                            hashSet = hashSet3;
                                                                            it2 = it3;
                                                                        }
                                                                    }
                                                                    hashSet2 = hashSet;
                                                                    map3 = c2390a3;
                                                                    for (Integer num2 : hashSet2) {
                                                                        num2.intValue();
                                                                        zziiVar = (zzii) map3.get(num2);
                                                                        bitSet = new BitSet();
                                                                        bitSet2 = new BitSet();
                                                                        c2390a = new C2390a();
                                                                        if (zziiVar != null) {
                                                                            for (zzhq zzhqVar : zziiVar.zze()) {
                                                                                if (zzhqVar.zza()) {
                                                                                    Map map10 = map3;
                                                                                    Integer numValueOf7 = Integer.valueOf(zzhqVar.zzb());
                                                                                    if (zzhqVar.zzc()) {
                                                                                        lValueOf = Long.valueOf(zzhqVar.zzd());
                                                                                    } else {
                                                                                        lValueOf = null;
                                                                                    }
                                                                                    c2390a.put(numValueOf7, lValueOf);
                                                                                    map3 = map10;
                                                                                }
                                                                            }
                                                                        }
                                                                        Map map11 = map3;
                                                                        C2390a c2390a10 = new C2390a();
                                                                        if (zziiVar != null) {
                                                                            it = zziiVar.zzg().iterator();
                                                                            while (it.hasNext()) {
                                                                                zzikVar = (zzik) it.next();
                                                                                if (!zzikVar.zza()) {
                                                                                }
                                                                            }
                                                                        }
                                                                        zziiVar2 = zziiVar;
                                                                        if (zziiVar2 != null) {
                                                                            i9 = 0;
                                                                            while (i9 < zziiVar2.zzb() * 64) {
                                                                                if (C4349u6.m19069P(zziiVar2.zza(), i9)) {
                                                                                    z10 = zM18800H;
                                                                                    this.f15066a.mo18421a().m18859w().m18836c("Filter already evaluated. audience ID, filter ID", num2, Integer.valueOf(i9));
                                                                                    bitSet2.set(i9);
                                                                                    if (C4349u6.m19069P(zziiVar2.zzc(), i9)) {
                                                                                        bitSet.set(i9);
                                                                                    }
                                                                                    i9++;
                                                                                    zM18800H = z10;
                                                                                } else {
                                                                                    z10 = zM18800H;
                                                                                }
                                                                                c2390a.remove(Integer.valueOf(i9));
                                                                                i9++;
                                                                                zM18800H = z10;
                                                                            }
                                                                        }
                                                                        boolean z11 = zM18800H;
                                                                        zzii zziiVar4 = (zzii) map2.get(num2);
                                                                        if (!zM18800H2) {
                                                                        }
                                                                        this.f15722f.put(num2, new C4062I6(this, this.f15720d, zziiVar4, bitSet, bitSet2, c2390a, c2390a10, null));
                                                                        zM18800H = z11;
                                                                        map3 = map11;
                                                                    }
                                                                    str4 = str2;
                                                                    str5 = str17;
                                                                    str6 = "Skipping failed audience ID";
                                                                    if (!list.isEmpty()) {
                                                                        c4070j6 = new C4070J6(this, null);
                                                                        c2390a4 = new C2390a();
                                                                        it4 = list.iterator();
                                                                        while (it4.hasNext()) {
                                                                            zzhsVar = (zzhs) it4.next();
                                                                            zzhsVarM18535a = c4070j6.m18535a(this.f15720d, zzhsVar);
                                                                            if (zzhsVarM18535a != null) {
                                                                                c4317q6 = this.f15465b;
                                                                                c4007cM19034Z = c4317q6.m18898F0().m19034Z(this.f15720d, zzhsVar, zzhsVarM18535a.zzd());
                                                                                c4317q6.m18898F0().m19055w0(c4007cM19034Z);
                                                                                if (!z7) {
                                                                                    j7 = c4007cM19034Z.f15129c;
                                                                                    strZzd = zzhsVarM18535a.zzd();
                                                                                    map5 = (Map) c2390a4.get(strZzd);
                                                                                    if (map5 == null) {
                                                                                        c4342uM18898F0 = c4317q6.m18898F0();
                                                                                        str9 = this.f15720d;
                                                                                        c4342uM18898F0.m18696j();
                                                                                        c4342uM18898F0.mo18427h();
                                                                                        AbstractC3718s.m18077f(str9);
                                                                                        AbstractC3718s.m18077f(strZzd);
                                                                                        c2390a5 = new C2390a();
                                                                                        str7 = str4;
                                                                                        str8 = str5;
                                                                                        try {
                                                                                            try {
                                                                                                c4007c = c4007cM19034Z;
                                                                                                try {
                                                                                                    cursorQuery2 = c4342uM18898F0.m19051u0().query("event_filters", new String[]{str8, str7}, "app_id=? AND event_name=?", new String[]{str9, strZzd}, null, null, null);
                                                                                                    try {
                                                                                                        try {
                                                                                                            if (cursorQuery2.moveToFirst()) {
                                                                                                                j8 = j7;
                                                                                                                do {
                                                                                                                    try {
                                                                                                                        try {
                                                                                                                            zzff zzffVar2 = (zzff) ((zzfe) C4349u6.m19071W(zzff.zzn(), cursorQuery2.getBlob(1))).zzbc();
                                                                                                                            numValueOf2 = Integer.valueOf(cursorQuery2.getInt(0));
                                                                                                                            arrayList2 = (List) c2390a5.get(numValueOf2);
                                                                                                                            if (arrayList2 == null) {
                                                                                                                                arrayList2 = new ArrayList();
                                                                                                                                c2390a5.put(numValueOf2, arrayList2);
                                                                                                                            }
                                                                                                                            arrayList2.add(zzffVar2);
                                                                                                                        } catch (IOException e13) {
                                                                                                                            c4342uM18898F0.f15066a.mo18421a().m18851o().m18836c("Failed to merge filter. appId", C4313q2.m18846x(str9), e13);
                                                                                                                        }
                                                                                                                    } catch (SQLiteException e14) {
                                                                                                                        e = e14;
                                                                                                                        c4342uM18898F0.f15066a.mo18421a().m18851o().m18836c("Database error querying filters. appId", C4313q2.m18846x(str9), e);
                                                                                                                        map5 = Collections.EMPTY_MAP;
                                                                                                                        if (cursorQuery2 != null) {
                                                                                                                            cursorQuery2.close();
                                                                                                                        }
                                                                                                                    }
                                                                                                                } while (cursorQuery2.moveToNext());
                                                                                                                cursorQuery2.close();
                                                                                                                map5 = c2390a5;
                                                                                                            } else {
                                                                                                                j8 = j7;
                                                                                                                map5 = Collections.EMPTY_MAP;
                                                                                                                cursorQuery2.close();
                                                                                                            }
                                                                                                        } catch (SQLiteException e15) {
                                                                                                            e = e15;
                                                                                                            j8 = j7;
                                                                                                        }
                                                                                                    } catch (Throwable th) {
                                                                                                        th = th;
                                                                                                        cursor2 = cursorQuery2;
                                                                                                        if (cursor2 != null) {
                                                                                                            cursor2.close();
                                                                                                        }
                                                                                                        throw th;
                                                                                                    }
                                                                                                } catch (SQLiteException e16) {
                                                                                                    e = e16;
                                                                                                    j8 = j7;
                                                                                                    cursorQuery2 = null;
                                                                                                    c4342uM18898F0.f15066a.mo18421a().m18851o().m18836c("Database error querying filters. appId", C4313q2.m18846x(str9), e);
                                                                                                    map5 = Collections.EMPTY_MAP;
                                                                                                    if (cursorQuery2 != null) {
                                                                                                        cursorQuery2.close();
                                                                                                    }
                                                                                                    c2390a4.put(strZzd, map5);
                                                                                                    for (Integer num3 : map5.keySet()) {
                                                                                                        iIntValue = num3.intValue();
                                                                                                        if (this.f15721e.contains(num3)) {
                                                                                                            this.f15066a.mo18421a().m18859w().m18835b("Skipping failed audience ID", num3);
                                                                                                        } else {
                                                                                                            it5 = ((List) map5.get(num3)).iterator();
                                                                                                            zM18693k = true;
                                                                                                            while (true) {
                                                                                                                if (!it5.hasNext()) {
                                                                                                                    map6 = map5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                zzff zzffVar3 = (zzff) it5.next();
                                                                                                                c4190b = new C4190b(this, this.f15720d, iIntValue, zzffVar3);
                                                                                                                map6 = map5;
                                                                                                                zM18693k = c4190b.m18693k(this.f15723g, this.f15724h, zzhsVarM18535a, j8, c4007c, m18722o(iIntValue, zzffVar3.zzb()));
                                                                                                                if (!zM18693k) {
                                                                                                                    this.f15721e.add(num3);
                                                                                                                    break;
                                                                                                                }
                                                                                                                m18721n(num3).m18532a(c4190b);
                                                                                                                map5 = map6;
                                                                                                            }
                                                                                                            if (!zM18693k) {
                                                                                                                this.f15721e.add(num3);
                                                                                                            }
                                                                                                            map5 = map6;
                                                                                                        }
                                                                                                    }
                                                                                                    str4 = str7;
                                                                                                    str5 = str8;
                                                                                                    c4070j6 = c4070j6;
                                                                                                    it4 = it4;
                                                                                                }
                                                                                            } catch (Throwable th2) {
                                                                                                th = th2;
                                                                                                cursor2 = null;
                                                                                            }
                                                                                        } catch (SQLiteException e17) {
                                                                                            e = e17;
                                                                                            c4007c = c4007cM19034Z;
                                                                                        }
                                                                                        c2390a4.put(strZzd, map5);
                                                                                    } else {
                                                                                        c4007c = c4007cM19034Z;
                                                                                        j8 = j7;
                                                                                        str7 = str4;
                                                                                        str8 = str5;
                                                                                    }
                                                                                    while (r6.hasNext()) {
                                                                                        iIntValue = num3.intValue();
                                                                                        if (this.f15721e.contains(num3)) {
                                                                                            this.f15066a.mo18421a().m18859w().m18835b("Skipping failed audience ID", num3);
                                                                                        } else {
                                                                                            it5 = ((List) map5.get(num3)).iterator();
                                                                                            zM18693k = true;
                                                                                            while (true) {
                                                                                                if (!it5.hasNext()) {
                                                                                                    map6 = map5;
                                                                                                    break;
                                                                                                }
                                                                                                zzff zzffVar4 = (zzff) it5.next();
                                                                                                c4190b = new C4190b(this, this.f15720d, iIntValue, zzffVar4);
                                                                                                map6 = map5;
                                                                                                zM18693k = c4190b.m18693k(this.f15723g, this.f15724h, zzhsVarM18535a, j8, c4007c, m18722o(iIntValue, zzffVar4.zzb()));
                                                                                                if (!zM18693k) {
                                                                                                    this.f15721e.add(num3);
                                                                                                    break;
                                                                                                }
                                                                                                m18721n(num3).m18532a(c4190b);
                                                                                                map5 = map6;
                                                                                            }
                                                                                            if (!zM18693k) {
                                                                                                this.f15721e.add(num3);
                                                                                            }
                                                                                            map5 = map6;
                                                                                        }
                                                                                    }
                                                                                    str4 = str7;
                                                                                    str5 = str8;
                                                                                    c4070j6 = c4070j6;
                                                                                    it4 = it4;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    str10 = str4;
                                                                    str11 = str5;
                                                                    if (!z7) {
                                                                        return new ArrayList();
                                                                    }
                                                                    if (!list2.isEmpty()) {
                                                                        c2390a6 = new C2390a();
                                                                        it6 = list2.iterator();
                                                                        while (it6.hasNext()) {
                                                                            zziu zziuVar = (zziu) it6.next();
                                                                            strZzc = zziuVar.zzc();
                                                                            map7 = (Map) c2390a6.get(strZzc);
                                                                            if (map7 == null) {
                                                                                c4342uM18898F2 = this.f15465b.m18898F0();
                                                                                str14 = this.f15720d;
                                                                                c4342uM18898F2.m18696j();
                                                                                c4342uM18898F2.mo18427h();
                                                                                AbstractC3718s.m18077f(str14);
                                                                                AbstractC3718s.m18077f(strZzc);
                                                                                c2390a7 = new C2390a();
                                                                                try {
                                                                                    cursorQuery3 = c4342uM18898F2.m19051u0().query("property_filters", new String[]{str11, str10}, "app_id=? AND property_name=?", new String[]{str14, strZzc}, null, null, null);
                                                                                    try {
                                                                                        try {
                                                                                            if (cursorQuery3.moveToFirst()) {
                                                                                                while (true) {
                                                                                                    try {
                                                                                                        zzfn zzfnVar2 = (zzfn) ((zzfm) C4349u6.m19071W(zzfn.zzi(), cursorQuery3.getBlob(1))).zzbc();
                                                                                                        numValueOf5 = Integer.valueOf(cursorQuery3.getInt(0));
                                                                                                        list5 = (List) c2390a7.get(numValueOf5);
                                                                                                        if (list5 == null) {
                                                                                                            str13 = str10;
                                                                                                            try {
                                                                                                                arrayList4 = new ArrayList();
                                                                                                                c2390a7.put(numValueOf5, arrayList4);
                                                                                                            } catch (SQLiteException e18) {
                                                                                                                e = e18;
                                                                                                                it6 = it6;
                                                                                                                c4342uM18898F2.f15066a.mo18421a().m18851o().m18836c("Database error querying filters. appId", C4313q2.m18846x(str14), e);
                                                                                                                map7 = Collections.EMPTY_MAP;
                                                                                                                if (cursorQuery3 != null) {
                                                                                                                    cursorQuery3.close();
                                                                                                                }
                                                                                                                c2390a6.put(strZzc, map7);
                                                                                                                for (Integer num4 : map7.keySet()) {
                                                                                                                    int iIntValue2 = num4.intValue();
                                                                                                                    if (this.f15721e.contains(num4)) {
                                                                                                                        this.f15066a.mo18421a().m18859w().m18835b(str6, num4);
                                                                                                                        break;
                                                                                                                    }
                                                                                                                    it7 = ((List) map7.get(num4)).iterator();
                                                                                                                    zM18711k = true;
                                                                                                                    while (true) {
                                                                                                                        if (it7.hasNext()) {
                                                                                                                            zzfnVar = (zzfn) it7.next();
                                                                                                                            c4164x2 = this.f15066a;
                                                                                                                            if (Log.isLoggable(c4164x2.mo18421a().m18861z(), 2)) {
                                                                                                                                C4297o2 c4297o2M18859w = c4164x2.mo18421a().m18859w();
                                                                                                                                if (zzfnVar.zza()) {
                                                                                                                                    numValueOf4 = Integer.valueOf(zzfnVar.zzb());
                                                                                                                                } else {
                                                                                                                                    numValueOf4 = null;
                                                                                                                                }
                                                                                                                                c4297o2M18859w.m18837d("Evaluating filter. audience, filter, property", num4, numValueOf4, c4164x2.m18662D().m18777c(zzfnVar.zzc()));
                                                                                                                                c4164x2.mo18421a().m18859w().m18835b("Filter definition", this.f15465b.m18903K0().m19092M(zzfnVar));
                                                                                                                            }
                                                                                                                            if (zzfnVar.zza()) {
                                                                                                                            }
                                                                                                                            C4297o2 c4297o2M18854r = c4164x2.mo18421a().m18854r();
                                                                                                                            Object objM18846x = C4313q2.m18846x(this.f15720d);
                                                                                                                            if (zzfnVar.zza()) {
                                                                                                                                numValueOf3 = Integer.valueOf(zzfnVar.zzb());
                                                                                                                            } else {
                                                                                                                                numValueOf3 = null;
                                                                                                                            }
                                                                                                                            c4297o2M18854r.m18836c("Invalid property filter ID. appId, id", objM18846x, String.valueOf(numValueOf3));
                                                                                                                            this.f15721e.add(num4);
                                                                                                                            map7 = map7;
                                                                                                                            str6 = str6;
                                                                                                                        } else {
                                                                                                                            map7 = map7;
                                                                                                                            str6 = str6;
                                                                                                                        }
                                                                                                                        if (!zM18711k) {
                                                                                                                            this.f15721e.add(num4);
                                                                                                                        }
                                                                                                                        map7 = map7;
                                                                                                                        str6 = str6;
                                                                                                                        m18721n(num4).m18532a(c4206d);
                                                                                                                        map7 = map7;
                                                                                                                        str6 = str6;
                                                                                                                    }
                                                                                                                }
                                                                                                                it6 = it6;
                                                                                                                str10 = str13;
                                                                                                            }
                                                                                                        } else {
                                                                                                            str13 = str10;
                                                                                                            arrayList4 = list5;
                                                                                                        }
                                                                                                        arrayList4.add(zzfnVar2);
                                                                                                    } catch (IOException e19) {
                                                                                                        str13 = str10;
                                                                                                        c4342uM18898F2.f15066a.mo18421a().m18851o().m18836c("Failed to merge filter", C4313q2.m18846x(str14), e19);
                                                                                                    }
                                                                                                    try {
                                                                                                        if (!cursorQuery3.moveToNext()) {
                                                                                                            break;
                                                                                                        }
                                                                                                        it6 = it6;
                                                                                                        str10 = str13;
                                                                                                    } catch (SQLiteException e20) {
                                                                                                        e = e20;
                                                                                                        c4342uM18898F2.f15066a.mo18421a().m18851o().m18836c("Database error querying filters. appId", C4313q2.m18846x(str14), e);
                                                                                                        map7 = Collections.EMPTY_MAP;
                                                                                                        if (cursorQuery3 != null) {
                                                                                                            cursorQuery3.close();
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                cursorQuery3.close();
                                                                                                map7 = c2390a7;
                                                                                            } else {
                                                                                                str13 = str10;
                                                                                                it6 = it6;
                                                                                                map7 = Collections.EMPTY_MAP;
                                                                                                cursorQuery3.close();
                                                                                            }
                                                                                        } catch (Throwable th3) {
                                                                                            th = th3;
                                                                                            cursor3 = cursorQuery3;
                                                                                            if (cursor3 != null) {
                                                                                                cursor3.close();
                                                                                            }
                                                                                            throw th;
                                                                                        }
                                                                                    } catch (SQLiteException e21) {
                                                                                        e = e21;
                                                                                        str13 = str10;
                                                                                    }
                                                                                } catch (SQLiteException e22) {
                                                                                    e = e22;
                                                                                    str13 = str10;
                                                                                    it6 = it6;
                                                                                    cursorQuery3 = null;
                                                                                } catch (Throwable th4) {
                                                                                    th = th4;
                                                                                    cursor3 = null;
                                                                                }
                                                                                c2390a6.put(strZzc, map7);
                                                                            } else {
                                                                                str13 = str10;
                                                                                it6 = it6;
                                                                            }
                                                                            while (r3.hasNext()) {
                                                                                int iIntValue3 = num4.intValue();
                                                                                if (this.f15721e.contains(num4)) {
                                                                                    this.f15066a.mo18421a().m18859w().m18835b(str6, num4);
                                                                                    break;
                                                                                    break;
                                                                                }
                                                                                it7 = ((List) map7.get(num4)).iterator();
                                                                                zM18711k = true;
                                                                                while (true) {
                                                                                    if (it7.hasNext()) {
                                                                                        zzfnVar = (zzfn) it7.next();
                                                                                        c4164x2 = this.f15066a;
                                                                                        if (Log.isLoggable(c4164x2.mo18421a().m18861z(), 2)) {
                                                                                            C4297o2 c4297o2M18859w2 = c4164x2.mo18421a().m18859w();
                                                                                            if (zzfnVar.zza()) {
                                                                                                numValueOf4 = Integer.valueOf(zzfnVar.zzb());
                                                                                            } else {
                                                                                                numValueOf4 = null;
                                                                                            }
                                                                                            c4297o2M18859w2.m18837d("Evaluating filter. audience, filter, property", num4, numValueOf4, c4164x2.m18662D().m18777c(zzfnVar.zzc()));
                                                                                            c4164x2.mo18421a().m18859w().m18835b("Filter definition", this.f15465b.m18903K0().m19092M(zzfnVar));
                                                                                        }
                                                                                        if (zzfnVar.zza()) {
                                                                                        }
                                                                                        C4297o2 c4297o2M18854r2 = c4164x2.mo18421a().m18854r();
                                                                                        Object objM18846x2 = C4313q2.m18846x(this.f15720d);
                                                                                        if (zzfnVar.zza()) {
                                                                                            numValueOf3 = Integer.valueOf(zzfnVar.zzb());
                                                                                        } else {
                                                                                            numValueOf3 = null;
                                                                                        }
                                                                                        c4297o2M18854r2.m18836c("Invalid property filter ID. appId, id", objM18846x2, String.valueOf(numValueOf3));
                                                                                        this.f15721e.add(num4);
                                                                                        map7 = map7;
                                                                                        str6 = str6;
                                                                                    } else {
                                                                                        map7 = map7;
                                                                                        str6 = str6;
                                                                                    }
                                                                                    if (!zM18711k) {
                                                                                        this.f15721e.add(num4);
                                                                                    }
                                                                                    map7 = map7;
                                                                                    str6 = str6;
                                                                                    m18721n(num4).m18532a(c4206d);
                                                                                    map7 = map7;
                                                                                    str6 = str6;
                                                                                }
                                                                            }
                                                                            it6 = it6;
                                                                            str10 = str13;
                                                                        }
                                                                    }
                                                                    arrayList3 = new ArrayList();
                                                                    Set<Integer> setKeySet = this.f15722f.keySet();
                                                                    setKeySet.removeAll(this.f15721e);
                                                                    for (Integer num5 : setKeySet) {
                                                                        int iIntValue4 = num5.intValue();
                                                                        C4062I6 c4062i6 = (C4062I6) this.f15722f.get(num5);
                                                                        AbstractC3718s.m18083l(c4062i6);
                                                                        zzhg zzhgVarM18533b = c4062i6.m18533b(iIntValue4);
                                                                        arrayList3.add(zzhgVarM18533b);
                                                                        c4342uM18898F1 = this.f15465b.m18898F0();
                                                                        str12 = this.f15720d;
                                                                        zzii zziiVarZzc = zzhgVarM18533b.zzc();
                                                                        c4342uM18898F1.m18696j();
                                                                        c4342uM18898F1.mo18427h();
                                                                        AbstractC3718s.m18077f(str12);
                                                                        AbstractC3718s.m18083l(zziiVarZzc);
                                                                        byte[] bArrZzcc = zziiVarZzc.zzcc();
                                                                        contentValues = new ContentValues();
                                                                        contentValues.put("app_id", str12);
                                                                        contentValues.put(str11, num5);
                                                                        contentValues.put("current_results", bArrZzcc);
                                                                        try {
                                                                            try {
                                                                                if (c4342uM18898F1.m19051u0().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                                                                    c4342uM18898F1.f15066a.mo18421a().m18851o().m18835b("Failed to insert filter results (got -1). appId", C4313q2.m18846x(str12));
                                                                                }
                                                                            } catch (SQLiteException e23) {
                                                                                e = e23;
                                                                                c4342uM18898F1.f15066a.mo18421a().m18851o().m18836c("Error storing filter results. appId", C4313q2.m18846x(str12), e);
                                                                            }
                                                                        } catch (SQLiteException e24) {
                                                                            e = e24;
                                                                        }
                                                                    }
                                                                    return arrayList3;
                                                                }
                                                            } catch (Throwable th5) {
                                                                th = th5;
                                                                r7 = sQLiteDatabaseM19051u0;
                                                                if (r7 != 0) {
                                                                    r7.close();
                                                                }
                                                                throw th;
                                                            }
                                                        } catch (SQLiteException e25) {
                                                            e = e25;
                                                            cursorRawQuery = null;
                                                        } catch (Throwable th6) {
                                                            th = th6;
                                                            r7 = 0;
                                                            if (r7 != 0) {
                                                                r7.close();
                                                            }
                                                            throw th;
                                                        }
                                                        cursorRawQuery.close();
                                                        AbstractC3718s.m18077f(str20);
                                                        AbstractC3718s.m18083l(map2);
                                                        c2390a3 = new C2390a();
                                                        if (!map2.isEmpty()) {
                                                            it2 = map2.keySet().iterator();
                                                            while (it2.hasNext()) {
                                                                num = (Integer) it2.next();
                                                                num.intValue();
                                                                zziiVar3 = (zzii) map2.get(num);
                                                                list4 = (List) c2390a2.get(num);
                                                                if (list4 != null) {
                                                                }
                                                                map4 = c2390a2;
                                                                hashSet3 = hashSet;
                                                                it3 = it2;
                                                                c2390a3.put(num, zziiVar3);
                                                                c2390a2 = map4;
                                                                hashSet = hashSet3;
                                                                it2 = it3;
                                                            }
                                                        }
                                                        hashSet2 = hashSet;
                                                        map3 = c2390a3;
                                                    } else {
                                                        hashSet2 = hashSet;
                                                        map3 = map2;
                                                    }
                                                    while (r16.hasNext()) {
                                                        num2.intValue();
                                                        zziiVar = (zzii) map3.get(num2);
                                                        bitSet = new BitSet();
                                                        bitSet2 = new BitSet();
                                                        c2390a = new C2390a();
                                                        if (zziiVar != null) {
                                                            while (r7.hasNext()) {
                                                                if (zzhqVar.zza()) {
                                                                    Map map12 = map3;
                                                                    Integer numValueOf8 = Integer.valueOf(zzhqVar.zzb());
                                                                    if (zzhqVar.zzc()) {
                                                                        lValueOf = Long.valueOf(zzhqVar.zzd());
                                                                    } else {
                                                                        lValueOf = null;
                                                                    }
                                                                    c2390a.put(numValueOf8, lValueOf);
                                                                    map3 = map12;
                                                                }
                                                            }
                                                        }
                                                        Map map13 = map3;
                                                        C2390a c2390a11 = new C2390a();
                                                        if (zziiVar != null) {
                                                            it = zziiVar.zzg().iterator();
                                                            while (it.hasNext()) {
                                                                zzikVar = (zzik) it.next();
                                                                if (!zzikVar.zza()) {
                                                                }
                                                            }
                                                        }
                                                        zziiVar2 = zziiVar;
                                                        if (zziiVar2 != null) {
                                                            i9 = 0;
                                                            while (i9 < zziiVar2.zzb() * 64) {
                                                                if (C4349u6.m19069P(zziiVar2.zza(), i9)) {
                                                                    z10 = zM18800H;
                                                                    this.f15066a.mo18421a().m18859w().m18836c("Filter already evaluated. audience ID, filter ID", num2, Integer.valueOf(i9));
                                                                    bitSet2.set(i9);
                                                                    if (C4349u6.m19069P(zziiVar2.zzc(), i9)) {
                                                                        bitSet.set(i9);
                                                                    }
                                                                    i9++;
                                                                    zM18800H = z10;
                                                                } else {
                                                                    z10 = zM18800H;
                                                                }
                                                                c2390a.remove(Integer.valueOf(i9));
                                                                i9++;
                                                                zM18800H = z10;
                                                            }
                                                        }
                                                        boolean z12 = zM18800H;
                                                        zzii zziiVar5 = (zzii) map2.get(num2);
                                                        if (!zM18800H2) {
                                                        }
                                                        this.f15722f.put(num2, new C4062I6(this, this.f15720d, zziiVar5, bitSet, bitSet2, c2390a, c2390a11, null));
                                                        zM18800H = z12;
                                                        map3 = map13;
                                                    }
                                                }
                                                str4 = str2;
                                                str5 = str17;
                                                str6 = "Skipping failed audience ID";
                                                if (!list.isEmpty()) {
                                                    c4070j6 = new C4070J6(this, null);
                                                    c2390a4 = new C2390a();
                                                    it4 = list.iterator();
                                                    while (it4.hasNext()) {
                                                        zzhsVar = (zzhs) it4.next();
                                                        zzhsVarM18535a = c4070j6.m18535a(this.f15720d, zzhsVar);
                                                        if (zzhsVarM18535a != null) {
                                                            c4317q6 = this.f15465b;
                                                            c4007cM19034Z = c4317q6.m18898F0().m19034Z(this.f15720d, zzhsVar, zzhsVarM18535a.zzd());
                                                            c4317q6.m18898F0().m19055w0(c4007cM19034Z);
                                                            if (!z7) {
                                                                j7 = c4007cM19034Z.f15129c;
                                                                strZzd = zzhsVarM18535a.zzd();
                                                                map5 = (Map) c2390a4.get(strZzd);
                                                                if (map5 == null) {
                                                                    c4342uM18898F0 = c4317q6.m18898F0();
                                                                    str9 = this.f15720d;
                                                                    c4342uM18898F0.m18696j();
                                                                    c4342uM18898F0.mo18427h();
                                                                    AbstractC3718s.m18077f(str9);
                                                                    AbstractC3718s.m18077f(strZzd);
                                                                    c2390a5 = new C2390a();
                                                                    str7 = str4;
                                                                    str8 = str5;
                                                                    c4007c = c4007cM19034Z;
                                                                    cursorQuery2 = c4342uM18898F0.m19051u0().query("event_filters", new String[]{str8, str7}, "app_id=? AND event_name=?", new String[]{str9, strZzd}, null, null, null);
                                                                    if (cursorQuery2.moveToFirst()) {
                                                                        j8 = j7;
                                                                        do {
                                                                            zzff zzffVar5 = (zzff) ((zzfe) C4349u6.m19071W(zzff.zzn(), cursorQuery2.getBlob(1))).zzbc();
                                                                            numValueOf2 = Integer.valueOf(cursorQuery2.getInt(0));
                                                                            arrayList2 = (List) c2390a5.get(numValueOf2);
                                                                            if (arrayList2 == null) {
                                                                                arrayList2 = new ArrayList();
                                                                                c2390a5.put(numValueOf2, arrayList2);
                                                                            }
                                                                            arrayList2.add(zzffVar5);
                                                                        } while (cursorQuery2.moveToNext());
                                                                        cursorQuery2.close();
                                                                        map5 = c2390a5;
                                                                    } else {
                                                                        j8 = j7;
                                                                        map5 = Collections.EMPTY_MAP;
                                                                        cursorQuery2.close();
                                                                    }
                                                                    c2390a4.put(strZzd, map5);
                                                                } else {
                                                                    c4007c = c4007cM19034Z;
                                                                    j8 = j7;
                                                                    str7 = str4;
                                                                    str8 = str5;
                                                                }
                                                                while (r6.hasNext()) {
                                                                    iIntValue = num3.intValue();
                                                                    if (this.f15721e.contains(num3)) {
                                                                        this.f15066a.mo18421a().m18859w().m18835b("Skipping failed audience ID", num3);
                                                                    } else {
                                                                        it5 = ((List) map5.get(num3)).iterator();
                                                                        zM18693k = true;
                                                                        while (true) {
                                                                            if (!it5.hasNext()) {
                                                                                map6 = map5;
                                                                                break;
                                                                            }
                                                                            zzff zzffVar6 = (zzff) it5.next();
                                                                            c4190b = new C4190b(this, this.f15720d, iIntValue, zzffVar6);
                                                                            map6 = map5;
                                                                            zM18693k = c4190b.m18693k(this.f15723g, this.f15724h, zzhsVarM18535a, j8, c4007c, m18722o(iIntValue, zzffVar6.zzb()));
                                                                            if (!zM18693k) {
                                                                                this.f15721e.add(num3);
                                                                                break;
                                                                            }
                                                                            m18721n(num3).m18532a(c4190b);
                                                                            map5 = map6;
                                                                        }
                                                                        if (!zM18693k) {
                                                                            this.f15721e.add(num3);
                                                                        }
                                                                        map5 = map6;
                                                                    }
                                                                }
                                                                str4 = str7;
                                                                str5 = str8;
                                                                c4070j6 = c4070j6;
                                                                it4 = it4;
                                                            }
                                                        }
                                                    }
                                                }
                                                str10 = str4;
                                                str11 = str5;
                                                if (!z7) {
                                                    return new ArrayList();
                                                }
                                                if (!list2.isEmpty()) {
                                                    c2390a6 = new C2390a();
                                                    it6 = list2.iterator();
                                                    while (it6.hasNext()) {
                                                        zziu zziuVar2 = (zziu) it6.next();
                                                        strZzc = zziuVar2.zzc();
                                                        map7 = (Map) c2390a6.get(strZzc);
                                                        if (map7 == null) {
                                                            c4342uM18898F2 = this.f15465b.m18898F0();
                                                            str14 = this.f15720d;
                                                            c4342uM18898F2.m18696j();
                                                            c4342uM18898F2.mo18427h();
                                                            AbstractC3718s.m18077f(str14);
                                                            AbstractC3718s.m18077f(strZzc);
                                                            c2390a7 = new C2390a();
                                                            cursorQuery3 = c4342uM18898F2.m19051u0().query("property_filters", new String[]{str11, str10}, "app_id=? AND property_name=?", new String[]{str14, strZzc}, null, null, null);
                                                            if (cursorQuery3.moveToFirst()) {
                                                                while (true) {
                                                                    zzfn zzfnVar3 = (zzfn) ((zzfm) C4349u6.m19071W(zzfn.zzi(), cursorQuery3.getBlob(1))).zzbc();
                                                                    numValueOf5 = Integer.valueOf(cursorQuery3.getInt(0));
                                                                    list5 = (List) c2390a7.get(numValueOf5);
                                                                    if (list5 == null) {
                                                                        str13 = str10;
                                                                        arrayList4 = new ArrayList();
                                                                        c2390a7.put(numValueOf5, arrayList4);
                                                                    } else {
                                                                        str13 = str10;
                                                                        arrayList4 = list5;
                                                                    }
                                                                    arrayList4.add(zzfnVar3);
                                                                    if (!cursorQuery3.moveToNext()) {
                                                                        break;
                                                                        break;
                                                                    }
                                                                    it6 = it6;
                                                                    str10 = str13;
                                                                }
                                                                cursorQuery3.close();
                                                                map7 = c2390a7;
                                                            } else {
                                                                str13 = str10;
                                                                it6 = it6;
                                                                map7 = Collections.EMPTY_MAP;
                                                                cursorQuery3.close();
                                                            }
                                                            c2390a6.put(strZzc, map7);
                                                        } else {
                                                            str13 = str10;
                                                            it6 = it6;
                                                        }
                                                        while (r3.hasNext()) {
                                                            int iIntValue5 = num4.intValue();
                                                            if (this.f15721e.contains(num4)) {
                                                                this.f15066a.mo18421a().m18859w().m18835b(str6, num4);
                                                                break;
                                                                break;
                                                            }
                                                            it7 = ((List) map7.get(num4)).iterator();
                                                            zM18711k = true;
                                                            while (true) {
                                                                if (it7.hasNext()) {
                                                                    zzfnVar = (zzfn) it7.next();
                                                                    c4164x2 = this.f15066a;
                                                                    if (Log.isLoggable(c4164x2.mo18421a().m18861z(), 2)) {
                                                                        C4297o2 c4297o2M18859w3 = c4164x2.mo18421a().m18859w();
                                                                        if (zzfnVar.zza()) {
                                                                            numValueOf4 = Integer.valueOf(zzfnVar.zzb());
                                                                        } else {
                                                                            numValueOf4 = null;
                                                                        }
                                                                        c4297o2M18859w3.m18837d("Evaluating filter. audience, filter, property", num4, numValueOf4, c4164x2.m18662D().m18777c(zzfnVar.zzc()));
                                                                        c4164x2.mo18421a().m18859w().m18835b("Filter definition", this.f15465b.m18903K0().m19092M(zzfnVar));
                                                                    }
                                                                    if (zzfnVar.zza()) {
                                                                    }
                                                                    C4297o2 c4297o2M18854r3 = c4164x2.mo18421a().m18854r();
                                                                    Object objM18846x3 = C4313q2.m18846x(this.f15720d);
                                                                    if (zzfnVar.zza()) {
                                                                        numValueOf3 = Integer.valueOf(zzfnVar.zzb());
                                                                    } else {
                                                                        numValueOf3 = null;
                                                                    }
                                                                    c4297o2M18854r3.m18836c("Invalid property filter ID. appId, id", objM18846x3, String.valueOf(numValueOf3));
                                                                    this.f15721e.add(num4);
                                                                    map7 = map7;
                                                                    str6 = str6;
                                                                } else {
                                                                    map7 = map7;
                                                                    str6 = str6;
                                                                }
                                                                if (!zM18711k) {
                                                                    this.f15721e.add(num4);
                                                                }
                                                                map7 = map7;
                                                                str6 = str6;
                                                                m18721n(num4).m18532a(c4206d);
                                                                map7 = map7;
                                                                str6 = str6;
                                                            }
                                                        }
                                                        it6 = it6;
                                                        str10 = str13;
                                                    }
                                                }
                                                arrayList3 = new ArrayList();
                                                Set<Integer> setKeySet2 = this.f15722f.keySet();
                                                setKeySet2.removeAll(this.f15721e);
                                                while (r3.hasNext()) {
                                                    int iIntValue6 = num5.intValue();
                                                    C4062I6 c4062i7 = (C4062I6) this.f15722f.get(num5);
                                                    AbstractC3718s.m18083l(c4062i7);
                                                    zzhg zzhgVarM18533b2 = c4062i7.m18533b(iIntValue6);
                                                    arrayList3.add(zzhgVarM18533b2);
                                                    c4342uM18898F1 = this.f15465b.m18898F0();
                                                    str12 = this.f15720d;
                                                    zzii zziiVarZzc2 = zzhgVarM18533b2.zzc();
                                                    c4342uM18898F1.m18696j();
                                                    c4342uM18898F1.mo18427h();
                                                    AbstractC3718s.m18077f(str12);
                                                    AbstractC3718s.m18083l(zziiVarZzc2);
                                                    byte[] bArrZzcc2 = zziiVarZzc2.zzcc();
                                                    contentValues = new ContentValues();
                                                    contentValues.put("app_id", str12);
                                                    contentValues.put(str11, num5);
                                                    contentValues.put("current_results", bArrZzcc2);
                                                    if (c4342uM18898F1.m19051u0().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                                        c4342uM18898F1.f15066a.mo18421a().m18851o().m18835b("Failed to insert filter results (got -1). appId", C4313q2.m18846x(str12));
                                                    }
                                                }
                                                return arrayList3;
                                            }
                                        }
                                        try {
                                            if (!cursorQuery.moveToNext()) {
                                                break;
                                            }
                                            z8 = z9;
                                            str16 = str2;
                                            str17 = str17;
                                        } catch (SQLiteException e26) {
                                            e = e26;
                                            c4342uM18898F5.f15066a.mo18421a().m18851o().m18836c("Database error querying filter results. appId", C4313q2.m18846x(str19), e);
                                            Map map14 = Collections.EMPTY_MAP;
                                            if (cursorQuery != null) {
                                                cursorQuery.close();
                                            }
                                            map2 = map14;
                                        }
                                    }
                                    cursorQuery.close();
                                    map2 = c2390a8;
                                } else {
                                    Map map15 = Collections.EMPTY_MAP;
                                    cursorQuery.close();
                                    map2 = map15;
                                    z9 = z8;
                                    str2 = "data";
                                    str17 = "audience_id";
                                }
                            } catch (Throwable th7) {
                                th = th7;
                                cursor = cursorQuery;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                throw th;
                            }
                        } catch (SQLiteException e27) {
                            e = e27;
                            z9 = z8;
                            str2 = "data";
                        }
                        if (!map2.isEmpty()) {
                            hashSet = new HashSet(map2.keySet());
                            if (z9) {
                                String str21 = this.f15720d;
                                C4342u c4342uM18898F7 = this.f15465b.m18898F0();
                                str3 = this.f15720d;
                                c4342uM18898F7.m18696j();
                                c4342uM18898F7.mo18427h();
                                AbstractC3718s.m18077f(str3);
                                c2390a2 = new C2390a();
                                sQLiteDatabaseM19051u0 = c4342uM18898F7.m19051u0();
                                cursorRawQuery = sQLiteDatabaseM19051u0.rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str3, str3});
                                if (cursorRawQuery.moveToFirst()) {
                                    do {
                                        numValueOf = Integer.valueOf(cursorRawQuery.getInt(0));
                                        arrayList = (List) c2390a2.get(numValueOf);
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                            c2390a2.put(numValueOf, arrayList);
                                        }
                                        arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                                    } while (cursorRawQuery.moveToNext());
                                } else {
                                    c2390a2 = Collections.EMPTY_MAP;
                                }
                                cursorRawQuery.close();
                                AbstractC3718s.m18077f(str21);
                                AbstractC3718s.m18083l(map2);
                                c2390a3 = new C2390a();
                                if (!map2.isEmpty()) {
                                    it2 = map2.keySet().iterator();
                                    while (it2.hasNext()) {
                                        num = (Integer) it2.next();
                                        num.intValue();
                                        zziiVar3 = (zzii) map2.get(num);
                                        list4 = (List) c2390a2.get(num);
                                        if (list4 != null) {
                                        }
                                        map4 = c2390a2;
                                        hashSet3 = hashSet;
                                        it3 = it2;
                                        c2390a3.put(num, zziiVar3);
                                        c2390a2 = map4;
                                        hashSet = hashSet3;
                                        it2 = it3;
                                    }
                                }
                                hashSet2 = hashSet;
                                map3 = c2390a3;
                            } else {
                                hashSet2 = hashSet;
                                map3 = map2;
                            }
                            while (r16.hasNext()) {
                                num2.intValue();
                                zziiVar = (zzii) map3.get(num2);
                                bitSet = new BitSet();
                                bitSet2 = new BitSet();
                                c2390a = new C2390a();
                                if (zziiVar != null) {
                                    while (r7.hasNext()) {
                                        if (zzhqVar.zza()) {
                                            Map map16 = map3;
                                            Integer numValueOf9 = Integer.valueOf(zzhqVar.zzb());
                                            if (zzhqVar.zzc()) {
                                                lValueOf = Long.valueOf(zzhqVar.zzd());
                                            } else {
                                                lValueOf = null;
                                            }
                                            c2390a.put(numValueOf9, lValueOf);
                                            map3 = map16;
                                        }
                                    }
                                }
                                Map map17 = map3;
                                C2390a c2390a12 = new C2390a();
                                if (zziiVar != null) {
                                    it = zziiVar.zzg().iterator();
                                    while (it.hasNext()) {
                                        zzikVar = (zzik) it.next();
                                        if (!zzikVar.zza()) {
                                        }
                                    }
                                }
                                zziiVar2 = zziiVar;
                                if (zziiVar2 != null) {
                                    i9 = 0;
                                    while (i9 < zziiVar2.zzb() * 64) {
                                        if (C4349u6.m19069P(zziiVar2.zza(), i9)) {
                                            z10 = zM18800H;
                                            this.f15066a.mo18421a().m18859w().m18836c("Filter already evaluated. audience ID, filter ID", num2, Integer.valueOf(i9));
                                            bitSet2.set(i9);
                                            if (C4349u6.m19069P(zziiVar2.zzc(), i9)) {
                                                bitSet.set(i9);
                                            }
                                            i9++;
                                            zM18800H = z10;
                                        } else {
                                            z10 = zM18800H;
                                        }
                                        c2390a.remove(Integer.valueOf(i9));
                                        i9++;
                                        zM18800H = z10;
                                    }
                                }
                                boolean z13 = zM18800H;
                                zzii zziiVar6 = (zzii) map2.get(num2);
                                if (!zM18800H2) {
                                }
                                this.f15722f.put(num2, new C4062I6(this, this.f15720d, zziiVar6, bitSet, bitSet2, c2390a, c2390a12, null));
                                zM18800H = z13;
                                map3 = map17;
                            }
                        }
                        str4 = str2;
                        str5 = str17;
                        str6 = "Skipping failed audience ID";
                        if (!list.isEmpty()) {
                            c4070j6 = new C4070J6(this, null);
                            c2390a4 = new C2390a();
                            it4 = list.iterator();
                            while (it4.hasNext()) {
                                zzhsVar = (zzhs) it4.next();
                                zzhsVarM18535a = c4070j6.m18535a(this.f15720d, zzhsVar);
                                if (zzhsVarM18535a != null) {
                                    c4317q6 = this.f15465b;
                                    c4007cM19034Z = c4317q6.m18898F0().m19034Z(this.f15720d, zzhsVar, zzhsVarM18535a.zzd());
                                    c4317q6.m18898F0().m19055w0(c4007cM19034Z);
                                    if (!z7) {
                                        j7 = c4007cM19034Z.f15129c;
                                        strZzd = zzhsVarM18535a.zzd();
                                        map5 = (Map) c2390a4.get(strZzd);
                                        if (map5 == null) {
                                            c4342uM18898F0 = c4317q6.m18898F0();
                                            str9 = this.f15720d;
                                            c4342uM18898F0.m18696j();
                                            c4342uM18898F0.mo18427h();
                                            AbstractC3718s.m18077f(str9);
                                            AbstractC3718s.m18077f(strZzd);
                                            c2390a5 = new C2390a();
                                            str7 = str4;
                                            str8 = str5;
                                            c4007c = c4007cM19034Z;
                                            cursorQuery2 = c4342uM18898F0.m19051u0().query("event_filters", new String[]{str8, str7}, "app_id=? AND event_name=?", new String[]{str9, strZzd}, null, null, null);
                                            if (cursorQuery2.moveToFirst()) {
                                                j8 = j7;
                                                do {
                                                    zzff zzffVar7 = (zzff) ((zzfe) C4349u6.m19071W(zzff.zzn(), cursorQuery2.getBlob(1))).zzbc();
                                                    numValueOf2 = Integer.valueOf(cursorQuery2.getInt(0));
                                                    arrayList2 = (List) c2390a5.get(numValueOf2);
                                                    if (arrayList2 == null) {
                                                        arrayList2 = new ArrayList();
                                                        c2390a5.put(numValueOf2, arrayList2);
                                                    }
                                                    arrayList2.add(zzffVar7);
                                                } while (cursorQuery2.moveToNext());
                                                cursorQuery2.close();
                                                map5 = c2390a5;
                                            } else {
                                                j8 = j7;
                                                map5 = Collections.EMPTY_MAP;
                                                cursorQuery2.close();
                                            }
                                            c2390a4.put(strZzd, map5);
                                        } else {
                                            c4007c = c4007cM19034Z;
                                            j8 = j7;
                                            str7 = str4;
                                            str8 = str5;
                                        }
                                        while (r6.hasNext()) {
                                            iIntValue = num3.intValue();
                                            if (this.f15721e.contains(num3)) {
                                                this.f15066a.mo18421a().m18859w().m18835b("Skipping failed audience ID", num3);
                                            } else {
                                                it5 = ((List) map5.get(num3)).iterator();
                                                zM18693k = true;
                                                while (true) {
                                                    if (!it5.hasNext()) {
                                                        map6 = map5;
                                                        break;
                                                    }
                                                    zzff zzffVar8 = (zzff) it5.next();
                                                    c4190b = new C4190b(this, this.f15720d, iIntValue, zzffVar8);
                                                    map6 = map5;
                                                    zM18693k = c4190b.m18693k(this.f15723g, this.f15724h, zzhsVarM18535a, j8, c4007c, m18722o(iIntValue, zzffVar8.zzb()));
                                                    if (!zM18693k) {
                                                        this.f15721e.add(num3);
                                                        break;
                                                    }
                                                    m18721n(num3).m18532a(c4190b);
                                                    map5 = map6;
                                                }
                                                if (!zM18693k) {
                                                    this.f15721e.add(num3);
                                                }
                                                map5 = map6;
                                            }
                                        }
                                        str4 = str7;
                                        str5 = str8;
                                        c4070j6 = c4070j6;
                                        it4 = it4;
                                    }
                                }
                            }
                        }
                        str10 = str4;
                        str11 = str5;
                        if (!z7) {
                            return new ArrayList();
                        }
                        if (!list2.isEmpty()) {
                            c2390a6 = new C2390a();
                            it6 = list2.iterator();
                            while (it6.hasNext()) {
                                zziu zziuVar3 = (zziu) it6.next();
                                strZzc = zziuVar3.zzc();
                                map7 = (Map) c2390a6.get(strZzc);
                                if (map7 == null) {
                                    c4342uM18898F2 = this.f15465b.m18898F0();
                                    str14 = this.f15720d;
                                    c4342uM18898F2.m18696j();
                                    c4342uM18898F2.mo18427h();
                                    AbstractC3718s.m18077f(str14);
                                    AbstractC3718s.m18077f(strZzc);
                                    c2390a7 = new C2390a();
                                    cursorQuery3 = c4342uM18898F2.m19051u0().query("property_filters", new String[]{str11, str10}, "app_id=? AND property_name=?", new String[]{str14, strZzc}, null, null, null);
                                    if (cursorQuery3.moveToFirst()) {
                                        while (true) {
                                            zzfn zzfnVar4 = (zzfn) ((zzfm) C4349u6.m19071W(zzfn.zzi(), cursorQuery3.getBlob(1))).zzbc();
                                            numValueOf5 = Integer.valueOf(cursorQuery3.getInt(0));
                                            list5 = (List) c2390a7.get(numValueOf5);
                                            if (list5 == null) {
                                                str13 = str10;
                                                arrayList4 = new ArrayList();
                                                c2390a7.put(numValueOf5, arrayList4);
                                            } else {
                                                str13 = str10;
                                                arrayList4 = list5;
                                            }
                                            arrayList4.add(zzfnVar4);
                                            if (!cursorQuery3.moveToNext()) {
                                                break;
                                                break;
                                            }
                                            it6 = it6;
                                            str10 = str13;
                                        }
                                        cursorQuery3.close();
                                        map7 = c2390a7;
                                    } else {
                                        str13 = str10;
                                        it6 = it6;
                                        map7 = Collections.EMPTY_MAP;
                                        cursorQuery3.close();
                                    }
                                    c2390a6.put(strZzc, map7);
                                } else {
                                    str13 = str10;
                                    it6 = it6;
                                }
                                while (r3.hasNext()) {
                                    int iIntValue7 = num4.intValue();
                                    if (this.f15721e.contains(num4)) {
                                        this.f15066a.mo18421a().m18859w().m18835b(str6, num4);
                                        break;
                                        break;
                                    }
                                    it7 = ((List) map7.get(num4)).iterator();
                                    zM18711k = true;
                                    while (true) {
                                        if (it7.hasNext()) {
                                            zzfnVar = (zzfn) it7.next();
                                            c4164x2 = this.f15066a;
                                            if (Log.isLoggable(c4164x2.mo18421a().m18861z(), 2)) {
                                                C4297o2 c4297o2M18859w4 = c4164x2.mo18421a().m18859w();
                                                if (zzfnVar.zza()) {
                                                    numValueOf4 = Integer.valueOf(zzfnVar.zzb());
                                                } else {
                                                    numValueOf4 = null;
                                                }
                                                c4297o2M18859w4.m18837d("Evaluating filter. audience, filter, property", num4, numValueOf4, c4164x2.m18662D().m18777c(zzfnVar.zzc()));
                                                c4164x2.mo18421a().m18859w().m18835b("Filter definition", this.f15465b.m18903K0().m19092M(zzfnVar));
                                            }
                                            if (zzfnVar.zza()) {
                                            }
                                            C4297o2 c4297o2M18854r4 = c4164x2.mo18421a().m18854r();
                                            Object objM18846x4 = C4313q2.m18846x(this.f15720d);
                                            if (zzfnVar.zza()) {
                                                numValueOf3 = Integer.valueOf(zzfnVar.zzb());
                                            } else {
                                                numValueOf3 = null;
                                            }
                                            c4297o2M18854r4.m18836c("Invalid property filter ID. appId, id", objM18846x4, String.valueOf(numValueOf3));
                                            this.f15721e.add(num4);
                                            map7 = map7;
                                            str6 = str6;
                                        } else {
                                            map7 = map7;
                                            str6 = str6;
                                        }
                                        if (!zM18711k) {
                                            this.f15721e.add(num4);
                                        }
                                        map7 = map7;
                                        str6 = str6;
                                        m18721n(num4).m18532a(c4206d);
                                        map7 = map7;
                                        str6 = str6;
                                    }
                                }
                                it6 = it6;
                                str10 = str13;
                            }
                        }
                        arrayList3 = new ArrayList();
                        Set<Integer> setKeySet3 = this.f15722f.keySet();
                        setKeySet3.removeAll(this.f15721e);
                        while (r3.hasNext()) {
                            int iIntValue8 = num5.intValue();
                            C4062I6 c4062i8 = (C4062I6) this.f15722f.get(num5);
                            AbstractC3718s.m18083l(c4062i8);
                            zzhg zzhgVarM18533b3 = c4062i8.m18533b(iIntValue8);
                            arrayList3.add(zzhgVarM18533b3);
                            c4342uM18898F1 = this.f15465b.m18898F0();
                            str12 = this.f15720d;
                            zzii zziiVarZzc3 = zzhgVarM18533b3.zzc();
                            c4342uM18898F1.m18696j();
                            c4342uM18898F1.mo18427h();
                            AbstractC3718s.m18077f(str12);
                            AbstractC3718s.m18083l(zziiVarZzc3);
                            byte[] bArrZzcc3 = zziiVarZzc3.zzcc();
                            contentValues = new ContentValues();
                            contentValues.put("app_id", str12);
                            contentValues.put(str11, num5);
                            contentValues.put("current_results", bArrZzcc3);
                            if (c4342uM18898F1.m19051u0().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                c4342uM18898F1.f15066a.mo18421a().m18851o().m18835b("Failed to insert filter results (got -1). appId", C4313q2.m18846x(str12));
                            }
                        }
                        return arrayList3;
                    }
                } catch (Throwable th8) {
                    th = th8;
                    if (cursorQuery4 != null) {
                        cursorQuery4.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e28) {
                e = e28;
                cursorQuery4 = null;
            } catch (Throwable th9) {
                th = th9;
                cursorQuery4 = null;
                if (cursorQuery4 != null) {
                    cursorQuery4.close();
                }
                throw th;
            }
        } else {
            map = map8;
        }
        C4342u c4342uM18898F8 = this.f15465b.m18898F0();
        String str110 = this.f15720d;
        c4342uM18898F8.m18696j();
        c4342uM18898F8.mo18427h();
        AbstractC3718s.m18077f(str110);
        try {
            cursorQuery = c4342uM18898F8.m19051u0().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{str110}, null, null, null);
            if (cursorQuery.moveToFirst()) {
                Map map18 = Collections.EMPTY_MAP;
                cursorQuery.close();
                map2 = map18;
                z9 = z8;
                str2 = "data";
                str17 = "audience_id";
            } else {
                c2390a8 = new C2390a();
                while (true) {
                    i10 = cursorQuery.getInt(0);
                    c2390a8.put(Integer.valueOf(i10), (zzii) ((zzih) C4349u6.m19071W(zzii.zzi(), cursorQuery.getBlob(1))).zzbc());
                    z9 = z8;
                    str2 = str16;
                    if (!cursorQuery.moveToNext()) {
                        break;
                        break;
                    }
                    z8 = z9;
                    str16 = str2;
                    str17 = str17;
                }
                cursorQuery.close();
                map2 = c2390a8;
            }
        } catch (SQLiteException e29) {
            e = e29;
            z9 = z8;
            str2 = "data";
            str17 = "audience_id";
            cursorQuery = null;
        } catch (Throwable th10) {
            th = th10;
            cursor = null;
        }
        if (!map2.isEmpty()) {
            hashSet = new HashSet(map2.keySet());
            if (z9) {
                String str22 = this.f15720d;
                C4342u c4342uM18898F9 = this.f15465b.m18898F0();
                str3 = this.f15720d;
                c4342uM18898F9.m18696j();
                c4342uM18898F9.mo18427h();
                AbstractC3718s.m18077f(str3);
                c2390a2 = new C2390a();
                sQLiteDatabaseM19051u0 = c4342uM18898F9.m19051u0();
                cursorRawQuery = sQLiteDatabaseM19051u0.rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str3, str3});
                if (cursorRawQuery.moveToFirst()) {
                    do {
                        numValueOf = Integer.valueOf(cursorRawQuery.getInt(0));
                        arrayList = (List) c2390a2.get(numValueOf);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            c2390a2.put(numValueOf, arrayList);
                        }
                        arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                    } while (cursorRawQuery.moveToNext());
                } else {
                    c2390a2 = Collections.EMPTY_MAP;
                }
                cursorRawQuery.close();
                AbstractC3718s.m18077f(str22);
                AbstractC3718s.m18083l(map2);
                c2390a3 = new C2390a();
                if (!map2.isEmpty()) {
                    it2 = map2.keySet().iterator();
                    while (it2.hasNext()) {
                        num = (Integer) it2.next();
                        num.intValue();
                        zziiVar3 = (zzii) map2.get(num);
                        list4 = (List) c2390a2.get(num);
                        if (list4 != null || list4.isEmpty()) {
                            map4 = c2390a2;
                            hashSet3 = hashSet;
                            it3 = it2;
                            c2390a3.put(num, zziiVar3);
                            c2390a2 = map4;
                            hashSet = hashSet3;
                            it2 = it3;
                        } else {
                            C4317q6 c4317q7 = this.f15465b;
                            map4 = c2390a2;
                            hashSet3 = hashSet;
                            List listM19094R = c4317q7.m18903K0().m19094R(zziiVar3.zzc(), list4);
                            if (listM19094R.isEmpty()) {
                                c2390a2 = map4;
                                hashSet = hashSet3;
                            } else {
                                zzih zzihVar = (zzih) zziiVar3.zzcl();
                                zzihVar.zzd();
                                zzihVar.zzc(listM19094R);
                                List listM19094R2 = c4317q7.m18903K0().m19094R(zziiVar3.zza(), list4);
                                zzihVar.zzb();
                                zzihVar.zza(listM19094R2);
                                ArrayList arrayList6 = new ArrayList();
                                Iterator it9 = zziiVar3.zze().iterator();
                                while (it9.hasNext()) {
                                    Iterator it10 = it2;
                                    zzhq zzhqVar2 = (zzhq) it9.next();
                                    Iterator it11 = it9;
                                    if (!list4.contains(Integer.valueOf(zzhqVar2.zzb()))) {
                                        arrayList6.add(zzhqVar2);
                                    }
                                    it2 = it10;
                                    it9 = it11;
                                }
                                it3 = it2;
                                zzihVar.zzf();
                                zzihVar.zze(arrayList6);
                                ArrayList arrayList7 = new ArrayList();
                                for (zzik zzikVar2 : zziiVar3.zzg()) {
                                    if (!list4.contains(Integer.valueOf(zzikVar2.zzb()))) {
                                        arrayList7.add(zzikVar2);
                                    }
                                }
                                zzihVar.zzh();
                                zzihVar.zzg(arrayList7);
                                c2390a3.put(num, (zzii) zzihVar.zzbc());
                                c2390a2 = map4;
                                hashSet = hashSet3;
                                it2 = it3;
                            }
                        }
                    }
                }
                hashSet2 = hashSet;
                map3 = c2390a3;
            } else {
                hashSet2 = hashSet;
                map3 = map2;
            }
            while (r16.hasNext()) {
                num2.intValue();
                zziiVar = (zzii) map3.get(num2);
                bitSet = new BitSet();
                bitSet2 = new BitSet();
                c2390a = new C2390a();
                if (zziiVar != null && zziiVar.zzf() != 0) {
                    while (r7.hasNext()) {
                        if (zzhqVar.zza()) {
                            Map map19 = map3;
                            Integer numValueOf10 = Integer.valueOf(zzhqVar.zzb());
                            if (zzhqVar.zzc()) {
                                lValueOf = Long.valueOf(zzhqVar.zzd());
                            } else {
                                lValueOf = null;
                            }
                            c2390a.put(numValueOf10, lValueOf);
                            map3 = map19;
                        }
                    }
                }
                Map map110 = map3;
                C2390a c2390a13 = new C2390a();
                if (zziiVar != null && zziiVar.zzh() != 0) {
                    it = zziiVar.zzg().iterator();
                    while (it.hasNext()) {
                        zzikVar = (zzik) it.next();
                        if (!zzikVar.zza() && zzikVar.zzd() > 0) {
                            c2390a13.put(Integer.valueOf(zzikVar.zzb()), Long.valueOf(zzikVar.zze(zzikVar.zzd() - 1)));
                            it = it;
                            zziiVar = zziiVar;
                        }
                    }
                }
                zziiVar2 = zziiVar;
                if (zziiVar2 != null) {
                    i9 = 0;
                    while (i9 < zziiVar2.zzb() * 64) {
                        if (C4349u6.m19069P(zziiVar2.zza(), i9)) {
                            z10 = zM18800H;
                            this.f15066a.mo18421a().m18859w().m18836c("Filter already evaluated. audience ID, filter ID", num2, Integer.valueOf(i9));
                            bitSet2.set(i9);
                            if (C4349u6.m19069P(zziiVar2.zzc(), i9)) {
                                bitSet.set(i9);
                            }
                            i9++;
                            zM18800H = z10;
                        } else {
                            z10 = zM18800H;
                        }
                        c2390a.remove(Integer.valueOf(i9));
                        i9++;
                        zM18800H = z10;
                    }
                }
                boolean z14 = zM18800H;
                zzii zziiVar7 = (zzii) map2.get(num2);
                if (!zM18800H2 && z14 && (list3 = (List) map.get(num2)) != null && this.f15724h != null && this.f15723g != null) {
                    Iterator it12 = list3.iterator();
                    while (it12.hasNext()) {
                        zzff zzffVar9 = (zzff) it12.next();
                        int iZzb = zzffVar9.zzb();
                        Iterator it13 = it12;
                        long jLongValue = this.f15724h.longValue() / 1000;
                        if (zzffVar9.zzj()) {
                            jLongValue = this.f15723g.longValue() / 1000;
                        }
                        Integer numValueOf11 = Integer.valueOf(iZzb);
                        if (c2390a.containsKey(numValueOf11)) {
                            c2390a.put(numValueOf11, Long.valueOf(jLongValue));
                        }
                        if (c2390a13.containsKey(numValueOf11)) {
                            c2390a13.put(numValueOf11, Long.valueOf(jLongValue));
                        }
                        it12 = it13;
                    }
                }
                this.f15722f.put(num2, new C4062I6(this, this.f15720d, zziiVar7, bitSet, bitSet2, c2390a, c2390a13, null));
                zM18800H = z14;
                map3 = map110;
            }
        }
        str4 = str2;
        str5 = str17;
        str6 = "Skipping failed audience ID";
        if (!list.isEmpty()) {
            c4070j6 = new C4070J6(this, null);
            c2390a4 = new C2390a();
            it4 = list.iterator();
            while (it4.hasNext()) {
                zzhsVar = (zzhs) it4.next();
                zzhsVarM18535a = c4070j6.m18535a(this.f15720d, zzhsVar);
                if (zzhsVarM18535a != null) {
                    c4317q6 = this.f15465b;
                    c4007cM19034Z = c4317q6.m18898F0().m19034Z(this.f15720d, zzhsVar, zzhsVarM18535a.zzd());
                    c4317q6.m18898F0().m19055w0(c4007cM19034Z);
                    if (!z7) {
                        j7 = c4007cM19034Z.f15129c;
                        strZzd = zzhsVarM18535a.zzd();
                        map5 = (Map) c2390a4.get(strZzd);
                        if (map5 == null) {
                            c4342uM18898F0 = c4317q6.m18898F0();
                            str9 = this.f15720d;
                            c4342uM18898F0.m18696j();
                            c4342uM18898F0.mo18427h();
                            AbstractC3718s.m18077f(str9);
                            AbstractC3718s.m18077f(strZzd);
                            c2390a5 = new C2390a();
                            str7 = str4;
                            str8 = str5;
                            c4007c = c4007cM19034Z;
                            cursorQuery2 = c4342uM18898F0.m19051u0().query("event_filters", new String[]{str8, str7}, "app_id=? AND event_name=?", new String[]{str9, strZzd}, null, null, null);
                            if (cursorQuery2.moveToFirst()) {
                                j8 = j7;
                                do {
                                    zzff zzffVar10 = (zzff) ((zzfe) C4349u6.m19071W(zzff.zzn(), cursorQuery2.getBlob(1))).zzbc();
                                    numValueOf2 = Integer.valueOf(cursorQuery2.getInt(0));
                                    arrayList2 = (List) c2390a5.get(numValueOf2);
                                    if (arrayList2 == null) {
                                        arrayList2 = new ArrayList();
                                        c2390a5.put(numValueOf2, arrayList2);
                                    }
                                    arrayList2.add(zzffVar10);
                                } while (cursorQuery2.moveToNext());
                                cursorQuery2.close();
                                map5 = c2390a5;
                            } else {
                                j8 = j7;
                                map5 = Collections.EMPTY_MAP;
                                cursorQuery2.close();
                            }
                            c2390a4.put(strZzd, map5);
                        } else {
                            c4007c = c4007cM19034Z;
                            j8 = j7;
                            str7 = str4;
                            str8 = str5;
                        }
                        while (r6.hasNext()) {
                            iIntValue = num3.intValue();
                            if (this.f15721e.contains(num3)) {
                                this.f15066a.mo18421a().m18859w().m18835b("Skipping failed audience ID", num3);
                            } else {
                                it5 = ((List) map5.get(num3)).iterator();
                                zM18693k = true;
                                while (true) {
                                    if (!it5.hasNext()) {
                                        map6 = map5;
                                        break;
                                    }
                                    zzff zzffVar11 = (zzff) it5.next();
                                    c4190b = new C4190b(this, this.f15720d, iIntValue, zzffVar11);
                                    map6 = map5;
                                    zM18693k = c4190b.m18693k(this.f15723g, this.f15724h, zzhsVarM18535a, j8, c4007c, m18722o(iIntValue, zzffVar11.zzb()));
                                    if (!zM18693k) {
                                        this.f15721e.add(num3);
                                        break;
                                    }
                                    m18721n(num3).m18532a(c4190b);
                                    map5 = map6;
                                }
                                if (!zM18693k) {
                                    this.f15721e.add(num3);
                                }
                                map5 = map6;
                            }
                        }
                        str4 = str7;
                        str5 = str8;
                        c4070j6 = c4070j6;
                        it4 = it4;
                    }
                }
            }
        }
        str10 = str4;
        str11 = str5;
        if (!z7) {
            return new ArrayList();
        }
        if (!list2.isEmpty()) {
            c2390a6 = new C2390a();
            it6 = list2.iterator();
            while (it6.hasNext()) {
                zziu zziuVar4 = (zziu) it6.next();
                strZzc = zziuVar4.zzc();
                map7 = (Map) c2390a6.get(strZzc);
                if (map7 == null) {
                    c4342uM18898F2 = this.f15465b.m18898F0();
                    str14 = this.f15720d;
                    c4342uM18898F2.m18696j();
                    c4342uM18898F2.mo18427h();
                    AbstractC3718s.m18077f(str14);
                    AbstractC3718s.m18077f(strZzc);
                    c2390a7 = new C2390a();
                    cursorQuery3 = c4342uM18898F2.m19051u0().query("property_filters", new String[]{str11, str10}, "app_id=? AND property_name=?", new String[]{str14, strZzc}, null, null, null);
                    if (cursorQuery3.moveToFirst()) {
                        while (true) {
                            zzfn zzfnVar5 = (zzfn) ((zzfm) C4349u6.m19071W(zzfn.zzi(), cursorQuery3.getBlob(1))).zzbc();
                            numValueOf5 = Integer.valueOf(cursorQuery3.getInt(0));
                            list5 = (List) c2390a7.get(numValueOf5);
                            if (list5 == null) {
                                str13 = str10;
                                arrayList4 = new ArrayList();
                                c2390a7.put(numValueOf5, arrayList4);
                            } else {
                                str13 = str10;
                                arrayList4 = list5;
                            }
                            arrayList4.add(zzfnVar5);
                            if (!cursorQuery3.moveToNext()) {
                                break;
                                break;
                            }
                            it6 = it6;
                            str10 = str13;
                        }
                        cursorQuery3.close();
                        map7 = c2390a7;
                    } else {
                        str13 = str10;
                        it6 = it6;
                        map7 = Collections.EMPTY_MAP;
                        cursorQuery3.close();
                    }
                    c2390a6.put(strZzc, map7);
                } else {
                    str13 = str10;
                    it6 = it6;
                }
                while (r3.hasNext()) {
                    int iIntValue9 = num4.intValue();
                    if (this.f15721e.contains(num4)) {
                        this.f15066a.mo18421a().m18859w().m18835b(str6, num4);
                        break;
                        break;
                    }
                    it7 = ((List) map7.get(num4)).iterator();
                    zM18711k = true;
                    while (true) {
                        if (it7.hasNext()) {
                            zzfnVar = (zzfn) it7.next();
                            c4164x2 = this.f15066a;
                            if (Log.isLoggable(c4164x2.mo18421a().m18861z(), 2)) {
                                C4297o2 c4297o2M18859w5 = c4164x2.mo18421a().m18859w();
                                if (zzfnVar.zza()) {
                                    numValueOf4 = Integer.valueOf(zzfnVar.zzb());
                                } else {
                                    numValueOf4 = null;
                                }
                                c4297o2M18859w5.m18837d("Evaluating filter. audience, filter, property", num4, numValueOf4, c4164x2.m18662D().m18777c(zzfnVar.zzc()));
                                c4164x2.mo18421a().m18859w().m18835b("Filter definition", this.f15465b.m18903K0().m19092M(zzfnVar));
                            }
                            if (zzfnVar.zza() || zzfnVar.zzb() > 256) {
                                C4297o2 c4297o2M18854r5 = c4164x2.mo18421a().m18854r();
                                Object objM18846x5 = C4313q2.m18846x(this.f15720d);
                                if (zzfnVar.zza()) {
                                    numValueOf3 = Integer.valueOf(zzfnVar.zzb());
                                } else {
                                    numValueOf3 = null;
                                }
                                c4297o2M18854r5.m18836c("Invalid property filter ID. appId, id", objM18846x5, String.valueOf(numValueOf3));
                                this.f15721e.add(num4);
                                map7 = map7;
                                str6 = str6;
                            } else {
                                c4206d = new C4206d(this, this.f15720d, iIntValue9, zzfnVar);
                                zM18711k = c4206d.m18711k(this.f15723g, this.f15724h, zziuVar4, m18722o(iIntValue9, zzfnVar.zzb()));
                                if (zM18711k) {
                                    m18721n(num4).m18532a(c4206d);
                                    map7 = map7;
                                    str6 = str6;
                                } else {
                                    this.f15721e.add(num4);
                                }
                            }
                        } else {
                            map7 = map7;
                            str6 = str6;
                        }
                        if (!zM18711k) {
                            this.f15721e.add(num4);
                        }
                        map7 = map7;
                        str6 = str6;
                    }
                }
                it6 = it6;
                str10 = str13;
            }
        }
        arrayList3 = new ArrayList();
        Set<Integer> setKeySet4 = this.f15722f.keySet();
        setKeySet4.removeAll(this.f15721e);
        while (r3.hasNext()) {
            int iIntValue10 = num5.intValue();
            C4062I6 c4062i9 = (C4062I6) this.f15722f.get(num5);
            AbstractC3718s.m18083l(c4062i9);
            zzhg zzhgVarM18533b4 = c4062i9.m18533b(iIntValue10);
            arrayList3.add(zzhgVarM18533b4);
            c4342uM18898F1 = this.f15465b.m18898F0();
            str12 = this.f15720d;
            zzii zziiVarZzc4 = zzhgVarM18533b4.zzc();
            c4342uM18898F1.m18696j();
            c4342uM18898F1.mo18427h();
            AbstractC3718s.m18077f(str12);
            AbstractC3718s.m18083l(zziiVarZzc4);
            byte[] bArrZzcc4 = zziiVarZzc4.zzcc();
            contentValues = new ContentValues();
            contentValues.put("app_id", str12);
            contentValues.put(str11, num5);
            contentValues.put("current_results", bArrZzcc4);
            if (c4342uM18898F1.m19051u0().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                c4342uM18898F1.f15066a.mo18421a().m18851o().m18835b("Failed to insert filter results (got -1). appId", C4313q2.m18846x(str12));
            }
        }
        return arrayList3;
    }
}
