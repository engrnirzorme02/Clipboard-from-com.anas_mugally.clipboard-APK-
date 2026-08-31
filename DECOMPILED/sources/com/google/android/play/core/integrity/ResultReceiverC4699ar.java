package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.ar */
/* JADX INFO: loaded from: classes2.dex */
final class ResultReceiverC4699ar extends ResultReceiver {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ BinderC4700as f18270a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ResultReceiverC4699ar(BinderC4700as binderC4700as, Handler handler) {
        super(handler);
        this.f18270a = binderC4700as;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i7, Bundle bundle) {
        if (i7 == 1) {
            this.f18270a.f18271a.trySetResult(3);
        } else if (i7 == 2) {
            this.f18270a.f18271a.trySetResult(2);
        } else {
            if (i7 != 3) {
                return;
            }
            this.f18270a.f18271a.trySetResult(1);
        }
    }
}
