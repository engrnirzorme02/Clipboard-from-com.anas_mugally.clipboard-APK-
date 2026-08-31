package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.content.AbstractC2436b;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.firebase.messaging.Y */
/* JADX INFO: loaded from: classes.dex */
class C4974Y {

    /* JADX INFO: renamed from: a */
    final SharedPreferences f18867a;

    /* JADX INFO: renamed from: com.google.firebase.messaging.Y$a */
    static class a {

        /* JADX INFO: renamed from: d */
        private static final long f18868d = TimeUnit.DAYS.toMillis(7);

        /* JADX INFO: renamed from: a */
        final String f18869a;

        /* JADX INFO: renamed from: b */
        final String f18870b;

        /* JADX INFO: renamed from: c */
        final long f18871c;

        private a(String str, String str2, long j7) {
            this.f18869a = str;
            this.f18870b = str2;
            this.f18871c = j7;
        }

        /* JADX INFO: renamed from: a */
        static String m22425a(String str, String str2, long j7) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("token", str);
                jSONObject.put("appVersion", str2);
                jSONObject.put("timestamp", j7);
                return jSONObject.toString();
            } catch (JSONException e7) {
                Log.w("FirebaseMessaging", "Failed to encode token: " + e7);
                return null;
            }
        }

        /* JADX INFO: renamed from: c */
        static a m22426c(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (!str.startsWith("{")) {
                return new a(str, null, 0L);
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                return new a(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
            } catch (JSONException e7) {
                Log.w("FirebaseMessaging", "Failed to parse token: " + e7);
                return null;
            }
        }

        /* JADX INFO: renamed from: b */
        boolean m22427b(String str) {
            return System.currentTimeMillis() > this.f18871c + f18868d || !str.equals(this.f18870b);
        }
    }

    public C4974Y(Context context) {
        this.f18867a = context.getSharedPreferences("com.google.android.gms.appid", 0);
        m22419a(context, "com.google.android.gms.appid-no-backup");
    }

    /* JADX INFO: renamed from: a */
    private void m22419a(Context context, String str) {
        File file = new File(AbstractC2436b.getNoBackupFilesDir(context), str);
        if (file.exists()) {
            return;
        }
        try {
            if (!file.createNewFile() || m22423e()) {
                return;
            }
            Log.i("FirebaseMessaging", "App restored, clearing state");
            m22421c();
        } catch (IOException e7) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Error creating file in no backup dir: " + e7.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private String m22420b(String str, String str2) {
        return str + "|T|" + str2 + "|*";
    }

    /* JADX INFO: renamed from: c */
    public synchronized void m22421c() {
        this.f18867a.edit().clear().commit();
    }

    /* JADX INFO: renamed from: d */
    public synchronized a m22422d(String str, String str2) {
        return a.m22426c(this.f18867a.getString(m22420b(str, str2), null));
    }

    /* JADX INFO: renamed from: e */
    public synchronized boolean m22423e() {
        return this.f18867a.getAll().isEmpty();
    }

    /* JADX INFO: renamed from: f */
    public synchronized void m22424f(String str, String str2, String str3, String str4) {
        String strM22425a = a.m22425a(str3, str4, System.currentTimeMillis());
        if (strM22425a == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = this.f18867a.edit();
        editorEdit.putString(m22420b(str, str2), strM22425a);
        editorEdit.commit();
    }
}
