package p380w2;

import android.os.AsyncTask;
import java.util.Objects;

/* JADX INFO: renamed from: w2.q */
/* JADX INFO: loaded from: classes.dex */
final class AsyncTaskC7348q extends AsyncTask {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ BinderC7350s f29230a;

    /* synthetic */ AsyncTaskC7348q(BinderC7350s binderC7350s, byte[] bArr) {
        Objects.requireNonNull(binderC7350s);
        this.f29230a = binderC7350s;
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        return this.f29230a.m32334N0();
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        BinderC7350s binderC7350s = this.f29230a;
        String str = (String) obj;
        if (binderC7350s.m32337Q0() == null || str == null) {
            return;
        }
        binderC7350s.m32337Q0().loadUrl(str);
    }
}
