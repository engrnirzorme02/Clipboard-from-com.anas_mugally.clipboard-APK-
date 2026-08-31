package p358t4;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: t4.a */
/* JADX INFO: loaded from: classes.dex */
public class C7079a {

    /* JADX INFO: renamed from: a */
    private final List f28255a;

    /* JADX INFO: renamed from: b */
    private final List f28256b;

    public C7079a(List list, List list2) {
        if (list.size() != list2.size() - 1) {
            throw new IllegalArgumentException("Number of posts need to be n-1 for n hashes in CompoundHash");
        }
        this.f28255a = list;
        this.f28256b = list2;
    }

    /* JADX INFO: renamed from: a */
    public List m31196a() {
        return Collections.unmodifiableList(this.f28256b);
    }

    /* JADX INFO: renamed from: b */
    public List m31197b() {
        return Collections.unmodifiableList(this.f28255a);
    }
}
