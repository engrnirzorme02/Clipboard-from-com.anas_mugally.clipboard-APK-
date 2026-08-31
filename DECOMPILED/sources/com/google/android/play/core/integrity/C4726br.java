package com.google.android.play.core.integrity;

import android.app.Activity;
import com.google.android.gms.tasks.Task;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.br */
/* JADX INFO: loaded from: classes2.dex */
final class C4726br extends StandardIntegrityManager.StandardIntegrityToken {

    /* JADX INFO: renamed from: a */
    private final String f18327a;

    /* JADX INFO: renamed from: b */
    private final AbstractC4755y f18328b;

    C4726br(String str, AbstractC4755y abstractC4755y) {
        this.f18327a = str;
        this.f18328b = abstractC4755y;
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityToken
    public final Task<Integer> showDialog(Activity activity, int i7) {
        return this.f18328b.m21883a(activity, i7);
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityToken
    public final String token() {
        return this.f18327a;
    }
}
