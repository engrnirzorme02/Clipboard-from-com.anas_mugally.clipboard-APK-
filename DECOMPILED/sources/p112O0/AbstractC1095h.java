package p112O0;

import androidx.work.C2896b;
import java.util.List;

/* JADX INFO: renamed from: O0.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1095h {

    /* JADX INFO: renamed from: a */
    private static final String f3951a = AbstractC1097j.m4846f("InputMerger");

    /* JADX INFO: renamed from: a */
    public static AbstractC1095h m4839a(String str) {
        try {
            return (AbstractC1095h) Class.forName(str).newInstance();
        } catch (Exception e7) {
            AbstractC1097j.m4844c().mo4848b(f3951a, "Trouble instantiating + " + str, e7);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract C2896b mo4840b(List list);
}
