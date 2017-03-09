package pl.jwrabel;

import com.google.common.base.CharMatcher;
import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import com.google.common.collect.BiMap;
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.HashBiMap;
import com.google.common.collect.Table;

import java.util.List;
import java.util.Map;

/**
 * Created by jakubwrabel on 08.03.2017.
 */
public class GuavaDemo {
	public static void main(String[] args) {
		// JOINER
		String[] array = new String[]{"A", "B", "C"};
		String s = Joiner.on("").join(array);
		System.out.println(s);

		// SPLITTER
		String stringToSplit = "A C B S";
		Iterable<String> split = Splitter.on(" ").split(stringToSplit);
		List<String> splitList = Splitter.on(" ").splitToList(stringToSplit);
		Splitter.on(" ").limit(4).splitToList(stringToSplit);
		Splitter.on(" ").omitEmptyStrings().trimResults().splitToList(stringToSplit);
		// REGEX, regular expressions, wyrażenia regularne
		List<String> strings = Splitter.onPattern("A4*j").splitToList(stringToSplit);


		// CharMatcher
		boolean asdasd = CharMatcher.digit().matchesAllOf("asdasdasdasd");

		// BiMap
		BiMap<String, String> biMap = HashBiMap.create();
		biMap.put("a", "---");

		String a = biMap.get("a");
		String s1 = biMap.inverse().get("---");

		// Tables
		Table<String, String, String> records = HashBasedTable.create();
		records.put("1", "Jakub", "Kowalski");
		records.put("2", "Jakub", "Nowak");

		Map<String, String> jakub = records.row("Jakub");
		Map<String, String> kowalski = records.column("Kowalski");
	}
}
