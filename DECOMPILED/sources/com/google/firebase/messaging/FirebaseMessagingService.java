package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import p163V2.C1730a;
import p163V2.C1732c;

/* JADX INFO: loaded from: classes.dex */
public class FirebaseMessagingService extends AbstractServiceC4990h {

    /* JADX INFO: renamed from: r */
    private static final Queue f18807r = new ArrayDeque(10);

    /* JADX INFO: renamed from: f */
    private C1732c f18808f;

    /* JADX INFO: renamed from: j */
    private boolean m22330j(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Queue queue = f18807r;
        if (!queue.contains(str)) {
            if (queue.size() >= 10) {
                queue.remove();
            }
            queue.add(str);
            return false;
        }
        if (!Log.isLoggable("FirebaseMessaging", 3)) {
            return true;
        }
        Log.d("FirebaseMessaging", "Received duplicate message: " + str);
        return true;
    }

    /* JADX INFO: renamed from: k */
    private void m22331k(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        extras.remove("androidx.content.wakelockid");
        if (C4958H.m22351t(extras)) {
            C4958H c4958h = new C4958H(extras);
            ExecutorService executorServiceM22545e = AbstractC5001n.m22545e();
            try {
                if (new C4984e(this, c4958h, executorServiceM22545e).m22494a()) {
                    executorServiceM22545e.shutdown();
                    return;
                } else {
                    executorServiceM22545e.shutdown();
                    if (AbstractC4955F.m22267D(intent)) {
                        AbstractC4955F.m22291w(intent);
                    }
                }
            } catch (Throwable th) {
                executorServiceM22545e.shutdown();
                throw th;
            }
        }
        mo15267p(new C4966P(extras));
    }

    /* JADX INFO: renamed from: l */
    private String m22332l(Intent intent) {
        String stringExtra = intent.getStringExtra("google.message_id");
        return stringExtra == null ? intent.getStringExtra("message_id") : stringExtra;
    }

    /* JADX INFO: renamed from: m */
    private C1732c m22333m(Context context) {
        if (this.f18808f == null) {
            this.f18808f = new C1732c(context.getApplicationContext());
        }
        return this.f18808f;
    }

    /* JADX INFO: renamed from: n */
    private void m22334n(Intent intent) {
        if (!m22330j(intent.getStringExtra("google.message_id"))) {
            m22335t(intent);
        }
        m22333m(this).m7367b(new C1730a(intent));
    }

    /* JADX INFO: renamed from: t */
    private void m22335t(Intent intent) {
        String stringExtra = intent.getStringExtra("message_type");
        if (stringExtra == null) {
            stringExtra = "gcm";
        }
        switch (stringExtra) {
            case "deleted_messages":
                m22338o();
                break;
            case "gcm":
                AbstractC4955F.m22293y(intent);
                m22331k(intent);
                break;
            case "send_error":
                m22340s(m22332l(intent), new C4970U(intent.getStringExtra("error")));
                break;
            case "send_event":
                m22339q(intent.getStringExtra("google.message_id"));
                break;
            default:
                Log.w("FirebaseMessaging", "Received message with unknown type: " + stringExtra);
                break;
        }
    }

    @Override // com.google.firebase.messaging.AbstractServiceC4990h
    /* JADX INFO: renamed from: e */
    protected Intent mo22336e(Intent intent) {
        return C4971V.m22403b().m22405c();
    }

    @Override // com.google.firebase.messaging.AbstractServiceC4990h
    /* JADX INFO: renamed from: f */
    public void mo22337f(Intent intent) {
        String action = intent.getAction();
        if ("com.google.android.c2dm.intent.RECEIVE".equals(action) || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(action)) {
            m22334n(intent);
            return;
        }
        if ("com.google.firebase.messaging.NEW_TOKEN".equals(action)) {
            mo15268r(intent.getStringExtra("token"));
            return;
        }
        Log.d("FirebaseMessaging", "Unknown intent action: " + intent.getAction());
    }

    /* JADX INFO: renamed from: o */
    public void m22338o() {
    }

    /* JADX INFO: renamed from: p */
    public void mo15267p(C4966P c4966p) {
    }

    /* JADX INFO: renamed from: q */
    public void m22339q(String str) {
    }

    /* JADX INFO: renamed from: r */
    public void mo15268r(String str) {
    }

    /* JADX INFO: renamed from: s */
    public void m22340s(String str, Exception exc) {
    }
}
