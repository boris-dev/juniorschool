package ru.liga.dcs;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;

public class FolderTreeTest {

    @Test
    public void testFindFoldersContainingPron() {
        FolderTree tree = new FolderTree();
        FolderTree.Folder root = new FolderTree.Folder("root");
        FolderTree.Folder subFolder1 = new FolderTree.Folder("pronunciation");
        FolderTree.Folder subFolder2 = new FolderTree.Folder("documents");
        FolderTree.Folder subFolder3 = new FolderTree.Folder("programs");
        root.addChild(subFolder1);
        root.addChild(subFolder2);
        subFolder2.addChild(subFolder3);

        List<String> expected = Arrays.asList("pronunciation");
        List<String> actual = tree.findFoldersContainingPron(root);

        assertEquals(expected, actual);
    }

    @Test
    public void testFindFoldersContainingPron_NoMatch() {
        FolderTree tree = new FolderTree();
        FolderTree.Folder root = new FolderTree.Folder("root");
        FolderTree.Folder subFolder1 = new FolderTree.Folder("documents");
        FolderTree.Folder subFolder2 = new FolderTree.Folder("reports");
        root.addChild(subFolder1);
        root.addChild(subFolder2);

        List<String> expected = Arrays.asList();
        List<String> actual = tree.findFoldersContainingPron(root);

        assertEquals(expected, actual);
    }

    @Test
    public void testFindFoldersContainingPron_AllMatch() {
        FolderTree tree = new FolderTree();
        FolderTree.Folder root = new FolderTree.Folder("root");
        FolderTree.Folder subFolder1 = new FolderTree.Folder("pronunciation");
        FolderTree.Folder subFolder2 = new FolderTree.Folder("report");
        FolderTree.Folder subFolder3 = new FolderTree.Folder("programs");
        root.addChild(subFolder1);
        root.addChild(subFolder2);
        root.addChild(subFolder3);

        List<String> expected = Arrays.asList("pronunciation", "programs");
        List<String> actual = tree.findFoldersContainingPron(root);

        assertEquals(expected, actual);
    }
}
