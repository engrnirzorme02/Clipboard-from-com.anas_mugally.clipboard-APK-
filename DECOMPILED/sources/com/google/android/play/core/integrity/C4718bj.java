package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.bj */
/* JADX INFO: loaded from: classes2.dex */
final class C4718bj extends AbstractC4755y {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ BinderC4719bk f18309a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C4718bj(BinderC4719bk binderC4719bk, String str, long j7) {
        super(str, j7);
        this.f18309a = binderC4719bk;
    }

    @Override // com.google.android.play.core.integrity.AbstractC4755y
    /* JADX INFO: renamed from: b */
    final Task mo21835b(Activity activity, Bundle bundle) {
        bundle.putLong("cloud.prj", this.f18309a.f18312e);
        return this.f18309a.f18310c.m21869c(activity, bundle);
    }
}
