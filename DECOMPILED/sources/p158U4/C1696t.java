package p158U4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: U4.t */
/* JADX INFO: loaded from: classes.dex */
public final class C1696t extends AbstractC1681e {

    /* JADX INFO: renamed from: b */
    public static final C1696t f5635b = new C1696t(Collections.EMPTY_LIST);

    private C1696t(List list) {
        super(list);
    }

    /* JADX INFO: renamed from: A */
    public static C1696t m7147A(String str) {
        if (str.contains("//")) {
            throw new IllegalArgumentException("Invalid path (" + str + "). Paths must not contain // in them.");
        }
        String[] strArrSplit = str.split("/");
        ArrayList arrayList = new ArrayList(strArrSplit.length);
        for (String str2 : strArrSplit) {
            if (!str2.isEmpty()) {
                arrayList.add(str2);
            }
        }
        return new C1696t(arrayList);
    }

    /* JADX INFO: renamed from: z */
    public static C1696t m7148z(List list) {
        return list.isEmpty() ? f5635b : new C1696t(list);
    }

    @Override // p158U4.AbstractC1681e
    /* JADX INFO: renamed from: h */
    public String mo7057h() {
        StringBuilder sb = new StringBuilder();
        for (int i7 = 0; i7 < this.f5596a.size(); i7++) {
            if (i7 > 0) {
                sb.append("/");
            }
            sb.append((String) this.f5596a.get(i7));
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p158U4.AbstractC1681e
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public C1696t mo7059m(List list) {
        return new C1696t(list);
    }
}
