package p022C4;

import android.util.Log;
import java.util.List;

/* JADX INFO: renamed from: C4.a */
/* JADX INFO: loaded from: classes.dex */
public class C0142a extends AbstractC0143b {
    public C0142a(InterfaceC0145d.a aVar, List list) {
        super(aVar, list);
    }

    @Override // p022C4.AbstractC0143b
    /* JADX INFO: renamed from: c */
    protected String mo612c(InterfaceC0145d.a aVar, String str, String str2, long j7) {
        return str2;
    }

    @Override // p022C4.AbstractC0143b
    /* JADX INFO: renamed from: d */
    protected void mo613d(String str, String str2) {
        Log.d(str, str2);
    }

    @Override // p022C4.AbstractC0143b
    /* JADX INFO: renamed from: e */
    protected void mo614e(String str, String str2) {
        Log.e(str, str2);
    }

    @Override // p022C4.AbstractC0143b
    /* JADX INFO: renamed from: f */
    protected void mo615f(String str, String str2) {
        Log.i(str, str2);
    }

    @Override // p022C4.AbstractC0143b
    /* JADX INFO: renamed from: h */
    protected void mo616h(String str, String str2) {
        Log.w(str, str2);
    }
}
