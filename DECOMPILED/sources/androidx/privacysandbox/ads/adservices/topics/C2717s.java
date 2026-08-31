package androidx.privacysandbox.ads.adservices.topics;

import android.adservices.topics.EncryptedTopic;
import android.adservices.topics.GetTopicsResponse;
import android.adservices.topics.Topic;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.topics.s */
/* JADX INFO: loaded from: classes.dex */
public final class C2717s {

    /* JADX INFO: renamed from: a */
    public static final C2717s f10652a = new C2717s();

    private C2717s() {
    }

    /* JADX INFO: renamed from: a */
    public final C2706h m12830a(GetTopicsResponse response) {
        AbstractC6118n.m27187e(response, "response");
        ArrayList arrayList = new ArrayList();
        Iterator it = response.getTopics().iterator();
        while (it.hasNext()) {
            Topic topicM12821a = AbstractC2708j.m12821a(it.next());
            arrayList.add(new C2718t(topicM12821a.getTaxonomyVersion(), topicM12821a.getModelVersion(), topicM12821a.getTopicId()));
        }
        return new C2706h(arrayList);
    }

    /* JADX INFO: renamed from: b */
    public final C2706h m12831b(GetTopicsResponse response) {
        AbstractC6118n.m27187e(response, "response");
        ArrayList arrayList = new ArrayList();
        Iterator it = response.getTopics().iterator();
        while (it.hasNext()) {
            Topic topicM12821a = AbstractC2708j.m12821a(it.next());
            arrayList.add(new C2718t(topicM12821a.getTaxonomyVersion(), topicM12821a.getModelVersion(), topicM12821a.getTopicId()));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = response.getEncryptedTopics().iterator();
        while (it2.hasNext()) {
            EncryptedTopic encryptedTopicM12826a = AbstractC2713o.m12826a(it2.next());
            byte[] encryptedTopic = encryptedTopicM12826a.getEncryptedTopic();
            AbstractC6118n.m27186d(encryptedTopic, "encryptedTopic.encryptedTopic");
            String keyIdentifier = encryptedTopicM12826a.getKeyIdentifier();
            AbstractC6118n.m27186d(keyIdentifier, "encryptedTopic.keyIdentifier");
            byte[] encapsulatedKey = encryptedTopicM12826a.getEncapsulatedKey();
            AbstractC6118n.m27186d(encapsulatedKey, "encryptedTopic.encapsulatedKey");
            arrayList2.add(new C2699a(encryptedTopic, keyIdentifier, encapsulatedKey));
        }
        return new C2706h(arrayList, arrayList2);
    }
}
