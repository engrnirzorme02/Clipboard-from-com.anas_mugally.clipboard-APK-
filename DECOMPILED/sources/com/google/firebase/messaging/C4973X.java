package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.google.firebase.messaging.X */
/* JADX INFO: loaded from: classes.dex */
final class C4973X {

    /* JADX INFO: renamed from: a */
    private final SharedPreferences f18861a;

    /* JADX INFO: renamed from: b */
    private final String f18862b;

    /* JADX INFO: renamed from: c */
    private final String f18863c;

    /* JADX INFO: renamed from: e */
    private final Executor f18865e;

    /* JADX INFO: renamed from: d */
    final ArrayDeque f18864d = new ArrayDeque();

    /* JADX INFO: renamed from: f */
    private boolean f18866f = false;

    private C4973X(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        this.f18861a = sharedPreferences;
        this.f18862b = str;
        this.f18863c = str2;
        this.f18865e = executor;
    }

    /* JADX INFO: renamed from: c */
    private boolean m22410c(boolean z7) {
        if (z7 && !this.f18866f) {
            m22414j();
        }
        return z7;
    }

    /* JADX INFO: renamed from: d */
    static C4973X m22411d(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        C4973X c4973x = new C4973X(sharedPreferences, str, str2, executor);
        c4973x.m22412e();
        return c4973x;
    }

    /* JADX INFO: renamed from: e */
    private void m22412e() {
        synchronized (this.f18864d) {
            try {
                this.f18864d.clear();
                String string = this.f18861a.getString(this.f18862b, "");
                if (!TextUtils.isEmpty(string) && string.contains(this.f18863c)) {
                    String[] strArrSplit = string.split(this.f18863c, -1);
                    if (strArrSplit.length == 0) {
                        Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : strArrSplit) {
                        if (!TextUtils.isEmpty(str)) {
                            this.f18864d.add(str);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public void m22413i() {
        synchronized (this.f18864d) {
            this.f18861a.edit().putString(this.f18862b, m22418h()).commit();
        }
    }

    /* JADX INFO: renamed from: j */
    private void m22414j() {
        this.f18865e.execute(new Runnable() { // from class: com.google.firebase.messaging.W
            @Override // java.lang.Runnable
            public final void run() {
                this.f18860a.m22413i();
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public boolean m22415b(String str) {
        boolean zM22410c;
        if (TextUtils.isEmpty(str) || str.contains(this.f18863c)) {
            return false;
        }
        synchronized (this.f18864d) {
            zM22410c = m22410c(this.f18864d.add(str));
        }
        return zM22410c;
    }

    /* JADX INFO: renamed from: f */
    public String m22416f() {
        String str;
        synchronized (this.f18864d) {
            str = (String) this.f18864d.peek();
        }
        return str;
    }

    /* JADX INFO: renamed from: g */
    public boolean m22417g(Object obj) {
        boolean zM22410c;
        synchronized (this.f18864d) {
            zM22410c = m22410c(this.f18864d.remove(obj));
        }
        return zM22410c;
    }

    /* JADX INFO: renamed from: h */
    public String m22418h() {
        StringBuilder sb = new StringBuilder();
        Iterator it = this.f18864d.iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            sb.append(this.f18863c);
        }
        return sb.toString();
    }
}
