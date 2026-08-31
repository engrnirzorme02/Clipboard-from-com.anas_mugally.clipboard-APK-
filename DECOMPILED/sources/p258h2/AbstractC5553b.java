package p258h2;

/* JADX INFO: renamed from: h2.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5553b {
    /* JADX INFO: renamed from: a */
    public static Object m24988a(int i7, Object obj, InterfaceC5552a interfaceC5552a, InterfaceC5554c interfaceC5554c) {
        Object objApply;
        if (i7 < 1) {
            return interfaceC5552a.apply(obj);
        }
        do {
            objApply = interfaceC5552a.apply(obj);
            obj = interfaceC5554c.mo17147a(obj, objApply);
            if (obj == null) {
                break;
            }
            i7--;
        } while (i7 >= 1);
        return objApply;
    }
}
