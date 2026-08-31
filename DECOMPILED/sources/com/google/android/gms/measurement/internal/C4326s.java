package com.google.android.gms.measurement.internal;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.internal.measurement.zzhr;
import com.google.android.gms.internal.measurement.zzhs;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.s */
/* JADX INFO: loaded from: classes2.dex */
public final class C4326s {

    /* JADX INFO: renamed from: a */
    private final String f16035a;

    /* JADX INFO: renamed from: b */
    private long f16036b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C4342u f16037c;

    public C4326s(C4342u c4342u, String str) {
        Objects.requireNonNull(c4342u);
        this.f16037c = c4342u;
        AbstractC3718s.m18077f(str);
        this.f16035a = str;
        this.f16036b = -1L;
    }

    /* JADX INFO: renamed from: a */
    public final List m18961a() {
        List arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = this.f16037c.m19051u0().query("raw_events", new String[]{"rowid", "name", "timestamp", "metadata_fingerprint", "data", "realtime"}, "app_id = ? and rowid > ?", new String[]{this.f16035a, String.valueOf(this.f16036b)}, null, null, "rowid", "1000");
                if (cursorQuery.moveToFirst()) {
                    do {
                        long j7 = cursorQuery.getLong(0);
                        long j8 = cursorQuery.getLong(3);
                        boolean z7 = cursorQuery.getLong(5) == 1;
                        byte[] blob = cursorQuery.getBlob(4);
                        if (j7 > this.f16036b) {
                            this.f16036b = j7;
                        }
                        try {
                            zzhr zzhrVar = (zzhr) C4349u6.m19071W(zzhs.zzk(), blob);
                            String string = cursorQuery.getString(1);
                            if (string == null) {
                                string = "";
                            }
                            zzhrVar.zzl(string);
                            zzhrVar.zzo(cursorQuery.getLong(2));
                            arrayList.add(new C4318r(j7, j8, z7, (zzhs) zzhrVar.zzbc()));
                        } catch (IOException e7) {
                            this.f16037c.f15066a.mo18421a().m18851o().m18836c("Data loss. Failed to merge raw event. appId", C4313q2.m18846x(this.f16035a), e7);
                        }
                    } while (cursorQuery.moveToNext());
                } else {
                    arrayList = Collections.EMPTY_LIST;
                }
            } catch (SQLiteException e8) {
                this.f16037c.f15066a.mo18421a().m18851o().m18836c("Data loss. Error querying raw events batch. appId", C4313q2.m18846x(this.f16035a), e8);
            }
            return arrayList;
        } finally {
            if (0 != 0) {
                cursorQuery.close();
            }
        }
    }

    public C4326s(C4342u c4342u, String str, long j7) {
        Objects.requireNonNull(c4342u);
        this.f16037c = c4342u;
        AbstractC3718s.m18077f(str);
        this.f16035a = str;
        this.f16036b = c4342u.m19036b0("select rowid from raw_events where app_id = ? and timestamp < ? order by rowid desc limit 1", new String[]{str, String.valueOf(j7)}, -1L);
    }
}
