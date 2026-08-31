package com.google.android.play.core.integrity;

import android.app.Activity;
import com.google.android.gms.tasks.Task;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.aq */
/* JADX INFO: loaded from: classes2.dex */
final class C4698aq extends IntegrityTokenResponse {

    /* JADX INFO: renamed from: a */
    private final String f18268a;

    /* JADX INFO: renamed from: b */
    private final AbstractC4755y f18269b;

    C4698aq(String str, AbstractC4755y abstractC4755y) {
        this.f18268a = str;
        this.f18269b = abstractC4755y;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenResponse
    public final Task<Integer> showDialog(Activity activity, int i7) {
        return this.f18269b.m21883a(activity, i7);
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenResponse
    public final String token() {
        return this.f18268a;
    }
}
