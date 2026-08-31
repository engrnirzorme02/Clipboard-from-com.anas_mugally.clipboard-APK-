package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.ah */
/* JADX INFO: loaded from: classes2.dex */
final class C4689ah extends AbstractC4755y {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ BinderC4690ai f18249a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C4689ah(BinderC4690ai binderC4690ai, String str, long j7) {
        super(str, j7);
        this.f18249a = binderC4690ai;
    }

    @Override // com.google.android.play.core.integrity.AbstractC4755y
    /* JADX INFO: renamed from: b */
    final Task mo21835b(Activity activity, Bundle bundle) {
        return this.f18249a.f18250a.m21842b(activity, bundle);
    }
}
