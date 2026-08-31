package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.internal.ads.zzbbn;
import com.google.android.gms.internal.measurement.zzfc;
import com.google.android.gms.internal.measurement.zzfd;
import com.google.android.gms.internal.measurement.zzfe;
import com.google.android.gms.internal.measurement.zzff;
import com.google.android.gms.internal.measurement.zzfg;
import com.google.android.gms.internal.measurement.zzfh;
import com.google.android.gms.internal.measurement.zzfm;
import com.google.android.gms.internal.measurement.zzfn;
import com.google.android.gms.internal.measurement.zzhr;
import com.google.android.gms.internal.measurement.zzhs;
import com.google.android.gms.internal.measurement.zzhw;
import com.google.android.gms.internal.measurement.zzhz;
import com.google.android.gms.internal.measurement.zzib;
import com.google.android.gms.internal.measurement.zzic;
import com.google.android.gms.internal.measurement.zzid;
import com.google.android.gms.internal.measurement.zziu;
import com.google.android.gms.internal.measurement.zzpr;
import com.google.android.gms.internal.measurement.zzqp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import p283k3.AbstractC6025H;
import p283k3.AbstractC6052w;
import p283k3.AbstractC6053x;
import p283k3.AbstractC6054y;
import p283k3.C6027J;
import p283k3.EnumC6024G;
import p283k3.EnumC6051v;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.u */
/* JADX INFO: loaded from: classes2.dex */
final class C4342u extends AbstractC4197b6 {

    /* JADX INFO: renamed from: f */
    private static final String[] f16085f = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};

    /* JADX INFO: renamed from: g */
    static final String[] f16086g = {"associated_row_id", "ALTER TABLE upload_queue ADD COLUMN associated_row_id INTEGER;", "last_upload_timestamp", "ALTER TABLE upload_queue ADD COLUMN last_upload_timestamp INTEGER;"};

    /* JADX INFO: renamed from: h */
    private static final String[] f16087h = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};

    /* JADX INFO: renamed from: i */
    private static final String[] f16088i = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;", "ad_services_version", "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;", "unmatched_first_open_without_ad_id", "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;", "npa_metadata_value", "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;", "attribution_eligibility_status", "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;", "sgtm_preview_key", "ALTER TABLE apps ADD COLUMN sgtm_preview_key TEXT;", "dma_consent_state", "ALTER TABLE apps ADD COLUMN dma_consent_state INTEGER;", "daily_realtime_dcu_count", "ALTER TABLE apps ADD COLUMN daily_realtime_dcu_count INTEGER;", "bundle_delivery_index", "ALTER TABLE apps ADD COLUMN bundle_delivery_index INTEGER;", "serialized_npa_metadata", "ALTER TABLE apps ADD COLUMN serialized_npa_metadata TEXT;", "unmatched_pfo", "ALTER TABLE apps ADD COLUMN unmatched_pfo INTEGER;", "unmatched_uwa", "ALTER TABLE apps ADD COLUMN unmatched_uwa INTEGER;", "ad_campaign_info", "ALTER TABLE apps ADD COLUMN ad_campaign_info BLOB;", "daily_registered_triggers_count", "ALTER TABLE apps ADD COLUMN daily_registered_triggers_count INTEGER;", "client_upload_eligibility", "ALTER TABLE apps ADD COLUMN client_upload_eligibility INTEGER;", "gmp_version_for_remote_config", "ALTER TABLE apps ADD COLUMN gmp_version_for_remote_config INTEGER;"};

    /* JADX INFO: renamed from: j */
    private static final String[] f16089j = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};

    /* JADX INFO: renamed from: k */
    private static final String[] f16090k = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};

    /* JADX INFO: renamed from: l */
    private static final String[] f16091l = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* JADX INFO: renamed from: m */
    private static final String[] f16092m = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* JADX INFO: renamed from: n */
    private static final String[] f16093n = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

    /* JADX INFO: renamed from: o */
    private static final String[] f16094o = {"consent_source", "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;", "dma_consent_settings", "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;", "storage_consent_at_bundling", "ALTER TABLE consent_settings ADD COLUMN storage_consent_at_bundling TEXT;"};

    /* JADX INFO: renamed from: p */
    private static final String[] f16095p = {"idempotent", "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);"};

    /* JADX INFO: renamed from: d */
    private final C4334t f16096d;

    /* JADX INFO: renamed from: e */
    private final C4125R5 f16097e;

    C4342u(C4317q6 c4317q6) {
        super(c4317q6);
        this.f16097e = new C4125R5(this.f15066a.mo18425f());
        this.f15066a.m18686w();
        this.f16096d = new C4334t(this, this.f15066a.mo18424e(), "google_app_measurement.db");
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0034  */
    /* JADX INFO: renamed from: M */
    private final String m18981M(String str, String[] strArr, String str2) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = m19051u0().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    cursorRawQuery.close();
                    return "";
                }
                String string = cursorRawQuery.getString(0);
                cursorRawQuery.close();
                return string;
            } catch (SQLiteException e7) {
                this.f15066a.mo18421a().m18851o().m18836c("Database error", str, e7);
                throw e7;
            }
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
        if (cursorRawQuery != null) {
            cursorRawQuery.close();
        }
        throw th;
    }

    /* JADX INFO: renamed from: N */
    private final void m18982N(String str, String str2, ContentValues contentValues) {
        try {
            SQLiteDatabase sQLiteDatabaseM19051u0 = m19051u0();
            String asString = contentValues.getAsString("app_id");
            if (asString == null) {
                this.f15066a.mo18421a().m18853q().m18835b("Value of the primary key is not set.", C4313q2.m18846x("app_id"));
                return;
            }
            StringBuilder sb = new StringBuilder(10);
            sb.append("app_id");
            sb.append(" = ?");
            if (sQLiteDatabaseM19051u0.update("consent_settings", contentValues, sb.toString(), new String[]{asString}) == 0 && sQLiteDatabaseM19051u0.insertWithOnConflict("consent_settings", null, contentValues, 5) == -1) {
                this.f15066a.mo18421a().m18851o().m18836c("Failed to insert/update table (got -1). key", C4313q2.m18846x("consent_settings"), C4313q2.m18846x("app_id"));
            }
        } catch (SQLiteException e7) {
            this.f15066a.mo18421a().m18851o().m18837d("Error storing into table. key", C4313q2.m18846x("consent_settings"), C4313q2.m18846x("app_id"), e7);
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x012f  */
    /* JADX INFO: renamed from: O */
    private final C4007C m18983O(String str, String str2, String str3) throws Throwable {
        Cursor cursorQuery;
        Boolean boolValueOf;
        AbstractC3718s.m18077f(str2);
        AbstractC3718s.m18077f(str3);
        mo18427h();
        m18696j();
        Cursor cursor = null;
        try {
            cursorQuery = m19051u0().query(str, (String[]) new ArrayList(Arrays.asList("lifetime_count", "current_bundle_count", "last_fire_timestamp", "last_bundled_timestamp", "last_bundled_day", "last_sampled_complex_event_id", "last_sampling_rate", "last_exempt_from_sampling", "current_session_count")).toArray(new String[0]), "app_id=? and name=?", new String[]{str2, str3}, null, null, null);
            try {
                try {
                    if (cursorQuery.moveToFirst()) {
                        long j7 = cursorQuery.getLong(0);
                        long j8 = cursorQuery.getLong(1);
                        long j9 = cursorQuery.getLong(2);
                        long j10 = cursorQuery.isNull(3) ? 0L : cursorQuery.getLong(3);
                        Long lValueOf = cursorQuery.isNull(4) ? null : Long.valueOf(cursorQuery.getLong(4));
                        Long lValueOf2 = cursorQuery.isNull(5) ? null : Long.valueOf(cursorQuery.getLong(5));
                        Long lValueOf3 = cursorQuery.isNull(6) ? null : Long.valueOf(cursorQuery.getLong(6));
                        if (cursorQuery.isNull(7)) {
                            boolValueOf = null;
                        } else {
                            boolValueOf = Boolean.valueOf(cursorQuery.getLong(7) == 1);
                        }
                        C4007C c4007c = new C4007C(str2, str3, j7, j8, cursorQuery.isNull(8) ? 0L : cursorQuery.getLong(8), j9, j10, lValueOf, lValueOf2, lValueOf3, boolValueOf);
                        if (cursorQuery.moveToNext()) {
                            this.f15066a.mo18421a().m18851o().m18835b("Got multiple records for event aggregates, expected one. appId", C4313q2.m18846x(str2));
                        }
                        cursorQuery.close();
                        return c4007c;
                    }
                } catch (SQLiteException e7) {
                    e = e7;
                    C4164X2 c4164x2 = this.f15066a;
                    c4164x2.mo18421a().m18851o().m18837d("Error querying events. appId", C4313q2.m18846x(str2), c4164x2.m18662D().m18775a(str3), e);
                }
            } catch (Throwable th) {
                th = th;
                cursor = cursorQuery;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e8) {
            e = e8;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }

    /* JADX INFO: renamed from: P */
    private final void m18984P(String str, C4007C c4007c) {
        AbstractC3718s.m18083l(c4007c);
        mo18427h();
        m18696j();
        ContentValues contentValues = new ContentValues();
        String str2 = c4007c.f15127a;
        contentValues.put("app_id", str2);
        contentValues.put("name", c4007c.f15128b);
        contentValues.put("lifetime_count", Long.valueOf(c4007c.f15129c));
        contentValues.put("current_bundle_count", Long.valueOf(c4007c.f15130d));
        contentValues.put("last_fire_timestamp", Long.valueOf(c4007c.f15132f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(c4007c.f15133g));
        contentValues.put("last_bundled_day", c4007c.f15134h);
        contentValues.put("last_sampled_complex_event_id", c4007c.f15135i);
        contentValues.put("last_sampling_rate", c4007c.f15136j);
        contentValues.put("current_session_count", Long.valueOf(c4007c.f15131e));
        Boolean bool = c4007c.f15137k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (m19051u0().insertWithOnConflict(str, null, contentValues, 5) == -1) {
                this.f15066a.mo18421a().m18851o().m18835b("Failed to insert/update event aggregates (got -1). appId", C4313q2.m18846x(str2));
            }
        } catch (SQLiteException e7) {
            this.f15066a.mo18421a().m18851o().m18836c("Error storing event aggregates. appId", C4313q2.m18846x(c4007c.f15127a), e7);
        }
    }

    /* JADX INFO: renamed from: Q */
    private final void m18985Q(String str, String str2) {
        AbstractC3718s.m18077f(str2);
        mo18427h();
        m18696j();
        try {
            m19051u0().delete(str, "app_id=?", new String[]{str2});
        } catch (SQLiteException e7) {
            this.f15066a.mo18421a().m18851o().m18836c("Error deleting snapshot. appId", C4313q2.m18846x(str2), e7);
        }
    }

    /* JADX INFO: renamed from: R */
    private final C4341t6 m18986R(String str, long j7, byte[] bArr, String str2, String str3, int i7, int i8, long j8, long j9, long j10) {
        if (TextUtils.isEmpty(str2)) {
            this.f15066a.mo18421a().m18858v().m18834a("Upload uri is null or empty. Destination is unknown. Dropping batch. ");
            return null;
        }
        try {
            zzhz zzhzVar = (zzhz) C4349u6.m19071W(zzib.zzh(), bArr);
            EnumC6024G enumC6024GM27044c = EnumC6024G.m27044c(i7);
            if (enumC6024GM27044c != EnumC6024G.GOOGLE_SIGNAL && enumC6024GM27044c != EnumC6024G.GOOGLE_SIGNAL_PENDING && i8 > 0) {
                ArrayList arrayList = new ArrayList();
                Iterator it = zzhzVar.zza().iterator();
                while (it.hasNext()) {
                    zzic zzicVar = (zzic) ((zzid) it.next()).zzcl();
                    zzicVar.zzao(i8);
                    arrayList.add((zzid) zzicVar.zzbc());
                }
                zzhzVar.zzg();
                zzhzVar.zzf(arrayList);
            }
            HashMap map = new HashMap();
            if (str3 != null) {
                for (String str4 : str3.split("\r\n")) {
                    if (str4.isEmpty()) {
                        break;
                    }
                    String[] strArrSplit = str4.split("=", 2);
                    if (strArrSplit.length != 2) {
                        this.f15066a.mo18421a().m18851o().m18835b("Invalid upload header: ", str4);
                        break;
                    }
                    map.put(strArrSplit[0], strArrSplit[1]);
                }
            }
            C4333s6 c4333s6 = new C4333s6();
            c4333s6.m18963b(j7);
            c4333s6.m18964c((zzib) zzhzVar.zzbc());
            c4333s6.m18965d(str2);
            c4333s6.m18966e(map);
            c4333s6.m18967f(enumC6024GM27044c);
            c4333s6.m18968g(j8);
            c4333s6.m18969h(j9);
            c4333s6.m18970i(j10);
            c4333s6.m18971j(i8);
            return c4333s6.m18962a();
        } catch (IOException e7) {
            this.f15066a.mo18421a().m18851o().m18836c("Failed to queued MeasurementBatch from upload_queue. appId", str, e7);
            return null;
        }
    }

    /* JADX INFO: renamed from: S */
    private final String m18987S() {
        C4164X2 c4164x2 = this.f15066a;
        long jMo18159a = c4164x2.mo18425f().mo18159a();
        Locale locale = Locale.US;
        EnumC6024G enumC6024G = EnumC6024G.GOOGLE_SIGNAL;
        Integer numValueOf = Integer.valueOf(enumC6024G.zza());
        Long lValueOf = Long.valueOf(jMo18159a);
        c4164x2.m18686w();
        Long l7 = (Long) AbstractC4209d2.f15634T.m18706b(null);
        l7.longValue();
        String str = String.format(locale, "(upload_type = %d AND ABS(creation_timestamp - %d) > %d)", numValueOf, lValueOf, l7);
        Integer numValueOf2 = Integer.valueOf(enumC6024G.zza());
        c4164x2.m18686w();
        String str2 = String.format(locale, "(upload_type != %d AND ABS(creation_timestamp - %d) > %d)", numValueOf2, lValueOf, Long.valueOf(C4278m.m18790q()));
        StringBuilder sb = new StringBuilder(str.length() + 5 + str2.length() + 1);
        sb.append("(");
        sb.append(str);
        sb.append(" OR ");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: T */
    private static final String m18988T(List list) {
        return list.isEmpty() ? "" : String.format(" AND (upload_type IN (%s))", TextUtils.join(", ", list));
    }

    /* JADX INFO: renamed from: o0 */
    static final void m18999o0(ContentValues contentValues, String str, Object obj) {
        AbstractC3718s.m18077f("value");
        AbstractC3718s.m18083l(obj);
        if (obj instanceof String) {
            contentValues.put("value", (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else {
            if (!(obj instanceof Double)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            contentValues.put("value", (Double) obj);
        }
    }

    /* JADX INFO: renamed from: p0 */
    private final long m19000p0(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor cursorRawQuery = m19051u0().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                long j7 = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j7;
            } catch (SQLiteException e7) {
                this.f15066a.mo18421a().m18851o().m18836c("Database error", str, e7);
                throw e7;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: q0 */
    private final long m19001q0(String str, String[] strArr, long j7) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = m19051u0().rawQuery(str, strArr);
                if (cursorRawQuery.moveToFirst()) {
                    j7 = cursorRawQuery.getLong(0);
                }
                cursorRawQuery.close();
                return j7;
            } catch (SQLiteException e7) {
                this.f15066a.mo18421a().m18851o().m18836c("Database error", str, e7);
                throw e7;
            }
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: A */
    public final long m19002A() {
        return m19001q0("select max(timestamp) from raw_events", null, 0L);
    }

    /* JADX INFO: renamed from: A0 */
    public final boolean m19003A0(C4373x6 c4373x6) {
        AbstractC3718s.m18083l(c4373x6);
        mo18427h();
        m18696j();
        String str = c4373x6.f16228a;
        String str2 = c4373x6.f16230c;
        if (m19005B0(str, str2) == null) {
            if (C4389z6.m19366r0(str2)) {
                if (m19000p0("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{str}) >= this.f15066a.m18686w().m18798F(str, AbstractC4209d2.f15640W, 25, 100)) {
                    return false;
                }
            } else if (!"_npa".equals(str2)) {
                long jM19000p0 = m19000p0("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{str, c4373x6.f16229b});
                this.f15066a.m18686w();
                if (jM19000p0 >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", c4373x6.f16229b);
        contentValues.put("name", str2);
        contentValues.put("set_timestamp", Long.valueOf(c4373x6.f16231d));
        m18999o0(contentValues, "value", c4373x6.f16232e);
        try {
            if (m19051u0().insertWithOnConflict("user_attributes", null, contentValues, 5) != -1) {
                return true;
            }
            this.f15066a.mo18421a().m18851o().m18835b("Failed to insert/update user property (got -1). appId", C4313q2.m18846x(str));
            return true;
        } catch (SQLiteException e7) {
            this.f15066a.mo18421a().m18851o().m18836c("Error storing user property. appId", C4313q2.m18846x(c4373x6.f16228a), e7);
            return true;
        }
    }

    /* JADX INFO: renamed from: B */
    public final boolean m19004B() {
        return m19000p0("select count(1) > 0 from raw_events", null) != 0;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:43:? A[SYNTHETIC] */
    /* JADX INFO: renamed from: B0 */
    public final C4373x6 m19005B0(String str, String str2) {
        Throwable th;
        String str3;
        String str4;
        SQLiteException sQLiteException;
        Cursor cursorQuery;
        AbstractC3718s.m18077f(str);
        AbstractC3718s.m18077f(str2);
        mo18427h();
        m18696j();
        Cursor cursor = null;
        try {
            cursorQuery = m19051u0().query("user_attributes", new String[]{"set_timestamp", "value", "origin"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
            try {
                try {
                    if (cursorQuery.moveToFirst()) {
                        long j7 = cursorQuery.getLong(0);
                        Object objM19056x = m19056x(cursorQuery, 1);
                        if (objM19056x != null) {
                            str3 = str;
                            str4 = str2;
                            try {
                                C4373x6 c4373x6 = new C4373x6(str3, cursorQuery.getString(2), str4, j7, objM19056x);
                                if (cursorQuery.moveToNext()) {
                                    this.f15066a.mo18421a().m18851o().m18835b("Got multiple records for user property, expected one. appId", C4313q2.m18846x(str3));
                                }
                                cursorQuery.close();
                                return c4373x6;
                            } catch (SQLiteException e7) {
                                e = e7;
                            }
                        }
                        sQLiteException = e;
                        C4164X2 c4164x2 = this.f15066a;
                        c4164x2.mo18421a().m18851o().m18837d("Error querying user property. appId", C4313q2.m18846x(str3), c4164x2.m18662D().m18777c(str4), sQLiteException);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cursor = cursorQuery;
                    if (cursor != null) {
                        throw th;
                    }
                    cursor.close();
                    throw th;
                }
            } catch (SQLiteException e8) {
                e = e8;
                str3 = str;
                str4 = str2;
            }
        } catch (SQLiteException e9) {
            str3 = str;
            str4 = str2;
            sQLiteException = e9;
            cursorQuery = null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor != null) {
                throw th;
            }
            cursor.close();
            throw th;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }

    /* JADX INFO: renamed from: C */
    public final boolean m19006C(String str, String str2) {
        return m19000p0("select count(1) from raw_events where app_id = ? and name = ?", new String[]{str, str2}) > 0;
    }

    /* JADX INFO: renamed from: C0 */
    public final List m19007C0(String str) {
        String str2;
        AbstractC3718s.m18077f(str);
        mo18427h();
        m18696j();
        List arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                C4164X2 c4164x2 = this.f15066a;
                c4164x2.m18686w();
                cursorQuery = m19051u0().query("user_attributes", new String[]{"name", "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
                try {
                    if (cursorQuery.moveToFirst()) {
                        while (true) {
                            String string = cursorQuery.getString(0);
                            String string2 = cursorQuery.getString(1);
                            if (string2 == null) {
                                string2 = "";
                            }
                            String str3 = string2;
                            long j7 = cursorQuery.getLong(2);
                            Object objM19056x = m19056x(cursorQuery, 3);
                            if (objM19056x == null) {
                                c4164x2.mo18421a().m18851o().m18835b("Read invalid user property value, ignoring it. appId", C4313q2.m18846x(str));
                                str2 = str;
                            } else {
                                str2 = str;
                                arrayList.add(new C4373x6(str2, str3, string, j7, objM19056x));
                            }
                            try {
                                if (!cursorQuery.moveToNext()) {
                                    break;
                                }
                                str = str2;
                            } catch (SQLiteException e7) {
                                e = e7;
                                this.f15066a.mo18421a().m18851o().m18836c("Error querying user properties. appId", C4313q2.m18846x(str2), e);
                                arrayList = Collections.EMPTY_LIST;
                            }
                        }
                    }
                } catch (SQLiteException e8) {
                    e = e8;
                    str2 = str;
                }
            } catch (SQLiteException e9) {
                e = e9;
                str2 = str;
            }
            return arrayList;
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
    }

    /* JADX INFO: renamed from: D */
    public final boolean m19008D() {
        return m19000p0("select count(1) > 0 from raw_events where realtime = 1", null) != 0;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x013a  */
    /* JADX WARN: Code duplicated, block: B:53:0x0141  */
    /* JADX INFO: renamed from: D0 */
    public final List m19009D0(String str, String str2, String str3) throws Throwable {
        String str4;
        Cursor cursor;
        Cursor cursorQuery;
        String str5;
        AbstractC3718s.m18077f(str);
        mo18427h();
        m18696j();
        List arrayList = new ArrayList();
        try {
            try {
                ArrayList arrayList2 = new ArrayList(3);
                String str6 = str;
                arrayList2.add(str6);
                StringBuilder sb = new StringBuilder("app_id=?");
                if (TextUtils.isEmpty(str2)) {
                    str4 = str2;
                } else {
                    str4 = str2;
                    try {
                        arrayList2.add(str4);
                        sb.append(" and origin=?");
                    } catch (SQLiteException e7) {
                        e = e7;
                        cursor = null;
                        try {
                            this.f15066a.mo18421a().m18851o().m18837d("(2)Error querying user properties", C4313q2.m18846x(str), str4, e);
                            arrayList = Collections.EMPTY_LIST;
                            cursorQuery = cursor;
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            return arrayList;
                        } catch (Throwable th) {
                            th = th;
                            if (cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    }
                }
                if (!TextUtils.isEmpty(str3)) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 1);
                    sb2.append(str3);
                    sb2.append("*");
                    arrayList2.add(sb2.toString());
                    sb.append(" and name glob ?");
                }
                String[] strArr = (String[]) arrayList2.toArray(new String[arrayList2.size()]);
                String string = sb.toString();
                C4164X2 c4164x2 = this.f15066a;
                c4164x2.m18686w();
                cursorQuery = m19051u0().query("user_attributes", new String[]{"name", "set_timestamp", "value", "origin"}, string, strArr, null, null, "rowid", "1001");
                try {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            while (true) {
                                int size = arrayList.size();
                                c4164x2.m18686w();
                                if (size >= 1000) {
                                    C4297o2 c4297o2M18851o = c4164x2.mo18421a().m18851o();
                                    c4164x2.m18686w();
                                    c4297o2M18851o.m18835b("Read more than the max allowed user properties, ignoring excess", Integer.valueOf(zzbbn.zzq.zzf));
                                    break;
                                }
                                String string2 = cursorQuery.getString(0);
                                long j7 = cursorQuery.getLong(1);
                                Object objM19056x = m19056x(cursorQuery, 2);
                                String string3 = cursorQuery.getString(3);
                                if (objM19056x == null) {
                                    try {
                                        c4164x2.mo18421a().m18851o().m18837d("(2)Read invalid user property value, ignoring it", C4313q2.m18846x(str6), string3, str3);
                                        str5 = string3;
                                    } catch (SQLiteException e8) {
                                        e = e8;
                                        str5 = string3;
                                        cursor = cursorQuery;
                                        str4 = str5;
                                        this.f15066a.mo18421a().m18851o().m18837d("(2)Error querying user properties", C4313q2.m18846x(str), str4, e);
                                        arrayList = Collections.EMPTY_LIST;
                                        cursorQuery = cursor;
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        return arrayList;
                                    }
                                } else {
                                    str5 = string3;
                                    arrayList.add(new C4373x6(str6, str5, string2, j7, objM19056x));
                                }
                                try {
                                    if (!cursorQuery.moveToNext()) {
                                        break;
                                    }
                                    str6 = str;
                                    str4 = str5;
                                } catch (SQLiteException e9) {
                                    e = e9;
                                    cursor = cursorQuery;
                                    str4 = str5;
                                    this.f15066a.mo18421a().m18851o().m18837d("(2)Error querying user properties", C4313q2.m18846x(str), str4, e);
                                    arrayList = Collections.EMPTY_LIST;
                                    cursorQuery = cursor;
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = cursorQuery;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                } catch (SQLiteException e10) {
                    e = e10;
                    cursor = cursorQuery;
                }
            } catch (Throwable th3) {
                th = th3;
                cursor = null;
            }
        } catch (SQLiteException e11) {
            e = e11;
            str4 = str2;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: E */
    public final long m19010E(String str) {
        AbstractC3718s.m18077f(str);
        return m19001q0("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    /* JADX INFO: renamed from: E0 */
    public final boolean m19011E0(C4246i c4246i) {
        AbstractC3718s.m18083l(c4246i);
        mo18427h();
        m18696j();
        String str = c4246i.f15806a;
        AbstractC3718s.m18083l(str);
        if (m19005B0(str, c4246i.f15808c.f16124b) == null) {
            long jM19000p0 = m19000p0("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            this.f15066a.m18686w();
            if (jM19000p0 >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", c4246i.f15807b);
        contentValues.put("name", c4246i.f15808c.f16124b);
        m18999o0(contentValues, "value", AbstractC3718s.m18083l(c4246i.f15808c.zza()));
        contentValues.put("active", Boolean.valueOf(c4246i.f15810e));
        contentValues.put("trigger_event_name", c4246i.f15811f);
        contentValues.put("trigger_timeout", Long.valueOf(c4246i.f15813s));
        C4164X2 c4164x2 = this.f15066a;
        contentValues.put("timed_out_event", c4164x2.m18661C().m19384T(c4246i.f15812r));
        contentValues.put("creation_timestamp", Long.valueOf(c4246i.f15809d));
        contentValues.put("triggered_event", c4164x2.m18661C().m19384T(c4246i.f15814t));
        contentValues.put("triggered_timestamp", Long.valueOf(c4246i.f15808c.f16125c));
        contentValues.put("time_to_live", Long.valueOf(c4246i.f15815u));
        contentValues.put("expired_event", c4164x2.m18661C().m19384T(c4246i.f15816v));
        try {
            if (m19051u0().insertWithOnConflict("conditional_properties", null, contentValues, 5) != -1) {
                return true;
            }
            c4164x2.mo18421a().m18851o().m18835b("Failed to insert/update conditional user property (got -1)", C4313q2.m18846x(str));
            return true;
        } catch (SQLiteException e7) {
            this.f15066a.mo18421a().m18851o().m18836c("Error storing conditional user property", C4313q2.m18846x(str), e7);
            return true;
        }
    }

    /* JADX INFO: renamed from: F */
    public final boolean m19012F(String str, Long l7, long j7, zzhs zzhsVar) {
        mo18427h();
        m18696j();
        AbstractC3718s.m18083l(zzhsVar);
        AbstractC3718s.m18077f(str);
        AbstractC3718s.m18083l(l7);
        C4164X2 c4164x2 = this.f15066a;
        byte[] bArrZzcc = zzhsVar.zzcc();
        c4164x2.mo18421a().m18859w().m18836c("Saving complex main event, appId, data size", c4164x2.m18662D().m18775a(str), Integer.valueOf(bArrZzcc.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l7);
        contentValues.put("children_to_process", Long.valueOf(j7));
        contentValues.put("main_event", bArrZzcc);
        try {
            if (m19051u0().insertWithOnConflict("main_event_params", null, contentValues, 5) != -1) {
                return true;
            }
            c4164x2.mo18421a().m18851o().m18835b("Failed to insert complex main event (got -1). appId", C4313q2.m18846x(str));
            return false;
        } catch (SQLiteException e7) {
            this.f15066a.mo18421a().m18851o().m18836c("Error storing complex main event. appId", C4313q2.m18846x(str), e7);
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x011b  */
    /* JADX WARN: Code duplicated, block: B:39:0x0121  */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x00f6: MOVE (r8 I:??[OBJECT, ARRAY]) = (r9 I:??[OBJECT, ARRAY]), block:B:29:0x00f6 */
    /* JADX INFO: renamed from: F0 */
    public final C4246i m19013F0(String str, String str2) throws Throwable {
        String str3;
        Cursor cursorQuery;
        Cursor cursor;
        AbstractC3718s.m18077f(str);
        AbstractC3718s.m18077f(str2);
        mo18427h();
        m18696j();
        Cursor cursor2 = null;
        try {
            try {
                cursorQuery = m19051u0().query("conditional_properties", new String[]{"origin", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
                try {
                    if (!cursorQuery.moveToFirst()) {
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        return null;
                    }
                    String string = cursorQuery.getString(0);
                    if (string == null) {
                        string = "";
                    }
                    String str4 = string;
                    Object objM19056x = m19056x(cursorQuery, 1);
                    boolean z7 = cursorQuery.getInt(2) != 0;
                    String string2 = cursorQuery.getString(3);
                    long j7 = cursorQuery.getLong(4);
                    C4317q6 c4317q6 = this.f15465b;
                    C4349u6 c4349u6M18903K0 = c4317q6.m18903K0();
                    byte[] blob = cursorQuery.getBlob(5);
                    Parcelable.Creator<C4039G> creator = C4039G.CREATOR;
                    C4039G c4039g = (C4039G) c4349u6M18903K0.m19093N(blob, creator);
                    str3 = str2;
                    try {
                        C4246i c4246i = new C4246i(str, str4, new C4357v6(str3, cursorQuery.getLong(8), objM19056x, str4), cursorQuery.getLong(6), z7, string2, c4039g, j7, (C4039G) c4317q6.m18903K0().m19093N(cursorQuery.getBlob(7), creator), cursorQuery.getLong(9), (C4039G) c4317q6.m18903K0().m19093N(cursorQuery.getBlob(10), creator));
                        if (cursorQuery.moveToNext()) {
                            C4164X2 c4164x2 = this.f15066a;
                            c4164x2.mo18421a().m18851o().m18836c("Got multiple records for conditional property, expected one", C4313q2.m18846x(str), c4164x2.m18662D().m18777c(str3));
                        }
                        cursorQuery.close();
                        return c4246i;
                    } catch (SQLiteException e7) {
                        e = e7;
                    }
                } catch (SQLiteException e8) {
                    e = e8;
                    str3 = str2;
                }
            } catch (Throwable th) {
                th = th;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SQLiteException e9) {
            e = e9;
            str3 = str2;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
        C4164X2 c4164x3 = this.f15066a;
        c4164x3.mo18421a().m18851o().m18837d("Error querying conditional property", C4313q2.m18846x(str), c4164x3.m18662D().m18777c(str3), e);
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0087  */
    /* JADX WARN: Not initialized variable reg: 1, insn: 0x006a: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:19:0x006a */
    /* JADX INFO: renamed from: G */
    public final Bundle m19014G(String str) throws Throwable {
        Cursor cursorRawQuery;
        Cursor cursor;
        mo18427h();
        m18696j();
        Cursor cursor2 = null;
        try {
            try {
                cursorRawQuery = m19051u0().rawQuery("select parameters from default_event_params where app_id=?", new String[]{str});
                try {
                    if (cursorRawQuery.moveToFirst()) {
                        try {
                            zzhs zzhsVar = (zzhs) ((zzhr) C4349u6.m19071W(zzhs.zzk(), cursorRawQuery.getBlob(0))).zzbc();
                            this.f15465b.m18903K0();
                            Bundle bundleM19076q = C4349u6.m19076q(zzhsVar.zza());
                            cursorRawQuery.close();
                            return bundleM19076q;
                        } catch (IOException e7) {
                            this.f15066a.mo18421a().m18851o().m18836c("Failed to retrieve default event parameters. appId", C4313q2.m18846x(str), e7);
                        }
                    } else {
                        this.f15066a.mo18421a().m18859w().m18834a("Default event parameters not found");
                    }
                } catch (SQLiteException e8) {
                    e = e8;
                    this.f15066a.mo18421a().m18851o().m18835b("Error selecting default event parameters", e);
                }
            } catch (Throwable th) {
                th = th;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SQLiteException e9) {
            e = e9;
            cursorRawQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
        if (cursorRawQuery != null) {
            cursorRawQuery.close();
        }
        return null;
    }

    /* JADX INFO: renamed from: G0 */
    public final int m19015G0(String str, String str2) {
        AbstractC3718s.m18077f(str);
        AbstractC3718s.m18077f(str2);
        mo18427h();
        m18696j();
        try {
            return m19051u0().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e7) {
            C4164X2 c4164x2 = this.f15066a;
            c4164x2.mo18421a().m18851o().m18837d("Error deleting conditional property", C4313q2.m18846x(str), c4164x2.m18662D().m18777c(str2), e7);
            return 0;
        }
    }

    /* JADX INFO: renamed from: H */
    final boolean m19016H(String str, long j7) {
        try {
            return m19001q0("select count(*) from raw_events where app_id=? and timestamp >= ? and name not like '!_%' escape '!' limit 1;", new String[]{str, String.valueOf(j7)}, 0L) <= 0 && m19001q0("select count(*) from raw_events where app_id=? and timestamp >= ? and name like '!_%' escape '!' limit 1;", new String[]{str, String.valueOf(j7)}, 0L) > 0;
        } catch (SQLiteException e7) {
            this.f15066a.mo18421a().m18851o().m18835b("Error checking backfill conditions", e7);
            return false;
        }
    }

    /* JADX INFO: renamed from: H0 */
    public final List m19017H0(String str, String str2, String str3) {
        AbstractC3718s.m18077f(str);
        mo18427h();
        m18696j();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb.append(" and name glob ?");
        }
        return m19019I0(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX WARN: Code duplicated, block: B:115:0x011e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:0x011e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x002e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:? A[LOOP:2: B:51:0x0104->B:120:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:53:0x010a  */
    /* JADX WARN: Failed to analyze thrown exceptions
    java.util.ConcurrentModificationException
    	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1095)
    	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:1049)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:117)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:178)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
     */
    /* JADX INFO: renamed from: I */
    public final void m19018I(String str, Long l7, String str2, Bundle bundle) {
        C4164X2 c4164x2;
        Bundle bundle2;
        C3999B c3999b;
        long j7;
        String str3;
        ContentValues contentValues;
        zzid zzidVar;
        Iterator it;
        String str4 = str;
        AbstractC3718s.m18083l(bundle);
        mo18427h();
        m18696j();
        C4326s c4326s = l7 != null ? new C4326s(this, str4, l7.longValue()) : new C4326s(this, str4);
        List<C4318r> listM18961a = c4326s.m18961a();
        while (!listM18961a.isEmpty()) {
            for (C4318r c4318r : listM18961a) {
                try {
                    if (!TextUtils.isEmpty(str2)) {
                        Cursor cursor = null;
                        zzid zzidVar2 = null;
                        Cursor cursor2 = null;
                        try {
                            try {
                                Cursor cursorQuery = m19051u0().query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{str4, Long.toString(c4318r.f16020b)}, null, null, "rowid", "2");
                                try {
                                    try {
                                        if (cursorQuery.moveToFirst()) {
                                            try {
                                                zzidVar = (zzid) ((zzic) C4349u6.m19071W(zzid.zzaE(), cursorQuery.getBlob(0))).zzbc();
                                                try {
                                                    if (cursorQuery.moveToNext()) {
                                                        this.f15066a.mo18421a().m18854r().m18835b("Get multiple raw event metadata records, expected one. appId", C4313q2.m18846x(str4));
                                                    }
                                                    cursorQuery.close();
                                                    cursorQuery.close();
                                                } catch (SQLiteException e7) {
                                                    e = e7;
                                                    cursor2 = cursorQuery;
                                                    this.f15066a.mo18421a().m18851o().m18836c("Data loss. Error selecting raw event. appId", C4313q2.m18846x(str4), e);
                                                    if (cursor2 != null) {
                                                        cursor2.close();
                                                    }
                                                }
                                                zzidVar2 = zzidVar;
                                            } catch (IOException e8) {
                                                this.f15066a.mo18421a().m18851o().m18836c("Data loss. Failed to merge raw event metadata. appId", C4313q2.m18846x(str4), e8);
                                                cursorQuery.close();
                                            }
                                            if (zzidVar2 != null) {
                                                it = zzidVar2.zzf().iterator();
                                                while (true) {
                                                    if (it.hasNext()) {
                                                        if (((zziu) it.next()).zzc().equals(str2)) {
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            this.f15066a.mo18421a().m18851o().m18835b("Raw event metadata record is missing. appId", C4313q2.m18846x(str4));
                                        }
                                        cursorQuery.close();
                                    } catch (Throwable th) {
                                        th = th;
                                        cursor = cursorQuery;
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                        throw th;
                                    }
                                } catch (SQLiteException e9) {
                                    e = e9;
                                    zzidVar = null;
                                }
                            } catch (SQLiteException e10) {
                                e = e10;
                                zzidVar = null;
                            }
                            if (zzidVar2 != null) {
                                it = zzidVar2.zzf().iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        if (((zziu) it.next()).zzc().equals(str2)) {
                                        }
                                    }
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                    long jUpdate = m19051u0().update("raw_events", contentValues, "rowid = ?", new String[]{String.valueOf(j7)});
                    if (jUpdate != 1) {
                        c4164x2.mo18421a().m18851o().m18836c("Failed to update raw event. appId, updatedRows", C4313q2.m18846x(str3), Long.valueOf(jUpdate));
                    }
                } catch (SQLiteException e11) {
                    this.f15066a.mo18421a().m18851o().m18836c("Error updating raw event. appId", C4313q2.m18846x(c3999b.f15080a), e11);
                }
                C4317q6 c4317q6 = this.f15465b;
                C4349u6 c4349u6M18903K0 = c4317q6.m18903K0();
                zzhs zzhsVar = c4318r.f16022d;
                Bundle bundle3 = new Bundle();
                for (zzhw zzhwVar : zzhsVar.zza()) {
                    if (zzhwVar.zzi()) {
                        bundle3.putDouble(zzhwVar.zzb(), zzhwVar.zzj());
                    } else if (zzhwVar.zzg()) {
                        bundle3.putFloat(zzhwVar.zzb(), zzhwVar.zzh());
                    } else if (zzhwVar.zze()) {
                        bundle3.putLong(zzhwVar.zzb(), zzhwVar.zzf());
                    } else if (zzhwVar.zzc()) {
                        bundle3.putString(zzhwVar.zzb(), zzhwVar.zzd());
                    } else if (zzhwVar.zzk().isEmpty()) {
                        c4349u6M18903K0.f15066a.mo18421a().m18851o().m18835b("Unexpected parameter type for parameter", zzhwVar);
                    } else {
                        bundle3.putParcelableArray(zzhwVar.zzb(), C4349u6.m19073Y(zzhwVar.zzk()));
                    }
                }
                String string = bundle3.getString("_o");
                bundle3.remove("_o");
                String strZzd = zzhsVar.zzd();
                if (string == null) {
                    string = "";
                }
                C4321r2 c4321r2 = new C4321r2(strZzd, string, bundle3, zzhsVar.zzf());
                c4164x2 = this.f15066a;
                Bundle bundle4 = c4321r2.f16028d;
                String str5 = c4321r2.f16025a;
                C4389z6 c4389z6M18661C = c4164x2.m18661C();
                if (str5.equals("_cmp")) {
                    bundle2 = new Bundle(bundle);
                    for (String str6 : bundle.keySet()) {
                        C4317q6 c4317q7 = c4317q6;
                        if (str6.startsWith("gad_")) {
                            bundle2.remove(str6);
                        }
                        c4317q6 = c4317q7;
                    }
                } else {
                    bundle2 = bundle;
                }
                C4317q6 c4317q8 = c4317q6;
                c4389z6M18661C.m19413w(bundle4, bundle2);
                c3999b = new C3999B(this.f15066a, c4321r2.f16026b, str4, zzhsVar.zzd(), zzhsVar.zzf(), zzhsVar.zzh(), bundle4);
                j7 = c4318r.f16019a;
                long j8 = c4318r.f16020b;
                boolean z7 = c4318r.f16021c;
                mo18427h();
                m18696j();
                AbstractC3718s.m18083l(c3999b);
                str3 = c3999b.f15080a;
                AbstractC3718s.m18077f(str3);
                byte[] bArrZzcc = c4317q8.m18903K0().m19089J(c3999b).zzcc();
                contentValues = new ContentValues();
                contentValues.put("app_id", str3);
                contentValues.put("name", c3999b.f15081b);
                contentValues.put("timestamp", Long.valueOf(c3999b.f15083d));
                contentValues.put("metadata_fingerprint", Long.valueOf(j8));
                contentValues.put("data", bArrZzcc);
                contentValues.put("realtime", Integer.valueOf(z7 ? 1 : 0));
                str4 = str;
            }
            listM18961a = c4326s.m18961a();
            str4 = str;
        }
    }

    /* JADX INFO: renamed from: I0 */
    public final List m19019I0(String str, String[] strArr) {
        mo18427h();
        m18696j();
        List arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                C4164X2 c4164x2 = this.f15066a;
                c4164x2.m18686w();
                cursorQuery = m19051u0().query("conditional_properties", new String[]{"app_id", "origin", "name", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, str, strArr, null, null, "rowid", "1001");
                if (cursorQuery.moveToFirst()) {
                    do {
                        int size = arrayList.size();
                        c4164x2.m18686w();
                        if (size >= 1000) {
                            C4297o2 c4297o2M18851o = c4164x2.mo18421a().m18851o();
                            c4164x2.m18686w();
                            c4297o2M18851o.m18835b("Read more than the max allowed conditional properties, ignoring extra", Integer.valueOf(zzbbn.zzq.zzf));
                            break;
                        }
                        String string = cursorQuery.getString(0);
                        String string2 = cursorQuery.getString(1);
                        String string3 = cursorQuery.getString(2);
                        Object objM19056x = m19056x(cursorQuery, 3);
                        boolean z7 = cursorQuery.getInt(4) != 0;
                        String string4 = cursorQuery.getString(5);
                        long j7 = cursorQuery.getLong(6);
                        C4317q6 c4317q6 = this.f15465b;
                        C4349u6 c4349u6M18903K0 = c4317q6.m18903K0();
                        byte[] blob = cursorQuery.getBlob(7);
                        Parcelable.Creator<C4039G> creator = C4039G.CREATOR;
                        C4039G c4039g = (C4039G) c4349u6M18903K0.m19093N(blob, creator);
                        arrayList.add(new C4246i(string, string2, new C4357v6(string3, cursorQuery.getLong(10), objM19056x, string2), cursorQuery.getLong(8), z7, string4, c4039g, j7, (C4039G) c4317q6.m18903K0().m19093N(cursorQuery.getBlob(9), creator), cursorQuery.getLong(11), (C4039G) c4317q6.m18903K0().m19093N(cursorQuery.getBlob(12), creator)));
                    } while (cursorQuery.moveToNext());
                }
            } catch (SQLiteException e7) {
                this.f15066a.mo18421a().m18851o().m18835b("Error querying conditional user property value", e7);
                arrayList = Collections.EMPTY_LIST;
            }
            return arrayList;
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0060  */
    /* JADX WARN: Code duplicated, block: B:26:0x0063 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x0066  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v8, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v9, types: [android.database.Cursor] */
    /* JADX INFO: renamed from: J */
    public final C4027E3 m19020J(String str) {
        Throwable th;
        SQLiteException e7;
        AbstractC3718s.m18083l(str);
        mo18427h();
        m18696j();
        ?? RawQuery = {str};
        ?? r7 = 0;
        c4027e3M18502f = null;
        c4027e3M18502f = null;
        C4027E3 c4027e3M18502f = null;
        try {
            try {
                RawQuery = m19051u0().rawQuery("select consent_state, consent_source from consent_settings where app_id=? limit 1;", RawQuery);
                try {
                    if (RawQuery.moveToFirst()) {
                        c4027e3M18502f = C4027E3.m18502f(RawQuery.getString(0), RawQuery.getInt(1));
                    } else {
                        this.f15066a.mo18421a().m18859w().m18834a("No data found");
                    }
                } catch (SQLiteException e8) {
                    e7 = e8;
                    this.f15066a.mo18421a().m18851o().m18835b("Error querying database.", e7);
                    if (RawQuery != 0) {
                    }
                    if (c4027e3M18502f == null) {
                        return C4027E3.f15193c;
                    }
                    return c4027e3M18502f;
                }
            } catch (Throwable th2) {
                th = th2;
                r7 = RawQuery;
                if (r7 != 0) {
                    r7.close();
                }
                throw th;
            }
        } catch (SQLiteException e9) {
            e7 = e9;
            RawQuery = 0;
        } catch (Throwable th3) {
            th = th3;
            if (r7 != 0) {
                r7.close();
            }
            throw th;
        }
        RawQuery.close();
        if (c4027e3M18502f == null) {
            return C4027E3.f15193c;
        }
        return c4027e3M18502f;
    }

    /* JADX WARN: Code duplicated, block: B:93:0x0306  */
    /* JADX INFO: renamed from: J0 */
    public final C4361w2 m19021J0(String str) {
        Cursor cursorQuery;
        Boolean boolValueOf;
        AbstractC3718s.m18077f(str);
        mo18427h();
        m18696j();
        Cursor cursor = null;
        try {
            cursorQuery = m19051u0().query("apps", new String[]{"app_instance_id", "gmp_app_id", "resettable_device_id_hash", "last_bundle_index", "last_bundle_start_timestamp", "last_bundle_end_timestamp", "app_version", "app_store", "gmp_version", "dev_cert_hash", "measurement_enabled", "day", "daily_public_events_count", "daily_events_count", "daily_conversions_count", "config_fetched_time", "failed_config_fetch_time", "app_version_int", "firebase_instance_id", "daily_error_events_count", "daily_realtime_events_count", "health_monitor_sample", "android_id", "adid_reporting_enabled", "admob_app_id", "dynamite_version", "safelisted_events", "ga_app_id", "session_stitching_token", "sgtm_upload_enabled", "target_os_version", "session_stitching_token_hash", "ad_services_version", "unmatched_first_open_without_ad_id", "npa_metadata_value", "attribution_eligibility_status", "sgtm_preview_key", "dma_consent_state", "daily_realtime_dcu_count", "bundle_delivery_index", "serialized_npa_metadata", "unmatched_pfo", "unmatched_uwa", "ad_campaign_info", "client_upload_eligibility"}, "app_id=?", new String[]{str}, null, null, null);
            try {
                try {
                    if (cursorQuery.moveToFirst()) {
                        C4317q6 c4317q6 = this.f15465b;
                        C4361w2 c4361w2 = new C4361w2(c4317q6.m18921g0(), str);
                        C4027E3 c4027e3M18920g = c4317q6.m18920g(str);
                        EnumC6051v enumC6051v = EnumC6051v.ANALYTICS_STORAGE;
                        if (c4027e3M18920g.m18514o(enumC6051v)) {
                            c4361w2.m19178q0(cursorQuery.getString(0));
                        }
                        c4361w2.m19182s0(cursorQuery.getString(1));
                        if (c4317q6.m18920g(str).m18514o(EnumC6051v.AD_STORAGE)) {
                            c4361w2.m19190w0(cursorQuery.getString(2));
                        }
                        c4361w2.m19155f(cursorQuery.getLong(3));
                        c4361w2.m19108A0(cursorQuery.getLong(4));
                        c4361w2.m19112C0(cursorQuery.getLong(5));
                        c4361w2.m19116E0(cursorQuery.getString(6));
                        c4361w2.m19124I0(cursorQuery.getString(7));
                        c4361w2.m19128K0(cursorQuery.getLong(8));
                        c4361w2.m19145a(cursorQuery.getLong(9));
                        c4361w2.m19153e(cursorQuery.isNull(10) || cursorQuery.getInt(10) != 0);
                        c4361w2.m19173o(cursorQuery.getLong(11));
                        c4361w2.m19177q(cursorQuery.getLong(12));
                        c4361w2.m19181s(cursorQuery.getLong(13));
                        c4361w2.m19185u(cursorQuery.getLong(14));
                        c4361w2.m19161i(cursorQuery.getLong(15));
                        c4361w2.m19165k(cursorQuery.getLong(16));
                        c4361w2.m19120G0(cursorQuery.isNull(17) ? -2147483648L : cursorQuery.getInt(17));
                        c4361w2.m19194y0(cursorQuery.getString(18));
                        c4361w2.m19193y(cursorQuery.getLong(19));
                        c4361w2.m19189w(cursorQuery.getLong(20));
                        c4361w2.m19133O(cursorQuery.getString(21));
                        c4361w2.m19135Q(cursorQuery.isNull(23) || cursorQuery.getInt(23) != 0);
                        c4361w2.m19149c(cursorQuery.isNull(25) ? 0L : cursorQuery.getLong(25));
                        if (!cursorQuery.isNull(26)) {
                            c4361w2.m19139U(Arrays.asList(cursorQuery.getString(26).split(",", -1)));
                        }
                        if (c4317q6.m18920g(str).m18514o(enumC6051v)) {
                            c4361w2.m19186u0(cursorQuery.getString(28));
                        }
                        c4361w2.m19141W((cursorQuery.isNull(29) || cursorQuery.getInt(29) == 0) ? false : true);
                        c4361w2.m19117F(cursorQuery.getLong(39));
                        c4361w2.m19170m0(cursorQuery.getString(36));
                        c4361w2.m19143Y(cursorQuery.getLong(30));
                        c4361w2.m19146a0(cursorQuery.getLong(31));
                        zzqp.zza();
                        C4164X2 c4164x2 = this.f15066a;
                        if (c4164x2.m18686w().m18800H(str, AbstractC4209d2.f15629Q0)) {
                            c4361w2.m19150c0(cursorQuery.getInt(32));
                            c4361w2.m19166k0(cursorQuery.getLong(35));
                        }
                        c4361w2.m19154e0((cursorQuery.isNull(33) || cursorQuery.getInt(33) == 0) ? false : true);
                        if (cursorQuery.isNull(34)) {
                            boolValueOf = null;
                        } else {
                            boolValueOf = Boolean.valueOf(cursorQuery.getInt(34) != 0);
                        }
                        c4361w2.m19137S(boolValueOf);
                        c4361w2.m19111C(cursorQuery.getInt(37));
                        c4361w2.m19115E(cursorQuery.getInt(38));
                        c4361w2.m19121H(cursorQuery.isNull(40) ? "" : (String) AbstractC3718s.m18083l(cursorQuery.getString(40)));
                        if (!cursorQuery.isNull(41)) {
                            c4361w2.m19158g0(Long.valueOf(cursorQuery.getLong(41)));
                        }
                        if (!cursorQuery.isNull(42)) {
                            c4361w2.m19162i0(Long.valueOf(cursorQuery.getLong(42)));
                        }
                        c4361w2.m19125J(cursorQuery.getBlob(43));
                        if (!cursorQuery.isNull(44)) {
                            c4361w2.m19129L(cursorQuery.getInt(44));
                        }
                        c4361w2.m19172n0();
                        if (cursorQuery.moveToNext()) {
                            c4164x2.mo18421a().m18851o().m18835b("Got multiple records for app, expected one. appId", C4313q2.m18846x(str));
                        }
                        cursorQuery.close();
                        return c4361w2;
                    }
                } catch (SQLiteException e7) {
                    e = e7;
                    this.f15066a.mo18421a().m18851o().m18836c("Error querying app. appId", C4313q2.m18846x(str), e);
                }
            } catch (Throwable th) {
                th = th;
                cursor = cursorQuery;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e8) {
            e = e8;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }

    /* JADX INFO: renamed from: K */
    public final boolean m19022K(String str, C4132S5 c4132s5) {
        mo18427h();
        m18696j();
        AbstractC3718s.m18083l(c4132s5);
        AbstractC3718s.m18077f(str);
        C4164X2 c4164x2 = this.f15066a;
        long jMo18159a = c4164x2.mo18425f().mo18159a();
        C4201c2 c4201c2 = AbstractC4209d2.f15705w0;
        long jLongValue = jMo18159a - ((Long) c4201c2.m18706b(null)).longValue();
        long j7 = c4132s5.f15418b;
        if (j7 < jLongValue || j7 > ((Long) c4201c2.m18706b(null)).longValue() + jMo18159a) {
            c4164x2.mo18421a().m18854r().m18837d("Storing trigger URI outside of the max retention time span. appId, now, timestamp", C4313q2.m18846x(str), Long.valueOf(jMo18159a), Long.valueOf(j7));
        }
        c4164x2.mo18421a().m18859w().m18834a("Saving trigger URI");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("trigger_uri", c4132s5.f15417a);
        contentValues.put("source", Integer.valueOf(c4132s5.f15419c));
        contentValues.put("timestamp_millis", Long.valueOf(j7));
        try {
            if (m19051u0().insert("trigger_uris", null, contentValues) != -1) {
                return true;
            }
            c4164x2.mo18421a().m18851o().m18835b("Failed to insert trigger URI (got -1). appId", C4313q2.m18846x(str));
            return false;
        } catch (SQLiteException e7) {
            this.f15066a.mo18421a().m18851o().m18836c("Error storing trigger URI. appId", C4313q2.m18846x(str), e7);
            return false;
        }
    }

    /* JADX INFO: renamed from: K0 */
    public final void m19023K0(C4361w2 c4361w2, boolean z7, boolean z8) {
        AbstractC3718s.m18083l(c4361w2);
        mo18427h();
        m18696j();
        String strM19174o0 = c4361w2.m19174o0();
        AbstractC3718s.m18083l(strM19174o0);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", strM19174o0);
        if (z7) {
            contentValues.put("app_instance_id", (String) null);
        } else if (this.f15465b.m18920g(strM19174o0).m18514o(EnumC6051v.ANALYTICS_STORAGE)) {
            contentValues.put("app_instance_id", c4361w2.m19176p0());
        }
        contentValues.put("gmp_app_id", c4361w2.m19180r0());
        C4317q6 c4317q6 = this.f15465b;
        if (c4317q6.m18920g(strM19174o0).m18514o(EnumC6051v.AD_STORAGE)) {
            contentValues.put("resettable_device_id_hash", c4361w2.m19188v0());
        }
        contentValues.put("last_bundle_index", Long.valueOf(c4361w2.m19157g()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(c4361w2.m19196z0()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(c4361w2.m19110B0()));
        contentValues.put("app_version", c4361w2.m19114D0());
        contentValues.put("app_store", c4361w2.m19122H0());
        contentValues.put("gmp_version", Long.valueOf(c4361w2.m19126J0()));
        contentValues.put("dev_cert_hash", Long.valueOf(c4361w2.m19130L0()));
        contentValues.put("measurement_enabled", Boolean.valueOf(c4361w2.m19151d()));
        contentValues.put("day", Long.valueOf(c4361w2.m19171n()));
        contentValues.put("daily_public_events_count", Long.valueOf(c4361w2.m19175p()));
        contentValues.put("daily_events_count", Long.valueOf(c4361w2.m19179r()));
        contentValues.put("daily_conversions_count", Long.valueOf(c4361w2.m19183t()));
        contentValues.put("config_fetched_time", Long.valueOf(c4361w2.m19159h()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(c4361w2.m19163j()));
        contentValues.put("app_version_int", Long.valueOf(c4361w2.m19118F0()));
        contentValues.put("firebase_instance_id", c4361w2.m19192x0());
        contentValues.put("daily_error_events_count", Long.valueOf(c4361w2.m19191x()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(c4361w2.m19187v()));
        contentValues.put("health_monitor_sample", c4361w2.m19195z());
        contentValues.put("android_id", (Long) 0L);
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(c4361w2.m19134P()));
        contentValues.put("dynamite_version", Long.valueOf(c4361w2.m19147b()));
        if (c4317q6.m18920g(strM19174o0).m18514o(EnumC6051v.ANALYTICS_STORAGE)) {
            contentValues.put("session_stitching_token", c4361w2.m19184t0());
        }
        contentValues.put("sgtm_upload_enabled", Boolean.valueOf(c4361w2.m19140V()));
        contentValues.put("target_os_version", Long.valueOf(c4361w2.m19142X()));
        contentValues.put("session_stitching_token_hash", Long.valueOf(c4361w2.m19144Z()));
        zzqp.zza();
        C4164X2 c4164x2 = this.f15066a;
        if (c4164x2.m18686w().m18800H(strM19174o0, AbstractC4209d2.f15629Q0)) {
            contentValues.put("ad_services_version", Integer.valueOf(c4361w2.m19148b0()));
            contentValues.put("attribution_eligibility_status", Long.valueOf(c4361w2.m19164j0()));
        }
        contentValues.put("unmatched_first_open_without_ad_id", Boolean.valueOf(c4361w2.m19152d0()));
        contentValues.put("npa_metadata_value", c4361w2.m19136R());
        contentValues.put("bundle_delivery_index", Long.valueOf(c4361w2.m19119G()));
        contentValues.put("sgtm_preview_key", c4361w2.m19168l0());
        contentValues.put("dma_consent_state", Integer.valueOf(c4361w2.m19109B()));
        contentValues.put("daily_realtime_dcu_count", Integer.valueOf(c4361w2.m19113D()));
        contentValues.put("serialized_npa_metadata", c4361w2.m19123I());
        contentValues.put("client_upload_eligibility", Integer.valueOf(c4361w2.m19131M()));
        List listM19138T = c4361w2.m19138T();
        if (listM19138T != null) {
            if (listM19138T.isEmpty()) {
                c4164x2.mo18421a().m18854r().m18835b("Safelisted events should not be an empty list. appId", strM19174o0);
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", listM19138T));
            }
        }
        zzpr.zza();
        if (c4164x2.m18686w().m18800H(null, AbstractC4209d2.f15619L0) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        contentValues.put("unmatched_pfo", c4361w2.m19156f0());
        contentValues.put("unmatched_uwa", c4361w2.m19160h0());
        contentValues.put("ad_campaign_info", c4361w2.m19127K());
        try {
            SQLiteDatabase sQLiteDatabaseM19051u0 = m19051u0();
            if (sQLiteDatabaseM19051u0.update("apps", contentValues, "app_id = ?", new String[]{strM19174o0}) == 0 && sQLiteDatabaseM19051u0.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                c4164x2.mo18421a().m18851o().m18835b("Failed to insert/update app (got -1). appId", C4313q2.m18846x(strM19174o0));
            }
        } catch (SQLiteException e7) {
            this.f15066a.mo18421a().m18851o().m18836c("Error storing app. appId", C4313q2.m18846x(strM19174o0), e7);
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m19024L(String str, C4027E3 c4027e3) {
        AbstractC3718s.m18083l(str);
        AbstractC3718s.m18083l(c4027e3);
        mo18427h();
        m18696j();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", c4027e3.m18512l());
        contentValues.put("consent_source", Integer.valueOf(c4027e3.m18509b()));
        m18982N("consent_settings", "app_id", contentValues);
    }

    /* JADX INFO: renamed from: L0 */
    public final C4310q m19025L0(long j7, String str, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13) {
        return m19026M0(j7, str, 1L, false, false, z9, false, z11, z12, z13);
    }

    /* JADX INFO: renamed from: M0 */
    public final C4310q m19026M0(long j7, String str, long j8, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13) {
        AbstractC3718s.m18077f(str);
        mo18427h();
        m18696j();
        String[] strArr = {str};
        C4310q c4310q = new C4310q();
        Cursor cursorQuery = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseM19051u0 = m19051u0();
                cursorQuery = sQLiteDatabaseM19051u0.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count", "daily_realtime_dcu_count", "daily_registered_triggers_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (cursorQuery.moveToFirst()) {
                    if (cursorQuery.getLong(0) == j7) {
                        c4310q.f15955b = cursorQuery.getLong(1);
                        c4310q.f15954a = cursorQuery.getLong(2);
                        c4310q.f15956c = cursorQuery.getLong(3);
                        c4310q.f15957d = cursorQuery.getLong(4);
                        c4310q.f15958e = cursorQuery.getLong(5);
                        c4310q.f15959f = cursorQuery.getLong(6);
                        c4310q.f15960g = cursorQuery.getLong(7);
                    }
                    if (z7) {
                        c4310q.f15955b += j8;
                    }
                    if (z8) {
                        c4310q.f15954a += j8;
                    }
                    if (z9) {
                        c4310q.f15956c += j8;
                    }
                    if (z10) {
                        c4310q.f15957d += j8;
                    }
                    if (z11) {
                        c4310q.f15958e += j8;
                    }
                    if (z12) {
                        c4310q.f15959f += j8;
                    }
                    if (z13) {
                        c4310q.f15960g += j8;
                    }
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("day", Long.valueOf(j7));
                    contentValues.put("daily_public_events_count", Long.valueOf(c4310q.f15954a));
                    contentValues.put("daily_events_count", Long.valueOf(c4310q.f15955b));
                    contentValues.put("daily_conversions_count", Long.valueOf(c4310q.f15956c));
                    contentValues.put("daily_error_events_count", Long.valueOf(c4310q.f15957d));
                    contentValues.put("daily_realtime_events_count", Long.valueOf(c4310q.f15958e));
                    contentValues.put("daily_realtime_dcu_count", Long.valueOf(c4310q.f15959f));
                    contentValues.put("daily_registered_triggers_count", Long.valueOf(c4310q.f15960g));
                    sQLiteDatabaseM19051u0.update("apps", contentValues, "app_id=?", strArr);
                } else {
                    this.f15066a.mo18421a().m18854r().m18835b("Not updating daily counts, app is not known. appId", C4313q2.m18846x(str));
                }
            } catch (SQLiteException e7) {
                this.f15066a.mo18421a().m18851o().m18836c("Error updating daily counts. appId", C4313q2.m18846x(str), e7);
            }
            return c4310q;
        } finally {
            if (0 != 0) {
                cursorQuery.close();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x008a  */
    /* JADX WARN: Code duplicated, block: B:36:? A[SYNTHETIC] */
    /* JADX INFO: renamed from: N0 */
    public final C4302p m19027N0(String str) throws Throwable {
        Throwable th;
        Cursor cursorQuery;
        AbstractC3718s.m18077f(str);
        mo18427h();
        m18696j();
        Cursor cursor = null;
        try {
            cursorQuery = m19051u0().query("apps", new String[]{"remote_config", "config_last_modified_time", "e_tag"}, "app_id=?", new String[]{str}, null, null, null);
            try {
                try {
                    if (cursorQuery.moveToFirst()) {
                        byte[] blob = cursorQuery.getBlob(0);
                        String string = cursorQuery.getString(1);
                        String string2 = cursorQuery.getString(2);
                        if (cursorQuery.moveToNext()) {
                            this.f15066a.mo18421a().m18851o().m18835b("Got multiple records for app config, expected one. appId", C4313q2.m18846x(str));
                        }
                        if (blob != null) {
                            C4302p c4302p = new C4302p(blob, string, string2);
                            cursorQuery.close();
                            return c4302p;
                        }
                    }
                } catch (SQLiteException e7) {
                    e = e7;
                    this.f15066a.mo18421a().m18851o().m18836c("Error querying remote config. appId", C4313q2.m18846x(str), e);
                }
            } catch (Throwable th2) {
                th = th2;
                cursor = cursorQuery;
                if (cursor != null) {
                    throw th;
                }
                cursor.close();
                throw th;
            }
        } catch (SQLiteException e8) {
            e = e8;
            cursorQuery = null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor != null) {
                throw th;
            }
            cursor.close();
            throw th;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0045  */
    /* JADX INFO: renamed from: O0 */
    public final boolean m19028O0(zzid zzidVar, boolean z7) {
        mo18427h();
        m18696j();
        AbstractC3718s.m18083l(zzidVar);
        AbstractC3718s.m18077f(zzidVar.zzA());
        AbstractC3718s.m18086o(zzidVar.zzn());
        m19050u();
        C4164X2 c4164x2 = this.f15066a;
        long jMo18159a = c4164x2.mo18425f().mo18159a();
        long jZzo = zzidVar.zzo();
        c4164x2.m18686w();
        if (jZzo >= jMo18159a - C4278m.m18790q()) {
            long jZzo2 = zzidVar.zzo();
            c4164x2.m18686w();
            if (jZzo2 > C4278m.m18790q() + jMo18159a) {
                c4164x2.mo18421a().m18854r().m18837d("Storing bundle outside of the max uploading time span. appId, now, timestamp", C4313q2.m18846x(zzidVar.zzA()), Long.valueOf(jMo18159a), Long.valueOf(zzidVar.zzo()));
            }
        } else {
            c4164x2.mo18421a().m18854r().m18837d("Storing bundle outside of the max uploading time span. appId, now, timestamp", C4313q2.m18846x(zzidVar.zzA()), Long.valueOf(jMo18159a), Long.valueOf(zzidVar.zzo()));
        }
        try {
            byte[] bArrM19098V = this.f15465b.m18903K0().m19098V(zzidVar.zzcc());
            C4164X2 c4164x3 = this.f15066a;
            c4164x3.mo18421a().m18859w().m18835b("Saving bundle, size", Integer.valueOf(bArrM19098V.length));
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", zzidVar.zzA());
            contentValues.put("bundle_end_timestamp", Long.valueOf(zzidVar.zzo()));
            contentValues.put("data", bArrM19098V);
            contentValues.put("has_realtime", Integer.valueOf(z7 ? 1 : 0));
            if (zzidVar.zzaa()) {
                contentValues.put("retry_count", Integer.valueOf(zzidVar.zzab()));
            }
            try {
                if (m19051u0().insert("queue", null, contentValues) != -1) {
                    return true;
                }
                c4164x3.mo18421a().m18851o().m18835b("Failed to insert bundle (got -1). appId", C4313q2.m18846x(zzidVar.zzA()));
                return false;
            } catch (SQLiteException e7) {
                this.f15066a.mo18421a().m18851o().m18836c("Error storing bundle. appId", C4313q2.m18846x(zzidVar.zzA()), e7);
                return false;
            }
        } catch (IOException e8) {
            this.f15066a.mo18421a().m18851o().m18836c("Data loss. Failed to serialize bundle. appId", C4313q2.m18846x(zzidVar.zzA()), e8);
            return false;
        }
    }

    /* JADX INFO: renamed from: U */
    public final C4374y m19029U(String str) {
        AbstractC3718s.m18083l(str);
        mo18427h();
        m18696j();
        return C4374y.m19316g(m18981M("select dma_consent_settings from consent_settings where app_id=? limit 1;", new String[]{str}, ""));
    }

    /* JADX INFO: renamed from: V */
    public final void m19030V(String str, C4374y c4374y) {
        AbstractC3718s.m18083l(str);
        AbstractC3718s.m18083l(c4374y);
        mo18427h();
        m18696j();
        C4027E3 c4027e3M19020J = m19020J(str);
        C4027E3 c4027e3 = C4027E3.f15193c;
        if (c4027e3M19020J == c4027e3) {
            m19024L(str, c4027e3);
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("dma_consent_settings", c4374y.m19323e());
        m18982N("consent_settings", "app_id", contentValues);
    }

    /* JADX INFO: renamed from: W */
    public final void m19031W(String str, C4027E3 c4027e3) {
        AbstractC3718s.m18083l(str);
        AbstractC3718s.m18083l(c4027e3);
        mo18427h();
        m18696j();
        m19024L(str, m19020J(str));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("storage_consent_at_bundling", c4027e3.m18512l());
        m18982N("consent_settings", "app_id", contentValues);
    }

    /* JADX INFO: renamed from: X */
    public final C4027E3 m19032X(String str) {
        AbstractC3718s.m18083l(str);
        mo18427h();
        m18696j();
        return C4027E3.m18502f(m18981M("select storage_consent_at_bundling from consent_settings where app_id=? limit 1;", new String[]{str}, ""), 100);
    }

    /* JADX INFO: renamed from: Y */
    final void m19033Y(String str, List list) throws Throwable {
        SQLiteDatabase sQLiteDatabase;
        boolean z7;
        AbstractC3718s.m18083l(list);
        for (int i7 = 0; i7 < list.size(); i7++) {
            zzfc zzfcVar = (zzfc) ((zzfd) list.get(i7)).zzcl();
            if (zzfcVar.zzd() != 0) {
                for (int i8 = 0; i8 < zzfcVar.zzd(); i8++) {
                    zzfe zzfeVar = (zzfe) zzfcVar.zze(i8).zzcl();
                    zzfe zzfeVar2 = (zzfe) zzfeVar.clone();
                    String strM27060b = AbstractC6052w.m27060b(zzfeVar.zza());
                    if (strM27060b != null) {
                        zzfeVar2.zzb(strM27060b);
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    int i9 = 0;
                    while (i9 < zzfeVar.zzc()) {
                        zzfh zzfhVarZzd = zzfeVar.zzd(i9);
                        zzfe zzfeVar3 = zzfeVar;
                        boolean z8 = z7;
                        String strM27046b = AbstractC6025H.m27046b(zzfhVarZzd.zzh(), AbstractC6053x.f23829a, AbstractC6053x.f23830b);
                        if (strM27046b != null) {
                            zzfg zzfgVar = (zzfg) zzfhVarZzd.zzcl();
                            zzfgVar.zza(strM27046b);
                            zzfeVar2.zze(i9, (zzfh) zzfgVar.zzbc());
                            z7 = true;
                        } else {
                            z7 = z8;
                        }
                        i9++;
                        zzfeVar = zzfeVar3;
                    }
                    if (z7) {
                        zzfcVar.zzf(i8, zzfeVar2);
                        list.set(i7, (zzfd) zzfcVar.zzbc());
                    }
                }
            }
            if (zzfcVar.zza() != 0) {
                for (int i10 = 0; i10 < zzfcVar.zza(); i10++) {
                    zzfn zzfnVarZzb = zzfcVar.zzb(i10);
                    String strM27046b2 = AbstractC6025H.m27046b(zzfnVarZzb.zzc(), AbstractC6054y.f23833a, AbstractC6054y.f23834b);
                    if (strM27046b2 != null) {
                        zzfm zzfmVar = (zzfm) zzfnVarZzb.zzcl();
                        zzfmVar.zza(strM27046b2);
                        zzfcVar.zzc(i10, zzfmVar);
                        list.set(i7, (zzfd) zzfcVar.zzbc());
                    }
                }
            }
        }
        m18696j();
        mo18427h();
        AbstractC3718s.m18077f(str);
        AbstractC3718s.m18083l(list);
        SQLiteDatabase sQLiteDatabaseM19051u0 = m19051u0();
        sQLiteDatabaseM19051u0.beginTransaction();
        try {
            m18696j();
            mo18427h();
            AbstractC3718s.m18077f(str);
            SQLiteDatabase sQLiteDatabaseM19051u1 = m19051u0();
            sQLiteDatabaseM19051u1.delete("property_filters", "app_id=?", new String[]{str});
            sQLiteDatabaseM19051u1.delete("event_filters", "app_id=?", new String[]{str});
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzfd zzfdVar = (zzfd) it.next();
                m18696j();
                mo18427h();
                AbstractC3718s.m18077f(str);
                AbstractC3718s.m18083l(zzfdVar);
                if (zzfdVar.zza()) {
                    int iZzb = zzfdVar.zzb();
                    Iterator it2 = zzfdVar.zzf().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (!((zzff) it2.next()).zza()) {
                                this.f15066a.mo18421a().m18854r().m18836c("Event filter with no ID. Audience definition ignored. appId, audienceId", C4313q2.m18846x(str), Integer.valueOf(iZzb));
                                break;
                            }
                        } else {
                            Iterator it3 = zzfdVar.zzc().iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    Iterator it4 = zzfdVar.zzf().iterator();
                                    while (true) {
                                        zzfd zzfdVar2 = zzfdVar;
                                        String str2 = "app_id";
                                        try {
                                            if (!it4.hasNext()) {
                                                sQLiteDatabase = sQLiteDatabaseM19051u0;
                                                Iterator it5 = zzfdVar2.zzc().iterator();
                                                while (true) {
                                                    if (it5.hasNext()) {
                                                        zzfn zzfnVar = (zzfn) it5.next();
                                                        m18696j();
                                                        mo18427h();
                                                        AbstractC3718s.m18077f(str);
                                                        AbstractC3718s.m18083l(zzfnVar);
                                                        if (zzfnVar.zzc().isEmpty()) {
                                                            this.f15066a.mo18421a().m18854r().m18837d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", C4313q2.m18846x(str), Integer.valueOf(iZzb), String.valueOf(zzfnVar.zza() ? Integer.valueOf(zzfnVar.zzb()) : null));
                                                        } else {
                                                            byte[] bArrZzcc = zzfnVar.zzcc();
                                                            ContentValues contentValues = new ContentValues();
                                                            contentValues.put(str2, str);
                                                            String str3 = str2;
                                                            contentValues.put("audience_id", Integer.valueOf(iZzb));
                                                            contentValues.put("filter_id", zzfnVar.zza() ? Integer.valueOf(zzfnVar.zzb()) : null);
                                                            Iterator it6 = it5;
                                                            contentValues.put("property_name", zzfnVar.zzc());
                                                            contentValues.put("session_scoped", zzfnVar.zzg() ? Boolean.valueOf(zzfnVar.zzh()) : null);
                                                            contentValues.put("data", bArrZzcc);
                                                            try {
                                                                if (m19051u0().insertWithOnConflict("property_filters", null, contentValues, 5) == -1) {
                                                                    this.f15066a.mo18421a().m18851o().m18835b("Failed to insert property filter (got -1). appId", C4313q2.m18846x(str));
                                                                } else {
                                                                    str2 = str3;
                                                                    it5 = it6;
                                                                }
                                                            } catch (SQLiteException e7) {
                                                                this.f15066a.mo18421a().m18851o().m18836c("Error storing property filter. appId", C4313q2.m18846x(str), e7);
                                                            }
                                                        }
                                                    }
                                                    sQLiteDatabaseM19051u0 = sQLiteDatabase;
                                                    break;
                                                }
                                            }
                                            zzff zzffVar = (zzff) it4.next();
                                            m18696j();
                                            mo18427h();
                                            AbstractC3718s.m18077f(str);
                                            AbstractC3718s.m18083l(zzffVar);
                                            if (!zzffVar.zzc().isEmpty()) {
                                                byte[] bArrZzcc2 = zzffVar.zzcc();
                                                sQLiteDatabase = sQLiteDatabaseM19051u0;
                                                ContentValues contentValues2 = new ContentValues();
                                                contentValues2.put("app_id", str);
                                                contentValues2.put("audience_id", Integer.valueOf(iZzb));
                                                contentValues2.put("filter_id", zzffVar.zza() ? Integer.valueOf(zzffVar.zzb()) : null);
                                                contentValues2.put("event_name", zzffVar.zzc());
                                                contentValues2.put("session_scoped", zzffVar.zzk() ? Boolean.valueOf(zzffVar.zzm()) : null);
                                                contentValues2.put("data", bArrZzcc2);
                                                try {
                                                    if (m19051u0().insertWithOnConflict("event_filters", null, contentValues2, 5) == -1) {
                                                        this.f15066a.mo18421a().m18851o().m18835b("Failed to insert event filter (got -1). appId", C4313q2.m18846x(str));
                                                    }
                                                    zzfdVar = zzfdVar2;
                                                    sQLiteDatabaseM19051u0 = sQLiteDatabase;
                                                } catch (SQLiteException e8) {
                                                    this.f15066a.mo18421a().m18851o().m18836c("Error storing event filter. appId", C4313q2.m18846x(str), e8);
                                                    m18696j();
                                                    mo18427h();
                                                    AbstractC3718s.m18077f(str);
                                                    SQLiteDatabase sQLiteDatabaseM19051u2 = m19051u0();
                                                    sQLiteDatabaseM19051u2.delete("property_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(iZzb)});
                                                    sQLiteDatabaseM19051u2.delete("event_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(iZzb)});
                                                    sQLiteDatabaseM19051u0 = sQLiteDatabase;
                                                    break;
                                                }
                                            } else {
                                                this.f15066a.mo18421a().m18854r().m18837d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", C4313q2.m18846x(str), Integer.valueOf(iZzb), String.valueOf(zzffVar.zza() ? Integer.valueOf(zzffVar.zzb()) : null));
                                                sQLiteDatabase = sQLiteDatabaseM19051u0;
                                            }
                                            m18696j();
                                            mo18427h();
                                            AbstractC3718s.m18077f(str);
                                            SQLiteDatabase sQLiteDatabaseM19051u3 = m19051u0();
                                            sQLiteDatabaseM19051u3.delete("property_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(iZzb)});
                                            sQLiteDatabaseM19051u3.delete("event_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(iZzb)});
                                            sQLiteDatabaseM19051u0 = sQLiteDatabase;
                                            break;
                                            break;
                                        } catch (Throwable th) {
                                            th = th;
                                            sQLiteDatabase.endTransaction();
                                            throw th;
                                        }
                                    }
                                }
                                if (!((zzfn) it3.next()).zza()) {
                                    this.f15066a.mo18421a().m18854r().m18836c("Property filter with no ID. Audience definition ignored. appId, audienceId", C4313q2.m18846x(str), Integer.valueOf(iZzb));
                                    break;
                                }
                            }
                        }
                    }
                } else {
                    this.f15066a.mo18421a().m18854r().m18835b("Audience with no ID. appId", C4313q2.m18846x(str));
                }
            }
            sQLiteDatabase = sQLiteDatabaseM19051u0;
            ArrayList arrayList = new ArrayList();
            Iterator it7 = list.iterator();
            while (it7.hasNext()) {
                zzfd zzfdVar3 = (zzfd) it7.next();
                arrayList.add(zzfdVar3.zza() ? Integer.valueOf(zzfdVar3.zzb()) : null);
            }
            AbstractC3718s.m18077f(str);
            m18696j();
            mo18427h();
            SQLiteDatabase sQLiteDatabaseM19051u4 = m19051u0();
            try {
                long jM19000p0 = m19000p0("select count(1) from audience_filter_values where app_id=?", new String[]{str});
                int i11 = 0;
                int iMax = Math.max(0, Math.min(2000, this.f15066a.m18686w().m18797E(str, AbstractC4209d2.f15638V)));
                if (jM19000p0 > iMax) {
                    ArrayList arrayList2 = new ArrayList();
                    while (true) {
                        if (i11 >= arrayList.size()) {
                            String strJoin = TextUtils.join(",", arrayList2);
                            StringBuilder sb = new StringBuilder(String.valueOf(strJoin).length() + 2);
                            sb.append("(");
                            sb.append(strJoin);
                            sb.append(")");
                            String string = sb.toString();
                            StringBuilder sb2 = new StringBuilder(string.length() + 140);
                            sb2.append("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ");
                            sb2.append(string);
                            sb2.append(" order by rowid desc limit -1 offset ?)");
                            sQLiteDatabaseM19051u4.delete("audience_filter_values", sb2.toString(), new String[]{str, Integer.toString(iMax)});
                            break;
                        }
                        Integer num = (Integer) arrayList.get(i11);
                        if (num == null) {
                            break;
                        }
                        arrayList2.add(Integer.toString(num.intValue()));
                        i11++;
                    }
                }
            } catch (SQLiteException e9) {
                this.f15066a.mo18421a().m18851o().m18836c("Database error querying filters. appId", C4313q2.m18846x(str), e9);
            }
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
        } catch (Throwable th2) {
            th = th2;
            sQLiteDatabase = sQLiteDatabaseM19051u0;
        }
    }

    /* JADX INFO: renamed from: Z */
    final C4007C m19034Z(String str, zzhs zzhsVar, String str2) throws Throwable {
        C4007C c4007cM18983O = m18983O("events", str, zzhsVar.zzd());
        if (c4007cM18983O == null) {
            C4164X2 c4164x2 = this.f15066a;
            c4164x2.mo18421a().m18854r().m18836c("Event aggregate wasn't created during raw event logging. appId, event", C4313q2.m18846x(str), c4164x2.m18662D().m18775a(str2));
            return new C4007C(str, zzhsVar.zzd(), 1L, 1L, 1L, zzhsVar.zzf(), 0L, null, null, null, null);
        }
        long j7 = c4007cM18983O.f15131e + 1;
        long j8 = c4007cM18983O.f15130d + 1;
        return new C4007C(c4007cM18983O.f15127a, c4007cM18983O.f15128b, c4007cM18983O.f15129c + 1, j8, j7, c4007cM18983O.f15132f, c4007cM18983O.f15133g, c4007cM18983O.f15134h, c4007cM18983O.f15135i, c4007cM18983O.f15136j, c4007cM18983O.f15137k);
    }

    /* JADX INFO: renamed from: a0 */
    protected final boolean m19035a0() {
        C4164X2 c4164x2 = this.f15066a;
        Context contextMo18424e = c4164x2.mo18424e();
        c4164x2.m18686w();
        return contextMo18424e.getDatabasePath("google_app_measurement.db").exists();
    }

    /* JADX INFO: renamed from: b0 */
    final /* synthetic */ long m19036b0(String str, String[] strArr, long j7) {
        return m19001q0("select rowid from raw_events where app_id = ? and timestamp < ? order by rowid desc limit 1", strArr, -1L);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4197b6
    /* JADX INFO: renamed from: l */
    protected final boolean mo18457l() {
        return false;
    }

    /* JADX INFO: renamed from: m */
    public final long m19037m(String str, zzib zzibVar, String str2, Map map, EnumC6024G enumC6024G, Long l7) {
        int iDelete;
        mo18427h();
        m18696j();
        AbstractC3718s.m18083l(zzibVar);
        AbstractC3718s.m18077f(str);
        mo18427h();
        m18696j();
        if (m19035a0()) {
            C4317q6 c4317q6 = this.f15465b;
            long jM18433a = c4317q6.m18904L0().f16248f.m18433a();
            C4164X2 c4164x2 = this.f15066a;
            long jMo18161c = c4164x2.mo18425f().mo18161c();
            long jAbs = Math.abs(jMo18161c - jM18433a);
            c4164x2.m18686w();
            if (jAbs > C4278m.m18791r()) {
                c4317q6.m18904L0().f16248f.m18434b(jMo18161c);
                mo18427h();
                m18696j();
                if (m19035a0() && (iDelete = m19051u0().delete("upload_queue", m18987S(), new String[0])) > 0) {
                    c4164x2.mo18421a().m18859w().m18835b("Deleted stale MeasurementBatch rows from upload_queue. rowsDeleted", Integer.valueOf(iDelete));
                }
                AbstractC3718s.m18077f(str);
                mo18427h();
                m18696j();
                try {
                    int iM18797E = c4164x2.m18686w().m18797E(str, AbstractC4209d2.f15596A);
                    if (iM18797E > 0) {
                        m19051u0().delete("upload_queue", "rowid in (SELECT rowid FROM upload_queue WHERE app_id=? ORDER BY rowid DESC LIMIT -1 OFFSET ?)", new String[]{str, String.valueOf(iM18797E)});
                    }
                } catch (SQLiteException e7) {
                    this.f15066a.mo18421a().m18851o().m18836c("Error deleting over the limit queued batches. appId", C4313q2.m18846x(str), e7);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            String str3 = (String) entry.getKey();
            String str4 = (String) entry.getValue();
            StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 1 + String.valueOf(str4).length());
            sb.append(str3);
            sb.append("=");
            sb.append(str4);
            arrayList.add(sb.toString());
        }
        byte[] bArrZzcc = zzibVar.zzcc();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("measurement_batch", bArrZzcc);
        contentValues.put("upload_uri", str2);
        contentValues.put("upload_headers", String.join("\r\n", arrayList));
        contentValues.put("upload_type", Integer.valueOf(enumC6024G.zza()));
        C4164X2 c4164x3 = this.f15066a;
        contentValues.put("creation_timestamp", Long.valueOf(c4164x3.mo18425f().mo18159a()));
        contentValues.put("retry_count", (Integer) 0);
        if (l7 != null) {
            contentValues.put("associated_row_id", l7);
        }
        try {
            long jInsert = m19051u0().insert("upload_queue", null, contentValues);
            if (jInsert != -1) {
                return jInsert;
            }
            c4164x3.mo18421a().m18851o().m18835b("Failed to insert MeasurementBatch (got -1) to upload_queue. appId", str);
            return -1L;
        } catch (SQLiteException e8) {
            this.f15066a.mo18421a().m18851o().m18836c("Error storing MeasurementBatch to upload_queue. appId", str, e8);
            return -1L;
        }
    }

    /* JADX INFO: renamed from: m0 */
    final /* synthetic */ C4125R5 m19038m0() {
        return this.f16097e;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00b5  */
    /* JADX INFO: renamed from: n */
    public final C4341t6 m19039n(long j7) {
        Cursor cursorQuery;
        mo18427h();
        m18696j();
        Cursor cursor = null;
        try {
            cursorQuery = m19051u0().query("upload_queue", new String[]{"rowId", "app_id", "measurement_batch", "upload_uri", "upload_headers", "upload_type", "retry_count", "creation_timestamp", "associated_row_id", "last_upload_timestamp"}, "rowId=?", new String[]{String.valueOf(j7)}, null, null, null, "1");
            try {
                if (cursorQuery.moveToFirst()) {
                    C4341t6 c4341t6M18986R = m18986R((String) AbstractC3718s.m18083l(cursorQuery.getString(1)), j7, cursorQuery.getBlob(2), cursorQuery.getString(3), cursorQuery.getString(4), cursorQuery.getInt(5), cursorQuery.getInt(6), cursorQuery.getLong(7), cursorQuery.getLong(8), cursorQuery.getLong(9));
                    cursorQuery.close();
                    return c4341t6M18986R;
                }
            } catch (SQLiteException e7) {
                e = e7;
                try {
                    this.f15066a.mo18421a().m18851o().m18836c("Error to querying MeasurementBatch from upload_queue. rowId", Long.valueOf(j7), e);
                } catch (Throwable th) {
                    th = th;
                    cursor = cursorQuery;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                cursor = cursorQuery;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e8) {
            e = e8;
            cursorQuery = null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x024e  */
    /* JADX WARN: Code duplicated, block: B:125:0x01ec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x00f5 A[Catch: all -> 0x0078, SQLiteException -> 0x007a, TryCatch #1 {SQLiteException -> 0x007a, blocks: (B:19:0x0070, B:45:0x00ce, B:47:0x00f5, B:48:0x010a, B:49:0x010e, B:50:0x011e, B:52:0x0124, B:53:0x0137, B:56:0x0151, B:68:0x0178, B:71:0x0180, B:77:0x01a0, B:61:0x0167, B:75:0x0192, B:76:0x019b, B:98:0x0221), top: B:112:0x0070 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x010a A[Catch: all -> 0x0078, SQLiteException -> 0x007a, TRY_LEAVE, TryCatch #1 {SQLiteException -> 0x007a, blocks: (B:19:0x0070, B:45:0x00ce, B:47:0x00f5, B:48:0x010a, B:49:0x010e, B:50:0x011e, B:52:0x0124, B:53:0x0137, B:56:0x0151, B:68:0x0178, B:71:0x0180, B:77:0x01a0, B:61:0x0167, B:75:0x0192, B:76:0x019b, B:98:0x0221), top: B:112:0x0070 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0124 A[Catch: all -> 0x0078, SQLiteException -> 0x007a, TryCatch #1 {SQLiteException -> 0x007a, blocks: (B:19:0x0070, B:45:0x00ce, B:47:0x00f5, B:48:0x010a, B:49:0x010e, B:50:0x011e, B:52:0x0124, B:53:0x0137, B:56:0x0151, B:68:0x0178, B:71:0x0180, B:77:0x01a0, B:61:0x0167, B:75:0x0192, B:76:0x019b, B:98:0x0221), top: B:112:0x0070 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0151 A[Catch: all -> 0x0078, SQLiteException -> 0x007a, TRY_ENTER, TryCatch #1 {SQLiteException -> 0x007a, blocks: (B:19:0x0070, B:45:0x00ce, B:47:0x00f5, B:48:0x010a, B:49:0x010e, B:50:0x011e, B:52:0x0124, B:53:0x0137, B:56:0x0151, B:68:0x0178, B:71:0x0180, B:77:0x01a0, B:61:0x0167, B:75:0x0192, B:76:0x019b, B:98:0x0221), top: B:112:0x0070 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0161  */
    /* JADX WARN: Code duplicated, block: B:60:0x0165  */
    /* JADX WARN: Code duplicated, block: B:61:0x0167 A[Catch: all -> 0x0078, SQLiteException -> 0x007a, TryCatch #1 {SQLiteException -> 0x007a, blocks: (B:19:0x0070, B:45:0x00ce, B:47:0x00f5, B:48:0x010a, B:49:0x010e, B:50:0x011e, B:52:0x0124, B:53:0x0137, B:56:0x0151, B:68:0x0178, B:71:0x0180, B:77:0x01a0, B:61:0x0167, B:75:0x0192, B:76:0x019b, B:98:0x0221), top: B:112:0x0070 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x016e  */
    /* JADX WARN: Code duplicated, block: B:69:0x017d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x017f  */
    /* JADX WARN: Code duplicated, block: B:73:0x018c  */
    /* JADX WARN: Code duplicated, block: B:75:0x0192 A[Catch: all -> 0x0078, SQLiteException -> 0x007a, TryCatch #1 {SQLiteException -> 0x007a, blocks: (B:19:0x0070, B:45:0x00ce, B:47:0x00f5, B:48:0x010a, B:49:0x010e, B:50:0x011e, B:52:0x0124, B:53:0x0137, B:56:0x0151, B:68:0x0178, B:71:0x0180, B:77:0x01a0, B:61:0x0167, B:75:0x0192, B:76:0x019b, B:98:0x0221), top: B:112:0x0070 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x019b A[Catch: all -> 0x0078, SQLiteException -> 0x007a, TryCatch #1 {SQLiteException -> 0x007a, blocks: (B:19:0x0070, B:45:0x00ce, B:47:0x00f5, B:48:0x010a, B:49:0x010e, B:50:0x011e, B:52:0x0124, B:53:0x0137, B:56:0x0151, B:68:0x0178, B:71:0x0180, B:77:0x01a0, B:61:0x0167, B:75:0x0192, B:76:0x019b, B:98:0x0221), top: B:112:0x0070 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x01bd A[Catch: all -> 0x01ed, SQLiteException -> 0x01ef, LOOP:0: B:80:0x01bd->B:127:?, LOOP_START, TRY_LEAVE, TryCatch #6 {SQLiteException -> 0x01ef, blocks: (B:78:0x01b7, B:80:0x01bd, B:81:0x01c6, B:83:0x01d1, B:92:0x0206, B:91:0x01f2, B:95:0x020d), top: B:120:0x01b7 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x0206 A[Catch: all -> 0x01ed, SQLiteException -> 0x01ef, TryCatch #6 {SQLiteException -> 0x01ef, blocks: (B:78:0x01b7, B:80:0x01bd, B:81:0x01c6, B:83:0x01d1, B:92:0x0206, B:91:0x01f2, B:95:0x020d), top: B:120:0x01b7 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x020d A[Catch: all -> 0x01ed, SQLiteException -> 0x01ef, TRY_LEAVE, TryCatch #6 {SQLiteException -> 0x01ef, blocks: (B:78:0x01b7, B:80:0x01bd, B:81:0x01c6, B:83:0x01d1, B:92:0x0206, B:91:0x01f2, B:95:0x020d), top: B:120:0x01b7 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX INFO: renamed from: n0 */
    public final void m19040n0(String str, long j7, long j8, C4285m6 c4285m6) throws Throwable {
        ?? r8;
        ?? r7;
        Cursor cursorRawQuery;
        String str2;
        String[] strArr;
        String string;
        ?? r9;
        C4164X2 c4164x2;
        String str3;
        String[] strArr2;
        String[] strArr3;
        String[] strArr4;
        long j9;
        zzhr zzhrVar;
        long jM19001q0;
        long j10;
        String string2;
        AbstractC3718s.m18083l(c4285m6);
        mo18427h();
        m18696j();
        ?? r10 = 0;
        cursorQuery = null;
        Cursor cursorQuery = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseM19051u0 = m19051u0();
                ?? IsEmpty = TextUtils.isEmpty(str);
                String str4 = "";
                try {
                    if (IsEmpty != 0) {
                        String[] strArr5 = j8 != -1 ? new String[]{String.valueOf(j8), String.valueOf(j7)} : new String[]{String.valueOf(j7)};
                        str4 = j8 != -1 ? "rowid <= ? and " : "";
                        StringBuilder sb = new StringBuilder(str4.length() + 148);
                        sb.append("select app_id, metadata_fingerprint from raw_events where ");
                        sb.append(str4);
                        sb.append("app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;");
                        cursorRawQuery = sQLiteDatabaseM19051u0.rawQuery(sb.toString(), strArr5);
                        try {
                            if (cursorRawQuery.moveToFirst()) {
                                string2 = cursorRawQuery.getString(0);
                                try {
                                    string = cursorRawQuery.getString(1);
                                    cursorRawQuery.close();
                                    r9 = string2;
                                    cursorRawQuery = sQLiteDatabaseM19051u0.query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{r9, string}, null, null, "rowid", "2");
                                    if (cursorRawQuery.moveToFirst()) {
                                        try {
                                            zzid zzidVar = (zzid) ((zzic) C4349u6.m19071W(zzid.zzaE(), cursorRawQuery.getBlob(0))).zzbc();
                                            if (cursorRawQuery.moveToNext()) {
                                                this.f15066a.mo18421a().m18854r().m18835b("Get multiple raw event metadata records, expected one. appId", C4313q2.m18846x(r9));
                                            }
                                            cursorRawQuery.close();
                                            AbstractC3718s.m18083l(zzidVar);
                                            c4285m6.f15891a = zzidVar;
                                            c4164x2 = this.f15066a;
                                            str3 = "app_id = ? and metadata_fingerprint = ?";
                                            if (c4164x2.m18686w().m18800H(null, AbstractC4209d2.f15683l1)) {
                                                jM19001q0 = m19001q0("select (rowid - 1) as max_rowid from raw_events where app_id = ? and metadata_fingerprint != ? order by rowid limit 1;", new String[]{r9, string}, -1L);
                                                if (j8 == -1) {
                                                    j10 = j8;
                                                } else if (jM19001q0 != -1) {
                                                    j10 = -1;
                                                } else {
                                                    strArr2 = new String[]{r9, string};
                                                    strArr4 = strArr2;
                                                }
                                                if (j10 == -1 && jM19001q0 != -1) {
                                                    jM19001q0 = Math.min(j10, jM19001q0);
                                                } else if (j10 != -1) {
                                                    jM19001q0 = j10;
                                                }
                                                strArr3 = new String[]{r9, string, String.valueOf(jM19001q0)};
                                                strArr4 = strArr3;
                                                str3 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                                            } else if (j8 != -1) {
                                                strArr3 = new String[]{r9, string, String.valueOf(j8)};
                                                strArr4 = strArr3;
                                                str3 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                                            } else {
                                                strArr2 = new String[]{r9, string};
                                                strArr4 = strArr2;
                                            }
                                            cursorQuery = sQLiteDatabaseM19051u0.query("raw_events", new String[]{"rowid", "name", "timestamp", "data"}, str3, strArr4, null, null, "rowid", null);
                                            try {
                                                if (cursorQuery.moveToFirst()) {
                                                    do {
                                                        j9 = cursorQuery.getLong(0);
                                                        try {
                                                            zzhrVar = (zzhr) C4349u6.m19071W(zzhs.zzk(), cursorQuery.getBlob(3));
                                                            zzhrVar.zzl(cursorQuery.getString(1));
                                                            zzhrVar.zzo(cursorQuery.getLong(2));
                                                            if (!c4285m6.m18827a(j9, (zzhs) zzhrVar.zzbc())) {
                                                                break;
                                                            }
                                                        } catch (IOException e7) {
                                                            this.f15066a.mo18421a().m18851o().m18836c("Data loss. Failed to merge raw event. appId", C4313q2.m18846x(r9), e7);
                                                        }
                                                    } while (cursorQuery.moveToNext());
                                                } else {
                                                    c4164x2.mo18421a().m18854r().m18835b("Raw event data disappeared while in transaction. appId", C4313q2.m18846x(r9));
                                                }
                                            } catch (SQLiteException e8) {
                                                e = e8;
                                                r7 = r9;
                                                this.f15066a.mo18421a().m18851o().m18836c("Data loss. Error selecting raw event. appId", C4313q2.m18846x(r7), e);
                                            }
                                            cursorRawQuery = cursorQuery;
                                        } catch (IOException e9) {
                                            this.f15066a.mo18421a().m18851o().m18836c("Data loss. Failed to merge raw event metadata. appId", C4313q2.m18846x(r9), e9);
                                        }
                                    } else {
                                        this.f15066a.mo18421a().m18851o().m18835b("Raw event metadata record is missing. appId", C4313q2.m18846x(r9));
                                    }
                                } catch (SQLiteException e10) {
                                    e = e10;
                                    cursorQuery = cursorRawQuery;
                                    r7 = string2;
                                    this.f15066a.mo18421a().m18851o().m18836c("Data loss. Error selecting raw event. appId", C4313q2.m18846x(r7), e);
                                    cursorRawQuery = cursorQuery;
                                    if (cursorRawQuery != null) {
                                        cursorRawQuery.close();
                                    }
                                }
                            }
                        } catch (SQLiteException e11) {
                            e = e11;
                            string2 = str;
                        }
                    } else {
                        try {
                            if (j8 != -1) {
                                String str5 = str;
                                strArr = new String[]{str5, String.valueOf(j8)};
                                IsEmpty = str5;
                            } else {
                                str2 = str;
                                strArr = new String[]{str2};
                            }
                            if (j8 != -1) {
                                IsEmpty = str2;
                                str4 = " and rowid <= ?";
                            }
                            IsEmpty = str2;
                            StringBuilder sb2 = new StringBuilder(str4.length() + 84);
                            sb2.append("select metadata_fingerprint from raw_events where app_id = ?");
                            sb2.append(str4);
                            sb2.append(" order by rowid limit 1;");
                            cursorRawQuery = sQLiteDatabaseM19051u0.rawQuery(sb2.toString(), strArr);
                            try {
                                if (cursorRawQuery.moveToFirst()) {
                                    string = cursorRawQuery.getString(0);
                                    cursorRawQuery.close();
                                    r9 = IsEmpty;
                                    cursorRawQuery = sQLiteDatabaseM19051u0.query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{r9, string}, null, null, "rowid", "2");
                                    if (cursorRawQuery.moveToFirst()) {
                                        this.f15066a.mo18421a().m18851o().m18835b("Raw event metadata record is missing. appId", C4313q2.m18846x(r9));
                                    } else {
                                        zzid zzidVar2 = (zzid) ((zzic) C4349u6.m19071W(zzid.zzaE(), cursorRawQuery.getBlob(0))).zzbc();
                                        if (cursorRawQuery.moveToNext()) {
                                            this.f15066a.mo18421a().m18854r().m18835b("Get multiple raw event metadata records, expected one. appId", C4313q2.m18846x(r9));
                                        }
                                        cursorRawQuery.close();
                                        AbstractC3718s.m18083l(zzidVar2);
                                        c4285m6.f15891a = zzidVar2;
                                        c4164x2 = this.f15066a;
                                        str3 = "app_id = ? and metadata_fingerprint = ?";
                                        if (c4164x2.m18686w().m18800H(null, AbstractC4209d2.f15683l1)) {
                                            jM19001q0 = m19001q0("select (rowid - 1) as max_rowid from raw_events where app_id = ? and metadata_fingerprint != ? order by rowid limit 1;", new String[]{r9, string}, -1L);
                                            if (j8 == -1) {
                                                j10 = j8;
                                            } else if (jM19001q0 != -1) {
                                                j10 = -1;
                                            } else {
                                                strArr2 = new String[]{r9, string};
                                                strArr4 = strArr2;
                                            }
                                            if (j10 == -1) {
                                                if (j10 != -1) {
                                                    jM19001q0 = j10;
                                                }
                                            } else if (j10 != -1) {
                                                jM19001q0 = j10;
                                            }
                                            strArr3 = new String[]{r9, string, String.valueOf(jM19001q0)};
                                            strArr4 = strArr3;
                                            str3 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                                        } else if (j8 != -1) {
                                            strArr3 = new String[]{r9, string, String.valueOf(j8)};
                                            strArr4 = strArr3;
                                            str3 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                                        } else {
                                            strArr2 = new String[]{r9, string};
                                            strArr4 = strArr2;
                                        }
                                        cursorQuery = sQLiteDatabaseM19051u0.query("raw_events", new String[]{"rowid", "name", "timestamp", "data"}, str3, strArr4, null, null, "rowid", null);
                                        if (cursorQuery.moveToFirst()) {
                                            do {
                                                j9 = cursorQuery.getLong(0);
                                                zzhrVar = (zzhr) C4349u6.m19071W(zzhs.zzk(), cursorQuery.getBlob(3));
                                                zzhrVar.zzl(cursorQuery.getString(1));
                                                zzhrVar.zzo(cursorQuery.getLong(2));
                                                if (!c4285m6.m18827a(j9, (zzhs) zzhrVar.zzbc())) {
                                                    break;
                                                    break;
                                                }
                                            } while (cursorQuery.moveToNext());
                                        } else {
                                            c4164x2.mo18421a().m18854r().m18835b("Raw event data disappeared while in transaction. appId", C4313q2.m18846x(r9));
                                        }
                                        cursorRawQuery = cursorQuery;
                                    }
                                }
                            } catch (SQLiteException e12) {
                                e = e12;
                                cursorQuery = cursorRawQuery;
                                r8 = IsEmpty;
                                r7 = r8;
                                this.f15066a.mo18421a().m18851o().m18836c("Data loss. Error selecting raw event. appId", C4313q2.m18846x(r7), e);
                                cursorRawQuery = cursorQuery;
                                if (cursorRawQuery != null) {
                                    cursorRawQuery.close();
                                }
                            }
                        } catch (SQLiteException e13) {
                            e = e13;
                            r8 = IsEmpty;
                        }
                    }
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                } catch (Throwable th) {
                    th = th;
                    r10 = "select metadata_fingerprint from raw_events where app_id = ?";
                    if (r10 != 0) {
                        r10.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e14) {
                e = e14;
                r8 = str;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00e1  */
    /* JADX INFO: renamed from: o */
    public final List m19041o(String str, C6027J c6027j, int i7) {
        List arrayList;
        AbstractC3718s.m18077f(str);
        mo18427h();
        m18696j();
        Cursor cursorQuery = null;
        try {
            SQLiteDatabase sQLiteDatabaseM19051u0 = m19051u0();
            String[] strArr = {"rowId", "app_id", "measurement_batch", "upload_uri", "upload_headers", "upload_type", "retry_count", "creation_timestamp", "associated_row_id", "last_upload_timestamp"};
            String strM18988T = m18988T(c6027j.f23807a);
            String strM18987S = m18987S();
            StringBuilder sb = new StringBuilder(String.valueOf(strM18988T).length() + 17 + strM18987S.length());
            sb.append("app_id=?");
            sb.append(strM18988T);
            sb.append(" AND NOT ");
            sb.append(strM18987S);
            cursorQuery = sQLiteDatabaseM19051u0.query("upload_queue", strArr, sb.toString(), new String[]{str}, null, null, "creation_timestamp ASC", i7 > 0 ? String.valueOf(i7) : null);
            arrayList = new ArrayList();
            while (cursorQuery.moveToNext()) {
                C4341t6 c4341t6M18986R = m18986R(str, cursorQuery.getLong(0), cursorQuery.getBlob(2), cursorQuery.getString(3), cursorQuery.getString(4), cursorQuery.getInt(5), cursorQuery.getInt(6), cursorQuery.getLong(7), cursorQuery.getLong(8), cursorQuery.getLong(9));
                if (c4341t6M18986R != null) {
                    arrayList.add(c4341t6M18986R);
                }
            }
        } catch (SQLiteException e7) {
            try {
                this.f15066a.mo18421a().m18851o().m18836c("Error to querying MeasurementBatch from upload_queue. appId", str, e7);
                arrayList = Collections.EMPTY_LIST;
            } catch (Throwable th) {
                th = th;
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m19042p(String str) {
        EnumC6024G[] enumC6024GArr = {EnumC6024G.GOOGLE_SIGNAL};
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(enumC6024GArr[0].zza()));
        String strM18988T = m18988T(arrayList);
        String strM18987S = m18987S();
        StringBuilder sb = new StringBuilder(String.valueOf(strM18988T).length() + 61 + strM18987S.length());
        sb.append("SELECT COUNT(1) > 0 FROM upload_queue WHERE app_id=?");
        sb.append(strM18988T);
        sb.append(" AND NOT ");
        sb.append(strM18987S);
        return m19000p0(sb.toString(), new String[]{str}) != 0;
    }

    /* JADX INFO: renamed from: q */
    public final void m19043q(Long l7) {
        mo18427h();
        m18696j();
        AbstractC3718s.m18083l(l7);
        try {
            if (m19051u0().delete("upload_queue", "rowid=?", new String[]{l7.toString()}) != 1) {
                this.f15066a.mo18421a().m18854r().m18834a("Deleted fewer rows from upload_queue than expected");
            }
        } catch (SQLiteException e7) {
            this.f15066a.mo18421a().m18851o().m18835b("Failed to delete a MeasurementBatch in a upload_queue table", e7);
            throw e7;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX INFO: renamed from: r */
    public final String m19044r() throws Throwable {
        SQLiteException e7;
        Cursor cursorRawQuery;
        SQLiteDatabase sQLiteDatabaseM19051u0 = m19051u0();
        ?? r7 = 0;
        try {
            try {
                cursorRawQuery = sQLiteDatabaseM19051u0.rawQuery("select app_id from queue order by has_realtime desc, rowid asc limit 1;", null);
                try {
                    if (cursorRawQuery.moveToFirst()) {
                        String string = cursorRawQuery.getString(0);
                        cursorRawQuery.close();
                        return string;
                    }
                } catch (SQLiteException e8) {
                    e7 = e8;
                    this.f15066a.mo18421a().m18851o().m18835b("Database error getting next bundle app id", e7);
                }
            } catch (Throwable th) {
                r7 = sQLiteDatabaseM19051u0;
                th = th;
                if (r7 != 0) {
                    r7.close();
                }
                throw th;
            }
        } catch (SQLiteException e9) {
            e7 = e9;
            cursorRawQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (r7 != 0) {
                r7.close();
            }
            throw th;
        }
        if (cursorRawQuery != null) {
            cursorRawQuery.close();
        }
        return null;
    }

    /* JADX INFO: renamed from: r0 */
    public final void m19045r0() {
        m18696j();
        m19051u0().beginTransaction();
    }

    /* JADX INFO: renamed from: s */
    public final boolean m19046s() {
        return m19000p0("select count(1) > 0 from queue where has_realtime = 1", null) != 0;
    }

    /* JADX INFO: renamed from: s0 */
    public final void m19047s0() {
        m18696j();
        m19051u0().setTransactionSuccessful();
    }

    /* JADX INFO: renamed from: t */
    public final void m19048t(long j7) {
        mo18427h();
        m18696j();
        try {
            if (m19051u0().delete("queue", "rowid=?", new String[]{String.valueOf(j7)}) == 1) {
            } else {
                throw new SQLiteException("Deleted fewer rows from queue than expected");
            }
        } catch (SQLiteException e7) {
            this.f15066a.mo18421a().m18851o().m18835b("Failed to delete a bundle in a queue table", e7);
            throw e7;
        }
    }

    /* JADX INFO: renamed from: t0 */
    public final void m19049t0() {
        m18696j();
        m19051u0().endTransaction();
    }

    /* JADX INFO: renamed from: u */
    final void m19050u() {
        mo18427h();
        m18696j();
        if (m19035a0()) {
            C4317q6 c4317q6 = this.f15465b;
            long jM18433a = c4317q6.m18904L0().f16247e.m18433a();
            C4164X2 c4164x2 = this.f15066a;
            long jMo18161c = c4164x2.mo18425f().mo18161c();
            long jAbs = Math.abs(jMo18161c - jM18433a);
            c4164x2.m18686w();
            if (jAbs > C4278m.m18791r()) {
                c4317q6.m18904L0().f16247e.m18434b(jMo18161c);
                mo18427h();
                m18696j();
                if (m19035a0()) {
                    SQLiteDatabase sQLiteDatabaseM19051u0 = m19051u0();
                    String strValueOf = String.valueOf(c4164x2.mo18425f().mo18159a());
                    c4164x2.m18686w();
                    int iDelete = sQLiteDatabaseM19051u0.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{strValueOf, String.valueOf(C4278m.m18790q())});
                    if (iDelete > 0) {
                        c4164x2.mo18421a().m18859w().m18835b("Deleted stale rows. rowsDeleted", Integer.valueOf(iDelete));
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: u0 */
    final SQLiteDatabase m19051u0() {
        mo18427h();
        try {
            return this.f16096d.getWritableDatabase();
        } catch (SQLiteException e7) {
            this.f15066a.mo18421a().m18854r().m18835b("Error opening database", e7);
            throw e7;
        }
    }

    /* JADX INFO: renamed from: v */
    final void m19052v(List list) {
        mo18427h();
        m18696j();
        AbstractC3718s.m18083l(list);
        AbstractC3718s.m18085n(list.size());
        if (m19035a0()) {
            String strJoin = TextUtils.join(",", list);
            StringBuilder sb = new StringBuilder(String.valueOf(strJoin).length() + 2);
            sb.append("(");
            sb.append(strJoin);
            sb.append(")");
            String string = sb.toString();
            StringBuilder sb2 = new StringBuilder(string.length() + 80);
            sb2.append("SELECT COUNT(1) FROM queue WHERE rowid IN ");
            sb2.append(string);
            sb2.append(" AND retry_count =  2147483647 LIMIT 1");
            if (m19000p0(sb2.toString(), null) > 0) {
                this.f15066a.mo18421a().m18854r().m18834a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase sQLiteDatabaseM19051u0 = m19051u0();
                StringBuilder sb3 = new StringBuilder(string.length() + 127);
                sb3.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
                sb3.append(string);
                sb3.append(" AND (retry_count IS NULL OR retry_count < 2147483647)");
                sQLiteDatabaseM19051u0.execSQL(sb3.toString());
            } catch (SQLiteException e7) {
                this.f15066a.mo18421a().m18851o().m18835b("Error incrementing retry count. error", e7);
            }
        }
    }

    /* JADX INFO: renamed from: v0 */
    public final C4007C m19053v0(String str, String str2) {
        return m18983O("events", str, str2);
    }

    /* JADX INFO: renamed from: w */
    final void m19054w(Long l7) {
        mo18427h();
        m18696j();
        AbstractC3718s.m18083l(l7);
        if (m19035a0()) {
            StringBuilder sb = new StringBuilder(l7.toString().length() + 86);
            sb.append("SELECT COUNT(1) FROM upload_queue WHERE rowid = ");
            sb.append(l7);
            sb.append(" AND retry_count =  2147483647 LIMIT 1");
            if (m19000p0(sb.toString(), null) > 0) {
                this.f15066a.mo18421a().m18854r().m18834a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase sQLiteDatabaseM19051u0 = m19051u0();
                long jMo18159a = this.f15066a.mo18425f().mo18159a();
                StringBuilder sb2 = new StringBuilder(String.valueOf(jMo18159a).length() + 60);
                sb2.append(" SET retry_count = retry_count + 1, last_upload_timestamp = ");
                sb2.append(jMo18159a);
                String string = sb2.toString();
                StringBuilder sb3 = new StringBuilder(string.length() + 34 + l7.toString().length() + 29);
                sb3.append("UPDATE upload_queue");
                sb3.append(string);
                sb3.append(" WHERE rowid = ");
                sb3.append(l7);
                sb3.append(" AND retry_count < 2147483647");
                sQLiteDatabaseM19051u0.execSQL(sb3.toString());
            } catch (SQLiteException e7) {
                this.f15066a.mo18421a().m18851o().m18835b("Error incrementing retry count. error", e7);
            }
        }
    }

    /* JADX INFO: renamed from: w0 */
    public final void m19055w0(C4007C c4007c) {
        m18984P("events", c4007c);
    }

    /* JADX INFO: renamed from: x */
    final Object m19056x(Cursor cursor, int i7) {
        int type = cursor.getType(i7);
        if (type == 0) {
            this.f15066a.mo18421a().m18851o().m18834a("Loaded invalid null value from database");
            return null;
        }
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i7));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i7));
        }
        if (type == 3) {
            return cursor.getString(i7);
        }
        if (type != 4) {
            this.f15066a.mo18421a().m18851o().m18835b("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
            return null;
        }
        this.f15066a.mo18421a().m18851o().m18834a("Loaded invalid blob type value, ignoring it");
        return null;
    }

    /* JADX INFO: renamed from: x0 */
    public final void m19057x0(String str) {
        C4007C c4007cM18983O;
        m18985Q("events_snapshot", str);
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = m19051u0().query("events", (String[]) Collections.singletonList("name").toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
                if (cursorQuery.moveToFirst()) {
                    do {
                        String string = cursorQuery.getString(0);
                        if (string != null && (c4007cM18983O = m18983O("events", str, string)) != null) {
                            m18984P("events_snapshot", c4007cM18983O);
                        }
                    } while (cursorQuery.moveToNext());
                }
            } catch (SQLiteException e7) {
                this.f15066a.mo18421a().m18851o().m18836c("Error creating snapshot. appId", C4313q2.m18846x(str), e7);
            }
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public final long m19058y() {
        return m19001q0("select max(bundle_end_timestamp) from queue", null, 0L);
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x00d8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:7:0x0054  */
    /* JADX WARN: Code duplicated, block: B:9:0x005b  */
    /* JADX INFO: renamed from: y0 */
    public final void m19059y0(String str) throws Throwable {
        boolean z7;
        C4007C c4007cM18983O;
        ArrayList arrayList = new ArrayList(Arrays.asList("name", "lifetime_count"));
        C4007C c4007cM18983O2 = m18983O("events", str, "_f");
        C4007C c4007cM18983O3 = m18983O("events", str, "_v");
        m18985Q("events", str);
        Cursor cursorQuery = null;
        boolean z8 = false;
        try {
            cursorQuery = m19051u0().query("events_snapshot", (String[]) arrayList.toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
            if (cursorQuery.moveToFirst()) {
                boolean z9 = false;
                z7 = false;
                do {
                    try {
                        String string = cursorQuery.getString(0);
                        if (cursorQuery.getLong(1) >= 1) {
                            if ("_f".equals(string)) {
                                z9 = true;
                            } else if ("_v".equals(string)) {
                                z7 = true;
                            }
                        }
                        if (string != null && (c4007cM18983O = m18983O("events_snapshot", str, string)) != null) {
                            m18984P("events", c4007cM18983O);
                        }
                    } catch (SQLiteException e7) {
                        e = e7;
                        z8 = z9;
                        try {
                            this.f15066a.mo18421a().m18851o().m18836c("Error querying snapshot. appId", C4313q2.m18846x(str), e);
                            z9 = z8;
                        } catch (Throwable th) {
                            th = th;
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            if (z8 && c4007cM18983O2 != null) {
                                m18984P("events", c4007cM18983O2);
                            } else if (!z7 && c4007cM18983O3 != null) {
                                m18984P("events", c4007cM18983O3);
                            }
                            m18985Q("events_snapshot", str);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        z8 = z9;
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        if (z8) {
                            if (!z7) {
                                m18984P("events", c4007cM18983O3);
                            }
                        } else if (!z7) {
                            m18984P("events", c4007cM18983O3);
                        }
                        m18985Q("events_snapshot", str);
                        throw th;
                    }
                } while (cursorQuery.moveToNext());
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                if (!z9 && c4007cM18983O2 != null) {
                    m18984P("events", c4007cM18983O2);
                } else if (!z7 && c4007cM18983O3 != null) {
                    m18984P("events", c4007cM18983O3);
                }
            } else {
                cursorQuery.close();
                if (c4007cM18983O2 != null) {
                    m18984P("events", c4007cM18983O2);
                } else if (c4007cM18983O3 != null) {
                    m18984P("events", c4007cM18983O3);
                }
            }
        } catch (SQLiteException e8) {
            e = e8;
            z7 = false;
        } catch (Throwable th3) {
            th = th3;
            z7 = false;
        }
        m18985Q("events_snapshot", str);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x009a A[Catch: all -> 0x0074, SQLiteException -> 0x00ae, TryCatch #0 {all -> 0x0074, blocks: (B:3:0x001b, B:6:0x0041, B:8:0x0060, B:15:0x0079, B:17:0x009a, B:20:0x00b0, B:23:0x00b8), top: B:29:0x001b }] */
    /* JADX WARN: Code duplicated, block: B:20:0x00b0 A[Catch: all -> 0x0074, SQLiteException -> 0x00ae, TRY_LEAVE, TryCatch #0 {all -> 0x0074, blocks: (B:3:0x001b, B:6:0x0041, B:8:0x0060, B:15:0x0079, B:17:0x009a, B:20:0x00b0, B:23:0x00b8), top: B:29:0x001b }] */
    /* JADX INFO: renamed from: z */
    protected final long m19060z(String str, String str2) {
        SQLiteException e7;
        long jM19001q0;
        long j7;
        ContentValues contentValues;
        AbstractC3718s.m18077f(str);
        AbstractC3718s.m18077f("first_open_count");
        mo18427h();
        m18696j();
        SQLiteDatabase sQLiteDatabaseM19051u0 = m19051u0();
        sQLiteDatabaseM19051u0.beginTransaction();
        try {
            try {
                StringBuilder sb = new StringBuilder(48);
                sb.append("select ");
                sb.append("first_open_count");
                sb.append(" from app2 where app_id=?");
                j7 = -1;
                jM19001q0 = m19001q0(sb.toString(), new String[]{str}, -1L);
                if (jM19001q0 == -1) {
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("app_id", str);
                    contentValues2.put("first_open_count", (Integer) 0);
                    contentValues2.put("previous_install_count", (Integer) 0);
                    if (sQLiteDatabaseM19051u0.insertWithOnConflict("app2", null, contentValues2, 5) == -1) {
                        this.f15066a.mo18421a().m18851o().m18836c("Failed to insert column (got -1). appId", C4313q2.m18846x(str), "first_open_count");
                    } else {
                        jM19001q0 = 0;
                        try {
                            contentValues = new ContentValues();
                            contentValues.put("app_id", str);
                            contentValues.put("first_open_count", Long.valueOf(1 + jM19001q0));
                            if (sQLiteDatabaseM19051u0.update("app2", contentValues, "app_id = ?", new String[]{str}) == 0) {
                                this.f15066a.mo18421a().m18851o().m18836c("Failed to update column (got 0). appId", C4313q2.m18846x(str), "first_open_count");
                            } else {
                                sQLiteDatabaseM19051u0.setTransactionSuccessful();
                                j7 = jM19001q0;
                            }
                        } catch (SQLiteException e8) {
                            e7 = e8;
                            this.f15066a.mo18421a().m18851o().m18837d("Error inserting column. appId", C4313q2.m18846x(str), "first_open_count", e7);
                        }
                    }
                } else {
                    contentValues = new ContentValues();
                    contentValues.put("app_id", str);
                    contentValues.put("first_open_count", Long.valueOf(1 + jM19001q0));
                    if (sQLiteDatabaseM19051u0.update("app2", contentValues, "app_id = ?", new String[]{str}) == 0) {
                        this.f15066a.mo18421a().m18851o().m18836c("Failed to update column (got 0). appId", C4313q2.m18846x(str), "first_open_count");
                    } else {
                        sQLiteDatabaseM19051u0.setTransactionSuccessful();
                        j7 = jM19001q0;
                    }
                }
            } finally {
                sQLiteDatabaseM19051u0.endTransaction();
            }
        } catch (SQLiteException e9) {
            e7 = e9;
            jM19001q0 = 0;
        }
        return j7;
    }

    /* JADX INFO: renamed from: z0 */
    public final void m19061z0(String str, String str2) {
        AbstractC3718s.m18077f(str);
        AbstractC3718s.m18077f(str2);
        mo18427h();
        m18696j();
        try {
            m19051u0().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e7) {
            C4164X2 c4164x2 = this.f15066a;
            c4164x2.mo18421a().m18851o().m18837d("Error deleting user property. appId", C4313q2.m18846x(str), c4164x2.m18662D().m18777c(str2), e7);
        }
    }
}
