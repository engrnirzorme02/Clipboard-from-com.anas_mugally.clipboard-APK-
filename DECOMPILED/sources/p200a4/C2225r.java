package p200a4;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: a4.r */
/* JADX INFO: loaded from: classes.dex */
public class C2225r extends C2226s {

    /* JADX INFO: renamed from: a */
    private final List f7199a;

    public C2225r(List list) {
        super("Dependency cycle detected: " + Arrays.toString(list.toArray()));
        this.f7199a = list;
    }
}
